package com.example.administrator.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        TextView textView_register_zhuce=(TextView)findViewById(R.id.register_zhuce);
        textView_register_zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(register.this,Login.class);
                startActivity(intent);
            }
        });

        TextView textView_register_back=(TextView)findViewById(R.id.register_back);
        textView_register_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(register.this,setting.class);
                startActivity(intent);
            }
        });
    }
}
