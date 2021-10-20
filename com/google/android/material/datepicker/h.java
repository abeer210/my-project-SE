package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.c;

/* compiled from: MaterialDatePicker */
public final class h<S> extends c {
    public static boolean D(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(cx1.c(context, nv1.materialCalendarStyle, g.class.getCanonicalName()), new int[]{16843277});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
