package com.faiq.tutorialdasaryoutube

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.faiq.tutorialdasaryoutube.databinding.ActivityLoginLinearBinding


class LoginActivity: AppCompatActivity() {
    lateinit var binding: ActivityLoginLinearBinding
    lateinit var email: String
    lateinit var password: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("PRINT-LOG", "1")
        Log.d("PRINT-LOG", "2")
        binding.btnLogin.setOnClickListener {
            email = binding.etEmail.text.toString()
            password = binding.etPassword.text.toString()
            Log.d("PRINT-LOG", email)


            if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
                Toast.makeText(applicationContext, "Email atau password masih kosong", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Sukses! Anda sudah memasukkan Email dan Password", Toast.LENGTH_SHORT).show()
            }
        }
    }
}