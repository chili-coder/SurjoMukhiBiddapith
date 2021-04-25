package com.sohaghlab.surjomukhibiddapith;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    TextView haveAccount;
    Button regiAccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        haveAccount=findViewById(R.id.ihaveaccount);
        regiAccount=findViewById(R.id.student_log);




    }
}