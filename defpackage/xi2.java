package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;
import vigqyno.C0201;

/* renamed from: xi2  reason: default package */
/* compiled from: ButtonSpan.kt */
public final class xi2 extends MetricAffectingSpan {
    private final tf2 a;

    public xi2(tf2 tf2) {
        ow2.c(tf2, C0201.m82(11992));
        this.a = tf2;
    }

    private final void a(Paint paint) {
        String str;
        Object obj;
        tf2 tf2 = this.a;
        Typeface typeface = paint.getTypeface();
        int style = typeface != null ? typeface.getStyle() : 0;
        Typeface typeface2 = tf2.l;
        int style2 = style & (typeface2 != null ? typeface2.getStyle() ^ -1 : 1);
        if ((style2 & 1) != 0) {
            paint.setFakeBoldText(true);
        }
        if ((style2 & 2) != 0) {
            paint.setTextSkewX(-0.25f);
        }
        if (tf2.j.f()) {
            paint.setTextSize((float) ((Number) tf2.j.d()).doubleValue());
        }
        if (tf2.h.f()) {
            sf2 sf2 = tf2.e;
            ow2.b(sf2, C0201.m82(11993));
            if (sf2.j()) {
                obj = tf2.h.d();
                str = C0201.m82(11994);
            } else {
                obj = tf2.i.d();
                str = C0201.m82(11995);
            }
            ow2.b(obj, str);
            paint.setColor(((Number) obj).intValue());
        }
        paint.setTypeface(tf2.l);
    }

    public void updateDrawState(TextPaint textPaint) {
        ow2.c(textPaint, C0201.m82(11996));
        a(textPaint);
    }

    public void updateMeasureState(TextPaint textPaint) {
        ow2.c(textPaint, C0201.m82(11997));
        a(textPaint);
    }
}
