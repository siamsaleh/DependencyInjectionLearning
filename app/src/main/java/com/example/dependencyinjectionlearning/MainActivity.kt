package com.example.dependencyinjectionlearning

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder().build()

        val userRegistrationService = component.getUserRegistrationService()
        val emailService = component.getEmailService()

        userRegistrationService.registerUser("test@gmail.com", "111111")
    }

    // @InjectConstructor tells the Component how to create the object
}