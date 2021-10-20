package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.u;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

/* renamed from: yn0  reason: default package */
public class yn0 {
    private uo0 a;
    private wr0 b;
    private boolean c;
    private final Object d = new Object();
    private b e;
    private final Context f;
    private final boolean g;
    private final long h;

    /* renamed from: yn0$a */
    public static final class a {
        private final String a;
        private final boolean b;

        public a(String str, boolean z) {
            this.a = str;
            this.b = z;
        }

        public final String a() {
            return this.a;
        }

        public final boolean b() {
            return this.b;
        }

        public final String toString() {
            String str = this.a;
            boolean z = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append(C0201.m82(30163));
            sb.append(str);
            sb.append(C0201.m82(30164));
            sb.append(z);
            return sb.toString();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yn0$b */
    public static class b extends Thread {
        private WeakReference<yn0> a;
        private long b;
        public CountDownLatch c = new CountDownLatch(1);
        public boolean d = false;

        public b(yn0 yn0, long j) {
            this.a = new WeakReference<>(yn0);
            this.b = j;
            start();
        }

        private final void a() {
            yn0 yn0 = this.a.get();
            if (yn0 != null) {
                yn0.a();
                this.d = true;
            }
        }

        public final void run() {
            try {
                if (!this.c.await(this.b, TimeUnit.MILLISECONDS)) {
                    a();
                }
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    private yn0(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        u.k(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f = context;
        this.c = false;
        this.h = j;
        this.g = z2;
    }

    public static a b(Context context) throws IOException, IllegalStateException, ap0, bp0 {
        ao0 ao0 = new ao0(context);
        boolean a2 = ao0.a(C0201.m82(16578), false);
        float b2 = ao0.b(C0201.m82(16579), 0.0f);
        String c2 = ao0.c(C0201.m82(16580), C0201.m82(16581));
        yn0 yn0 = new yn0(context, -1, a2, ao0.a(C0201.m82(16582), false));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            yn0.h(false);
            a c3 = yn0.c();
            yn0.i(c3, a2, b2, SystemClock.elapsedRealtime() - elapsedRealtime, c2, null);
            yn0.a();
            return c3;
        } catch (Throwable th) {
            yn0.a();
            throw th;
        }
    }

    public static void d(boolean z) {
    }

    private static uo0 e(Context context, boolean z) throws IOException, ap0, bp0 {
        try {
            context.getPackageManager().getPackageInfo(C0201.m82(16583), 0);
            int j = zo0.h().j(context, 12451000);
            if (j == 0 || j == 2) {
                String r5 = z ? C0201.m82(16585) : C0201.m82(16586);
                uo0 uo0 = new uo0();
                Intent intent = new Intent(r5);
                intent.setPackage(C0201.m82(16587));
                try {
                    if (aq0.b().a(context, intent, uo0, 1)) {
                        return uo0;
                    }
                    throw new IOException(C0201.m82(16588));
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException(C0201.m82(16584));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new ap0(9);
        }
    }

    private static wr0 f(Context context, uo0 uo0) throws IOException {
        try {
            return xr0.i(uo0.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException(C0201.m82(16589));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void g() {
        synchronized (this.d) {
            if (this.e != null) {
                this.e.c.countDown();
                try {
                    this.e.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.h > 0) {
                this.e = new b(this, this.h);
            }
        }
    }

    private final void h(boolean z) throws IOException, IllegalStateException, ap0, bp0 {
        u.j(C0201.m82(16590));
        synchronized (this) {
            if (this.c) {
                a();
            }
            uo0 e2 = e(this.f, this.g);
            this.a = e2;
            this.b = f(this.f, e2);
            this.c = true;
            if (z) {
                g();
            }
        }
    }

    private final boolean i(a aVar, boolean z, float f2, long j, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String r0 = C0201.m82(16591);
        String r1 = C0201.m82(16592);
        hashMap.put(C0201.m82(16593), z ? r0 : r1);
        if (aVar != null) {
            if (!aVar.b()) {
                r0 = r1;
            }
            hashMap.put(C0201.m82(16594), r0);
        }
        if (!(aVar == null || aVar.a() == null)) {
            hashMap.put(C0201.m82(16595), Integer.toString(aVar.a().length()));
        }
        if (th != null) {
            hashMap.put(C0201.m82(16596), th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put(C0201.m82(16597), str);
        }
        hashMap.put(C0201.m82(16598), C0201.m82(16599));
        hashMap.put(C0201.m82(16600), Long.toString(j));
        new zn0(this, hashMap).start();
        return true;
    }

    public final void a() {
        u.j(C0201.m82(16601));
        synchronized (this) {
            if (this.f != null && this.a != null) {
                try {
                    if (this.c) {
                        aq0.b().c(this.f, this.a);
                    }
                } catch (Throwable th) {
                    Log.i(C0201.m82(16602), C0201.m82(16603), th);
                }
                this.c = false;
                this.b = null;
                this.a = null;
            }
        }
    }

    public a c() throws IOException {
        a aVar;
        u.j(C0201.m82(16604));
        synchronized (this) {
            if (!this.c) {
                synchronized (this.d) {
                    if (this.e == null || !this.e.d) {
                        throw new IOException(C0201.m82(16607));
                    }
                }
                try {
                    h(false);
                    if (!this.c) {
                        throw new IOException(C0201.m82(16605));
                    }
                } catch (Exception e2) {
                    throw new IOException(C0201.m82(16606), e2);
                }
            }
            u.k(this.a);
            u.k(this.b);
            try {
                aVar = new a(this.b.t(), this.b.P0(true));
            } catch (RemoteException e3) {
                Log.i(C0201.m82(16608), C0201.m82(16609), e3);
                throw new IOException(C0201.m82(16610));
            }
        }
        g();
        return aVar;
    }

    public void finalize() throws Throwable {
        a();
        super.finalize();
    }
}
