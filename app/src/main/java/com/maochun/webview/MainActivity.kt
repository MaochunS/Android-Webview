package com.maochun.webview

import android.net.Uri
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity
import androidx.browser.customtabs.CustomTabsIntent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val myWebView: WebView = findViewById(R.id.webview)
//        myWebView.loadUrl("https://172.17.3.201/web/#/login")

        val url = "https://172.17.3.201/web/#/login"
        val builder = CustomTabsIntent.Builder()
        val customTabsIntent: CustomTabsIntent = builder.build()
        customTabsIntent.launchUrl(this@MainActivity, Uri.parse(url))
    }
}