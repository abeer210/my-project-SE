package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: hn0  reason: default package */
/* compiled from: Util */
public final class hn0 {
    public static int a(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().density);
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 16;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 21;
    }
}
