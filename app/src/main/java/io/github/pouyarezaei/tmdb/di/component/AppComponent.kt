package io.github.pouyarezaei.tmdb.di.component

import dagger.BindsInstance
import dagger.Component
import io.github.pouyarezaei.tmdb.TMDBApplication
import io.github.pouyarezaei.tmdb.di.module.Binder

@Component(modules = [Binder::class])
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: TMDBApplication): AppComponent
    }

    fun inject(tmdbApplication: TMDBApplication)
}