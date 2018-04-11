package com.example.gj94g.hw1;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEdit;
    private Button mBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdit = (EditText)findViewById(R.id.edit_text);
        mBtn = (Button)findViewById(R.id.button_school);

        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = MainActivity.this;
                Intent intent = new Intent(context,showActivity.class);
                intent.putExtra("mEdit",mEdit.getText().toString());
                startActivity(intent);
            }
        });

    }


}
