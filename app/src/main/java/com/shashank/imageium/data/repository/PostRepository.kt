package com.shashank.imageium.data.repository

import com.shashank.imageium.data.local.dao.PostsDao
import com.shashank.imageium.data.api.ImageiumService
import com.shashank.imageium.model.Post
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import javax.inject.Inject

interface PostRepository {
    fun getAllPosts(): Flow<Resource<List<Post>>>
}

/**
 * Singleton repository for fetching data from remote and storing it in database
 * for offline capability. This is Single source of data.
 */
@ExperimentalCoroutinesApi
class DefaultPostRepository @Inject constructor(
    private val postsDao: PostsDao,
    private val imageiumService: ImageiumService
) : PostRepository {

    /**
     * Fetched the posts from network and stored it in database. At the end, data from persistence
     * storage is fetched and emitted.
     */
    override fun getAllPosts(): Flow<Resource<List<Post>>> {
        return object : NetworkBoundRepository<List<Post>, List<Post>>() {

            override suspend fun saveRemoteData(response: List<Post>) = postsDao.addPosts(response)

            override fun fetchFromLocal(): Flow<List<Post>> = postsDao.getAllPosts()

            override suspend fun fetchFromRemote(): Response<List<Post>> = imageiumService.getPosts()
        }.asFlow()
    }

}
