package com.massive_project_eduvion_mahasiswa.onboarding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.massive_project_eduvion_dosen.models.LoginRequest
import com.massive_project_eduvion_dosen.models.LoginResponse
import com.massive_project_eduvion_dosen.network.RetrofitClient
import com.massive_project_eduvion_mahasiswa.activity.Barcode1Activity
import com.massive_project_eduvion_mahasiswa.activity.LoadingScreenActivity
import com.massive_project_eduvion_mahasiswa.databinding.ActivityLoginBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.edtLoginEmail.text
            val pass = binding.edtLoginPassword.text

            prosesLogin()
        }
    }

    private fun prosesLogin(){
        val request = LoginRequest()
        request.email = binding.edtLoginEmail.text.toString()
        request.password = binding.edtLoginPassword.text.toString()

        RetrofitClient.getApi(this).login(request).enqueue(object : Callback<LoginResponse>{
            override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                val data = response.body()
                var token = data?.token
                Log.d("data: ", data.toString())
                if (token != null){
                    startActivity(Intent(this@LoginActivity, LoadingScreenActivity::class.java))
                }else{
                    Toast.makeText(this@LoginActivity, "Akun anda tidak terdaftar", Toast.LENGTH_LONG).show()
                }
            }

            override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                Log.e("error: ", t.message.toString())

                Toast.makeText(this@LoginActivity, "eror tidak bisa ambil data", Toast.LENGTH_LONG).show()
            }
        })
    }

    fun navigateToBarcode1(view: View) {
        val intent = Intent(this, Barcode1Activity::class.java)
        startActivity(intent)
    }
}