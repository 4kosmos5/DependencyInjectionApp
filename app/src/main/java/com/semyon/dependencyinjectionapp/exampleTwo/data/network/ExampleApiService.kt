package com.semyon.dependencyinjectionapp.exampleTwo.data.network

import android.content.Context
import android.util.Log
import com.semyon.dependencyinjectionapp.R
import com.semyon.dependencyinjectionapp.exampleTwo.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Singleton

@ApplicationScope
class ExampleApiService @Inject constructor(
    private val context: Context,
    private val timeMillis: Long) {

    fun method() {
        Log.d(LOG_TAG, "ExampleApiService ${context.getString(R.string.app_name)} $timeMillis $this")
    }

    companion object{
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}
