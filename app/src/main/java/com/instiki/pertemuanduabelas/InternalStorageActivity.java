package com.instiki.pertemuanduabelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InternalStorageActivity extends AppCompatActivity {
    EditText internalContentET;
    Button btnWriteInternal, btnReadInternal;

    static final int READ_BLOCK_SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internal_storage);

        internalContentET = findViewById(R.id.internal_content_edittext);
        btnWriteInternal = findViewById(R.id.btn_internal_writetext);
        btnReadInternal = findViewById(R.id.btn_internal_read);
    }
}