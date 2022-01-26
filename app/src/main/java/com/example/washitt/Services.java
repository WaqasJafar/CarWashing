package com.example.washitt;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.core.view.DragStartHelper;

import com.hsalf.smilerating.SmileRating;


public class Services extends Activity{
    Button button;
    Switch aSwitch ,aSwitch2, aSwitch3;
    protected  void onCreate(Bundle savedInStanceState) {
        super.onCreate(savedInStanceState);
        setContentView(R.layout.services);


        button=(Button)findViewById(R.id.back);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in1=new Intent(Services.this,Row.class);
                startActivity(in1);


            }
        });

        aSwitch=(Switch) findViewById(R.id.switch1);
        aSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Services.this,Spl.class);
                startActivity(in1);
            }
        });



        aSwitch2=(Switch) findViewById(R.id.switch2);
        aSwitch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Services.this,EW.class);
                startActivity(in1);
            }
        });


        aSwitch3=(Switch) findViewById(R.id.switch3);
        aSwitch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Services.this,Washing.class);
                startActivity(in1);
            }
        });
    }
}