package com.sohaghlab.surjomukhibiddapith.admin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.R;

public class ClasslistTActivity extends AppCompatActivity {

    CardView addClass1,addClass2,addClass3,addClass4,addClass5,addClass6,addClass7,addClass8,addClass9,addClass10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classlist_t);

        addClass1=findViewById(R.id.addClassOne);
        addClass2=findViewById(R.id.addClassTwo);
        addClass3=findViewById(R.id.addClassThree);
        addClass4=findViewById(R.id.addClassFour);
        addClass5=findViewById(R.id.addClassFive);
        addClass6=findViewById(R.id.addClassSix);
        addClass7=findViewById(R.id.addClassseven);
        addClass8=findViewById(R.id.addClassEignt);
        addClass9=findViewById(R.id.addClassNight);
        addClass10=findViewById(R.id.addClassTen);


        addClass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ClasslistTActivity.this, ClassAddActivity.class);
                startActivity(intent);

                Toast.makeText(ClasslistTActivity.this, "Add class One", Toast.LENGTH_SHORT).show();
            }
        });

    }
}