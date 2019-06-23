package com.example.timeanddate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private Button btnShowDate;
    private Button btnShowTime;
    private Button btnShowRead;

    private DatePicker datePicker;
    private TimePicker timePicker;

    private String msg = "dataPicker을 조작하세요";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowDate = (Button)findViewById(R.id.btn_show_date);
        btnShowTime = (Button)findViewById(R.id.btn_show_time);
        btnShowRead = (Button)findViewById(R.id.btn_show_read);

        datePicker = (DatePicker)findViewById(R.id.picker_date);
        timePicker = (TimePicker)findViewById(R.id.picker_time);

        btnShowDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.VISIBLE);
                timePicker.setVisibility(View.GONE);

                msg = "datePicker을 조작하세요.";
            }
        });

        btnShowTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                datePicker.setVisibility(View.GONE);
                timePicker.setVisibility(View.VISIBLE);

                msg = "timePicker을 조작하세요.";
            }
        });

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                msg = year + "." +  (month + 1) + "." + dayOfMonth;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hourOfDay, int minute) {
                msg = hourOfDay + " : " + minute;
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

        btnShowRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
            }
        });

    }

}
