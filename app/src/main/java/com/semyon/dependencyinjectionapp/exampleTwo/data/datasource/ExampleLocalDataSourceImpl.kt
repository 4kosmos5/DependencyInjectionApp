package com.semyon.dependencyinjectionapp.exampleTwo.data.datasource

import com.semyon.dependencyinjectionapp.exampleTwo.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
