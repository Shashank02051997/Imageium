package com.shashank.imageium.ui.main.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.shashank.imageium.R
import com.shashank.imageium.databinding.ItemPostBinding
import com.shashank.imageium.model.Post
import com.shashank.imageium.ui.main.adapter.PostListAdapter

/**
 * [RecyclerView.ViewHolder] implementation to inflate View for RecyclerView.
 * See [PostListAdapter]]
 */
class PostViewHolder(private val binding: ItemPostBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(post: Post) {
        binding.imageView.load(post.download_url) {
            placeholder(R.drawable.ic_photo)
            error(R.drawable.ic_broken_image)
        }
    }
}
