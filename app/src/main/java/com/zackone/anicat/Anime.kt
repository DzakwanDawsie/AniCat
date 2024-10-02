package com.zackone.anicat

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Anime(
    val title: String,
    val synopsis: String,
    val image: String,
    val studio: String,
    val releaseYear: Int,
    val releaseSeason: String
): Parcelable
