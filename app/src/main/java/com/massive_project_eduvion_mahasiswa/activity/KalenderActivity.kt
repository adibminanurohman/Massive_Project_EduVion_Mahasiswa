package com.massive_project_eduvion_mahasiswa.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.MainActivity
import com.massive_project_eduvion_mahasiswa.R

class KalenderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalender)
    }
    fun navigateToAddKalenderActivity(view: View) {
        val intent = Intent(this, AddJadwalActivity::class.java)
        startActivity(intent)
    }
}