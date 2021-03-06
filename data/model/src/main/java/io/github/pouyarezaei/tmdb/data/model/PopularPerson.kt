package io.github.pouyarezaei.tmdb.data.model

import io.github.pouyarezaei.tmdb.data.model.KnownFor

data class PopularPerson(
    val adult: Boolean,
    val gender: Int,
    val id: Int,
    val known_for: List<KnownFor>,
    val known_for_department: String,
    val name: String,
    val popularity: Double,
    val profile_path: String
)