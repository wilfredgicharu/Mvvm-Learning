package com.example.scapping.di

import android.content.Context
import com.example.scapping.ResourceProvider.ResourceProviderImpl
import com.example.scapping.utils.ResourceProvider
import com.example.scapping.utils.connectivity.ConnectivityUtils
import com.example.scapping.utils.connectivity.ConnectivityUtilsImpl

// Load here string resource provider
/**
 * TODO: Add your own API KEY in local.properties file
 */
val appModule = module {

    single(named("TMDB_KEY")) { provideApiKey(get()) }

    single<ResourceProvider> { ResourceProviderImpl(get()) }

    single<ConnectivityUtils> { ConnectivityUtilsImpl(get()) }
}

internal fun provideApiKey(
    context: Context
): String = context.getString(R.string.tmdb_key)
