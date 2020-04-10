package com.example.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mediaAdapter = MediaAdapter() { (title) -> toast(title) }
    val recyclerView by lazy { findViewById<RecyclerView>(R.id.recycler) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = mediaAdapter
        mediaAdapter.items = getMedia()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.filter_photos -> {
                mediaAdapter.items =
                    getMedia().filter { mediaItem -> mediaItem.type == MediaItem.Type.PHOTO }
            }
            R.id.filter_videos -> {
                mediaAdapter.items =
                    getMedia().filter { mediaItem -> mediaItem.type == MediaItem.Type.VIDEO }
            }
            else -> {
                mediaAdapter.items = getMedia()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
