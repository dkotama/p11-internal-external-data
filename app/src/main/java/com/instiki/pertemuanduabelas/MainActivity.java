package com.instiki.pertemuanduabelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnInternalStorage, btnExternalStorage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInternalStorage = findViewById(R.id.btn_internalstg);
        btnExternalStorage = findViewById(R.id.btn_externalstg);

        btnInternalStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Tambahkan intent ke Internal Storage
            }
        });

        btnExternalStorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: Tambahkan intent ke External Storage
            }
        });
    }
}