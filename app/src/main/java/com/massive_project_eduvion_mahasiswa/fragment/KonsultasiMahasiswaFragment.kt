package com.massive_project_eduvion_mahasiswa.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.massive_project_eduvion_dosen.network.RetrofitClient
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.databinding.FragmentKonsultasiMahasiswaBinding
import com.massive_project_eduvion_mahasiswa.models.DissertationsRequest
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class KonsultasiMahasiswaFragment : Fragment() {

    private lateinit var binding: FragmentKonsultasiMahasiswaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentKonsultasiMahasiswaBinding.inflate(inflater, container, false)

        binding.btnAjukanSkripsi.setOnClickListener {
            val name = binding.inputName.text
            val npm = binding.inputNim.text
            val topikSkripsi = binding.inputTopikSkripsi.text
            val dosenPembimbing = binding.inputDosenPembimbing.text
            val judulSkripsi = binding.inputJudulSkripsi.text

            prosesAjukanSkripsi()
        }

        return binding.root
    }

    private fun navigateToKonsultasiMahasiswa2Fragment() {
        // Create an instance of the fragment you want to navigate to
        val fragmentKonsultasiMahasiswa2Fragment = KonsultasiMahasiswa2Fragment()

        // Get the FragmentManager
        val fragmentManager = parentFragmentManager

        // Begin the transaction
        val transaction = fragmentManager.beginTransaction()

        // Replace the current fragment with the new one
        transaction.replace(R.id.fragment_container, fragmentKonsultasiMahasiswa2Fragment)

        // Add the transaction to the back stack (optional)
        transaction.addToBackStack(null)

        // Commit the transaction
        transaction.commit()
    }

    private fun prosesAjukanSkripsi() {
        val request = DissertationsRequest()
        request.name = binding.inputName.text.toString()
        request.npm = binding.inputNim.text.toString()
        request.chapter = binding.inputTopikSkripsi.text.toString()
        request.supervisor = binding.inputDosenPembimbing.text.toString()
        request.title = binding.inputJudulSkripsi.text.toString()


        RetrofitClient.getApi().createDissertations(request)
            .enqueue(object : Callback<DissertationsResponse> {
                override fun onResponse(
                    call: Call<DissertationsResponse>,
                    response: Response<DissertationsResponse>
                ) {
                    val data = response.body()
                    if (data != null) {
                        Log.d("data berhasil:", data.toString())
                        navigateToKonsultasiMahasiswa2Fragment()
                    } else {
                        Log.e("data belum berhasil kode:", response.code().toString())
                        activity?.runOnUiThread {
                            Toast.makeText(requireContext(), "Silakan masukkan data", Toast.LENGTH_SHORT).show()
                        }
                    }
                }

                override fun onFailure(call: Call<DissertationsResponse>, t: Throwable) {
                    Log.e("errorr brow:", t.message.toString())
                }

            })
    }

}

