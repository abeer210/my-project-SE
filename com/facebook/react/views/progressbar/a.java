package com.facebook.react.views.progressbar;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ProgressBarContainerView */
public class a extends FrameLayout {
    private Integer a;
    private boolean b = true;
    private boolean c = true;
    private double d;
    private ProgressBar e;

    public a(Context context) {
        super(context);
    }

    private void c(ProgressBar progressBar) {
        Drawable drawable;
        if (progressBar.isIndeterminate()) {
            drawable = progressBar.getIndeterminateDrawable();
        } else {
            drawable = progressBar.getProgressDrawable();
        }
        if (drawable != null) {
            Integer num = this.a;
            if (num != null) {
                drawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            } else {
                drawable.clearColorFilter();
            }
        }
    }

    public void a() {
        ProgressBar progressBar = this.e;
        if (progressBar != null) {
            progressBar.setIndeterminate(this.b);
            c(this.e);
            this.e.setProgress((int) (this.d * 1000.0d));
            if (this.c) {
                this.e.setVisibility(0);
            } else {
                this.e.setVisibility(4);
            }
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(15949));
        }
    }

    public void b(boolean z) {
        this.c = z;
    }

    public void d(Integer num) {
        this.a = num;
    }

    public void e(boolean z) {
        this.b = z;
    }

    public void f(double d2) {
        this.d = d2;
    }

    public void g(String str) {
        ProgressBar createProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.e = createProgressBar;
        createProgressBar.setMax(C0188.f18);
        removeAllViews();
        addView(this.e, new ViewGroup.LayoutParams(-1, -1));
    }
}
