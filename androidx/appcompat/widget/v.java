package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.a;

/* compiled from: AppCompatSeekBarHelper */
public class v extends r {
    private final SeekBar d;
    private Drawable e;
    private ColorStateList f = null;
    private PorterDuff.Mode g = null;
    private boolean h = false;
    private boolean i = false;

    public v(SeekBar seekBar) {
        super(seekBar);
        this.d = seekBar;
    }

    private void f() {
        if (this.e == null) {
            return;
        }
        if (this.h || this.i) {
            Drawable r = a.r(this.e.mutate());
            this.e = r;
            if (this.h) {
                a.o(r, this.f);
            }
            if (this.i) {
                a.p(this.e, this.g);
            }
            if (this.e.isStateful()) {
                this.e.setState(this.d.getDrawableState());
            }
        }
    }

    @Override // androidx.appcompat.widget.r
    public void c(AttributeSet attributeSet, int i2) {
        super.c(attributeSet, i2);
        x0 u = x0.u(this.d.getContext(), attributeSet, m.AppCompatSeekBar, i2, 0);
        Drawable h2 = u.h(m.AppCompatSeekBar_android_thumb);
        if (h2 != null) {
            this.d.setThumb(h2);
        }
        j(u.g(m.AppCompatSeekBar_tickMark));
        if (u.r(m.AppCompatSeekBar_tickMarkTintMode)) {
            this.g = e0.e(u.k(m.AppCompatSeekBar_tickMarkTintMode, -1), this.g);
            this.i = true;
        }
        if (u.r(m.AppCompatSeekBar_tickMarkTint)) {
            this.f = u.c(m.AppCompatSeekBar_tickMarkTint);
            this.h = true;
        }
        u.v();
        f();
    }

    public void g(Canvas canvas) {
        if (this.e != null) {
            int max = this.d.getMax();
            int i2 = 1;
            if (max > 1) {
                int intrinsicWidth = this.e.getIntrinsicWidth();
                int intrinsicHeight = this.e.getIntrinsicHeight();
                int i3 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i2 = intrinsicHeight / 2;
                }
                this.e.setBounds(-i3, -i2, i3, i2);
                float width = ((float) ((this.d.getWidth() - this.d.getPaddingLeft()) - this.d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.d.getPaddingLeft(), (float) (this.d.getHeight() / 2));
                for (int i4 = 0; i4 <= max; i4++) {
                    this.e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public void h() {
        Drawable drawable = this.e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.d.getDrawableState())) {
            this.d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.d);
            a.m(drawable, k3.w(this.d));
            if (drawable.isStateful()) {
                drawable.setState(this.d.getDrawableState());
            }
            f();
        }
        this.d.invalidate();
    }
}
