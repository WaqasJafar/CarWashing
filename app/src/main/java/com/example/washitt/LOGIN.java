package com.example.washitt;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RequiresApi;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;


public class LOGIN extends Activity {
    Button b3;
    EditText mail, password;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        b3 = (Button) findViewById(R.id.logBtn);
        mail =(EditText)findViewById ( R.id.email );
        password =(EditText)findViewById ( R.id.password );

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (mail.length ()==0)
                {
                    mail.setError ( "Enter value" );


                }
                else if(password.length ()==0)
                {

                   password.setError ( "Enter valide Password" );

                }

                else{

                    Toast.makeText ( LOGIN.this, "Recode added",Toast.LENGTH_SHORT).show ();
                    Intent in3 = new Intent(LOGIN.this, Menu.class);
                    startActivity(in3);
                }


            }
        });
    }
}