package io.github.pouyarezaei.repository.di.component

import dagger.Component
import io.github.pouyarezaei.common.di.component.CommonComponent
import io.github.pouyarezaei.tmdb.data.remote.di.component.RemoteComponent

@Component(dependencies = [RemoteComponent::class, CommonComponent::class])
interface RepositoryComponent {
    @Component.Factory
    interface Factory {
        fun create(
            remoteComponent: RemoteComponent,
            commonComponent: CommonComponent
        ): RepositoryComponent
    }
}