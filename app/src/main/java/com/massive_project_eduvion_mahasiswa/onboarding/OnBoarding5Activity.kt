package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.databinding.ActivityOnBoarding5Binding

class OnBoarding5Activity : AppCompatActivity() {
    private lateinit var binding: ActivityOnBoarding5Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoarding5Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToOnBoarding6(view: View) {
        val intent = Intent(this, OnBoarding6Activity::class.java)
        startActivity(intent)
    }
    fun navigateToOnBoarding4(view: View) {
        val intent = Intent(this, OnBoarding4Activity::class.java)
        startActivity(intent)
    }
}