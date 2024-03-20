package com.semyon.dependencyinjectionapp.exampleTwo.data.datasource

import com.semyon.dependencyinjectionapp.exampleTwo.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}
