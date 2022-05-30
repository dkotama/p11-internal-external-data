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

        btnWriteInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    String content = internalContentET.getText().toString() ;

                    FileOutputStream fileout = openFileOutput("user_text.txt", MODE_PRIVATE);
                    OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                    outputWriter.write(content);
                    outputWriter.close();

                    Toast.makeText(InternalStorageActivity.this, "File Saved Successfuly!", Toast.LENGTH_LONG).show();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

        btnReadInternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    FileInputStream fileIn=openFileInput("user_text.txt");
                    InputStreamReader InputRead= new InputStreamReader(fileIn);

                    char[] inputBuffer= new char[READ_BLOCK_SIZE];
                    String s="";
                    int charRead;

                    while ((charRead=InputRead.read(inputBuffer))>0) {
                        // char to string conversion
                        String readstring=String.copyValueOf(inputBuffer,0,charRead);
                        s +=readstring;
                    }
                    InputRead.close();
                    internalContentET.setText(s);


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}