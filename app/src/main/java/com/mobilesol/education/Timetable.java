package com.mobilesol.education;


import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mobilesol.education.R;

public class Timetable extends Fragment {
    SharedPreferences login;
    DatePickerDialog picker;
    TextView tv1,tv2,tv3,studentid;
    String mail;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_timetable, container, false);
        studentid=(TextView)view.findViewById(R.id.studentid);
        login   = getActivity().getSharedPreferences("loginpref", 0);
        mail=  login.getString("mail", null);
        studentid.setText(mail);
        Toolbar toolbar = (Toolbar)view. findViewById(R.id.toolbar);

        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle("Exam TimeTable ");
    }
}
