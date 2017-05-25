package com.example.rahee.bank;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button equity, kcb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        equity = (Button) findViewById(R.id.equity);
        kcb = (Button) findViewById(R.id.kcb);


        equity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Welcome to Equity", Toast.LENGTH_SHORT).show();
               // Intent w = new Intent(MainActivity.this, Equity.class);
                Intent w = new Intent(getApplicationContext(), Equity.class);
                startActivity(w);
            }
        });


        kcb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent w = new Intent(getApplicationContext(), kcb.class);
                startActivity(w);
            }
        });
    }
}
