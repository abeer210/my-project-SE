package defpackage;

import android.content.Context;
import android.util.TypedValue;

/* renamed from: ym0  reason: default package */
/* compiled from: Util */
public class ym0 {
    public static int a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }
}
