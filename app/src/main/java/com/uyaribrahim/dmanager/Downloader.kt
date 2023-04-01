package com.uyaribrahim.dmanager

import android.app.DownloadManager
import android.content.Context
import android.os.Environment
import androidx.core.net.toUri

class Downloader(
    mContext: Context
) : IDownloader {

    private val downloadManager = mContext.getSystemService(DownloadManager::class.java)

    override fun downloadFile(url: String): Long {
        val req = DownloadManager.Request(url.toUri())
            .setMimeType("image/jpeg")
            .setAllowedNetworkTypes(DownloadManager.Request.NETWORK_WIFI)
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setTitle("${System.currentTimeMillis()}.jpeg")
            //.addRequestHeader("Authorization", "Bearer token") If using an API
            .setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, "image.jpg")

        return downloadManager.enqueue(req)
    }
}