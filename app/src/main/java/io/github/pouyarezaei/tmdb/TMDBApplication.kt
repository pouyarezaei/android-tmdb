package io.github.pouyarezaei.tmdb

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex
import io.github.pouyarezaei.tmdb.di.component.AppComponent
import io.github.pouyarezaei.tmdb.di.component.DaggerAppComponent

class TMDBApplication : Application() {
    private lateinit var appComponent: AppComponent
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.factory().create(this@TMDBApplication)
            .also { it.inject(this@TMDBApplication) }

    }


}