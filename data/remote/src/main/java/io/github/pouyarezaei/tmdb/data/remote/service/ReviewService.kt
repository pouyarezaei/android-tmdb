package io.github.pouyarezaei.tmdb.data.remote.service

import io.github.pouyarezaei.tmdb.data.model.Review
import retrofit2.http.GET
import retrofit2.http.Path

interface ReviewService {
    /**
     * Retrieve the details of a movie or TV show review.
     * @param reviewId Specify which review to query.
     */
    @GET("review/{id}")
    suspend fun getReviewDetails(
        @Path("id") reviewId: Int
    ): Review

}