package com.example.scapping

import android.app.Application
import timber.log.Timber

class MoviesApp: Application() {
    override fun onCreate() {
        super.onCreate()
        // Initialize the Koin dependency injection framework
        startKoin {
            // Use Android context
            androidContext(this@MoviesApp)
            modules(
                listOf(
                    networkModule,
                    viewModelModule
                )
            )
        }
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}