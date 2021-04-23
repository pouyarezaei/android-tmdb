package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.remote.response.MovieDiscoverResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.TvDiscoverResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface DiscoverService {
    /**
     * Discover movies by different types of data like average rating, number of votes, genres and certifications. You can get a valid list of certifications from themethod.
     * @param sortBy Choose from one of the many available sort options.{ Choose from one of the many available sort options.Allowed Values: , vote_average.desc, vote_average.asc, first_air_date.desc, first_air_date.asc, popularity.desc, popularity.ascdefault: popularity.desc }
     * @param page Specify which page to query.
     * @param year A filter to limit the results to a specific year (looking at all release dates).
     */
    @GET("discover/movie")
    suspend fun discoverMovie(
        @Query("page") page: Int? = null,
        @Query("sort_by") sortBy: String? = null,
        @Query("year") year: Int? = null
    ): MovieDiscoverResponse

    /**
     * Discover TV shows by different types of data like average rating, number of votes, genres, the network they aired on and air dates.
     * @param sortBy Choose from one of the many available sort options.{popularity.asc, popularity.desc, release_date.asc, release_date.desc, revenue.asc, revenue.desc, primary_release_date.asc, primary_release_date.desc, original_title.asc, original_title.desc, vote_average.asc, vote_average.desc, vote_count.asc, vote_count.descdefault: popularity.desc}
     * @param page Specify which page to query.
     * @param year A filter to limit the results to a specific year (looking at all release dates).
     */
    @GET("discover/tv")
    suspend fun discoverTv(
        @Query("page") page: Int? = null,
        @Query("sort_by") sortBy: String? = null,
        @Query("year") year: Int? = null
    ): TvDiscoverResponse

}