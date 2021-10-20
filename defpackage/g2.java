package defpackage;

import android.os.Build;
import android.os.Trace;

/* renamed from: g2  reason: default package */
/* compiled from: TraceCompat */
public final class g2 {
    public static void a(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void b() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }
}
