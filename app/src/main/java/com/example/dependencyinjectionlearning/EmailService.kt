package com.example.dependencyinjectionlearning

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor(){

    fun send(email: String, from: String, body: String) {
        Log.d("LOGLOG", "send: Email Sent")
    }
}