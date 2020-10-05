package com.example.mydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    private TextView tv_name_demo,tv_age_demo,tv_phn_demo,tv_dob_demo,tv_gender_demo,tv_weight_demo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        getSupportActionBar().setTitle("Profile");

        tv_name_demo = findViewById(R.id.tv_name_demo);
        tv_age_demo = findViewById(R.id.tv_age_demo);
        tv_phn_demo = findViewById(R.id.tv_phn_demo);
        tv_dob_demo = findViewById(R.id.tv_dob_demo);
        tv_gender_demo = findViewById(R.id.tv_gender_demo);
        tv_weight_demo = findViewById(R.id.tv_weight_demo);

        String name = getIntent().getStringExtra("keyname");
        String age = getIntent().getStringExtra("keyage");
        String phn = getIntent().getStringExtra("keyphn");
        String dob = getIntent().getStringExtra("keydob");
        String gender = getIntent().getStringExtra("keygender");
        String weight = getIntent().getStringExtra("keyweight");

        tv_name_demo.setText(name);
        tv_age_demo.setText(age);
        tv_phn_demo.setText(phn);
        tv_dob_demo.setText(dob);
        tv_gender_demo.setText(gender);
        tv_weight_demo.setText(weight);

    }
}
