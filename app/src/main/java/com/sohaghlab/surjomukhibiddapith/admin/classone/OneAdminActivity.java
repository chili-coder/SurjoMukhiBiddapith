package com.sohaghlab.surjomukhibiddapith.admin.classone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

import com.sohaghlab.surjomukhibiddapith.R;
import com.sohaghlab.surjomukhibiddapith.adapter.studentAdapter;

import java.util.ArrayList;

public class OneAdminActivity extends AppCompatActivity {

    ListView listView;
    studentAdapter adapterOne;



    public static ArrayList<Student> studentArrayList = new ArrayList<>();

   /* String sName[]={"Sohagh","Kamal","Mohoshin","Jamal","Tanvir"};
    String sRoll[]={"1","2","3","4","5"};
    String sSection[]={"A","A","B","A","C"};
    String sCall[]={"07137637","082378623","023776783","02362734","02738625"};
    String sUser[]={"hjagsh","asdhj","askg","asdhv","ashvh"};
    String sPass[]={"hgzdee","hjge66","jj6544","4wer","5werrw"};

    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_admin);

        listView=findViewById(R.id.student_list);

        adapterOne = new studentAdapter(this,studentArrayList);




    }
}