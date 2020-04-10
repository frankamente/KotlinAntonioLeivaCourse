package com.example.myplayer

import android.content.Context
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
}

fun RecyclerView.ViewHolder.toast(message: String) {
    this.itemView.context.toast(message)
}