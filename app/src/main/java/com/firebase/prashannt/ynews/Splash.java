package com.firebase.prashannt.ynews;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by prashannt on 5/11/2016.
 */
public class Splash extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    Intent openStartingPoint=new Intent(Splash.this,AppIntroActivity.class);
                    startActivity(openStartingPoint);
                }
            }

        };
        timer.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();

    }
}
