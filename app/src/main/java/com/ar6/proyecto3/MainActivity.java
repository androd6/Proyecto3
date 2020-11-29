package com.ar6.proyecto3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Definicion del toolbar del activity
        Toolbar varToolbar = findViewById(R.id.v1_ToolBar);
        setSupportActionBar(varToolbar);

    }
}