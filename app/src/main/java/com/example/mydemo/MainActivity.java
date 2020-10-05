package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



     private Button btn_login;
     private EditText et_email,et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("MainActivity");
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);

        btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et_email.getText().toString().equals("abc@gmail.com") && et_password.getText().toString().equals("1234")){

                    Intent intent = new Intent(MainActivity.this,EditProfile.class);
                    startActivity(intent);
                }
                else{

                    Toast.makeText(MainActivity.this, "Invalid Email and Password", Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}
