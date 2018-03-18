package com.example.apurva.successquotes;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/**
 * Created by apurva on 18-Mar-18.
 */

public class HindiTextView extends AppCompatTextView {
    public HindiTextView(Context context) {
        super(context);
        initTypeface(context);
    }

    public HindiTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initTypeface(context);
    }

    public HindiTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initTypeface(context);
    }

    private void initTypeface(Context context){

        Typeface typeface=Typeface.createFromAsset(context.getAssets(),"NotoSansDevanagari-Regular.ttf");
        this.setTypeface(typeface);

    }
}
