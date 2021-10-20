package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: up2  reason: default package */
/* compiled from: ZoomableDraweeView */
public class up2 extends qa0 {
    private tp2 i;

    public up2(Context context) {
        super(context);
        m();
    }

    public float getMaximumScale() {
        return this.i.t();
    }

    public float getMediumScale() {
        return this.i.u();
    }

    public float getMinimumScale() {
        return this.i.v();
    }

    public tx2 getOnPhotoTapListener() {
        return this.i.w();
    }

    public wx2 getOnViewTapListener() {
        return this.i.x();
    }

    public float getScale() {
        return this.i.y();
    }

    public void m() {
        tp2 tp2 = this.i;
        if (tp2 == null || tp2.r() == null) {
            this.i = new tp2(this);
        }
    }

    public void n(float f, float f2, float f3, boolean z) {
        this.i.N(f, f2, f3, z);
    }

    public void o(float f, boolean z) {
        n(f, (float) (getRight() / 2), (float) (getBottom() / 2), z);
    }

    @Override // defpackage.oa0
    public void onAttachedToWindow() {
        m();
        super.onAttachedToWindow();
    }

    @Override // defpackage.oa0
    public void onDetachedFromWindow() {
        this.i.B();
        super.onDetachedFromWindow();
    }

    public void onDraw(Canvas canvas) {
        int save = canvas.save();
        canvas.concat(this.i.q());
        super.onDraw(canvas);
        canvas.restoreToCount(save);
    }

    @Override // defpackage.oa0
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p(int i2, int i3) {
        this.i.Q(i2, i3);
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.i.E(z);
    }

    public void setMaximumScale(float f) {
        this.i.F(f);
    }

    public void setMediumScale(float f) {
        this.i.G(f);
    }

    public void setMinimumScale(float f) {
        this.i.H(f);
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.i.I(onDoubleTapListener);
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.i.J(onLongClickListener);
    }

    public void setOnPhotoTapListener(tx2 tx2) {
        this.i.K(tx2);
    }

    public void setOnScaleChangeListener(ux2 ux2) {
        this.i.S(ux2);
    }

    public void setOnViewTapListener(wx2 wx2) {
        this.i.L(wx2);
    }

    public void setScale(float f) {
        this.i.M(f);
    }

    public void setZoomTransitionDuration(long j) {
        this.i.P(j);
    }
}
