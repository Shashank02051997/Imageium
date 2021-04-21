package com.shashank.imageium.module

import com.shashank.imageium.data.repository.DefaultPostRepository
import com.shashank.imageium.data.repository.PostRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import kotlinx.coroutines.ExperimentalCoroutinesApi

/**
 * Currently PostRepository is only used in ViewModels.
 */
@ExperimentalCoroutinesApi
@InstallIn(ActivityRetainedComponent::class)
@Module
abstract class PostRepositoryModule {

    @ActivityRetainedScoped
    @Binds
    abstract fun bindPostRepository(repository: DefaultPostRepository): PostRepository
}
