package com.android.flint.flerovium;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SoloActivity extends AppCompatActivity {
    private CanvasView mCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);

        mCanvas = (CanvasView) findViewById(R.id.signature_canvas);
    }
}
