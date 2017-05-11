package com.alvarez.luis.lalvarezlab5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by luisalvarez on 5/9/17.
 */

public class ClockView extends View {

    private Context context;
    private int h;
    private int w;
    private final float HEIGHT = 340f;
    private final float WIDTH = 200f;
    private final float ASPECTRATIO = WIDTH / HEIGHT;
    private final float radius = 200;
    private Path path;
    private float hourHandLength;
    private float minuteHandLength;
    private float secondHandLength;
    private float hourTailLength;
    private float minuteTailLength;
    private float secondTailLength;






    public ClockView(Context context) {
        super(context);
        if(!isInEditMode()){
            init(context);
        }
    }



    public ClockView(Context context, AttributeSet attrs) {

        super(context, attrs);
        if(!isInEditMode()){
            init(context);
        }
    }

    public ClockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        if(!isInEditMode()){
            init(context);
        }

    }

    private void init(Context context){
        this.context = context;
    }

    @Override
    protected void onDraw(Canvas canvas){

        canvas.drawRGB(0,0,0);

        int red = Color.rgb(255,0,0);
        int dullred = Color.rgb(77, 0, 0);
        Paint p = new Paint();
        Paint p2 = new Paint();
        p.setColor(red);
        p2.setColor(dullred);
        p.setStyle(Paint.Style.FILL);
        p2.setStyle(Paint.Style.FILL);
        path = new Path();
        path.moveTo(30, 40);
        path.lineTo(40, 50);
        path.lineTo(160, 50);
        path.lineTo(170, 40);
        path.lineTo(160, 30);
        path.lineTo(40, 30);
        path.lineTo(30, 40);
        float h2 =  h / HEIGHT;
        float w2 = w / WIDTH;

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

        this.w = w;
        this.h = h;
        super.onSizeChanged(w, h, oldw, oldh);

    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {

        int widthSize = MeasureSpec.getSize(widthMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMeasureSpec);


        int calc_width = (int)(heightSize * ASPECTRATIO);
        int calc_height = (int)(widthSize / ASPECTRATIO);

        if(calc_height > widthSize){
            setMeasuredDimension(calc_width, heightSize);
        }
        else{
            setMeasuredDimension(widthSize, calc_height);
        }
    }



}