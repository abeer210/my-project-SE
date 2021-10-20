package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: wj2  reason: default package */
/* compiled from: UiThread */
public class wj2 {
    private static final Handler a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        a.post(runnable);
    }
}
