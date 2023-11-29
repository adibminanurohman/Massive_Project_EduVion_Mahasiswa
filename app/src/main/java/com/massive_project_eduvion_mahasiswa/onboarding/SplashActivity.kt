package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.massive_project_eduvion_mahasiswa.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler().postDelayed({
            val intent = Intent(this@SplashScreen, OnBoardingActivity1::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}
