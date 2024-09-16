package com.example.dependencyinjectionlearning

import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import javax.inject.Named

@InstallIn(FragmentComponent::class) // used in fragment
@Module
class UserModule {


    // @Binds
    // abstract fun bindsUserRepository(sqlRepository: SQLRepository): UserRepository // binds the UserRepository interface to the SQLRepository class

    @Provides
//    @Named("sql")
    @SqlQualifier
    fun provideSQLRepository(sqlRepository: SQLRepository): UserRepository {
        return SQLRepository()
    }

    @Provides
//    @Named("firebase")
    @FirebaseQualifier
    fun provideFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}