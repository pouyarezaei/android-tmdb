package io.github.pouyarezaei.tmdb.data.model

import com.google.gson.annotations.SerializedName

data class Person(

    @SerializedName("id")
    val id: Int,

    @SerializedName("adult")
    val adult: Boolean,
    @SerializedName("also_known_as")
    val also_known_as: List<String>,

    @SerializedName("biography")
    val biography: String,

    @SerializedName("birthday")
    val birthday: String,

    @SerializedName("deathday")
    val deathday: String,

    val gender: Int,

    val homepage: String,

    val imdbId: String,

    val knownForDepartment: String,

    val name: String,

    val placeOfBirth: String,

    val popularity: Double,

    val profilePath: String
)