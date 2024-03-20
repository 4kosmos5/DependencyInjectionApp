package com.semyon.dependencyinjectionapp.exampleTwo

import android.app.Application
import com.semyon.dependencyinjectionapp.exampleTwo.di.DaggerApplicationComponent

class ExampleApp : Application() {

    val component by lazy {
        DaggerApplicationComponent.factory()
            .create(this, System.currentTimeMillis())
    }

}