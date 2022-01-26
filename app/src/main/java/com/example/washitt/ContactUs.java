package com.example.washitt;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ContactUs extends Activity {
    EditText editText,editText2,editText3,textView4,textView5;

    Button btn;



    protected  void onCreate(Bundle savedInStanceState) {

        super.onCreate(savedInStanceState);
        setContentView(R.layout.contact_us);

        editText = (EditText)findViewById ( R.id.editText );
        editText2 =(EditText) findViewById ( R.id.editText2 );
        editText3 = (EditText) findViewById ( R.id.editText3 );
        textView4 = (EditText) findViewById ( R.id.editText4);
        btn =(Button) findViewById (R.id.button);

        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {


                if (editText.length ()==0 )
                {
                    editText.setError ( "Enter value" );


                }
                else if(editText2.length ()==0)

                {
                    editText2.setError ( "Enter value" );
                }

                else if (editText3.length ()==0)

                {
                    editText3.setError ( "Enter value" );

                }

                else {

                    Toast.makeText ( ContactUs.this, "Recode added",Toast.LENGTH_SHORT).show ();

                }


            }

        } );
    }
}
