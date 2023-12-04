package com.massive_project_eduvion_mahasiswa.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.databinding.FragmentKonsultasiMahasiswaBinding

class KonsultasiMahasiswaFragment : Fragment() {

    private lateinit var binding: FragmentKonsultasiMahasiswaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKonsultasiMahasiswaBinding.inflate(inflater, container, false)

        binding.btnAjukanSkripsi.setOnClickListener {
            navigateToKonsultasiMahasiswa2Fragment()
        }

        return binding.root
    }

    private fun navigateToKonsultasiMahasiswa2Fragment() {
        // Create an instance of the fragment you want to navigate to
        val fragmentKonsultasiMahasiswa2 = KonsultasiMahasiswa2Fragment()

        // Get the FragmentManager
        val fragmentManager = parentFragmentManager

        // Begin the transaction
        val transaction = fragmentManager.beginTransaction()

        // Replace the current fragment with the new one
        transaction.replace(R.id.fragment_container, fragmentKonsultasiMahasiswa2)

        // Add the transaction to the back stack (optional)
        transaction.addToBackStack(null)

        // Commit the transaction
        transaction.commit()
    }
}
