package defpackage;

import android.content.Context;

/* renamed from: mc2  reason: default package */
public class mc2 {
    private static Context a;

    public static Context a() {
        return a;
    }

    public static void b(Context context) {
        if (context != null && a == null) {
            a = context.getApplicationContext();
        }
    }
}
