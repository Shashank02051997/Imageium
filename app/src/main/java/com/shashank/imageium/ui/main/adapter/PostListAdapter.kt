package com.shashank.imageium.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.shashank.imageium.databinding.ItemPostBinding
import com.shashank.imageium.model.Post
import com.shashank.imageium.ui.main.viewholder.PostViewHolder

/**
 * Adapter class [RecyclerView.Adapter] for [RecyclerView] which binds [Post] along with [PostViewHolder]
 * @param onItemClicked which will receive callback when item is clicked.
 */
class PostListAdapter : ListAdapter<Post, PostViewHolder>(DIFF_CALLBACK) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PostViewHolder(
        ItemPostBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
    )

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) =
        holder.bind(getItem(position))

    companion object {
        private val DIFF_CALLBACK = object : DiffUtil.ItemCallback<Post>() {
            override fun areItemsTheSame(oldItem: Post, newItem: Post): Boolean =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Post, newItem: Post): Boolean =
                oldItem == newItem
        }
    }
}
