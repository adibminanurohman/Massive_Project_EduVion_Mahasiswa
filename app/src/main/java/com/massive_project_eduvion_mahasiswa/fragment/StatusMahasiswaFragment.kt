package com.massive_project_eduvion_mahasiswa.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.massive_project_eduvion_dosen.network.RetrofitClient
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.databinding.FragmentStatusMahasiswaBinding
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StatusMahasiswaFragment : Fragment() {
    private lateinit var binding: FragmentStatusMahasiswaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentStatusMahasiswaBinding.inflate(inflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        ambilData()
    }

    private fun ambilData(){
        RetrofitClient.getApi().getAllDissertations().enqueue(object : Callback<DissertationsResponse>{
            override fun onResponse(
                call: Call<DissertationsResponse>,
                response: Response<DissertationsResponse>
            ) {
                val data = response.body()
                if (data != null){
                    Log.d("data konsultasi berhasil", data.toString())
                    // Lakukan sesuatu dengan data yang diterima di sini
                    // Contoh: binding.teksView.text = data.toString()
                } else {
                    Log.e("data konsultasi belum berhasil", response.code().toString())
                }
            }

            override fun onFailure(call: Call<DissertationsResponse>, t: Throwable) {
                Log.e("data eror", t.message.toString())
            }
        })
    }
}
