package com.example.myplayer

object MediaProvider {

    private val thumbBase = "https://picsum.photos/id/"

    val data = listOf(
        MediaItem("Title 1", "${thumbBase}1/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 2", "${thumbBase}2/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 3", "${thumbBase}3/200/300", MediaItem.Type.VIDEO),
        MediaItem("Title 4", "${thumbBase}4/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 5", "${thumbBase}5/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 6", "${thumbBase}6/200/300", MediaItem.Type.VIDEO),
        MediaItem("Title 7", "${thumbBase}7/200/300", MediaItem.Type.VIDEO),
        MediaItem("Title 8", "${thumbBase}8/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 9", "${thumbBase}9/200/300", MediaItem.Type.PHOTO),
        MediaItem("Title 10", "${thumbBase}10/200/300", MediaItem.Type.VIDEO)
    )
}