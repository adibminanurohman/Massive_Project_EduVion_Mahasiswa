package com.massive_project_eduvion_mahasiswa.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.databinding.ActivityBarcode2Binding
import com.massive_project_eduvion_mahasiswa.databinding.ActivityRoomchatBinding
import com.massive_project_eduvion_mahasiswa.databinding.FragmentChatMahasiswaBinding

class RoomchatActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRoomchatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRoomchatBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun navigateToPengaturanActivity(view: View) {
        val intent = Intent(this, PengaturanActivity::class.java)
        startActivity(intent)
    }
}