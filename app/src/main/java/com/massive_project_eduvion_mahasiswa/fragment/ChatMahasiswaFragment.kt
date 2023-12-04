package com.massive_project_eduvion_mahasiswa.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.activity.EjurnalActivity
import com.massive_project_eduvion_mahasiswa.activity.PengaturanActivity
import com.massive_project_eduvion_mahasiswa.activity.RoomchatActivity
import com.massive_project_eduvion_mahasiswa.databinding.FragmentChatMahasiswaBinding
import com.massive_project_eduvion_mahasiswa.databinding.FragmentHomeMahasiswaBinding

class ChatMahasiswaFragment : Fragment() {
    private lateinit var binding: FragmentChatMahasiswaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentChatMahasiswaBinding.inflate(inflater, container, false)

        binding.imageView10.setOnClickListener {
            navigateToRoomchatActivity()
        }
        binding.imageButton11.setOnClickListener{
            navigateToPengaturanActivity()
        }
        return binding.root
    }
    private fun navigateToRoomchatActivity() {
        val intent = Intent(requireContext(), RoomchatActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToPengaturanActivity(){
        val intent = Intent(requireContext(), PengaturanActivity::class.java)
        startActivity(intent)
    }
}