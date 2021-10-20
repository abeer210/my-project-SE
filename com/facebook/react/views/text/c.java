package com.facebook.react.views.text;

import android.content.res.AssetManager;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* compiled from: CustomStyleSpan */
public class c extends MetricAffectingSpan implements l {
    private final AssetManager a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;

    public c(int i, int i2, String str, String str2, AssetManager assetManager) {
        this.b = i;
        this.c = i2;
        this.d = str;
        this.e = str2;
        this.a = assetManager;
    }

    private static void a(Paint paint, int i, int i2, String str, String str2, AssetManager assetManager) {
        Typeface a2 = t.a(paint.getTypeface(), i, i2, str2, assetManager);
        if (Build.VERSION.SDK_INT >= 21) {
            paint.setFontFeatureSettings(str);
        }
        paint.setTypeface(a2);
        paint.setSubpixelText(true);
    }

    public void updateDrawState(TextPaint textPaint) {
        a(textPaint, this.b, this.c, this.d, this.e, this.a);
    }

    public void updateMeasureState(TextPaint textPaint) {
        a(textPaint, this.b, this.c, this.d, this.e, this.a);
    }
}
