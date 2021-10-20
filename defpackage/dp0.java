package defpackage;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.internal.x0;
import com.google.android.gms.common.util.i;
import com.google.android.gms.common.util.l;
import com.google.android.gms.common.util.o;
import com.google.android.gms.common.util.p;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* renamed from: dp0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class dp0 {
    @Deprecated
    public static final int a = 0;
    private static boolean b;
    private static boolean c;
    public static final AtomicBoolean d = new AtomicBoolean();
    private static final AtomicBoolean e = new AtomicBoolean();

    static {
        C0201.m83(dp0.class, 366);
    }

    @Deprecated
    public static void a(Context context) {
        if (!d.getAndSet(true)) {
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(C0201.m82(18678));
                if (notificationManager != null) {
                    notificationManager.cancel(10436);
                }
            } catch (SecurityException unused) {
            }
        }
    }

    @Deprecated
    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(C0201.m82(18679), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w(C0201.m82(18680), C0201.m82(18681));
            return 0;
        }
    }

    @Deprecated
    public static String c(int i) {
        return vo0.y(i);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext(C0201.m82(18682), 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication(C0201.m82(18683));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!c) {
            try {
                PackageInfo d2 = hq0.a(context).d(C0201.m82(18684), 64);
                ep0.a(context);
                if (d2 == null || ep0.f(d2, false) || !ep0.f(d2, true)) {
                    b = false;
                } else {
                    b = true;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                Log.w(C0201.m82(18685), C0201.m82(18686), e2);
            } finally {
                c = true;
            }
        }
        return b || !i.a();
    }

    @Deprecated
    public static int g(Context context, int i) {
        try {
            context.getResources().getString(fp0.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e(C0201.m82(18687), C0201.m82(18688));
        }
        if (!C0201.m82(18689).equals(context.getPackageName()) && !e.get()) {
            int b2 = x0.b(context);
            if (b2 == 0) {
                throw new IllegalStateException(C0201.m82(18693));
            } else if (b2 != a) {
                int i2 = a;
                StringBuilder sb = new StringBuilder(320);
                sb.append(C0201.m82(18690));
                sb.append(i2);
                sb.append(C0201.m82(18691));
                sb.append(b2);
                sb.append(C0201.m82(18692));
                throw new IllegalStateException(sb.toString());
            }
        }
        return n(context, !i.c(context) && !i.e(context), i);
    }

    @Deprecated
    public static boolean h(Context context, int i) {
        return o.a(context, i);
    }

    @Deprecated
    public static boolean i(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return k(context, C0201.m82(18694));
        }
        return false;
    }

    @TargetApi(18)
    public static boolean j(Context context) {
        Bundle applicationRestrictions;
        if (!l.d() || (applicationRestrictions = ((UserManager) context.getSystemService(C0201.m82(18695))).getApplicationRestrictions(context.getPackageName())) == null) {
            return false;
        }
        return C0201.m82(18697).equals(applicationRestrictions.getString(C0201.m82(18696)));
    }

    @TargetApi(21)
    public static boolean k(Context context, String str) {
        boolean equals = str.equals(C0201.m82(18698));
        if (l.g()) {
            try {
                for (PackageInstaller.SessionInfo sessionInfo : context.getPackageManager().getPackageInstaller().getAllSessions()) {
                    if (str.equals(sessionInfo.getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (equals) {
                return applicationInfo.enabled;
            }
            return applicationInfo.enabled && !j(context);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    @Deprecated
    public static boolean l(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean m(Context context, int i, String str) {
        return o.b(context, i, str);
    }

    private static int n(Context context, boolean z, int i) {
        String r0 = C0201.m82(18699);
        u.a(i >= 0);
        PackageManager packageManager = context.getPackageManager();
        PackageInfo packageInfo = null;
        String r6 = C0201.m82(18700);
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo(C0201.m82(18701), 8256);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(r6, C0201.m82(18702));
                return 9;
            }
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo(r0, 64);
            ep0.a(context);
            if (!ep0.f(packageInfo2, true)) {
                Log.w(r6, C0201.m82(18703));
                return 9;
            } else if (z && (!ep0.f(packageInfo, true) || !packageInfo.signatures[0].equals(packageInfo2.signatures[0]))) {
                Log.w(r6, C0201.m82(18704));
                return 9;
            } else if (p.a(packageInfo2.versionCode) < p.a(i)) {
                int i2 = packageInfo2.versionCode;
                StringBuilder sb = new StringBuilder(77);
                sb.append(C0201.m82(18705));
                sb.append(i);
                sb.append(C0201.m82(18706));
                sb.append(i2);
                Log.w(r6, sb.toString());
                return 2;
            } else {
                ApplicationInfo applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    try {
                        applicationInfo = packageManager.getApplicationInfo(r0, 0);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf(r6, C0201.m82(18707), e2);
                        return 1;
                    }
                }
                if (!applicationInfo.enabled) {
                    return 3;
                }
                return 0;
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.w(r6, C0201.m82(18708));
            return 1;
        }
    }
}
