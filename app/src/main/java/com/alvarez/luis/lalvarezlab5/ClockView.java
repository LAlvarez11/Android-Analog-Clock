package com.alvarez.luis.lalvarezlab5;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by luisalvarez on 5/9/17.
 */

public class ClockView extends View {

    private Context context;

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


}
