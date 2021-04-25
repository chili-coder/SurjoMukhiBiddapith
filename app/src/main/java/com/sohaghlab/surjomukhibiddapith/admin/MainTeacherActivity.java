package com.sohaghlab.surjomukhibiddapith.admin;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.LoginActivity;
import com.sohaghlab.surjomukhibiddapith.MainActivity;
import com.sohaghlab.surjomukhibiddapith.R;
import com.sohaghlab.surjomukhibiddapith.RegisterActivity;

public class MainTeacherActivity extends AppCompatActivity {

    CardView addwork, addclass, listteacher,list_student;
    String pintex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_teacher);

        addclass=findViewById(R.id.addClassCard);
        addwork=findViewById(R.id.addWorkCard);
        listteacher=findViewById(R.id.list_teacherCard);
        list_student=findViewById(R.id.listStudentCard);


        addclass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainTeacherActivity.this, ClasslistTActivity.class);
                startActivity(intent);




            }
        });


        addwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTeacherActivity.this, WorkAddActivity.class);
                startActivity(intent);
            }
        });

        list_student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainTeacherActivity.this, ViewStudentActivity.class);
                startActivity(intent);
            }
        });

        listteacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder mydialog = new AlertDialog.Builder(MainTeacherActivity.this);
                mydialog.setTitle("Enter Pin");

               // mydialog.setIcon(R.drawable.ic_sun);

                final EditText pinInput = new EditText(MainTeacherActivity.this);
                pinInput.setInputType(InputType.TYPE_CLASS_NUMBER);
                mydialog.setView(pinInput);

                mydialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        pintex=pinInput.getText().toString();

                       if(pintex.equals("3333")){
                            Intent intent = new Intent(MainTeacherActivity.this, TeacherAddActivity.class);
                            startActivity(intent);

                            Toast.makeText(MainTeacherActivity.this, "Success", Toast.LENGTH_SHORT).show();

                        }else {
                            Toast.makeText(MainTeacherActivity.this, "Error!", Toast.LENGTH_SHORT).show();

                        }

                    }
                });

                mydialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });

                mydialog.show();


            }
        });

    }
}