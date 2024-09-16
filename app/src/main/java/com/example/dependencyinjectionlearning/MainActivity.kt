package com.example.dependencyinjectionlearning

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint // For Activity Class
class MainActivity : AppCompatActivity() {

    /*@Inject
    lateinit var userRepository: UserRepository*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*userRepository.saveUser("test@gmail.com", "123456")*/
    }
}