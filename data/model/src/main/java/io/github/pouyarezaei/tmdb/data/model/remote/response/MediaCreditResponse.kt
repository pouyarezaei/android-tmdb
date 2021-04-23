package io.github.pouyarezaei.tmdb.data.model.remote.response

import com.google.gson.annotations.SerializedName
import io.github.pouyarezaei.tmdb.data.model.GuestStar
import io.github.pouyarezaei.tmdb.data.model.MediaCast
import io.github.pouyarezaei.tmdb.data.model.MediaCrew

data class MediaCreditResponse(
    @SerializedName("cast")
    val cast: List<MediaCast>,
    @SerializedName("crew")
    val crew: List<MediaCrew>,
    @SerializedName("guest_star")
    val guestStar: List<GuestStar>,
    @SerializedName("id")
    val id: Int
)