package com.example.pozna.myapplication33;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText e1;
    TextView t1;
    int goroscop = 3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.e1);
        t1 = (TextView) findViewById(R.id.t1);
        b1 = (Button) findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ;

                int saesons = Integer.parseInt(e1.getText().toString());
                if(saesons == goroscop){
                    e1.setText("oven");
                }

                else if(saesons > goroscop){
                    e1.setText("lev");
                }

                else if(saesons <goroscop)
                {
                    e1.setText("vesi");
                }

                else if(saesons < goroscop)
                {
                    e1.setText("vodolei");

                }
                else if(saesons < goroscop)
                {
                    e1.setText("ribi");

                }


            }
        });


    }
}
