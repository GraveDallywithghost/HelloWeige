package com.example.helloweige;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;

public class MainActivity extends Activity {
	
	private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mWebview = (WebView) findViewById(R.id.webview);
        WebSettings webSettings= mWebview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        //×ÔÊÊÓ¦ÆÁÄ»
        webSettings.setLayoutAlgorithm(LayoutAlgorithm.NORMAL);
        mWebview.loadUrl("file:///android_asset/html.html");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
