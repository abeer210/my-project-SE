package com.facebook.react.views.text;

import android.annotation.TargetApi;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

@TargetApi(21)
/* compiled from: CustomLetterSpacingSpan */
public class a extends MetricAffectingSpan implements l {
    private final float a;

    public a(float f) {
        this.a = f;
    }

    private void a(TextPaint textPaint) {
        if (!Float.isNaN(this.a)) {
            textPaint.setLetterSpacing(this.a);
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint);
    }
}
