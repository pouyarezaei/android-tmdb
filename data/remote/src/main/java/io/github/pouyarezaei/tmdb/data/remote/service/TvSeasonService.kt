package io.github.pouyarezaei.tmdb.data.remote.service


import io.github.pouyarezaei.tmdb.data.model.Season
import io.github.pouyarezaei.tmdb.data.model.remote.response.ImageResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.MediaCreditResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.VideoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TvSeasonService {

    /**
     * Get the TV season details by id.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     */
    @GET("tv/{id}/season/{season_number}")
    suspend fun getSeasonDetails(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int
    ): Season

    /**
     * Get the credits for TV season.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     */
    @GET("tv/{id}/season/{season_number}/credits")
    suspend fun getSeasonCredits(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int
    ): MediaCreditResponse

    /**
     * Get the images that belong to a TV season.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     */
    @GET("tv/{id}/season/{season_number}/images")
    suspend fun getSeasonImages(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int
    ): ImageResponse

    /**
     * Get the videos that have been added to a TV season.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     */
    @GET("tv/{id}/season/{season_number}/videos")
    suspend fun getSeasonVideos(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int
    ): VideoResponse

}