package com.sohaghlab.surjomukhibiddapith.student;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.R;

public class TodayClassActivity extends AppCompatActivity {

    CardView todayclass;
    Button joinClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_class);

        getSupportActionBar().setTitle("আজকের ক্লাস");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        todayclass=findViewById(R.id.addClassCard);
        joinClass=findViewById(R.id.joinclass);

        joinClass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = getPackageManager().getLaunchIntentForPackage("com.google.android.apps.meetings");
                if(intent!=null){
                    startActivity(intent);
                } else{

                    Intent intent1 =new Intent(Intent.ACTION_VIEW);
                    intent1.setData(Uri.parse("https://meet.google.com/"));
                    startActivity(intent1);



                }

                Toast.makeText(TodayClassActivity.this, "Join Class", Toast.LENGTH_SHORT).show();
            }
        });



    }
}