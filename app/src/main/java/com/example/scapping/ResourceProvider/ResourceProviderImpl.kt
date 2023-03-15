package com.example.scapping.ResourceProvider

import android.content.Context
import androidx.annotation.StringRes
import com.example.scapping.utils.ResourceProvider

class ResourceProviderImpl(
    private val context: Context
    ) : ResourceProvider {
    override fun getString(resourceId: Int): String = context.getString(resourceId)

    override fun getString(
        resourceId: Int,
        vararg args: Any
    ): String {
        return if (args.isNotEmpty()) {
            context.resources.getString(resourceId, *args)
        } else {
            context.resources.getString(resourceId)
        }
    }
}
