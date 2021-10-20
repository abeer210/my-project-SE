package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* compiled from: CutoutDrawable */
public class c extends rx1 {
    private final Paint A;
    private final RectF B;
    private int C;

    public c() {
        this(null);
    }

    private void i0(Canvas canvas) {
        if (!p0(getCallback())) {
            canvas.restoreToCount(this.C);
        }
    }

    private void j0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (p0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
                return;
            }
            return;
        }
        l0(canvas);
    }

    private void l0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.C = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null);
        } else {
            this.C = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), null, 31);
        }
    }

    private void o0() {
        this.A.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A.setColor(-1);
        this.A.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    private boolean p0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    @Override // defpackage.rx1
    public void draw(Canvas canvas) {
        j0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.B, this.A);
        i0(canvas);
    }

    public boolean h0() {
        return !this.B.isEmpty();
    }

    public void k0() {
        m0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public void m0(float f, float f2, float f3, float f4) {
        RectF rectF = this.B;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            this.B.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    public void n0(RectF rectF) {
        m0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(vx1 vx1) {
        super(vx1 == null ? new vx1() : vx1);
        this.A = new Paint(1);
        o0();
        this.B = new RectF();
    }
}
