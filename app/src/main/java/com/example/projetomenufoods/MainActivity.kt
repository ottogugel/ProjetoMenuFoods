package com.example.projetomenufoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.botao1)
        botao.setOnClickListener {
            Toast.makeText(this, "Olá, Android", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

    }
}