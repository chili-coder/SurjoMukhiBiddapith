package com.sohaghlab.surjomukhibiddapith;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class stActivity extends AppCompatActivity {

    CardView studentcard, teachercard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_st);

        studentcard =findViewById(R.id.addWorkCard);
        teachercard =findViewById(R.id.addClassCard);

        studentcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stActivity.this,LoginActivity.class);
                startActivity(intent);

                Toast.makeText(stActivity.this, "Student", Toast.LENGTH_SHORT).show();
            }
        });

        teachercard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(stActivity.this,TeacherLogActivity.class);
                startActivity(intent);

                Toast.makeText(stActivity.this, "Teacher", Toast.LENGTH_SHORT).show();

            }
        });






    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(stActivity.this)
                .setTitle("র্সূযমুখী বিদ্যাপীঠ")
                .setCancelable(false)
                .setMessage("আপনি কি এপ্স থেকে বের হতে চান?")
                .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        ActivityCompat.finishAffinity(stActivity.this);
                    }
                })
                .setNegativeButton("না", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

        builder.show();

    }
}


