package com.example.administrator.myproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);

        Button setting_zhuce_button=(Button)findViewById(R.id.setting_zhuce);
        setting_zhuce_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(setting.this,Login.class);
                startActivity(intent);
            }
        });

        Button setting_register_button=(Button)findViewById(R.id.setting_register);
        setting_register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(setting.this,register.class);
                startActivity(intent);
            }
        });


    }
}
