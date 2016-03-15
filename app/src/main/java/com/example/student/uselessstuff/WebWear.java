package com.example.student.uselessstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebWear extends AppCompatActivity {

    public static WebView wvWebMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_wear);

        wvWebMain = (WebView) findViewById(R.id.vwWebMain);

        WebSettings webSettings = wvWebMain.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wvWebMain.loadUrl("http://haneke.net/");

    }
}
