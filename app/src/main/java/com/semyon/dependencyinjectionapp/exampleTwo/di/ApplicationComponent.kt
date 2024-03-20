package com.semyon.dependencyinjectionapp.exampleTwo.di

import android.content.Context
import com.semyon.dependencyinjectionapp.exampleTwo.presentation.MainActivity
import com.semyon.dependencyinjectionapp.exampleTwo.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface ApplicationComponentFactory {

        fun create(
            @BindsInstance context: Context,
            @BindsInstance timeMillis: Long,
        ): ApplicationComponent
    }
}