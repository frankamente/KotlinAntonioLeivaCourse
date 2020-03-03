package com.example.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button)
        val textInput = findViewById<TextView>(R.id.editText)
        button.setOnClickListener{
            showToast("Hello ${textInput.text}")
        }
    }

    private fun showToast(text: String){
        android.widget.Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_SHORT).show()
    }
}
