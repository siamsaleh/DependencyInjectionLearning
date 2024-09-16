package com.example.dependencyinjectionlearning

import android.util.Log
import javax.inject.Inject

const val TAG = "UserRepository"

interface UserRepository{
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser in SQL: $email, $password")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "saveUser in Firebase: $email, $password")
    }
}