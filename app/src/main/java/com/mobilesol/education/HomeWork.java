package com.mobilesol.education;


import android.app.DatePickerDialog;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import com.mobilesol.education.R;

import java.util.Calendar;


public class HomeWork extends Fragment {


    SharedPreferences login;
    DatePickerDialog picker;
    TextView tv1,tv2,tv3,studentid;
    String mail;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
    View   view=inflater.inflate(R.layout.fragment_home_work, container, false);

        Toolbar toolbar = (Toolbar)view. findViewById(R.id.toolbar);
        studentid=(TextView)view.findViewById(R.id.studentid);
        tv1=(TextView)view.findViewById(R.id.TextView);


        login   = getActivity().getSharedPreferences("loginpref", 0);
        mail=  login.getString("mail", null);
        studentid.setText(mail);
        tv1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                picker = new DatePickerDialog(getActivity(),
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                tv1.setText(  + dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);

                            }
                        }, year, month, day);
                picker.show();
            }
        });
        return view;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        getActivity().setTitle("Home Work ");
    }
}
