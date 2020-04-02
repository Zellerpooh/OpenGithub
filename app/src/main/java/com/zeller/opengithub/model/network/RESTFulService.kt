package com.zeller.opengithub.model.network

import com.zeller.ommon.ext.ensureDir
import com.zeller.opengithub.ui.AppContext
import java.io.File

private const val BASE_URL = "https://api.github.com"

private val cacheFile by lazy {
    File(AppContext.cacheDir, "webServiceApi").apply { ensureDir() }
}

val retrofit by lazy {

}