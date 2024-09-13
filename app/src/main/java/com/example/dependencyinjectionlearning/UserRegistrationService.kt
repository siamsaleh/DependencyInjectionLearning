package com.example.dependencyinjectionlearning

import javax.inject.Inject

class UserRegistrationService @Inject constructor( // This inject will tell how to create this object
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "no-reply@gmail.com", "User Registered")
    }
}