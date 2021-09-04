package io.github.pouyarezaei.repository.repositories

import io.github.pouyarezaei.common.AppDispatchers
import io.github.pouyarezaei.tmdb.data.model.Movie
import io.github.pouyarezaei.tmdb.data.model.remote.response.MovieDiscoverResponse
import io.github.pouyarezaei.tmdb.data.remote.service.MovieService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val movieService: MovieService,
    val appDispatchers: AppDispatchers
) {
    suspend fun findById(id: Int): Flow<Movie> = flowOf(movieService.getMovieById(id))

    suspend fun getPopular(page: Int): Flow<MovieDiscoverResponse> =
        flowOf(movieService.getPopularMovies(page))

    suspend fun getLatest(): Flow<Movie> = flowOf(movieService.getLatestMovies())


//    suspend fun getTopRated() = movieService.getTopRatedMovies().results
//    suspend fun getImages(id: Int): ImageResponse = movieService.getMovieImages(id)
//    suspend fun getVideos(id: Int): List<Video> = movieService.getMovieVideos(id).results
//    suspend fun getRecommendations(id: Int): List<MovieListResultObject> =
//        movieService.getMovieRecommendations(id).results
//
//    suspend fun getReviews(id: Int): List<Review> = movieService.getMovieReviews(id).results

}