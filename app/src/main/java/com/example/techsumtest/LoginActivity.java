package com.example.techsumtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button loginbtn,signin_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();

        loginbtn=findViewById(R.id.login_button);
        signin_btn=findViewById(R.id.button_signin);


        Toast.makeText(this, "click onn login ", Toast.LENGTH_LONG).show();
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,FanbookActivity.class);
                startActivity(intent);
            }
        });
    }
}