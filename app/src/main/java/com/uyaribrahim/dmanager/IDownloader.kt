package com.uyaribrahim.dmanager

interface IDownloader {
    fun downloadFile(url: String): Long
}