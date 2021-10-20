package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.l;
import vigqyno.C0201;

/* renamed from: fq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class fq0 {
    private static Context a;
    private static Boolean b;

    public static synchronized boolean a(Context context) {
        synchronized (fq0.class) {
            Context applicationContext = context.getApplicationContext();
            if (a == null || b == null || a != applicationContext) {
                b = null;
                if (l.i()) {
                    b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
                } else {
                    try {
                        context.getClassLoader().loadClass(C0201.m82(1640));
                        b = Boolean.TRUE;
                    } catch (ClassNotFoundException unused) {
                        b = Boolean.FALSE;
                    }
                }
                a = applicationContext;
                return b.booleanValue();
            }
            return b.booleanValue();
        }
    }
}
