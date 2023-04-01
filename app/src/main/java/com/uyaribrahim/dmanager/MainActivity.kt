package com.uyaribrahim.dmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.download)
        val downloader = Downloader(this)

        button.setOnClickListener {
            downloader.downloadFile("https://avatars.githubusercontent.com/u/23297209?v=4")
        }

    }
}