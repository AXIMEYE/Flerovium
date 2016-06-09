package com.android.flint.flerovium;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class SoloActivity extends AppCompatActivity {
    private CanvasView mCanvas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solo);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        mCanvas = (CanvasView) findViewById(R.id.drawing_canvas);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.tools_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
            case R.id.pencil_tool:
                mCanvas.setStrokeWidth(4f);
                return true;
            case R.id.paint_brush_tool:
                mCanvas.setStrokeWidth(10f);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
