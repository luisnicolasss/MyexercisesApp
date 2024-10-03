package com.example.myexercisesapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myexercisesapp.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    lateinit var binding : ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityIntroBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}