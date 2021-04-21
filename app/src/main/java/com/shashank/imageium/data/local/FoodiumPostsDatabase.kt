package com.shashank.imageium.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.shashank.imageium.data.local.dao.PostsDao
import com.shashank.imageium.model.Post

/**
 * Abstract Imageium database.
 * It provides DAO [PostsDao] by using method [getPostsDao].
 */
@Database(
    entities = [Post::class],
    version = DatabaseMigrations.DB_VERSION
)
abstract class ImageiumPostsDatabase : RoomDatabase() {

    /**
     * @return [PostsDao] Imageium Posts Data Access Object.
     */
    abstract fun getPostsDao(): PostsDao

    companion object {
        const val DB_NAME = "imageium_database"

        @Volatile
        private var INSTANCE: ImageiumPostsDatabase? = null

        fun getInstance(context: Context): ImageiumPostsDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }

            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ImageiumPostsDatabase::class.java,
                    DB_NAME
                ).build()

                INSTANCE = instance
                return instance
            }
        }
    }
}
