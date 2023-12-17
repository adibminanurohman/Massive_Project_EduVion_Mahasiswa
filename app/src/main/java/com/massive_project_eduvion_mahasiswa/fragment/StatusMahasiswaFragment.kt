package com.massive_project_eduvion_mahasiswa.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.massive_project_eduvion_dosen.network.RetrofitClient
import com.massive_project_eduvion_mahasiswa.R
import com.massive_project_eduvion_mahasiswa.adapter.KonsultasiAdapter
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponseItem
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class StatusMahasiswaFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: KonsultasiAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_status_mahasiswa, container, false)
        recyclerView = view.findViewById(R.id.rv_konsultasi)

        // Atur layout manager untuk RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        // Inflate the layout for this fragment
        ambilData()
        return view
    }


    private fun ambilData(){
        RetrofitClient.getApi().getAllDissertation().enqueue(object : Callback<List<DissertationsResponseItem>> {
            override fun onResponse(
                call: Call<List<DissertationsResponseItem>>,
                response: Response<List<DissertationsResponseItem>>
            ) {
                val data = response.body()
                if (data != null){
                    adapter = KonsultasiAdapter(data)
                    recyclerView.adapter = adapter
                    Log.d("data", response.body().toString())
                }else{
                    Log.e("data konsultasi belum berhasil", response.code().toString())
                }
            }

            override fun onFailure(call: Call<List<DissertationsResponseItem>>, t: Throwable) {
                Log.e("errorrrrr", t.message.toString())
            }


        })
    }

}