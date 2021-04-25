package com.sohaghlab.surjomukhibiddapith;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.sohaghlab.surjomukhibiddapith.student.ContractActivity;

public class LoginActivity extends AppCompatActivity {

    TextView contacrtadmin;
    Button loginBtn;

    Spinner loginspnner;
    Dialog myDialog;

    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        contacrtadmin = findViewById(R.id.popupContract);
        loginBtn = findViewById(R.id.student_log);
        loginspnner=findViewById(R.id.login_spnner);
        user=findViewById(R.id.username);
        pass=findViewById(R.id.password);



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.userType,R.layout.support_simple_spinner_dropdown_item);
        loginspnner.setAdapter(adapter);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String classitem =loginspnner.getSelectedItem().toString();

                if(user.getText().toString().equals("classone")&& pass.getText().toString().equals("12345")&& classitem.equals("One")) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);

                    Toast.makeText(LoginActivity.this, user.getText(), Toast.LENGTH_SHORT).show();

                } else if(user.getText().toString().equals("classtwo")&& pass.getText().toString().equals("112233")&& classitem.equals("Two")){

                    Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(intent);

                } else if(user.getText().toString().equals("classthree")&& pass.getText().toString().equals("112233")&& classitem.equals("Three")){

                    Intent intent = new Intent(LoginActivity.this, ContractActivity.class);
                    startActivity(intent);

                }else{
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });




        myDialog = new Dialog(this);

     contacrtadmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    TextView txtclose;
                    myDialog.setContentView(R.layout.popup);
                    txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
                    txtclose.setText("X");
                    txtclose.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            myDialog.dismiss();
                        }
                    });
                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    myDialog.show();
                }



        });





    }





}