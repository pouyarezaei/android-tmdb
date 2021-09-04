package io.github.pouyarezaei.common.di.component

import dagger.Component
import io.github.pouyarezaei.common.di.module.AppDispatchersModule

@Component(modules = [AppDispatchersModule::class])
interface CommonComponent {
    @Component.Factory
    interface Factory {
        fun create(): CommonComponent
    }
}