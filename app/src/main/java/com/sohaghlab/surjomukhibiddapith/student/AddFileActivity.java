package com.sohaghlab.surjomukhibiddapith.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.R;

public class AddFileActivity extends AppCompatActivity {

    ImageView addimage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_file);

        addimage=findViewById(R.id.addimage);

        addimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AddFileActivity.this, "Click Upload Image", Toast.LENGTH_SHORT).show();
            }
        });
    }
}