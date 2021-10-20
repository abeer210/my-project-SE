package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* renamed from: ep0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class ep0 {
    private static ep0 b;
    private final Context a;

    private ep0(Context context) {
        this.a = context.getApplicationContext();
    }

    public static ep0 a(Context context) {
        u.k(context);
        synchronized (ep0.class) {
            if (b == null) {
                kq0.c(context);
                b = new ep0(context);
            }
        }
        return b;
    }

    private static lq0 d(PackageInfo packageInfo, lq0... lq0Arr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w(C0201.m82(6225), C0201.m82(6226));
            return null;
        }
        oq0 oq0 = new oq0(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < lq0Arr.length; i++) {
            if (lq0Arr[i].equals(oq0)) {
                return lq0Arr[i];
            }
        }
        return null;
    }

    private final tq0 e(String str, int i) {
        try {
            PackageInfo g = hq0.a(this.a).g(str, 64, i);
            boolean f = dp0.f(this.a);
            if (g == null) {
                return tq0.d(C0201.m82(6227));
            }
            if (g.signatures != null) {
                if (g.signatures.length == 1) {
                    oq0 oq0 = new oq0(g.signatures[0].toByteArray());
                    String str2 = g.packageName;
                    tq0 a2 = kq0.a(str2, oq0, f, false);
                    return (!a2.a || g.applicationInfo == null || (g.applicationInfo.flags & 2) == 0 || !kq0.a(str2, oq0, false, true).a) ? a2 : tq0.d(C0201.m82(6228));
                }
            }
            return tq0.d(C0201.m82(6229));
        } catch (PackageManager.NameNotFoundException unused) {
            String r9 = C0201.m82(6230);
            String valueOf = String.valueOf(str);
            return tq0.d(valueOf.length() != 0 ? r9.concat(valueOf) : new String(r9));
        }
    }

    public static boolean f(PackageInfo packageInfo, boolean z) {
        lq0 lq0;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                lq0 = d(packageInfo, qq0.a);
            } else {
                lq0 = d(packageInfo, qq0.a[0]);
            }
            if (lq0 != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (f(packageInfo, false)) {
            return true;
        }
        if (f(packageInfo, true)) {
            if (dp0.f(this.a)) {
                return true;
            }
            Log.w(C0201.m82(6231), C0201.m82(6232));
        }
        return false;
    }

    public boolean c(int i) {
        tq0 tq0;
        String[] e = hq0.a(this.a).e(i);
        if (e == null || e.length == 0) {
            tq0 = tq0.d(C0201.m82(6233));
        } else {
            tq0 = null;
            for (String str : e) {
                tq0 = e(str, i);
                if (tq0.a) {
                    break;
                }
            }
        }
        tq0.g();
        return tq0.a;
    }
}
