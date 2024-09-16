package com.example.dependencyinjectionlearning

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@InstallIn(FragmentComponent::class) // used in fragment
@Module
class UserModule {

    @Provides
    fun provideUserRepository(): UserRepository {
        return FirebaseRepository()
    }
}