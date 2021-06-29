package com.shashank.imageium.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.shashank.imageium.data.repository.PostRepository
import com.shashank.imageium.model.Post
import com.shashank.imageium.model.State
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * ViewModel for [MainActivity]
 */
@ExperimentalCoroutinesApi
@HiltViewModel
class MainViewModel @Inject constructor(private val postRepository: PostRepository) :
    ViewModel() {

    private val _postsLiveData = MutableLiveData<State<List<Post>>>()

    val postsLiveData: LiveData<State<List<Post>>> = _postsLiveData

    fun getPosts() {
        viewModelScope.launch {
            postRepository.getAllPosts()
                .onStart { _postsLiveData.value = State.loading() }
                .map { resource -> State.fromResource(resource) }
                .collect { state -> _postsLiveData.value = state }
        }
    }
}
