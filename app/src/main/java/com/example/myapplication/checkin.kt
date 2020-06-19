package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_checkin.*

class checkin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkin)


        val BB = intent.getStringExtra("AA")

        webV.loadUrl(BB)
            webV.settings.javaScriptEnabled=true
            webV.settings.allowContentAccess=true
            webV.settings.domStorageEnabled=true
            webV.settings.useWideViewPort=true
            webV.settings.setAppCacheEnabled(true)
    }
}