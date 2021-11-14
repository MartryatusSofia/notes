package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class Register : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        auth = FirebaseAuth.getInstance()

        val intenButton1: Button = findViewById(R.id.btnSignup)
        intenButton1.setOnClickListener { viewhome1() }

        val intenButton2: Button = findViewById(R.id.btnLogin)
        intenButton2.setOnClickListener { viewhome2() }
    }

    private fun viewhome1() {
        val email =


    }

    private fun viewhome2() {
        val intent = Intent(this, Home::class.java)
        startActivity(intent)
    }
}


