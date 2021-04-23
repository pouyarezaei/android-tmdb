package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.PopularPerson

data class PopularPersonResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<PopularPerson>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)