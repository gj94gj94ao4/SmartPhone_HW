package com.example.gj94g.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class showActivity extends AppCompatActivity {

    private TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        tv = findViewById(R.id.show_textView);
        Intent intent = getIntent();
        tv.setText(this.getText(R.string.school_number)+":"+intent.getStringExtra("mEdit"));
    }
}
