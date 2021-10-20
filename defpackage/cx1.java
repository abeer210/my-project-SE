package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import vigqyno.C0201;

/* renamed from: cx1  reason: default package */
/* compiled from: MaterialAttributes */
public class cx1 {
    public static TypedValue a(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean b(Context context, int i, boolean z) {
        TypedValue a = a(context, i);
        if (a == null || a.type != 18) {
            return z;
        }
        return a.data != 0;
    }

    public static int c(Context context, int i, String str) {
        TypedValue a = a(context, i);
        if (a != null) {
            return a.data;
        }
        throw new IllegalArgumentException(String.format(C0201.m82(4886), str, context.getResources().getResourceName(i)));
    }

    public static int d(View view, int i) {
        return c(view.getContext(), i, view.getClass().getCanonicalName());
    }
}
