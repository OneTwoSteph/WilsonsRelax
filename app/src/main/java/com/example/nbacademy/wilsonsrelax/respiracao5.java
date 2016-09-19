package com.example.nbacademy.wilsonsrelax;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;

public class respiracao5 extends AppCompatActivity {

    ProgressBar progressBar;

    private void setProgressValue(final int progress, final int inc, final int totalTime) {

        // set the progress
        progressBar.setProgress(inc);
        // thread is used to change the progress value
		if(totalTime < 600000){
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(progress == 0 && progressBar.getProgress()<100)
						setProgressValue(0,progressBar.getProgress() + 10, totalTime + 500);
					else {
						if (progress == 100 && progressBar.getProgress() == 0) {
							setProgressValue(0,progressBar.getProgress() + 10, totalTime + 500);
						} else {
							setProgressValue(100, progressBar.getProgress() - 10, totalTime + 500);
						}
					}
				}
			});
			thread.start();
		}else{
			//Acabou o exercicio!!!!
		}
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respiracao1);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        setProgressValue(0,10,0);
        /*Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);*/


    }

}
