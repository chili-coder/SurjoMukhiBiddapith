package com.sohaghlab.surjomukhibiddapith.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.R;

public class ProfileActivity extends AppCompatActivity {

    TextView editProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        editProfile= findViewById(R.id.editprofile);


        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ProfileActivity.this, "Comming Soon...", Toast.LENGTH_SHORT).show();
            }
        });
    }
}