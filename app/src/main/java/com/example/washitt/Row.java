package com.example.washitt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Row extends Activity {
    EditText editText ,EditText2;
    Button  button;
    protected  void onCreate(Bundle savedInStanceState) {
        super.onCreate(savedInStanceState);
        setContentView(R.layout.row);

        final EditText edit1 =(EditText)findViewById ( R.id.edit1 );
        final EditText edit2 =(EditText)findViewById ( R.id.edit2 );
        Button  btn =(Button) findViewById ( R.id.button );
        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i=new Intent ( Intent.ACTION_SENDTO );
                i.setType ( "message/html" );
                i.putExtra ( Intent.EXTRA_EMAIL, new String ( "xyz@gmail.com" ));
                i.putExtra ( Intent.EXTRA_SUBJECT ,"Feedback Form App");
                i.putExtra ( Intent.EXTRA_TEXT,"Name:"+edit1.getText ()+"\n Message:"+edit2.getText ());
                try {
                    startActivity(Intent.createChooser ( i,"Please select Email" ));
                }
                catch (android.content.ActivityNotFoundException ex)
                {
                    Toast.makeText ( Row.this,"There are no Email Clients" ,Toast.LENGTH_SHORT).show ();

                }
            }
        } );


}}
