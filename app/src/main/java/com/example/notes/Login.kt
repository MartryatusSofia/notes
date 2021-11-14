package com.example.notes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val intenButton: Button = findViewById(R.id.btnRegister)
        intenButton.setOnClickListener{viewHome()}
    }

    private fun viewHome(){
        val intent = Intent(this, Register::class.java)
        startActivity(intent)
    }
}