package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.databinding.ActivityOnBoarding3Binding

class OnBoarding3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding4(view: View) {
        val intent = Intent(this, OnBoarding4Activity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding2(view: View) {
        val intent = Intent(this, OnBoarding2Activity::class.java)
        startActivity(intent)
    }
}