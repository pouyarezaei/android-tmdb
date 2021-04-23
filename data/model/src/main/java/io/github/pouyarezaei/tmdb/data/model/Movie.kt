package io.github.pouyarezaei.tmdb.data.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class Movie(
    val id: Int?,
    val adult: Boolean?,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    val budget: Int?,
    val homepage: String?,
    @SerializedName("imdbI_id")
    val imdbId: String?,
    @SerializedName("original_language")
    val originalLanguage: String?,
    @SerializedName("original_title")
    val originalTitle: String?,
    val overview: String?,
    val popularity: Double?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("release_date")
    val releaseDate: Date?,
    val revenue: Long?,
    val runtime: Int?,
    val status: String?,
    @SerializedName("tagline")
    val tagLine: String?,
    val title: String?,
    val video: Boolean?,
    @SerializedName("vote_average")
    val voteAverage: Double?,
    @SerializedName("vote_count")
    val voteCount: Int?,
    val genres: List<Genre>,
    val production_companies: List<ProductionCompany>,
    val spoken_languages: List<SpokenLanguage>,
    val production_countries: List<ProductionCountry>
)