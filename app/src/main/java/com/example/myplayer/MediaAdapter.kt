package com.example.myplayer

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.view_media_item.view.*
import kotlin.properties.Delegates

class MediaAdapter(val listener: (MediaItem) -> Unit) :
    RecyclerView.Adapter<MediaAdapter.ViewHolder>() {

    var items: List<MediaItem> by Delegates.observable(emptyList()) { _, _, _ ->
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = parent.inflate(R.layout.view_media_item)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val mediaItem = items[position]
        holder.bind(mediaItem)
        holder.itemView.setOnClickListener { listener(mediaItem) }
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        fun bind(item: MediaItem) {
            with(itemView) {
                media_title.text = item.title
                media_thumb.loadUrl(item.thumbUrl)
                media_video_indicator.visibility = when (item.type) {
                    MediaItem.Type.VIDEO -> View.VISIBLE
                    MediaItem.Type.PHOTO -> View.GONE
                }
            }
        }
    }
}
