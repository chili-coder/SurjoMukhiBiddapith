package com.sohaghlab.surjomukhibiddapith;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.admin.MainTeacherActivity;

public class TeacherLogActivity extends AppCompatActivity {

    Button teacherLog;
    TextView iamastudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_log);

        iamastudent=findViewById(R.id.iamstudent);
        teacherLog=findViewById(R.id.student_log);

        iamastudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TeacherLogActivity.this,LoginActivity.class);
                startActivity(intent);

                Toast.makeText(TeacherLogActivity.this, "Student Login", Toast.LENGTH_SHORT).show();
            }
        });

        teacherLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TeacherLogActivity.this, MainTeacherActivity.class);
                startActivity(intent);

                Toast.makeText(TeacherLogActivity.this, "Teacher Login", Toast.LENGTH_SHORT).show();
            }
        });



    }
}