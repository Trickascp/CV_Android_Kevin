package com.example.cvkevin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PortofolioActivity extends AppCompatActivity {

    private WebView web1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portofolio);

        web1 = (WebView) this.findViewById(R.id.web_prof);
        web1.getSettings().setLoadsImagesAutomatically(true);
        web1.getSettings().setJavaScriptEnabled(true);
        web1.setWebViewClient(new MyBrowser());
        web1.loadUrl("http://profilekevin.epizy.com/home.html");


        web1.getSettings().setSupportZoom(true);
        web1.getSettings().setBuiltInZoomControls(true);
        web1.getSettings().setDisplayZoomControls(false);

    }
    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
