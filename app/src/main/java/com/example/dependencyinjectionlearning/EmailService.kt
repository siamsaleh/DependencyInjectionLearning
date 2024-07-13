package com.example.dependencyinjectionlearning

import android.util.Log

class EmailService {

    fun send(email: String, from: String, body: String) {
        Log.d("LOGLOG", "send: Email Sent")
    }
}