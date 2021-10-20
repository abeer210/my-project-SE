package defpackage;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.u0;
import com.google.android.gms.common.internal.v0;
import com.google.android.gms.dynamite.DynamiteModule;
import vigqyno.C0201;

/* renamed from: kq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class kq0 {
    private static volatile v0 a;
    private static final Object b = new Object();
    private static Context c;

    public static tq0 a(String str, lq0 lq0, boolean z, boolean z2) {
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            return d(str, lq0, z, z2);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    public static final /* synthetic */ String b(boolean z, String str, lq0 lq0) throws Exception {
        boolean z2 = true;
        if (z || !d(str, lq0, true, false).a) {
            z2 = false;
        }
        return tq0.e(str, lq0, z, z2);
    }

    public static synchronized void c(Context context) {
        synchronized (kq0.class) {
            if (c != null) {
                Log.w(C0201.m82(5208), C0201.m82(5209));
            } else if (context != null) {
                c = context.getApplicationContext();
            }
        }
    }

    private static tq0 d(String str, lq0 lq0, boolean z, boolean z2) {
        try {
            if (a == null) {
                u.k(c);
                synchronized (b) {
                    if (a == null) {
                        a = u0.U3(DynamiteModule.e(c, DynamiteModule.k, C0201.m82(5210)).d(C0201.m82(5211)));
                    }
                }
            }
            u.k(c);
            try {
                if (a.h3(new rq0(str, lq0, z, z2), ar0.W3(c.getPackageManager()))) {
                    return tq0.f();
                }
                return tq0.c(new mq0(z, str, lq0));
            } catch (RemoteException e) {
                Log.e(C0201.m82(5212), C0201.m82(5213), e);
                return tq0.b(C0201.m82(5214), e);
            }
        } catch (DynamiteModule.a e2) {
            Log.e(C0201.m82(5215), C0201.m82(5216), e2);
            String r6 = C0201.m82(5217);
            String valueOf = String.valueOf(e2.getMessage());
            return tq0.b(valueOf.length() != 0 ? r6.concat(valueOf) : new String(r6), e2);
        }
    }
}
