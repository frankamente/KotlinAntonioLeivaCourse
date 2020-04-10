package com.example.myplayer

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

fun Context.toast(message: String, toastLength: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, toastLength).show()
}

fun RecyclerView.ViewHolder.toast(message: String) {
    this.itemView.context.toast(message)
}

fun ViewGroup.inflate(layoutResourceId: Int, attachToParent: Boolean = false): View {
    return LayoutInflater.from(this.context).inflate(layoutResourceId, this, attachToParent)
}

fun ImageView.loadUrl(thumbUrl: String) {
    Picasso.with(context).load(thumbUrl).into(this)
}

inline fun <reified T : View> View.find(resourceId: Int): T {
    return findViewById<T>(resourceId)
}

inline fun <reified T : View> RecyclerView.ViewHolder.find(resourceId: Int): T {
    return itemView.find<T>(resourceId)
}