package com.semyon.dependencyinjectionapp.exampleTwo.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.semyon.dependencyinjectionapp.exampleTwo.di.IdQualifier
import com.semyon.dependencyinjectionapp.exampleTwo.di.NameQualifier
import com.semyon.dependencyinjectionapp.exampleTwo.domain.ExampleUseCase
import javax.inject.Inject
import javax.inject.Named

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val name: String
): ViewModel() {

    fun method() {
        useCase
        Log.d("ExampleViewModel", "$this $id $name")
    }
}
