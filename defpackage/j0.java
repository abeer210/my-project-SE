package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: j0  reason: default package */
/* compiled from: CardView */
public class j0 extends FrameLayout {
    private static final o0 e;
    private boolean a;
    private boolean b;
    public final Rect c;
    private final n0 d;

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            e = new l0();
        } else if (i >= 17) {
            e = new k0();
        } else {
            e = new m0();
        }
        e.h();
    }

    public ColorStateList getCardBackgroundColor() {
        return e.g(this.d);
    }

    public float getCardElevation() {
        return e.b(this.d);
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return e.f(this.d);
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return e.c(this.d);
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    public void onMeasure(int i, int i2) {
        if (!(e instanceof l0)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) e.j(this.d)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil((double) e.i(this.d)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        e.l(this.d, ColorStateList.valueOf(i));
    }

    public void setCardElevation(float f) {
        e.e(this.d, f);
    }

    public void setMaxCardElevation(float f) {
        e.m(this.d, f);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            e.k(this.d);
        }
    }

    public void setRadius(float f) {
        e.a(this.d, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            e.d(this.d);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        e.l(this.d, colorStateList);
    }
}
