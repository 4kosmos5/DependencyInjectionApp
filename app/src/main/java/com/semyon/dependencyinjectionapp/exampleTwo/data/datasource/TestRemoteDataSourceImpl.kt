package com.semyon.dependencyinjectionapp.exampleTwo.data.datasource

import android.util.Log
import javax.inject.Inject

class TestRemoteDataSourceImpl @Inject constructor(): ExampleRemoteDataSource {
    override fun method() {
        Log.d("TesRemoteDataSourceImpl", "test")
    }
}