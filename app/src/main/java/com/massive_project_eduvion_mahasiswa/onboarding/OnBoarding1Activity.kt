package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.databinding.ActivityOnBoarding1Binding

class OnBoardingActivity1 : AppCompatActivity() {

    private lateinit var binding: ActivityOnBoarding1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding1Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding2(view: View) {
        val intent = Intent(this, OnBoarding2Activity::class.java)
        startActivity(intent)
    }
}

