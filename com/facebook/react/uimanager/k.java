package com.facebook.react.uimanager;

import android.view.View;
import vigqyno.C0201;

/* compiled from: MeasureSpecAssertions */
public class k {
    public static final void a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 0 || mode2 == 0) {
            throw new IllegalStateException(C0201.m82(23185));
        }
    }
}
