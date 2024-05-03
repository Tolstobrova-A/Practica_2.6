package com.mirea.kt.practica26tolstobrova;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        TextView editTextFirst=findViewById(R.id.textView4);
        TextView editTextSecond=findViewById(R.id.textView5);
        TextView editTextSecond1=findViewById(R.id.textView6);
        Button btnCalc=findViewById(R.id.button2);
        btnCalc.setOnClickListener(v -> {
            String firstTermStr=editTextFirst.getText().toString();
            String secondTermStr=editTextSecond.getText().toString();
            String second1TermStr=editTextSecond1.getText().toString();
            if(!firstTermStr.isEmpty() && !secondTermStr.isEmpty() && !second1TermStr.isEmpty()){
                int result=Integer.parseInt(firstTermStr)*Integer.parseInt(secondTermStr)*Integer.parseInt(second1TermStr);
                Intent intent=new Intent();
                intent.putExtra("data",result);
                setResult(RESULT_OK,intent);
                finish();
            }else{
                Toast.makeText(getApplicationContext(),"Invalid terms", Toast.LENGTH_LONG).show();
            }
        });

    }


}