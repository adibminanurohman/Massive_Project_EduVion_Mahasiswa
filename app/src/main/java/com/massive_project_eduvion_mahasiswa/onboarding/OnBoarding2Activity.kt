package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.databinding.ActivityOnBoarding2Binding

class OnBoarding2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding3(view: View) {
        val intent = Intent(this, OnBoarding3Activity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding1(view: View) {
        val intent = Intent(this, OnBoardingActivity1::class.java)
        startActivity(intent)
    }
}