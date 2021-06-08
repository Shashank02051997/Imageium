package com.shashank.imageium.data.repository

import androidx.annotation.MainThread
import androidx.annotation.WorkerThread
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import retrofit2.Response

/**
 * A repository which provides resource from local database as well as remote end point.
 *
 * [RESULT] represents the type for database.
 * [REQUEST] represents the type for network.
 */
@ExperimentalCoroutinesApi
abstract class NetworkBoundRepository<RESULT, REQUEST> {

    fun asFlow() = flow<Resource<RESULT>> {

        // Emit Database content first
        emit(Resource.Success(fetchFromLocal().first()))

        // Fetch latest posts from remote
        val apiResponse = fetchFromRemote()

        // Parse body
        val remotePosts = apiResponse.body()

        // Check for response validation
        if (apiResponse.isSuccessful && remotePosts != null) {
            // Save posts into the persistence storage
            saveRemoteData(remotePosts)
        } else {
            // Something went wrong! Emit Error state.
            emit(Resource.Failed(apiResponse.message()))
        }

        // Retrieve posts from persistence storage and emit
        emitAll(
            fetchFromLocal().map {
                Resource.Success<RESULT>(it)
            }
        )
    }.catch { e ->
        e.printStackTrace()
        emit(Resource.Failed("Network error! Can't get latest posts."))
    }

    /**
     * Saves retrieved from remote into the persistence storage.
     */
    @WorkerThread
    protected abstract suspend fun saveRemoteData(response: REQUEST)

    /**
     * Retrieves all data from persistence storage.
     */
    @MainThread
    protected abstract fun fetchFromLocal(): Flow<RESULT>

    /**
     * Fetches [Response] from the remote end point.
     */
    @MainThread
    protected abstract suspend fun fetchFromRemote(): Response<REQUEST>
}
