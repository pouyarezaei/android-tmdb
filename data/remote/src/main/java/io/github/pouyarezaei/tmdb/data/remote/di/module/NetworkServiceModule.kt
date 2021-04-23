package io.github.pouyarezaei.tmdb.data.remote.di.module

import dagger.Module
import dagger.Provides
import io.github.pouyarezaei.tmdb.data.remote.service.*
import retrofit2.Retrofit


@Module
class NetworkServiceModule {
    @Provides
    fun provideMovieService(retrofit: Retrofit): MovieService {
        return retrofit.create(MovieService::class.java)
    }

    @Provides
    fun provideDiscoverService(retrofit: Retrofit): DiscoverService {
        return retrofit.create(DiscoverService::class.java)
    }

    @Provides
    fun provideGenreService(retrofit: Retrofit): GenreService {
        return retrofit.create(GenreService::class.java)
    }


    @Provides
    fun provideReviewService(retrofit: Retrofit): ReviewService {
        return retrofit.create(ReviewService::class.java)
    }

    @Provides
    fun provideTrendingService(retrofit: Retrofit): TrendingService {
        return retrofit.create(TrendingService::class.java)
    }

    @Provides
    fun provideTvEpisodeService(retrofit: Retrofit): TvEpisodeService {
        return retrofit.create(TvEpisodeService::class.java)
    }

    @Provides
    fun provideTvSeasonService(retrofit: Retrofit): TvSeasonService {
        return retrofit.create(TvSeasonService::class.java)
    }

    @Provides
    fun provideTvService(retrofit: Retrofit): TvService {
        return retrofit.create(TvService::class.java)
    }

}