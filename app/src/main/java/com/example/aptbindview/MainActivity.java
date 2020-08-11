package com.example.aptbindview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.apt_annotation.BindView;
import com.example.apt_library.BindViewTool;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.textview)
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BindViewTool.bindActivity(this);
        textView.setText("人坚不催");
    }
}