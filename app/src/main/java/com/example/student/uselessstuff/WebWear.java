package com.example.student.uselessstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.SeekBar;

import java.util.Objects;

public class WebWear extends AppCompatActivity {

    public static WebView wvWebMain;

    public static SeekBar sbUseless;
    public static SeekBar sbUseful;
    public static SeekBar sbRandom;

    public static int Usefulness;
    public static int Uselessness;
    public static int Randomness;
    public static String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_wear);

        wvWebMain = (WebView) findViewById(R.id.vwWebMain);

        sbUseless = (SeekBar) findViewById(R.id.sbUseless);
        sbUseful = (SeekBar) findViewById(R.id.sbUseful);
        sbRandom = (SeekBar) findViewById(R.id.sbRandom);


        //WebView set settings/creation of pages
        WebSettings webSettings = wvWebMain.getSettings();
        webSettings.setJavaScriptEnabled(true);
        wvWebMain.loadUrl("http://www.everydayim.com/");

        Object[] values = new Object[50];

        values[1] = new String("test");
        values[1] = new Integer(Usefulness);
        System.out.print(values[1]);

    }
    public void SeekingMovement(SeekBar sbUseless, SeekBar sbUseful, SeekBar sbRandom,
                                Integer usefulness, Integer uselessness, Integer randomness) {

    }
}
