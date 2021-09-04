package io.github.pouyarezaei.common.di.module

import dagger.Module
import dagger.Provides
import io.github.pouyarezaei.common.AppDispatchers
import kotlinx.coroutines.Dispatchers

@Module
class AppDispatchersModule {
    @Provides
    fun provideAppDispatchers(): AppDispatchers {
        return AppDispatchers(
            io = Dispatchers.IO,
            main = Dispatchers.Main,
            default = Dispatchers.Default
        )
    }
}