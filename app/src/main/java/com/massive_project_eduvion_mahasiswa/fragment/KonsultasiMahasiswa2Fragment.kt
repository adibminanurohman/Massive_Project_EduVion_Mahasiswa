package com.massive_project_eduvion_mahasiswa.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.databinding.FragmentKonsultasiMahasiswa2Binding
import com.massive_project_eduvion_mahasiswa.databinding.FragmentKonsultasiMahasiswaBinding

class KonsultasiMahasiswa2Fragment : Fragment() {
    private lateinit var binding: FragmentKonsultasiMahasiswa2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKonsultasiMahasiswa2Binding.inflate(inflater, container, false)

        binding.imageButton14.setOnClickListener {
            navigateToKonsultasiMahasiswa3Fragment()
        }

        binding.imageButton13.setOnClickListener {
            navigateToChatMahasiswaFragment()
        }

        return binding.root
    }

    private fun navigateToKonsultasiMahasiswa3Fragment() {
        // Create an instance of the fragment you want to navigate to
        val fragmentKonsultasiMahasiswa3 = KonsultasiMahasiswa3Fragment()

        // Get the FragmentManager
        val fragmentManager = parentFragmentManager

        // Begin the transaction
        val transaction = fragmentManager.beginTransaction()

        // Replace the current fragment with the new one
        transaction.replace(R.id.fragment_container, fragmentKonsultasiMahasiswa3)

        // Add the transaction to the back stack (optional)
        transaction.addToBackStack(null)

        // Commit the transaction
        transaction.commit()
    }

    private fun navigateToChatMahasiswaFragment() {
        // Create an instance of the fragment you want to navigate to
        val fragmentChatMahasiswa = ChatMahasiswaFragment()

        // Get the FragmentManager
        val fragmentManager = parentFragmentManager

        // Begin the transaction
        val transaction = fragmentManager.beginTransaction()

        // Replace the current fragment with the new one
        transaction.replace(R.id.fragment_container, fragmentChatMahasiswa)

        // Add the transaction to the back stack (optional)
        transaction.addToBackStack(null)

        // Commit the transaction
        transaction.commit()
    }
}