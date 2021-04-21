package com.shashank.imageium.module

import android.app.Application
import com.shashank.imageium.data.local.ImageiumPostsDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class FoodiumDatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(application: Application) = ImageiumPostsDatabase.getInstance(application)

    @Singleton
    @Provides
    fun providePostsDao(database: ImageiumPostsDatabase) = database.getPostsDao()
}
