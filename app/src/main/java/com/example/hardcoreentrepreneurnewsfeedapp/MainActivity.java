package com.example.hardcoreentrepreneurnewsfeedapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView myWebView = findViewById(R.id.myWebView);
        myWebView.loadUrl("file:///android_asset/main.html");
        myWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
        myWebView.getSettings().setAllowContentAccess(true);
        myWebView.getSettings().setJavaScriptEnabled(true);

    }
}