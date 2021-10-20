package com.facebook.react.views.text;

import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.style.ReplacementSpan;
import android.widget.TextView;

/* compiled from: TextInlineImageSpan */
public abstract class z extends ReplacementSpan implements l {
    public static void g(Spannable spannable, TextView textView) {
        z[] zVarArr = (z[]) spannable.getSpans(0, spannable.length(), z.class);
        for (z zVar : zVarArr) {
            zVar.c();
            zVar.h(textView);
        }
    }

    public abstract Drawable a();

    public abstract int b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public abstract void h(TextView textView);
}
