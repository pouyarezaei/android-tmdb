package io.github.pouyarezaei.tmdb.data.remote.service


import io.github.pouyarezaei.tmdb.data.model.Person
import io.github.pouyarezaei.tmdb.data.model.remote.response.ImageResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.PersonCreditResponse
import io.github.pouyarezaei.tmdb.data.model.remote.response.PopularPersonResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface PersonService {
    /**
     * Get the movie and TV credits together in a single response.
     * @param personId
     */
    @GET("person/{id}/combined_credits")
    suspend fun getAllWorksForPerson(@Path("id") personId: Int): PersonCreditResponse

    /**
     * Get the movie credits for a person.
     * @param personId
     */
    @GET("person/{id}/movie_credits")
    suspend fun getMoviesForPerson(@Path("id") personId: Int): PersonCreditResponse

    /**
     * Get the TV show credits for a person.
     * @param personId
     */
    @GET("person/{id}/tv_credits")
    suspend fun getTvForPerson(@Path("id") personId: Int): PersonCreditResponse

    /**
     * Get the primary person details by id.
     * Supports append_to_response.
     * @param personId
     */
    @GET("person/{id}")
    suspend fun getPersonDetails(@Path("id") personId: Int): Person

    /**
     * Get the images for a person.
     * @param personId
     */
    @GET("person/{id}/images")
    suspend fun getPersonImages(@Path("id") personId: Int): ImageResponse

    /**
     * Get the list of popular people on TMDb. This list updates daily.
     */
    @GET("person/popular")
    suspend fun getPopularPersons(): PopularPersonResponse

    /**
     * Get the most newly created person. This is a live response and will continuously change.
     */
    @GET("person/latest")
    suspend fun getLatestPersons(): Person

}