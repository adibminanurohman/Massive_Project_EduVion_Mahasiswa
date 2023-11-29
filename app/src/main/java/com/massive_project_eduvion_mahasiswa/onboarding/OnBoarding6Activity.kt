package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.databinding.ActivityOnBoarding6Binding

class OnBoarding6Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding6Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding6Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToLogin(view: View) {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding6(view: View) {
        val intent = Intent(this, OnBoarding6Activity::class.java)
        startActivity(intent)
    }
}