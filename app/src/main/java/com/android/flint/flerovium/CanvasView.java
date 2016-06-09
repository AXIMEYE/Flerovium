package com.android.flint.flerovium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class CanvasView extends View {
    private Paint mPaint;
    private Path mPath = new Path();
    private Bitmap mBitmap;

    public CanvasView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setupPaint();
        setupBitmap();
    }

    /**
     * Implement this to do your drawing
     * @param canvas the canvas on which the background would be drawn
     */
    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(mBitmap, 0, 0, mPaint);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float pointX = event.getX();
        float pointY = event.getY();
        Canvas c = new Canvas(mBitmap);

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                mPath.moveTo(pointX, pointY);
                c.drawPath(mPath, mPaint);
                break;
            case MotionEvent.ACTION_MOVE:
                mPath.lineTo(pointX, pointY);
                c.drawPath(mPath, mPaint);
                break;
            default:
                return false;
        }

        postInvalidate();
        return true;
    }

    private void setupPaint() {
        mPaint = new Paint();
        mPaint.setColor(Color.BLACK);
        mPaint.setAntiAlias(true);
        mPaint.setStrokeWidth(5);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeJoin(Paint.Join.ROUND);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
    }

    private void setupBitmap() {
        mBitmap = Bitmap.createBitmap(800, 400, Bitmap.Config.ARGB_8888); // 800x400 landscape dimensions of my device
    }

    public void clearCanvas() {

    }

    public void setStrokeWidth(float width) {
        mPaint.setStrokeWidth(width);
    }
}