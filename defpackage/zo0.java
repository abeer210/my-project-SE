package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.util.i;
import vigqyno.C0201;

/* renamed from: zo0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class zo0 {
    public static final int a = dp0.a;
    private static final zo0 b = new zo0();

    public static zo0 h() {
        return b;
    }

    private static String n(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(10974));
        sb.append(a);
        String r1 = C0201.m82(10975);
        sb.append(r1);
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append(r1);
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append(r1);
        if (context != null) {
            try {
                sb.append(hq0.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return sb.toString();
    }

    public void a(Context context) {
        dp0.a(context);
    }

    public int b(Context context) {
        return dp0.b(context);
    }

    @Deprecated
    public Intent c(int i) {
        return d(null, i, null);
    }

    public Intent d(Context context, int i, String str) {
        String r1 = C0201.m82(10976);
        if (i == 1 || i == 2) {
            if (context == null || !i.c(context)) {
                return o0.a(r1, n(context, str));
            }
            return o0.c();
        } else if (i != 3) {
            return null;
        } else {
            return o0.b(r1);
        }
    }

    public PendingIntent e(Context context, int i, int i2) {
        return f(context, i, i2, null);
    }

    public PendingIntent f(Context context, int i, int i2, String str) {
        Intent d = d(context, i, str);
        if (d == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i2, d, 134217728);
    }

    public String g(int i) {
        return dp0.c(i);
    }

    public int i(Context context) {
        return j(context, a);
    }

    public int j(Context context, int i) {
        int g = dp0.g(context, i);
        if (dp0.i(context, g)) {
            return 18;
        }
        return g;
    }

    public boolean k(Context context, int i) {
        return dp0.i(context, i);
    }

    public boolean l(Context context, String str) {
        return dp0.k(context, str);
    }

    public boolean m(int i) {
        return dp0.l(i);
    }
}
