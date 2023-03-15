package com.example.scapping.di

val commonModelsModule = module {
    // Singleton as its going to be used in more than one module.
    single<MovieMapper> { MovieMapperImpl(defaultDispatcher = get(named("defaultDispatcher"))) }
}
