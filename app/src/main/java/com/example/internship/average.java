package com.example.internship;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;

import java.util.Calendar;

public class average extends AppCompatActivity {

    EditText dateTXT;
    ImageView cal;
    private int mDate, mMonth, mYear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_average);
        getSupportActionBar().setTitle("Average");

        dateTXT=findViewById(R.id.avgdate);
        cal=findViewById(R.id.datepicker);

        dateTXT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar Cal= Calendar.getInstance();
                mDate=Cal.get(Calendar.DATE);
                mMonth=Cal.get(Calendar.MONTH);
                mYear=Cal.get(Calendar.YEAR);
                DatePickerDialog datePickerDialog= new DatePickerDialog(average.this, android.R.style.Theme_DeviceDefault_Dialog, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int year, int month, int date) {
                        month=month+1;
                      //  mMonth=mMonth+1;
                        dateTXT.setText(date+"/"+month+"/"+year);
                    }
                },mYear, mMonth, mDate);
                datePickerDialog.show();



            }
        });

    }
}