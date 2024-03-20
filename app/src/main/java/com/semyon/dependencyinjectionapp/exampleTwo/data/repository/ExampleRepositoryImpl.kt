package com.semyon.dependencyinjectionapp.exampleTwo.data.repository

import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleLocalDataSource
import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleRemoteDataSource
import com.semyon.dependencyinjectionapp.exampleTwo.data.mapper.ExampleMapper
import com.semyon.dependencyinjectionapp.exampleTwo.di.ProdQualifier
import com.semyon.dependencyinjectionapp.exampleTwo.di.TestQualifier
import com.semyon.dependencyinjectionapp.exampleTwo.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
