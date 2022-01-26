package com.example.washitt;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class Menu extends Activity {
 ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8;


    protected  void onCreate(Bundle savedInStanceState){

        super.onCreate(savedInStanceState);

        setContentView(R.layout.main_menu);
        imageView1=(ImageView) findViewById(R.id.image1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,About.class);
                startActivity(in1);
            }
        });
        imageView2=(ImageView) findViewById(R.id.image2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,Services.class);
                startActivity(in1);
            }
        });

        imageView3=(ImageView) findViewById(R.id.image3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,PriceTable.class);
                startActivity(in1);
            }
        });

        imageView4=(ImageView) findViewById(R.id.image4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,Location.class);
                startActivity(in1);
            }
        });

        imageView5=(ImageView) findViewById(R.id.image5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,OurTeam.class);
                startActivity(in1);
            }
        });
        imageView6=(ImageView) findViewById(R.id.image6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,ContactUs.class);
                startActivity(in1);
            }
        });

        imageView7=(ImageView) findViewById(R.id.image7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,Row.class);
                startActivity(in1);
            }
        });
        imageView8=(ImageView) findViewById(R.id.image8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in1=new Intent(Menu.this,ContactUs.class);
                startActivity(in1);
            }
        });
    }
}
