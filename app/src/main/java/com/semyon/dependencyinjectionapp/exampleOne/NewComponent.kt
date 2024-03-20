package com.semyon.dependencyinjectionapp.exampleOne

import dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

}