package com.example.dependencyinjectionlearning

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String) {
        Log.d("LOGLOG", "saveUser: Email Save")
    }
}