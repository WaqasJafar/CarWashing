package com.example.washitt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Washing extends AppCompatActivity {

    private Spinner spinner;
    RadioGroup radioGroup;
    RadioButton radioButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_washing );

        radioGroup =findViewById ( R.id.radioGroup);
        Button buttonApply =findViewById ( R.id.button_apply );
        buttonApply.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                int radioId =radioGroup.getCheckedRadioButtonId ();
                radioButton = findViewById ( radioId );

            }
        } );




        spinner = findViewById ( R.id.spinner );
        List<String> categories = new ArrayList<> (  );
        categories.add ( 0,"Select Car Type" );
        categories.add ( "HONDHA CIVIC AND CITY" );
        categories.add ( "TOYOTA COROLLA" );
        categories.add ( "MERCEDES" );
        categories.add ( "MEHRAN" );
        categories.add ( "HUNDYIA" );
        categories.add ( "KIYA" );
        categories.add ( "SUZUKI CULTUS" );
        categories.add ( "SUZUKI WAGON R" );

        ArrayAdapter<String> dataAdapter ;
        dataAdapter =new ArrayAdapter(this,android.R.layout.simple_spinner_item , categories);
        dataAdapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item );
        spinner.setAdapter ( dataAdapter );
        spinner.setOnItemSelectedListener ( new AdapterView.OnItemSelectedListener () {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if (parent.getItemAtPosition ( position ).equals ( "Select Car Type" ))
                {

                }
                else
                {
                    String item = parent.getItemAtPosition ( position ).toString ();

                    Toast.makeText ( parent.getContext (), "Selected:" +item,Toast.LENGTH_SHORT ).show ();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        } );



    }

    public void  checkButton (View v){

        int radioId =radioGroup.getCheckedRadioButtonId ();
        radioButton = findViewById ( radioId );
        Toast.makeText(this,"Selected Radio Button:" + radioButton.getText (), Toast.LENGTH_SHORT).show ();
    }
}
