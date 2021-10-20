package com.horcrux.svg;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.facebook.react.bridge.ReactContext;

@SuppressLint({"ViewConstructor"})
/* compiled from: DefsView */
public class e extends d {
    public e(ReactContext reactContext) {
        super(reactContext);
    }

    @Override // com.horcrux.svg.w0, com.horcrux.svg.d
    public void j(Canvas canvas, Paint paint, float f) {
    }

    @Override // com.horcrux.svg.w0
    public void v() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof w0) {
                ((w0) childAt).v();
            }
        }
    }
}
