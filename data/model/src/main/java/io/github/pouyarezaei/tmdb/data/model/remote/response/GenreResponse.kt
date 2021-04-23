package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.Genre

data class GenreResponse(
    @SerializedName("genres")
    val genres: List<Genre>
)