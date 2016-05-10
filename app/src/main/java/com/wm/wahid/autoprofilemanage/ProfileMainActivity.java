package com.wm.wahid.autoprofilemanage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ProfileMainActivity extends AppCompatActivity {
    private Button _stopButton;
    public static TextView t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_main);
        _stopButton = (Button) findViewById(R.id.stopButtonID);
        t = (TextView) findViewById(R.id.textView);
        startService(new Intent(getBaseContext(), SensorService.class));


        _stopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopService(new Intent(getBaseContext(), SensorService.class));
            }
        });
    }
}
