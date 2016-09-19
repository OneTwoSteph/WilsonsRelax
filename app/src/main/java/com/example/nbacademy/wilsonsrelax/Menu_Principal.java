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

public class Menu_Principal extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu__principal);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        /*
=======
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

>>>>>>> be60d5e16c348e3784c9af6714f71320516b46d2
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
<<<<<<< HEAD
            }
        });
        */
        //Action Listener Botão Respiração
        Button resp = (Button) findViewById(R.id.button10);

        resp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Menu_Principal.this, Respiracao.class));
            }

        });

        //Action Listener Botão Relaxamento
        final Button relax =(Button)findViewById(R.id.button11);

        relax.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Menu_Principal.this, Relaxamento.class));
            }

        });

        //Action Listener Botão Música
        Button musica =(Button)findViewById(R.id.button12);

        musica.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Menu_Principal.this, Musica.class));
            }

        });

        //Action Listener Botão Posicoes
        Button pos =(Button)findViewById(R.id.button13);

        pos.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(Menu_Principal.this, Posicoes.class));
            }

        });


    }
}



