package com.semyon.dependencyinjectionapp.exampleTwo.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.semyon.dependencyinjectionapp.exampleTwo.domain.ExampleRepository
import com.semyon.dependencyinjectionapp.exampleTwo.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel2 @Inject constructor(
    private val repository: ExampleRepository
): ViewModel() {

    fun method() {
        repository.method()
        Log.d("ExampleViewModel2", "$this")
    }
}
