package com.example.dependencyinjectionlearning

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp // For Application Class
class UserApplication: Application() {

    /*@Inject
    lateinit var userRepository: UserRepository*/

    override fun onCreate() {
        super.onCreate()

        /*userRepository.saveUser("test@gmail.com", "123456")*/
    }
}