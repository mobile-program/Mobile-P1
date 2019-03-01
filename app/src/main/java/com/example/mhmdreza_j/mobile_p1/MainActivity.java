package com.example.mhmdreza_j.mobile_p1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

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
    }

    private void onClearClicked() {
        linearLayout.removeAllViews();
    }

    private void onGetClicked() {

    }

    private void onRefreshClicked() {

    }
}
