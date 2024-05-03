package com.mirea.kt.practica26tolstobrova;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnStart;
    private TextView tvTextValue;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart=findViewById(R.id.button);
        tvTextValue=findViewById(R.id.textView2);
        btnStart.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            Intent intent=new Intent(this,CalcActivity.class);
            startActivityForResult(intent,12345);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==12345){
            if(data!=null){
                int res=data.getIntExtra("data",0);
                Log.d("simple_app_tag","Result: "+res);
                tvTextValue.setText("Произведение чисел: "+ "\n" + res);
            }
        }
    }
}