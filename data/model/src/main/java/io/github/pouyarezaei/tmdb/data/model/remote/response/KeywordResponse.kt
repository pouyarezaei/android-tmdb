package io.github.pouyarezaei.tmdb.data.model.remote.response
import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.Keyword

data class KeywordResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("keywords")
    val keywords: List<Keyword>
)