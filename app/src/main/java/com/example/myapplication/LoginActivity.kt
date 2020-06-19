package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val button: Button =findViewById(R.id.btnOK)


        button.setOnClickListener {
            Toast.makeText( this, "OK" ,Toast.LENGTH_SHORT).show()


        val intent = Intent (this,MainActivity::class.java)
        startActivity(intent)
        }

    }
}