package com.massive_project_eduvion_mahasiswa.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.massive_project_eduvion_mahasiswa.R

class AddJadwalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_jadwal)
    }

    fun navigateToKalenderActivity(view: View) {
        // Assuming KonsultasiMahasiswa2Activity is the target activity
        val intent = Intent(this, KalenderActivity::class.java)
        startActivity(intent)
    }
}

