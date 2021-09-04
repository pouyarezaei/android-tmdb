package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.Movie
import io.github.pouyarezaei.tmdb.data.model.remote.response.*
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieService {
    /**
     * Search for a TV show.
     * @param query  Pass a text query to search. This value should be URI encoded. required
     * @param page Specify which page to query.
     */
    @GET("search/movie")
    suspend fun searchMovies(
        @Query("query") query: String,
        @Query("page") page: Int
    ): MovieDiscoverResponse

    /**
     * Get the primary information about a movie.
     * Supports append_to_response.
     * @param movieId Specify which page to query.
     */
    @GET("movie/{id}")
    suspend fun getMovieById(@Path("id") movieId: Int): Movie

    /**
     * Get the videos that have been added to a movie.
     * @param movieId Specify which page to query.
     */
    @GET("movie/{id}/videos")
    suspend fun getMovieVideos(@Path("id") movieId: Int): VideoResponse

    /**
     * Get the user reviews for a movie.
     * @param tvId Specify which TvShow to query.
     */
    @GET("tv/{id}/reviews")
    suspend fun getMovieReviews(@Path("id") tvId: Int): ReviewResponse

    /**
     * Get the images that have been added to a movie.
     * @param movieId Specify which page to query.
     */
    @GET("/movie/{id}/images")
    suspend fun getMovieImages(@Path("id") movieId: Int): ImageResponse

    /**
     * Get the keywords that have been added to a movie.
     * @param movieId Specify which page to query.
     */
    @GET("movie/{id}/keywords")
    suspend fun getMovieKeywords(@Path("id") movieId: Int): KeywordResponse

    /**
     * Get a list of recommended movies for a movie.
     * @param movieId Specify which page to query.
     * @param page Specify which page to query.
     */
    @GET("movie/{id}/recommendations")
    suspend fun getMovieRecommendations(
        @Path("id") movieId: Int,
        @Query("page") page: Int
    ): MovieDiscoverResponse

    /**
     * Get the credits (cast and crew) that have been added to a TV show.
     * @param movieId Specify which movie to query.
     */
    @GET("movie/{id}/credits")
    suspend fun getTvCredits(@Path("id") movieId: Int): MediaCreditResponse

    /**
     * Get a list of similar movies. This is not the same as the "Recommendation" system you see on the website.
     * @param movieId Specify which page to query.
     * @param page Specify which page to query.
     */
    @GET("movie/{id}/similar")
    suspend fun getSimilarMovies(
        @Path("id") movieId: Int,
        @Query("page") page: Int
    ): MovieDiscoverResponse

    /**
     * Get a list of upcoming movies in theatres. This is a release type query that looks for all movies that have a release type of 2 or 3 within the specified date range.
     * @param page Specify which page to query.
     */
    @GET("movie/upcoming")
    suspend fun getUpComingMovies(@Query("page") page: Int): MovieDiscoverResponse

    /**
     * Get the top rated movies on TMDb.
     * @param page Specify which page to query.
     */
    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Query("page") page: Int): MovieDiscoverResponse

    /**
     * Get a list of the current popular movies on TMDb. This list updates daily.
     * @param page Specify which page to query.
     */
    @GET("movie/popular")
    suspend fun getPopularMovies(@Query("page") page: Int): MovieDiscoverResponse

    /**
     * Get the most newly created movie. This is a live response and will continuously change.
     */
    @GET("movie/latest")
    suspend fun getLatestMovies(): Movie

}