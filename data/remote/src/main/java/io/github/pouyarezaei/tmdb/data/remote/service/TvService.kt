package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.Tv
import io.github.pouyarezaei.tmdb.data.model.remote.response.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TvService {
    /**
     * Search for a TV show.
     * @param query  Pass a text query to search. This value should be URI encoded. required
     * @param page Specify which page to query.
     */
    @GET("search/tv")
    suspend fun searchTv(
        @Query("query") query: String,
        @Query("page") page: Int
    ): TvDiscoverResponse

    /**
     * Get the primary TV show details by id.
     * @param TvId Specify which TvShow to query.
     */
    @GET("tv/{id}")
    suspend fun getTvDetails(@Path("id") tvId: Int): Tv

    /**
     * Get the credits (cast and crew) that have been added to a TV show.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/credits")
    suspend fun getTvCredits(@Path("id") tvId: Int): MediaCreditResponse

    /**
     * Get the images that belong to a TV show.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/images")
    suspend fun getTvImages(@Path("id") tvId: Int): ImageResponse

    /**
     * Get the videos that have been added to a TV show.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/videos")
    suspend fun getTvVideos(@Path("id") tvId: Int): VideoResponse


    /**
     * Get the keywords that have been added to a TV show.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/keywords")
    suspend fun getTvKeywords(@Path("id") tvId: Int): KeywordResponse

    /**
     *Get the list of TV show recommendations for this item.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/recommendations")
    suspend fun getTvRecommendations(@Path("id") tvId: Int): TvDiscoverResponse

    /**
     * Get the reviews for a TV show.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/reviews")
    suspend fun getTvReviews(@Path("id") tvId: Int): ReviewResponse

    /**
     * Get a list of similar TV shows. These items are assembled by looking at keywords and genres.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/similar")
    suspend fun getSimilarTvShows(@Path("id") tvId: Int): TvDiscoverResponse

    /**
     * Get a list of the top rated TV shows on TMDb.
     */
    @GET("tv/top_rated")
    suspend fun getTopRatedTvShows(): TvDiscoverResponse

    /**
     * Get a list of the current popular TV shows on TMDb. This list updates daily.
     */
    @GET("tv/popular")
    suspend fun getPopularTvShows(): TvDiscoverResponse

    /**
     * Get the most newly created TV show. This is a live response and will continuously change.
     */
    @GET("tv/latest")
    suspend fun getLatestTvShows(): Tv

    /**
     * Get a list of TV shows that are airing today. This query is purely day based as we do not currently support airing times.
     * @param page Specify which page to query.
     */
    @GET("tv/airing_today")
    suspend fun getLatestMovies(@Query("page") page: Int): TvDiscoverResponse

    /**
     * Get a list of shows that are currently on the air.
     * This query looks for any TV show that has an episode with an air date in the next 7 days.
     * @param page Specify which page to query.
     */
    @GET("tv/on_the_air")
    suspend fun getOnTheAirTvShows(@Query("page") page: Int): TvDiscoverResponse


}


