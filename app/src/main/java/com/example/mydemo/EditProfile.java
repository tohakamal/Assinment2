package com.example.mydemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity {


    private TextView tv_name,tv_age,tv_phone,tv_dob,tv_gender,tv_weight;
    private EditText et_name,et_age,et_phn,et_dob,et_gender,et_weight;

    private Button btn_save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);

        getSupportActionBar().setTitle("Edit Profile");



        tv_name = findViewById(R.id.tv_name);
        tv_age = findViewById(R.id.tv_age);
        tv_phone = findViewById(R.id.tv_phone);
        tv_dob = findViewById(R.id.tv_dob);
        tv_gender = findViewById(R.id.tv_gender);
        tv_weight = findViewById(R.id.tv_weight);

        et_name = findViewById(R.id.et_name);
        et_age = findViewById(R.id.et_age);
        et_phn = findViewById(R.id.et_phn);
        et_dob = findViewById(R.id.et_dob);
        et_gender = findViewById(R.id.et_gender);
        et_weight = findViewById(R.id.et_weight);

        btn_save = findViewById(R.id.btn_save);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = et_name.getText().toString();
                String age = et_age.getText().toString();
                String phn = et_phn.getText().toString();
                String dob = et_dob.getText().toString();
                String gender = et_gender.getText().toString();
                String weight = et_weight.getText().toString();

                Intent intent = new Intent(EditProfile.this,Profile.class);
                intent.putExtra("keyname",name);
                intent.putExtra("keyage",age);
                intent.putExtra("keyphn",phn);
                intent.putExtra("keydob",dob);
                intent.putExtra("keygender",gender);
                intent.putExtra("keyweight",weight);
                startActivity(intent);

            }
        });
    }


}
