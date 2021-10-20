package com.facebook.react.views.switchview;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.r0;

/* compiled from: ReactSwitch */
public class a extends r0 {
    private boolean S = true;
    private Integer T = null;
    private Integer U = null;

    public a(Context context) {
        super(context);
    }

    private void q(boolean z) {
        if (this.U != null || this.T != null) {
            p(z ? this.U : this.T);
        }
    }

    public void m(Drawable drawable, Integer num) {
        if (num == null) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void n(boolean z) {
        if (isChecked() != z) {
            super.setChecked(z);
            q(z);
        }
        this.S = true;
    }

    public void o(Integer num) {
        m(super.getThumbDrawable(), num);
    }

    public void p(Integer num) {
        m(super.getTrackDrawable(), num);
    }

    public void r(Integer num) {
        if (num != this.T) {
            this.T = num;
            if (!isChecked()) {
                p(this.T);
            }
        }
    }

    public void s(Integer num) {
        if (num != this.U) {
            this.U = num;
            if (isChecked()) {
                p(this.U);
            }
        }
    }

    @Override // androidx.appcompat.widget.r0
    public void setChecked(boolean z) {
        if (!this.S || isChecked() == z) {
            super.setChecked(isChecked());
            return;
        }
        this.S = false;
        super.setChecked(z);
        q(z);
    }
}
