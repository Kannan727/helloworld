package com.example.helloworld;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView disp;
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button2=findViewById(R.id.button2);
        setContentView(R.layout.activity_main2);
        disp=findViewById(R.id.textView2);
        String name=getIntent().getStringExtra("Message");
        disp.setText(name);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str="I am from 2nd activity";
               Intent i=new Intent();
                i.putExtra("Msg",str);
                setResult(RESULT_OK,i);
                finish();
            }
        });

    }
}