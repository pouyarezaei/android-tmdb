package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.PersonCast
import io.github.pouyarezaei.tmdb.data.model.PersonCrew

data class PersonCreditResponse(
    @SerializedName("cast")
    val cast: List<PersonCast>,
    @SerializedName("crew")
    val crew: List<PersonCrew>,
    @SerializedName("id")
    val id: Int
)