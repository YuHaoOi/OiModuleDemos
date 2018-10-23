package com.example.oi.oicommondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.oi.oicommondemo.wifiutils.WifiUtilsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoWiFiUtils(View view) {
        WifiUtilsActivity.actionStart(this);
    }
}
