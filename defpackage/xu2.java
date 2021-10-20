package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import vigqyno.C0201;

/* renamed from: xu2  reason: default package */
/* compiled from: BlurView */
public class xu2 extends FrameLayout {
    private static final String c = xu2.class.getSimpleName();
    public wu2 a = new av2();
    private int b;

    public xu2(Context context) {
        super(context);
        a(null, 0);
    }

    private void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, bv2.BlurView, i, 0);
        this.b = obtainStyledAttributes.getColor(bv2.BlurView_blurOverlayColor, 0);
        obtainStyledAttributes.recycle();
    }

    public yu2 b(float f) {
        return this.a.g(f);
    }

    public yu2 c(int i) {
        this.b = i;
        return this.a.b(i);
    }

    public yu2 d(ViewGroup viewGroup) {
        uu2 uu2 = new uu2(this, viewGroup, this.b);
        this.a.destroy();
        this.a = uu2;
        return uu2;
    }

    public void draw(Canvas canvas) {
        if (this.a.f(canvas)) {
            super.draw(canvas);
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(c, C0201.m82(66));
        } else {
            this.a.a(true);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a(false);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.e();
    }
}
