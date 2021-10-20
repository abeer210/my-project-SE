package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.measurement.internal.t5;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: sh1  reason: default package */
public class sh1 {
    private static volatile sh1 h;
    private static Boolean i;
    private static Boolean j;
    private static boolean k;
    private static Boolean l;
    private static String m;
    private static String n;
    private final String a;
    public final e b;
    private final ExecutorService c;
    private List<Pair<t5, Object>> d;
    private int e;
    private boolean f;
    private qe1 g;

    /* access modifiers changed from: package-private */
    /* renamed from: sh1$a */
    public abstract class a implements Runnable {
        public final long a;
        public final long b;
        private final boolean c;

        public a(sh1 sh1) {
            this(true);
        }

        public abstract void a() throws RemoteException;

        public void b() {
        }

        public void run() {
            if (sh1.this.f) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e) {
                sh1.this.E(e, false, this.c);
                b();
            }
        }

        public a(boolean z) {
            this.a = sh1.this.b.a();
            this.b = sh1.this.b.b();
            this.c = z;
        }
    }

    /* renamed from: sh1$b */
    class b implements Application.ActivityLifecycleCallbacks {
        public b() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            sh1.this.B(new e51(this, activity, bundle));
        }

        public final void onActivityDestroyed(Activity activity) {
            sh1.this.B(new j51(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            sh1.this.B(new f51(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            sh1.this.B(new g51(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            rf1 rf1 = new rf1();
            sh1.this.B(new h51(this, activity, rf1));
            Bundle W3 = rf1.W3(50);
            if (W3 != null) {
                bundle.putAll(W3);
            }
        }

        public final void onActivityStarted(Activity activity) {
            sh1.this.B(new d51(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            sh1.this.B(new i51(this, activity));
        }
    }

    static {
        C0201.m83(sh1.class, 583);
    }

    private sh1(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !K(str2, str3)) {
            this.a = C0201.m82(6080);
        } else {
            this.a = str;
        }
        this.b = h.d();
        this.c = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue());
        boolean z = false;
        if (!(!M(context) || U())) {
            this.f = true;
            Log.w(this.a, C0201.m82(6081));
            return;
        }
        if (!K(str2, str3)) {
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null ? true : z)) {
                    Log.w(this.a, C0201.m82(6083));
                }
            } else {
                Log.v(this.a, C0201.m82(6082));
                this.f = true;
                return;
            }
        }
        B(new rh1(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.a, C0201.m82(6084));
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void B(a aVar) {
        this.c.execute(aVar);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void E(Exception exc, boolean z, boolean z2) {
        this.f |= z;
        if (z) {
            Log.w(this.a, C0201.m82(6085), exc);
            return;
        }
        String r8 = C0201.m82(6086);
        if (z2) {
            A(5, r8, exc, null, null);
        }
        Log.w(this.a, r8, exc);
    }

    private final void F(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        B(new z41(this, l2, str, str2, bundle, z, z2));
    }

    private final void G(String str, String str2, Object obj, boolean z) {
        B(new c51(this, str, str2, obj, z));
    }

    private static boolean H(Context context, String str) {
        u.g(str);
        try {
            ApplicationInfo b2 = hq0.a(context).b(context.getPackageName(), 128);
            if (b2 != null) {
                if (b2.metaData != null) {
                    return b2.metaData.getBoolean(str);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static boolean K(String str, String str2) {
        return (str2 == null || str == null || U()) ? false : true;
    }

    private static boolean M(Context context) {
        try {
            com.google.android.gms.common.api.internal.h.c(context);
            if (com.google.android.gms.common.api.internal.h.b() != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused) {
        }
    }

    /* access modifiers changed from: private */
    public static int N(Context context) {
        return DynamiteModule.c(context, C0201.m82(6087));
    }

    /* access modifiers changed from: private */
    public static int P(Context context) {
        return DynamiteModule.a(context, C0201.m82(6088));
    }

    /* access modifiers changed from: private */
    public static void Q(Context context) {
        synchronized (sh1.class) {
            try {
                if (i != null && j != null) {
                    return;
                }
                if (H(context, C0201.m82(6089))) {
                    i = Boolean.FALSE;
                    j = Boolean.FALSE;
                    return;
                }
                SharedPreferences sharedPreferences = context.getSharedPreferences(C0201.m82(6090), 0);
                i = Boolean.valueOf(sharedPreferences.getBoolean(m, false));
                j = Boolean.valueOf(sharedPreferences.getBoolean(n, false));
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.remove(m);
                edit.remove(n);
                edit.apply();
            } catch (ClassCastException | IllegalStateException | NullPointerException e2) {
                Log.e(C0201.m82(6091), C0201.m82(6092), e2);
                i = Boolean.FALSE;
                j = Boolean.FALSE;
            }
        }
    }

    public static boolean R(Context context) {
        Q(context);
        synchronized (sh1.class) {
            if (!k) {
                try {
                    String str = (String) Class.forName(C0201.m82(6093)).getMethod(C0201.m82(6094), String.class, String.class).invoke(null, C0201.m82(6095), C0201.m82(6096));
                    if (C0201.m82(6097).equals(str)) {
                        l = Boolean.TRUE;
                    } else if (C0201.m82(6098).equals(str)) {
                        l = Boolean.FALSE;
                    } else {
                        l = null;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                    Log.e(C0201.m82(6099), C0201.m82(6100), e2);
                    l = null;
                } finally {
                    k = true;
                }
            }
        }
        Boolean bool = l;
        if (bool == null) {
            bool = i;
        }
        return bool.booleanValue();
    }

    private static boolean U() {
        try {
            Class.forName(C0201.m82(6101));
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static sh1 x(Context context) {
        return y(context, null, null, null, null);
    }

    public static sh1 y(Context context, String str, String str2, String str3, Bundle bundle) {
        u.k(context);
        if (h == null) {
            synchronized (sh1.class) {
                if (h == null) {
                    h = new sh1(context, str, str2, str3, bundle);
                }
            }
        }
        return h;
    }

    public final void A(int i2, String str, Object obj, Object obj2, Object obj3) {
        B(new v41(this, false, 5, str, obj, null, null));
    }

    public final String W() {
        rf1 rf1 = new rf1();
        B(new s41(this, rf1));
        return rf1.V3(50);
    }

    public final void a(String str) {
        B(new p41(this, str));
    }

    public final void b(String str, String str2, Bundle bundle) {
        B(new i41(this, str, str2, bundle));
    }

    public final void c(String str) {
        B(new o41(this, str));
    }

    public final long d() {
        rf1 rf1 = new rf1();
        B(new r41(this, rf1));
        Long l2 = (Long) rf1.U3(rf1.W3(500), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long nextLong = new Random(System.nanoTime() ^ this.b.a()).nextLong();
        int i2 = this.e + 1;
        this.e = i2;
        return nextLong + ((long) i2);
    }

    public final List<Bundle> e(String str, String str2) {
        rf1 rf1 = new rf1();
        B(new h41(this, str, str2, rf1));
        List<Bundle> list = (List) rf1.U3(rf1.W3(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final String f() {
        rf1 rf1 = new rf1();
        B(new t41(this, rf1));
        return rf1.V3(500);
    }

    public final String g() {
        rf1 rf1 = new rf1();
        B(new u41(this, rf1));
        return rf1.V3(500);
    }

    public final String h() {
        rf1 rf1 = new rf1();
        B(new q41(this, rf1));
        return rf1.V3(500);
    }

    public final int i(String str) {
        rf1 rf1 = new rf1();
        B(new x41(this, str, rf1));
        Integer num = (Integer) rf1.U3(rf1.W3(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final Map<String, Object> j(String str, String str2, boolean z) {
        rf1 rf1 = new rf1();
        B(new w41(this, str, str2, z, rf1));
        Bundle W3 = rf1.W3(5000);
        if (W3 == null || W3.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(W3.size());
        for (String str3 : W3.keySet()) {
            Object obj = W3.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(str3, obj);
            }
        }
        return hashMap;
    }

    public final void k(String str, Bundle bundle) {
        F(null, str, bundle, false, true, null);
    }

    public final void l(String str, String str2, Bundle bundle) {
        F(str, str2, bundle, true, true, null);
    }

    public final void m(Bundle bundle) {
        B(new b51(this, bundle));
    }

    public final void n(Activity activity, String str, String str2) {
        B(new j41(this, activity, str, str2));
    }

    public final void o(boolean z) {
        B(new y41(this, z));
    }

    public final void p(boolean z) {
        B(new l41(this, z));
    }

    public final void q(long j2) {
        B(new n41(this, j2));
    }

    public final void r(long j2) {
        B(new m41(this, j2));
    }

    public final void s(String str) {
        B(new k41(this, str));
    }

    public final void t(String str, String str2) {
        G(null, str, str2, false);
    }

    public final void u(String str, String str2, Object obj) {
        G(str, str2, obj, true);
    }

    public final qe1 v(Context context, boolean z) {
        DynamiteModule.b bVar;
        if (z) {
            try {
                bVar = DynamiteModule.l;
            } catch (DynamiteModule.a e2) {
                E(e2, true, false);
                return null;
            }
        } else {
            bVar = DynamiteModule.j;
        }
        return hh1.asInterface(DynamiteModule.e(context, bVar, C0201.m82(6102)).d(C0201.m82(6103)));
    }
}
