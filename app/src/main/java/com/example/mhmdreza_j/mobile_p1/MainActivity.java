package com.example.mhmdreza_j.mobile_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements NotificationCenter.NotificationListener{

    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.linearLayout);
        findViewById(R.id.refreshButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onRefreshClicked();
            }
        });
        findViewById(R.id.getButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onGetClicked();
            }
        });
        findViewById(R.id.refreshButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               onClearClicked();
            }
        });
        NotificationCenter.register(this, NotificationCenter.DATA_LOADED);
    }

    private void onClearClicked() {
        linearLayout.removeAllViews();
    }

    private void onGetClicked() {

    }

    private void onRefreshClicked() {

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        NotificationCenter.unregister(this, NotificationCenter.DATA_LOADED);
    }

    @Override
    public void onDataReceived(ArrayList<Integer> data) {

    }
}
