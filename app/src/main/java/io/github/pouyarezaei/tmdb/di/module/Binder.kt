package io.github.pouyarezaei.tmdb.di.module

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import io.github.pouyarezaei.tmdb.TMDBApplication

@Module
abstract class Binder {
    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun bindApplication(tmdbApplication: TMDBApplication): Application
}