package com.semyon.dependencyinjectionapp.exampleTwo.di

import com.semyon.dependencyinjectionapp.exampleTwo.data.repository.ExampleRepositoryImpl
import com.semyon.dependencyinjectionapp.exampleTwo.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}