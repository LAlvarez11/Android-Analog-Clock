package com.alvarez.luis.lalvarezlab5;

import android.content.Context;
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
