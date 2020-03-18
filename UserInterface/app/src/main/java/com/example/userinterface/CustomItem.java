package com.example.userinterface;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class CustomItem extends androidx.appcompat.widget.AppCompatTextView {

    public CustomItem(Context context) {
        super(context);
    }

    public CustomItem(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomItem(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
