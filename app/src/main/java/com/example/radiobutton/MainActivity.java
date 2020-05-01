package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView final_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final_result=findViewById(R.id.result);
        final_result.setEnabled(false);
    }

    public void SelectDept(View view) {

        boolean checked=((RadioButton) view).isChecked();

        switch (view.getId()){

            case R.id.dept_IT:
                if(checked){
                    final_result.setText("You are in IT department");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
             break;

            case R.id.dept_Sales:
                if(checked){
                    final_result.setText("You are in Sales department");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;

            case R.id.dept_HR:
                if(checked){
                    final_result.setText("You are in HR department");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;

            case R.id.dept_NPO:
                if(checked){
                    final_result.setText("You are in NPO department");
                    final_result.setEnabled(true);
                }else{
                    final_result.setEnabled(false);
                }
                break;

        }


    }
}
