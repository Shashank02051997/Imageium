package com.shashank.imageium.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.shashank.imageium.model.Post
import kotlinx.coroutines.flow.Flow

/**
 * Data Access Object (DAO) for [com.shashank.imageium.data.local.ImageiumPostsDatabase]
 */
@Dao
interface PostsDao {

    /**
     * Inserts [posts] into the [Post.TABLE_NAME] table.
     * Duplicate values are replaced in the table.
     * @param posts Posts
     */
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addPosts(posts: List<Post>)

    /**
     * Deletes all the posts from the [Post.TABLE_NAME] table.
     */
    @Query("DELETE FROM ${Post.TABLE_NAME}")
    suspend fun deleteAllPosts()

    /**
     * Fetches all the posts from the [Post.TABLE_NAME] table.
     * @return [Flow]
     */
    @Query("SELECT * FROM ${Post.TABLE_NAME}")
    fun getAllPosts(): Flow<List<Post>>
}
