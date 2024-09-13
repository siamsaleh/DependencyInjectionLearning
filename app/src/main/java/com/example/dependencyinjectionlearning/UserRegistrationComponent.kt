package com.example.dependencyinjectionlearning

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
    fun getEmailService(): EmailService
}