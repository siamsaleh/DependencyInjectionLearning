package com.example.dependencyinjectionlearning

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepository"

class UserRepository @Inject constructor(
    private val loggerService: LoggerService // Constructor Injection
) {

    fun saveUser(email: String, password: String) {
        loggerService.log("saveUser: User Saved in DB")
    }
}