package com.example.dependencyinjectionlearning

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//@Singleton
@ActivityScoped
class LoggerService @Inject constructor() {

    fun log(message: String) {
        Log.d(TAG, "log: $message")
    }
}