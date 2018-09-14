package com.mobilesol.education;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

public class SplashScreen extends Activity {
    Handler handler;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               Nextpage();
            }
        },5000);
    }

    private void Nextpage() {
        Intent intent=new Intent(SplashScreen.this,Login.class);
        startActivity(intent);
        finish();
    }
}
