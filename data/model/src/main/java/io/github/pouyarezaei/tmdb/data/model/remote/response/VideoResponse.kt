package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.Video

data class VideoResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("results")
    val results: List<Video>
)