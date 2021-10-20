package com.facebook.react.views.text.frescosupport;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.TextView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.fresco.a;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.image.d;
import com.facebook.react.views.text.z;
import defpackage.w90;

/* compiled from: FrescoBasedReactTextInlineImageSpan */
public class b extends z {
    private Drawable a;
    private final x80 b;
    private final na0<ba0> c;
    private final Object d;
    private int e;
    private int f;
    private Uri g;
    private int h;
    private ReadableMap i;
    private String j;
    private TextView k;

    public b(Resources resources, int i2, int i3, int i4, Uri uri, ReadableMap readableMap, x80 x80, Object obj, String str) {
        this.c = new na0<>(ca0.u(resources).a());
        this.b = x80;
        this.d = obj;
        this.f = i4;
        this.g = uri == null ? Uri.EMPTY : uri;
        this.i = readableMap;
        this.h = (int) q.c((float) i3);
        this.e = (int) q.c((float) i2);
        this.j = str;
    }

    private w90.c i(String str) {
        return d.c(str);
    }

    @Override // com.facebook.react.views.text.z
    public Drawable a() {
        return this.a;
    }

    @Override // com.facebook.react.views.text.z
    public int b() {
        return this.e;
    }

    @Override // com.facebook.react.views.text.z
    public void c() {
        this.c.k();
    }

    @Override // com.facebook.react.views.text.z
    public void d() {
        this.c.l();
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f2, int i4, int i5, int i6, Paint paint) {
        if (this.a == null) {
            a w = a.w(jh0.r(this.g), this.i);
            this.c.h().u(i(this.j));
            x80 x80 = this.b;
            x80.x();
            x80.D(this.c.g());
            x80.z(this.d);
            x80.B(w);
            this.c.o(x80.a());
            this.b.x();
            Drawable i7 = this.c.i();
            this.a = i7;
            i7.setBounds(0, 0, this.h, this.e);
            int i8 = this.f;
            if (i8 != 0) {
                this.a.setColorFilter(i8, PorterDuff.Mode.SRC_IN);
            }
            this.a.setCallback(this.k);
        }
        canvas.save();
        canvas.translate(f2, (float) (((i5 + ((int) paint.descent())) - (((int) (paint.descent() - paint.ascent())) / 2)) - ((this.a.getBounds().bottom - this.a.getBounds().top) / 2)));
        this.a.draw(canvas);
        canvas.restore();
    }

    @Override // com.facebook.react.views.text.z
    public void e() {
        this.c.k();
    }

    @Override // com.facebook.react.views.text.z
    public void f() {
        this.c.l();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt != null) {
            int i4 = -this.e;
            fontMetricsInt.ascent = i4;
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = i4;
            fontMetricsInt.bottom = 0;
        }
        return this.h;
    }

    @Override // com.facebook.react.views.text.z
    public void h(TextView textView) {
        this.k = textView;
    }
}
