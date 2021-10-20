package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import androidx.core.util.h;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: s4  reason: default package */
/* compiled from: AsyncTaskLoader */
public abstract class s4<D> extends u4<D> {
    private final Executor j;
    public volatile s4<D>.a k;
    public volatile s4<D>.a l;
    public long m;
    public long n;
    public Handler o;

    /* access modifiers changed from: package-private */
    /* renamed from: s4$a */
    /* compiled from: AsyncTaskLoader */
    public final class a extends v4<Void, Void, D> implements Runnable {
        private final CountDownLatch j = new CountDownLatch(1);
        public boolean k;

        public a() {
        }

        @Override // defpackage.v4
        public void h(D d) {
            try {
                s4.this.C(this, d);
            } finally {
                this.j.countDown();
            }
        }

        @Override // defpackage.v4
        public void i(D d) {
            try {
                s4.this.D(this, d);
            } finally {
                this.j.countDown();
            }
        }

        /* renamed from: n */
        public D b(Void... voidArr) {
            try {
                return (D) s4.this.I();
            } catch (d2 e) {
                if (f()) {
                    return null;
                }
                throw e;
            }
        }

        public void run() {
            this.k = false;
            s4.this.E();
        }
    }

    public s4(Context context) {
        this(context, v4.h);
    }

    public void B() {
    }

    public void C(s4<D>.a aVar, D d) {
        H(d);
        if (this.l == aVar) {
            w();
            this.n = SystemClock.uptimeMillis();
            this.l = null;
            f();
            E();
        }
    }

    public void D(s4<D>.a aVar, D d) {
        if (this.k != aVar) {
            C(aVar, d);
        } else if (k()) {
            H(d);
        } else {
            d();
            this.n = SystemClock.uptimeMillis();
            this.k = null;
            g(d);
        }
    }

    public void E() {
        if (this.l == null && this.k != null) {
            if (this.k.k) {
                this.k.k = false;
                this.o.removeCallbacks(this.k);
            }
            if (this.m <= 0 || SystemClock.uptimeMillis() >= this.n + this.m) {
                this.k.c(this.j, null);
                return;
            }
            this.k.k = true;
            this.o.postAtTime(this.k, this.n + this.m);
        }
    }

    public boolean F() {
        return this.l != null;
    }

    public abstract D G();

    public void H(D d) {
    }

    public D I() {
        return G();
    }

    @Override // defpackage.u4
    @Deprecated
    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.h(str, fileDescriptor, printWriter, strArr);
        s4<D>.a aVar = this.k;
        String r8 = C0201.m82(1646);
        if (aVar != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(1647));
            printWriter.print(this.k);
            printWriter.print(r8);
            printWriter.println(this.k.k);
        }
        if (this.l != null) {
            printWriter.print(str);
            printWriter.print(C0201.m82(1648));
            printWriter.print(this.l);
            printWriter.print(r8);
            printWriter.println(this.l.k);
        }
        if (this.m != 0) {
            printWriter.print(str);
            printWriter.print(C0201.m82(1649));
            h.c(this.m, printWriter);
            printWriter.print(C0201.m82(1650));
            h.b(this.n, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // defpackage.u4
    public boolean o() {
        if (this.k == null) {
            return false;
        }
        if (!this.e) {
            this.h = true;
        }
        if (this.l != null) {
            if (this.k.k) {
                this.k.k = false;
                this.o.removeCallbacks(this.k);
            }
            this.k = null;
            return false;
        } else if (this.k.k) {
            this.k.k = false;
            this.o.removeCallbacks(this.k);
            this.k = null;
            return false;
        } else {
            boolean a2 = this.k.a(false);
            if (a2) {
                this.l = this.k;
                B();
            }
            this.k = null;
            return a2;
        }
    }

    @Override // defpackage.u4
    public void q() {
        super.q();
        c();
        this.k = new a();
        E();
    }

    private s4(Context context, Executor executor) {
        super(context);
        this.n = -10000;
        this.j = executor;
    }
}
