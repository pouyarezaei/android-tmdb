package io.github.pouyarezaei.tmdb.data.remote.di.component

import dagger.Component
import io.github.pouyarezaei.tmdb.data.remote.di.module.CoreNetworkModule
import io.github.pouyarezaei.tmdb.data.remote.di.module.NetworkServiceModule
import retrofit2.Retrofit

@Component(modules = [CoreNetworkModule::class, NetworkServiceModule::class])
interface RemoteComponent {
    @Component.Factory
    interface Factory {
        fun create(): RemoteComponent
    }

    fun provideMovieService(retrofit: Retrofit)
    fun provideDiscoverService(retrofit: Retrofit)
    fun provideGenreService(retrofit: Retrofit)
    fun provideTrendingService(retrofit: Retrofit)
    fun provideTvEpisodeService(retrofit: Retrofit)
    fun provideTvSeasonService(retrofit: Retrofit)
    fun provideTvService(retrofit: Retrofit)
}