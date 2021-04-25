package com.sohaghlab.surjomukhibiddapith.admin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sohaghlab.surjomukhibiddapith.R;

public class TeacherAddActivity extends AppCompatActivity {

    TextView tName,tUsername,tPassword;
FloatingActionButton addTeacher;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_add);

        tName=findViewById(R.id.teacher_name);
        tUsername=findViewById(R.id.techaer_user);
        tPassword=findViewById(R.id.teacher_pass);
        addTeacher=findViewById(R.id.add_teacher_floting);


        addTeacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });




    }
}