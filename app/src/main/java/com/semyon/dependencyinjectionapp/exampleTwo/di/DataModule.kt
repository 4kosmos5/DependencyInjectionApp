package com.semyon.dependencyinjectionapp.exampleTwo.di

import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleLocalDataSource
import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleLocalDataSourceImpl
import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleRemoteDataSource
import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.ExampleRemoteDataSourceImpl
import com.semyon.dependencyinjectionapp.exampleTwo.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource

}