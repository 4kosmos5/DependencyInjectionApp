package com.semyon.dependencyinjectionapp.exampleTwo.di

import com.semyon.dependencyinjectionapp.exampleTwo.presentation.MainActivity
import com.semyon.dependencyinjectionapp.exampleTwo.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [ViewModelModule::class]
)
interface ActivityComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier name: String
        ): ActivityComponent
    }
}