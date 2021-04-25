package com.sohaghlab.surjomukhibiddapith.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.sohaghlab.surjomukhibiddapith.R;
import com.sohaghlab.surjomukhibiddapith.admin.classone.Student;

import java.util.List;

public class studentAdapter extends ArrayAdapter<Student> {

    Context context;

    List<Student>arrayListStudent;

    public studentAdapter(@NonNull Context context, List<Student>arrayListStudent) {
        super(context, R.layout.studentview,arrayListStudent);

        this.context= context;
        this.arrayListStudent=arrayListStudent;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.studentview,null,true);

        TextView name1 = view.findViewById(R.id.name_st);
        TextView roll1 = view.findViewById(R.id.roll_st);
        TextView section1 = view.findViewById(R.id.sec_st);
        TextView call1 = view.findViewById(R.id.call_st);
        TextView username1 = view.findViewById(R.id.user_st);
        TextView password1 = view.findViewById(R.id.pass_st);

        name1.setText(arrayListStudent.get(position).getName());
        roll1.setText(arrayListStudent.get(position).getRoll());
        section1.setText(arrayListStudent.get(position).getSection());
        username1.setText(arrayListStudent.get(position).getUsername());
        password1.setText(arrayListStudent.get(position).getPassword());
        call1.setText(arrayListStudent.get(position).getCall());





        return super.getView(position, convertView, parent);
    }
}
