package com.facebook.react.views.view;

import android.view.View;
import com.facebook.yoga.n;
import vigqyno.C0188;

/* compiled from: MeasureUtil */
public class b {
    public static int a(float f, n nVar) {
        if (nVar == n.EXACTLY) {
            return View.MeasureSpec.makeMeasureSpec((int) f, 1073741824);
        }
        if (nVar == n.AT_MOST) {
            return View.MeasureSpec.makeMeasureSpec((int) f, C0188.f23);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }
}
