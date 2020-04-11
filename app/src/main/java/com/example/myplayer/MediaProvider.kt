package com.example.myplayer

object MediaProvider {

    private val thumbBase = "https://picsum.photos/id/"
    private val thumbSize = "/200/300"

    val data = (1..10).map {
        MediaItem(
            it,
            "Title $it",
            "$thumbBase$it$thumbSize",
            when {
                it % 3 == 0 -> MediaItem.Type.PHOTO
                else -> MediaItem.Type.VIDEO
            }
        )
    }
}