package com.framgia.oleo.utils

import android.content.Context
import androidx.annotation.NonNull
import com.bumptech.glide.GlideBuilder
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.load.engine.cache.InternalCacheDiskCacheFactory
import com.bumptech.glide.load.engine.cache.LruResourceCache
import com.bumptech.glide.module.AppGlideModule

@GlideModule
class GlideConfiguration  : AppGlideModule() {
    
    override fun applyOptions(@NonNull context: Context, @NonNull builder: GlideBuilder) {
        
        val memoryCacheSizeBytes = 1024 * 1024 * 20 // 20MB
        builder.setMemoryCache(LruResourceCache(memoryCacheSizeBytes.toLong()))
        
        val diskCacheSizeBytes = 1024 * 1024 * 50 // 50 MB
        builder.setDiskCache(InternalCacheDiskCacheFactory(context, diskCacheSizeBytes.toLong()))
    }
}
