package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Log;
import vigqyno.C0201;

/* renamed from: hb2  reason: default package */
public abstract class hb2 {
    @SuppressLint({"StaticFieldLeak"})
    private static hb2 a;

    public static synchronized void a(Context context) {
        synchronized (hb2.class) {
            Log.i(C0201.m82(31767), C0201.m82(31768));
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (a == null) {
                a = new sb2(context);
            }
        }
    }
}
