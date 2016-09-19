package com.example.nbacademy.wilsonsrelax;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Respiracao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiracao);


        //Action Listener Botão Respiração
        Button resp1 = (Button) findViewById(R.id.button1);

        resp1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao1.class));
                //this
            }

        });


        //Action Listener Botão Respiração
        Button resp2 = (Button) findViewById(R.id.button2);

        resp2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao2.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp3 = (Button) findViewById(R.id.button3);

        resp3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao3.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp4 = (Button) findViewById(R.id.button4);

        resp4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao4.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp5 = (Button) findViewById(R.id.button5);

        resp5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao5.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp6 = (Button) findViewById(R.id.button6);

        resp6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao6.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp7 = (Button) findViewById(R.id.button7);

        resp7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao7.class));
                //this
            }

        });

        //Action Listener Botão Respiração
        Button resp8 = (Button) findViewById(R.id.button8);

        resp8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Respiracao.this, respiracao8.class));
                //this
            }

        });
    }
}
