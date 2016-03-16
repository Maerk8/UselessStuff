package com.example.student.uselessstuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Objects;

public class WebWear extends AppCompatActivity {

    public static WebView wvWebMain;

    public static SeekBar sbUseless;
    public static SeekBar sbUseful;
    public static SeekBar sbRandom;
    public static TextView txtWebSite;

    public static int Usefulness;
    public static int Uselessness;
    public static int Randomness;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_wear);

        wvWebMain = (WebView) findViewById(R.id.vwWebMain);

        sbUseless = (SeekBar) findViewById(R.id.sbUseless);
        sbUseful = (SeekBar) findViewById(R.id.sbUseful);
        sbRandom = (SeekBar) findViewById(R.id.sbRandom);

        txtWebSite = (TextView) findViewById(R.id.txtWebsiteName);

        sbUseless.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Uselessness = progress;

                if (Uselessness > Usefulness && Uselessness > Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://www.everydayim.com/");
                    txtWebSite.setText("http//www.everydayim.com/");


                }
                else if (Uselessness < Usefulness && Uselessness > Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://www.sanger.dk/");
                    txtWebSite.setText("http://www.sanger.dk/");

                }

                else if (Uselessness > Usefulness && Uselessness < Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://www.taghua.com/");
                    txtWebSite.setText("http://www.taghua.com/");

                }
                else if (Uselessness < Usefulness && Uselessness < Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://tencents.info/");
                    txtWebSite.setText("http://tencents.info/");

                }

                else {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://leekspin.com/");
                    txtWebSite.setText("http://leekspin.com/");

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbUseful.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Usefulness = progress;

                if (Usefulness > Uselessness && Usefulness > Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");


                }
                else if (Usefulness < Uselessness && Usefulness > Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }

                else if (Usefulness > Uselessness && Usefulness < Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }
                else if (Usefulness < Uselessness && Usefulness < Randomness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");


                }

                else {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        sbRandom.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Randomness = progress;

                if (Randomness > Usefulness && Randomness > Uselessness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");


                }
                else if (Randomness < Usefulness && Randomness > Uselessness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }

                else if (Randomness > Usefulness && Randomness < Uselessness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }
                else if (Randomness < Usefulness && Randomness < Uselessness) {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");


                }

                else {

//WebView set settings/creation of pages
                    WebSettings webSettings = wvWebMain.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    wvWebMain.loadUrl("http://");

                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
   /* public void Seekinthebar(View vw){

        wvWebMain = (WebView) findViewById(R.id.vwWebMain);

        sbUseless = (SeekBar) findViewById(R.id.sbUseless);
        sbUseful = (SeekBar) findViewById(R.id.sbUseful);
        sbRandom = (SeekBar) findViewById(R.id.sbRandom);


        SeekBar.OnSeekBarChangeListener sbUseless= new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        Uselessness = progress;

                        if (Uselessness > Usefulness && Uselessness > Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://www.everydayim.com/");


                        }
                        else if (Uselessness < Usefulness && Uselessness > Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://www.sanger.dk/");

                        }

                        else if (Uselessness > Usefulness && Uselessness < Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://www.taghua.com/");

                        }
                        else if (Uselessness < Usefulness && Uselessness < Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://tencents.info/");


                        }

                        else {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://leekspin.com/");

                        }

                    }
                    @Override
                    public void onStartTrackingTouch( SeekBar seekBar) {


                    }
                    @Override
                    public void onStopTrackingTouch( SeekBar seekBar) {


                    }

                };

        SeekBar.OnSeekBarChangeListener sbUseful = new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged( SeekBar seekBar, int progress, boolean fromUser) {
                        Usefulness = progress;

                        if (Usefulness > Uselessness && Usefulness > Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");


                        }
                        else if (Usefulness < Uselessness && Usefulness > Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }

                        else if (Usefulness > Uselessness && Usefulness < Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }
                        else if (Usefulness < Uselessness && Usefulness < Randomness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");


                        }

                        else {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }

                    }
                    @Override
                    public void onStartTrackingTouch( SeekBar seekBar) {


                    }
                    @Override
                    public void onStopTrackingTouch( SeekBar seekBar) {


                    }

                };

        sbRandom.setOnSeekBarChangeListener(

                new SeekBar.OnSeekBarChangeListener() {

                    @Override
                    public void onProgressChanged( SeekBar seekBar, int progress, boolean fromUser) {
                        Randomness = progress;

                        if (Randomness > Usefulness && Randomness > Uselessness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");


                        }
                        else if (Randomness < Usefulness && Randomness > Uselessness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }

                        else if (Randomness > Usefulness && Randomness < Uselessness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }
                        else if (Randomness < Usefulness && Randomness < Uselessness) {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");


                        }

                        else {

//WebView set settings/creation of pages
                            WebSettings webSettings = wvWebMain.getSettings();
                            webSettings.setJavaScriptEnabled(true);
                            wvWebMain.loadUrl("http://");

                        }

                    }
                    @Override
                    public void onStartTrackingTouch( SeekBar seekBar) {


                    }
                    @Override
                    public void onStopTrackingTouch( SeekBar seekBar) {


                    }

                } );

    }
*/
}
