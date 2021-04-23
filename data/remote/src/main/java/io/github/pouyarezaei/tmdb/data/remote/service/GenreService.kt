package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.remote.response.GenreResponse
import retrofit2.http.GET

interface GenreService {
    /**
     * Get the list of official genres for movies.
     */
    @GET("genre/movie/list")
    suspend fun getMovieGenres(): GenreResponse

    /**
     * Get the list of official genres for TV shows.
     */
    @GET("genre/tv/list")
    suspend fun getTVGenres(): GenreResponse
}