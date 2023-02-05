package com.example.scapping.model

import javax.security.auth.callback.Callback

interface MuseunDataSource {
    fun retrieveMuseums(callback: OperationCallback<Museum>)
    fun cancel()
}