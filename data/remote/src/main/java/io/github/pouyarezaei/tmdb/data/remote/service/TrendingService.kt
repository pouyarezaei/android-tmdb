package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.remote.response.MovieDiscoverResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TrendingService {

    /**
     * Get the daily or weekly trending items. The daily trending list tracks items over the period of a day while items have a 24 hour half life. The weekly list tracks items over a 7 day period, with a 7 day half life.
     * @param mediaType  Valid Media Types {all,movie,tv,person}
     * @param time   Valid Time Windows {day,week}
     *
     */
    @GET("trending/{type}/{time}")
    suspend fun getTrending(
        @Path("type") mediaType: String,
        @Path("time") time: String
    ): MovieDiscoverResponse

}