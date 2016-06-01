package com.android.flint.flerovium;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FleroviumActivity extends Activity {
    Button mMultiplayerButton;
    Button mSoloButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flerovium);

        mMultiplayerButton = (Button) findViewById(R.id.multiplayer_button);
        mMultiplayerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mSoloButton = (Button) findViewById(R.id.solo_button);
        mSoloButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FleroviumActivity.this, SoloActivity.class);
                startActivity(i);
            }
        });
    }


}
