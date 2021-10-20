package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.Keep;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    private static final long i = TimeUnit.HOURS.toSeconds(8);
    private static y j;
    private static ScheduledExecutorService k;
    private final Executor a;
    private final l12 b;
    private final q c;
    private b d;
    private final t e;
    private final c0 f;
    private boolean g;
    private final a h;

    /* access modifiers changed from: private */
    public class a {
        private final boolean a = c();
        private t12<j12> b;
        private Boolean c;

        public a(v12 v12) {
            Boolean b2 = b();
            this.c = b2;
            if (b2 == null && this.a) {
                t0 t0Var = new t0(this);
                this.b = t0Var;
                v12.a(j12.class, t0Var);
            }
        }

        private final Boolean b() {
            ApplicationInfo applicationInfo;
            Context i = FirebaseInstanceId.this.b.i();
            SharedPreferences sharedPreferences = i.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = i.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(i.getPackageName(), 128)) == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        private final boolean c() {
            try {
                Class.forName("com.google.firebase.messaging.a");
                return true;
            } catch (ClassNotFoundException unused) {
                Context i = FirebaseInstanceId.this.b.i();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(i.getPackageName());
                ResolveInfo resolveService = i.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }

        public final synchronized boolean a() {
            if (this.c == null) {
                return this.a && FirebaseInstanceId.this.b.t();
            }
            return this.c.booleanValue();
        }
    }

    public FirebaseInstanceId(l12 l12, v12 v12, f22 f22) {
        this(l12, new q(l12.i()), k0.d(), k0.d(), v12, f22);
    }

    public static boolean B() {
        if (!Log.isLoggable("FirebaseInstanceId", 3)) {
            return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseInstanceId", 3);
        }
        return true;
    }

    public static FirebaseInstanceId d() {
        return getInstance(l12.k());
    }

    private final synchronized void f() {
        if (!this.g) {
            m(0);
        }
    }

    @Keep
    public static FirebaseInstanceId getInstance(l12 l12) {
        return (FirebaseInstanceId) l12.g(FirebaseInstanceId.class);
    }

    private final zs1<a> h(String str, String str2) {
        return ct1.d(null).j(this.a, new r0(this, str, v(str2)));
    }

    private final <T> T l(zs1<T> zs1) throws IOException {
        try {
            return (T) ct1.b(zs1, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    C();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public static void n(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (k == null) {
                k = new ScheduledThreadPoolExecutor(1, new cq0("FirebaseInstanceId"));
            }
            k.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    private static b0 r(String str, String str2) {
        return j.f("", str, str2);
    }

    private static String v(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    /* access modifiers changed from: private */
    public final void w() {
        b0 z = z();
        if (F() || p(z) || this.f.c()) {
            f();
        }
    }

    private static String y() {
        return q.b(j.j("").a());
    }

    public final String A() throws IOException {
        return e(q.a(this.b), "*");
    }

    public final synchronized void C() {
        j.e();
        if (this.h.a()) {
            f();
        }
    }

    public final boolean D() {
        return this.d.g();
    }

    public final void E() {
        j.k("");
        f();
    }

    public final boolean F() {
        return this.d.e();
    }

    public void a() throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            l(this.d.c(y()));
            C();
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public void b(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            String v = v(str2);
            l(this.d.f(y(), b0.b(r(str, v)), str, v));
            j.g("", str, v);
            return;
        }
        throw new IOException("MAIN_THREAD");
    }

    public String c() {
        w();
        return y();
    }

    public String e(String str, String str2) throws IOException {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            return ((a) l(h(str, str2))).a();
        }
        throw new IOException("MAIN_THREAD");
    }

    public final synchronized zs1<Void> g(String str) {
        zs1<Void> a2;
        a2 = this.f.a(str);
        f();
        return a2;
    }

    public final /* synthetic */ zs1 i(String str, String str2, zs1 zs1) throws Exception {
        String y = y();
        b0 r = r(str, str2);
        if (!this.d.e() && !p(r)) {
            return ct1.d(new a1(y, r.a));
        }
        return this.e.b(str, str2, new q0(this, y, b0.b(r), str, str2));
    }

    public final /* synthetic */ zs1 j(String str, String str2, String str3, String str4) {
        return this.d.d(str, str2, str3, str4).q(this.a, new s0(this, str3, str4, str));
    }

    public final synchronized void m(long j2) {
        n(new a0(this, this.c, this.f, Math.min(Math.max(30L, j2 << 1), i)), j2);
        this.g = true;
    }

    public final synchronized void o(boolean z) {
        this.g = z;
    }

    public final boolean p(b0 b0Var) {
        return b0Var == null || b0Var.d(this.c.d());
    }

    public final /* synthetic */ zs1 q(String str, String str2, String str3, String str4) throws Exception {
        j.c("", str, str2, str4, this.c.d());
        return ct1.d(new a1(str3, str4));
    }

    public final void t(String str) throws IOException {
        b0 z = z();
        if (!p(z)) {
            l(this.d.b(y(), z.a, str));
            return;
        }
        throw new IOException("token not available");
    }

    public final void u(String str) throws IOException {
        b0 z = z();
        if (!p(z)) {
            l(this.d.a(y(), z.a, str));
            return;
        }
        throw new IOException("token not available");
    }

    public final l12 x() {
        return this.b;
    }

    public final b0 z() {
        return r(q.a(this.b), "*");
    }

    private FirebaseInstanceId(l12 l12, q qVar, Executor executor, Executor executor2, v12 v12, f22 f22) {
        this.g = false;
        if (q.a(l12) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (j == null) {
                    j = new y(l12.i());
                }
            }
            this.b = l12;
            this.c = qVar;
            if (this.d == null) {
                b bVar = (b) l12.g(b.class);
                if (bVar == null || !bVar.g()) {
                    this.d = new v0(l12, qVar, executor, f22);
                } else {
                    this.d = bVar;
                }
            }
            this.d = this.d;
            this.a = executor2;
            this.f = new c0(j);
            this.h = new a(v12);
            this.e = new t(executor);
            if (this.h.a()) {
                w();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }
}
