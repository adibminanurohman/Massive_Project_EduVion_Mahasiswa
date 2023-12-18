package com.massive_project_eduvion_mahasiswa.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.massive_project_eduvion_mahasiswa.R
import android.content.Intent
import android.util.Log
import com.massive_project_eduvion_dosen.network.RetrofitClient
import com.massive_project_eduvion_mahasiswa.databinding.ActivityAddJadwalBinding
import com.massive_project_eduvion_mahasiswa.models.DissertationsRequest
import com.massive_project_eduvion_mahasiswa.models.DissertationsResponse
import com.massive_project_eduvion_mahasiswa.models.EventRequest
import com.massive_project_eduvion_mahasiswa.models.EventResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class AddJadwalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddJadwalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddJadwalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnTambahkanJadwal.setOnClickListener {
            val name = binding.inputName.text.toString()
            val day = binding.inputDate.dayOfMonth +1
            val month = binding.inputDate.month + 1  // Note: Months are 0-indexed
            val year = binding.inputDate.year
            val date = "$year-$month-$day"
            val time = binding.inputTime.text.toString()
            val location = binding.inputLocation.text.toString()

            prosesAddJadwal(name, date, time, location)
        }
    }

    private fun navigateToKalenderActivity() {
        // Assuming KonsultasiMahasiswa2Activity is the target activity
        val intent = Intent(this, KalenderActivity::class.java)
        startActivity(intent)
    }

    private fun prosesAddJadwal(name: String, date: String, time: String, location: String) {
        val request = EventRequest()
        request.name = name
        request.date = convertStringToDate(date) // Convert String to Date
        request.time = time
        request.location = location

        RetrofitClient.getApi().createEvent(request)
            .enqueue(object : Callback<EventResponse> {
                override fun onResponse(
                    call: Call<EventResponse>,
                    response: Response<EventResponse>
                ) {
                    val data = response.body()
                    if (data != null) {
                        Log.d("data berhasil:", data.toString())
                        navigateToKalenderActivity()
                    } else {
                        Log.e("data belum berhasil kode:", response.code().toString())
                    }
                }

                override fun onFailure(call: Call<EventResponse>, t: Throwable) {
                    Log.e("errorr brow:", t.message.toString())
                }
            })
    }

    // Function to convert String to Date
    private fun convertStringToDate(dateString: String): Date? {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault())
        return try {
            dateFormat.parse(dateString)
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}