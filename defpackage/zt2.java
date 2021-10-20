package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* renamed from: zt2  reason: default package */
/* compiled from: BaseFingerprint */
public abstract class zt2 {
    public Context a;
    private Handler b;
    private e c;
    private d d;
    private int e = 0;
    private int f = 3;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;

    /* renamed from: zt2$a */
    /* compiled from: BaseFingerprint */
    class a implements Runnable {
        public a() {
        }

        public void run() {
            zt2.this.c.a();
        }
    }

    /* renamed from: zt2$b */
    /* compiled from: BaseFingerprint */
    class b implements Runnable {
        public final /* synthetic */ int a;

        public b(int i) {
            this.a = i;
        }

        public void run() {
            zt2.this.c.d(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: zt2$c */
    /* compiled from: BaseFingerprint */
    public class c implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        public c(boolean z, boolean z2) {
            this.a = z;
            this.b = z2;
        }

        public void run() {
            if (this.a) {
                zt2.this.c.c();
            } else {
                zt2.this.c.b(this.b);
            }
        }
    }

    /* renamed from: zt2$d */
    /* compiled from: BaseFingerprint */
    public interface d {
        void a(Throwable th);
    }

    /* renamed from: zt2$e */
    /* compiled from: BaseFingerprint */
    public interface e {
        void a();

        void b(boolean z);

        void c();

        void d(int i);
    }

    public zt2(Context context, d dVar) {
        this.a = context;
        this.d = dVar;
        this.b = new Handler(Looper.getMainLooper());
    }

    public void b() {
        this.j = true;
        c();
    }

    public abstract void c();

    public abstract void d();

    public boolean e() {
        return this.g && this.h;
    }

    public boolean f() {
        return this.g;
    }

    public boolean g() {
        return this.h;
    }

    public boolean h() {
        return true;
    }

    public void i(Throwable th) {
        d dVar = this.d;
        if (dVar != null && th != null) {
            dVar.a(th);
        }
    }

    public void j(boolean z) {
        if (!this.j) {
            boolean z2 = z && this.e == 0;
            this.e = this.f;
            if (this.c != null) {
                n(new c(z2, z));
            }
            b();
        }
    }

    public void k() {
        if (!this.j) {
            int i2 = this.e + 1;
            this.e = i2;
            int i3 = this.f;
            if (i2 < i3) {
                if (this.c != null) {
                    n(new b(i3 - i2));
                }
                if (h()) {
                    d();
                    return;
                }
                return;
            }
            j(false);
        }
    }

    public void l() {
        if (!this.j) {
            this.e = this.f;
            if (this.c != null) {
                n(new a());
            }
            b();
        }
    }

    public void m() {
        if (this.i && this.c != null && this.e < this.f) {
            this.j = false;
            d();
        }
    }

    public void n(Runnable runnable) {
        this.b.post(runnable);
    }

    public void o(boolean z) {
        this.g = z;
    }

    public void p(boolean z) {
        this.h = z;
    }

    public void q(int i2, e eVar) {
        this.f = i2;
        this.c = eVar;
        this.i = true;
        this.j = false;
        this.e = 0;
        d();
    }
}
