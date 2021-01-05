package com.example.helloworld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private RadioGroup rg;
   // private CheckBox c1,c2,c3,c4;

    //private EditText name;
    //private final int request=10;
    //private TextView showname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);
        rg=findViewById(R.id.rg);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder str=new StringBuilder();
                str.append("Selected Languages are");
                int id=rg.getCheckedRadioButtonId();
                RadioButton rbl=findViewById(id);
                str.append(rbl.getText().toString());
                Toast.makeText(MainActivity.this,str.toString(),Toast.LENGTH_LONG).show();
            }
        });


       // c1=findViewById(R.id.checkBox1);
       // c2=findViewById(R.id.checkBox2);
       // c3=findViewById(R.id.checkBox3);
       // c4=findViewById(R.id.checkBox4);

      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean check=true;
                StringBuilder str=new StringBuilder();
                str.append("Languages Known !!\n");
                if(c1.isChecked()){
                    str.append(c1.getText().toString()+"\n");
                    check=false;
                }
                if(c2.isChecked()){
                    str.append(c2.getText().toString()+"\n");
                    check=false;
                }
                if(c3.isChecked()){
                    str.append(c3.getText().toString()+"\n");
                    check=false;
                }
                if(c4.isChecked()){
                    str.append(c4.getText().toString()+"\n");
                    check=false;
                }
                if(check)
                {
                    str.append("None !!!");
                }
                Toast.makeText(MainActivity.this,str.toString(),Toast.LENGTH_SHORT).show();
            }
        });
        */

    }
        //button=findViewById(R.id.button);
        //name=findViewById(R.id.name);
        //showname=findViewById(R.id.textView);
        //showname.setEnabled(false);
        //showname.setVisibility(View.GONE);

      /* button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               String names;
               names=name.getText().toString();
               Intent intent=new Intent(MainActivity.this,MainActivity2.class);
               intent.putExtra("Message",names);

               startActivityForResult(intent,request);
               //startActivity(intent);

             //  showname.setText(names);
               //showname.setVisibility(View.VISIBLE);
               //showname.setEnabled(true);

               //Toast.makeText(MainActivity.this,names,Toast.LENGTH_SHORT).show();
           }
       });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==resultCode)
        {
            if(resultCode==RESULT_OK)
            {
                String msg=data.getStringExtra("msg");
                button.setText(msg);
            }
        }
        else
        {
            //default msg.....
        }
    }
    */

    /*
   //life cycle modelsss
    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onstart" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(MainActivity.this, "onStop" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(MainActivity.this, "onDestroy" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart" , Toast.LENGTH_SHORT).show();
    }
    */
}