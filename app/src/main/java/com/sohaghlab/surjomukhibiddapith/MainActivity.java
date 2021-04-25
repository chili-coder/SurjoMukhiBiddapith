package com.sohaghlab.surjomukhibiddapith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.student.AddFileActivity;
import com.sohaghlab.surjomukhibiddapith.student.ContractActivity;
import com.sohaghlab.surjomukhibiddapith.student.ProfileActivity;
import com.sohaghlab.surjomukhibiddapith.student.TeacherActivity;
import com.sohaghlab.surjomukhibiddapith.student.TodayClassActivity;
import com.sohaghlab.surjomukhibiddapith.student.TodayWorkActivity;

public class MainActivity extends AppCompatActivity {

    TextView movetext;

    CardView todayWorkCard, todayClassCard, teacherCard, contractCard, aboutCard,profileCard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        movetext= findViewById(R.id.moveText);
        movetext.setSelected(true);

        todayClassCard =findViewById(R.id.addClassCard);
        todayWorkCard =findViewById(R.id.addWorkCard);
        teacherCard =findViewById(R.id.list_teacherCard);
        profileCard =findViewById(R.id.listStudentCard);





      todayClassCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TodayClassActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Today Class", Toast.LENGTH_SHORT).show();
            }
        });
        todayWorkCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TodayWorkActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Today Work", Toast.LENGTH_SHORT).show();
            }
        });

        teacherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, " On The Way", Toast.LENGTH_SHORT).show();
            }
        });
        profileCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Profile", Toast.LENGTH_SHORT).show();
            }
        });

        teacherCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TeacherActivity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "Teacher", Toast.LENGTH_SHORT).show();
            }
        });









    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.side_manu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.contrct:
                Intent i = new Intent(this, ContractActivity.class);
                this.startActivity(i);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}