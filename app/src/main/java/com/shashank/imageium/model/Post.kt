package com.shashank.imageium.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.shashank.imageium.model.Post.Companion.TABLE_NAME

/**
 * Data class for Database entity and Serialization.
 */
@Entity(tableName = TABLE_NAME)
data class Post(

    @PrimaryKey
    var id: Int? = 0,
    var download_url: String? = null
) {
    companion object {
        const val TABLE_NAME = "imageium_posts"
    }
}
