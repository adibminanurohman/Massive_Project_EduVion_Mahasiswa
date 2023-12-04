package com.massive_project_eduvion_mahasiswa.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.activity.EjurnalActivity
import com.massive_project_eduvion_mahasiswa.activity.KalenderActivity
import com.massive_project_eduvion_mahasiswa.activity.NotifikasiActivity
import com.massive_project_eduvion_mahasiswa.databinding.FragmentHomeMahasiswaBinding

class HomeMahasiswaFragment : Fragment() {

    private lateinit var binding: FragmentHomeMahasiswaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeMahasiswaBinding.inflate(inflater, container, false)

        binding.imageButton5.setOnClickListener {
            navigateToEjurnalActivity()
        }
        binding.imageButton4.setOnClickListener {
            navigateToKalenderActivity()
        }
        binding.imageButton3.setOnClickListener{
            navigateToNotifikasiActivity()
        }

        return binding.root
    }

    private fun navigateToEjurnalActivity() {
        val intent = Intent(requireContext(), EjurnalActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToKalenderActivity() {
        val intent = Intent(requireContext(), KalenderActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToNotifikasiActivity(){
        val intent = Intent(requireContext(), NotifikasiActivity::class.java)
        startActivity(intent)
    }
}