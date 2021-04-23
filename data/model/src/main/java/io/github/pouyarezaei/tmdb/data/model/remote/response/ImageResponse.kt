package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.Poster

data class ImageResponse(
    val backdrops: List<Poster>? = null,
    val id: Int,
    @SerializedName(value = "posters", alternate = ["stills", "profiles"])
    val posters: List<Poster>
)