package com.example.washitt;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;


public class PriceTable extends Activity{

private boolean table_flg = false;
   @Override
    protected  void onCreate(Bundle savedInStanceState) {
        super.onCreate(savedInStanceState);
        setContentView(R.layout.price_table);

        }

        public void collapseTable(View view){

            TableLayout table =findViewById ( R.id.table );
            Button switchBtn = findViewById ( R.id.swichBtn );
            table.setColumnCollapsed ( 1, table_flg );
            table.setColumnCollapsed ( 2, table_flg );

            if (table_flg){

                table_flg = false;
                switchBtn.setText ("Show Detail");

            }
            else {
                table_flg =true;
                switchBtn.setText ( "Hide Detail" );
            }
        }
    }

