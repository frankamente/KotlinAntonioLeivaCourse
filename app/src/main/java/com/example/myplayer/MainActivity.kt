package com.example.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showToast("Hello")
        changeTextView("Hello Fran")
    }

    private fun changeTextView(message: String) {
        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = message
    }

    private fun showToast(text: String){
        android.widget.Toast.makeText(applicationContext, text, android.widget.Toast.LENGTH_SHORT).show()
    }
}
