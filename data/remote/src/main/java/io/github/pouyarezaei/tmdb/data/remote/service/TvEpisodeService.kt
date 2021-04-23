package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.Episode
import io.github.pouyarezaei.tmdb.data.model.remote.response.ImageResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.MediaCreditResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.VideoResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface TvEpisodeService {
    /**
     * Get the TV episode details by id.
     * Supports append_to_response.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     * @param episodeNumber Specify which episode of season to query.
     */
    @GET("tv/{id}/season/{season_number}/episode/{episode_number}")
    suspend fun getEpisodeDetails(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int,
        @Path("episode_number") episodeNumber: Int
    ): Episode

    /**
     * Get the credits (cast, crew and guest stars) for a TV episode.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     * @param episodeNumber Specify which episode of season to query.
     */
    @GET("tv/{id}/season/{season_number}/episode/{episode_number}/credits")
    suspend fun getEpisodeCredits(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int,
        @Path("episode_number") episodeNumber: Int
    ): MediaCreditResponse

    /**
     * Get the images that belong to a TV episode.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     * @param episodeNumber Specify which episode of season to query.
     */
    @GET("tv/{id}/season/{season_number}/episode/{episode_number}/images")
    suspend fun getEpisodeImage(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int,
        @Path("episode_number") episodeNumber: Int
    ): ImageResponse

    /**
     * Get the images that belong to a TV episode.
     * @param tvId Specify which TvShow to query.
     * @param seasonNumber Specify which season of TvShow to query.
     * @param episodeNumber Specify which episode of season to query.
     */
    @GET("tv/{id}/season/{season_number}/episode/{episode_number}/videos")
    suspend fun getEpisodeVideos(
        @Path("id") tvId: Int,
        @Path("season_number") seasonNumber: Int,
        @Path("episode_number") episodeNumber: Int
    ): VideoResponse

}