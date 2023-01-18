package com.example.projectmobiledailyfe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.util.Patterns.EMAIL_ADDRESS
import android.widget.Toast
import com.example.projectmobiledailyfe.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth
import java.util.*
import java.util.regex.Pattern

class RegisterActivity : AppCompatActivity() {

    lateinit var  binding: ActivityRegisterBinding
    lateinit var auth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()

        binding.btnArahLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.btnRegister.setOnClickListener {

            val email = binding.registeremail.text.toString()
            val password = binding.registerpassword.text.toString()

            if (email.isEmpty()) {
                binding.registeremail.error = "Email harus diisi"
                binding.registeremail.requestFocus()
                return@setOnClickListener
            }
            if (password.isEmpty()) {
                binding.registerpassword.error = "Password harus diisi"
                binding.registerpassword.requestFocus()
                return@setOnClickListener
            }
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.registeremail.error = "Email tidak Valid"
                binding.registeremail.requestFocus()
                return@setOnClickListener
            }

            RegisterFirebase(email,password)
        }
    }
    private fun RegisterFirebase (email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Register Berhasil", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this, LoginActivity::class.java)
                    startActivity(intent)
                } else {
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }
    }
}

