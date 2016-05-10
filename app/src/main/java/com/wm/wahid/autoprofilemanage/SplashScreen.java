package com.wm.wahid.autoprofilemanage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

/**
 * Created by Wahid on 5/6/2016.
 */
public class SplashScreen extends AppCompatActivity {
    private final int SPLASH_SCREEN_DISPLAY_TIME = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_ACTION_BAR);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, ProfileMainActivity.class);
                SplashScreen.this.startActivity(intent);
                SplashScreen.this.finish();
            }
        }, SPLASH_SCREEN_DISPLAY_TIME);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
