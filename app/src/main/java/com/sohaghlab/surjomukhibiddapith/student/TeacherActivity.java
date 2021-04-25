package com.sohaghlab.surjomukhibiddapith.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sohaghlab.surjomukhibiddapith.R;

public class TeacherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        getSupportActionBar().setTitle("শিক্ষকবৃন্দ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}