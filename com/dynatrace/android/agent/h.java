package com.dynatrace.android.agent;

import android.os.Looper;
import com.dynatrace.android.agent.f;
import com.dynatrace.android.agent.l;
import defpackage.n20;
import java.io.File;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

/* compiled from: CommunicationManager */
public class h {
    private static final String s = (u.b + C0201.m82(2672));
    public j30 a;
    public v10 b;
    public f.a c = new f.a();
    public l.a d = new l.a();
    public x e = x.c;
    private f f;
    private AtomicBoolean g = new AtomicBoolean(false);
    private AtomicBoolean h = new AtomicBoolean(false);
    private AtomicBoolean i = new AtomicBoolean(false);
    private Thread j;
    private Timer k;
    private i l;
    private boolean m = false;
    private long n = 0;
    private g o;
    private o10 p;
    private ThreadPoolExecutor q;
    private c r = null;

    /* access modifiers changed from: package-private */
    /* compiled from: CommunicationManager */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[e.values().length];
            a = iArr;
            iArr[e.FINISHED.ordinal()] = 1;
            a[e.MORE_DATA_AVAILABLE.ordinal()] = 2;
            a[e.DATA_NOT_SENT.ordinal()] = 3;
            try {
                a[e.NO_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: CommunicationManager */
    public class b extends TimerTask {
        public b() {
        }

        public void run() {
            h.this.o.j();
            if (h.this.l == null) {
                if (u.c) {
                    s30.r(h.s, C0201.m82(3176));
                }
                h.this.F();
            } else if (h.this.l.f() || h.this.i.get()) {
                long b = h.this.e.b() - h.this.n;
                if (h.this.l.i()) {
                    h.this.g.set(h.this.l.e());
                    if (!h.this.g.get()) {
                        if (u.c) {
                            s30.r(h.s, String.format(C0201.m82(3177), Boolean.valueOf(h.this.i.get()), Long.valueOf(b / 1000)));
                            return;
                        }
                        return;
                    }
                }
                if (b >= 7200000) {
                    h.this.g.set(true);
                }
                if (!h.this.g.get()) {
                    h.this.g.set(h.this.l.e() && g30.a().g());
                }
                if (u.c) {
                    s30.r(h.s, String.format(C0201.m82(3178), Boolean.valueOf(h.this.g.get()), Boolean.valueOf(h.this.i.get())));
                }
                if (h.this.i.get() || h.this.g.get()) {
                    if (h.this.o.e()) {
                        h.this.h.set(true);
                    }
                    if (m.n.get() == 1) {
                        h.this.h.set(true);
                        m.n.set(2);
                    }
                    if (u.c) {
                        s30.r(h.s, String.format(C0201.m82(3179), Boolean.valueOf(h.this.h.get()), Long.valueOf(h.this.j.getId())));
                    }
                    if (h.this.h.get() || h.this.g.get()) {
                        synchronized (h.this.j) {
                            h.this.j.notify();
                        }
                        h hVar = h.this;
                        hVar.n = hVar.e.b();
                    }
                }
            } else {
                h.this.F();
                j.s(99);
                h.this.l = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: CommunicationManager */
    public class c extends Thread {
        public /* synthetic */ c(h hVar, a aVar) {
            this();
        }

        public void run() {
            boolean z;
            h.this.m = true;
            do {
                try {
                    synchronized (this) {
                        if (h.this.m) {
                            wait();
                            z = h.this.m;
                            h.this.o(q30.e().i());
                        } else {
                            return;
                        }
                    }
                } catch (InterruptedException unused) {
                    return;
                } catch (Exception e) {
                    if (u.c) {
                        s30.s(h.s, e.getMessage(), e);
                        return;
                    }
                    return;
                }
            } while (z);
        }

        private c() {
            super(u.b + C0201.m82(3503));
        }
    }

    /* compiled from: CommunicationManager */
    private class d extends Thread {
        private final n20 a;
        private boolean b;
        private u10 c;
        private int d;
        private boolean e;

        public /* synthetic */ d(h hVar, n20 n20, u10 u10, int i, boolean z, a aVar) {
            this(n20, u10, i, z);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private boolean b() {
            return this.b;
        }

        public void run() {
            this.b = h.this.v(this.a, this.c, this.d, this.e);
        }

        private d(n20 n20, u10 u10, int i, boolean z) {
            this.b = false;
            setName(C0201.m82(3567));
            this.a = n20;
            this.c = u10;
            this.d = i;
            this.e = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: CommunicationManager */
    public enum e {
        NO_DATA,
        DATA_NOT_SENT,
        MORE_DATA_AVAILABLE,
        FINISHED
    }

    /* access modifiers changed from: protected */
    /* compiled from: CommunicationManager */
    public class f {
        private File a;

        public /* synthetic */ f(h hVar, a aVar) {
            this();
        }

        public boolean a() {
            boolean z = false;
            try {
                File file = new File(b.d().c().getCacheDir() + File.separator + C0201.m82(3435));
                boolean exists = file.exists();
                if (!exists || h.this.e.b() - file.lastModified() <= 60000) {
                    z = exists;
                } else {
                    file.delete();
                    if (u.c) {
                        s30.r(h.s, C0201.m82(3436));
                    }
                }
                if (!z) {
                    try {
                        if (file.createNewFile()) {
                            file.deleteOnExit();
                            this.a = file;
                        }
                    } catch (IOException e) {
                        if (u.c) {
                            s30.t(h.s, e.toString());
                        }
                    }
                    z = true;
                }
                return !z;
            } catch (Exception e2) {
                if (u.c) {
                    s30.t(h.s, e2.toString());
                }
                return false;
            }
        }

        public void b() {
            File file = this.a;
            if (file != null) {
                file.delete();
                this.a = null;
            }
        }

        private f() {
        }
    }

    public h(g gVar) {
        this.o = gVar;
        this.f = new f(this, null);
    }

    private void G(g30 g30) {
        if (u.c) {
            String str = s;
            s30.r(str, C0201.m82(2673) + g30.d());
        }
        k30.c().b();
        this.a.k(g30);
        if (u.c) {
            String str2 = s;
            s30.r(str2, C0201.m82(2674) + g30.d());
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void o(boolean z) {
        if (u.c) {
            s30.r(s, String.format(C0201.m82(2675), Boolean.valueOf(this.h.get()), Boolean.valueOf(this.g.get())));
        }
        n20 e2 = b.d().e();
        if (!z) {
            this.a.d(this.e.b(), e2.H());
            return;
        }
        g30 a2 = g30.a();
        if (a2.h() && this.h.compareAndSet(true, false)) {
            int i2 = a.a[A(e2, a2.b).ordinal()];
            if (i2 == 1) {
                s(e2);
            } else if (i2 == 2) {
                this.h.set(true);
                s(e2);
            } else if (i2 == 3) {
                this.h.set(true);
            } else if (i2 == 4 && this.g.get()) {
                q(e2, a2);
            }
        } else if (this.g.get()) {
            q(e2, a2);
        } else if (!a2.h() && this.h.get()) {
            q(e2, a2);
        }
    }

    private void q(n20 n20, g30 g30) {
        boolean z;
        this.a.d(this.e.b(), n20.H());
        try {
            boolean z2 = !g30.h();
            n20 f2 = this.b.f(n20, z2, b.d().c);
            r(n20, f2);
            if (z2) {
                g30.e(f2.F(), f2.w(), this.r);
                if (!g30.g()) {
                    this.a.b(g30.b, g30.c);
                } else {
                    G(g30);
                }
                j.i(g30);
            }
            z = g30.a().h();
        } catch (Exception e2) {
            if (u.c) {
                x(C0201.m82(2676), e2);
            }
            t(e2);
            z = true;
        }
        if (z) {
            this.g.set(false);
        }
        if (u.c) {
            s30.r(s, String.format(C0201.m82(2677), Boolean.valueOf(this.i.get()), Boolean.valueOf(this.g.get())));
        }
    }

    private void r(n20 n20, n20 n202) {
        i iVar;
        this.i.set(n202.I());
        if (n202.D() != n20.c.ERROR) {
            b.d().d.o(n202);
        } else if (u.c) {
            s30.r(s, C0201.m82(2678));
        }
        j.b(n202);
        if (this.r != null) {
            if (n202.E() > n20.E()) {
                this.r.d(n202);
            }
            if (n202.K()) {
                this.r.b(n202.B());
            }
        }
        if (this.k != null && (iVar = this.l) != null) {
            iVar.g(true, false);
        }
    }

    private void s(n20 n20) {
        g30 a2 = g30.a();
        if (a2.h()) {
            this.g.set(false);
        } else if (this.g.get()) {
            q(n20, a2);
        }
    }

    private void t(Exception exc) {
        i iVar;
        List<String> list;
        boolean z = exc instanceof t10;
        if (z) {
            r10 a2 = ((t10) exc).a();
            if (a2.a == 429 && (list = a2.d.get(C0201.m82(2679))) != null && !list.isEmpty()) {
                try {
                    int parseInt = Integer.parseInt(list.get(0));
                    this.i.set(false);
                    k30.c().b();
                    j.b.a();
                    if (this.l != null) {
                        this.l.h(parseInt);
                        return;
                    }
                } catch (NumberFormatException e2) {
                    if (u.c) {
                        s30.u(s, C0201.m82(2680), e2);
                    }
                }
            }
        }
        if (this.p == null) {
            u(false);
            return;
        }
        if (z) {
            this.i.set(false);
            if (!(this.k == null || (iVar = this.l) == null)) {
                iVar.l();
            }
        } else {
            u(true);
        }
        if (!this.q.isShutdown()) {
            this.q.execute(new p10(this.p, exc));
        }
    }

    private void u(boolean z) {
        i iVar;
        this.i.set(false);
        if (this.k != null && (iVar = this.l) != null) {
            iVar.g(false, z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0060  */
    private boolean v(n20 n20, u10 u10, int i2, boolean z) {
        boolean z2;
        Exception e2;
        try {
            if (b.d().b.get() || b.d().a.get() || !z) {
                z2 = false;
            } else {
                z2 = f.a(u10);
                if (z2) {
                    try {
                        b.d().a.set(true);
                    } catch (Exception e3) {
                        e2 = e3;
                        if (z2) {
                        }
                        if (u.c) {
                        }
                        t(e2);
                        return false;
                    }
                }
            }
            n20 g2 = this.b.g(n20, u10.a(), i2);
            if (z2) {
                b.d().g(true);
                b.d().a.set(false);
            }
            r(n20, g2);
            return true;
        } catch (Exception e4) {
            e2 = e4;
            z2 = false;
            if (z2) {
                b.d().a.set(false);
            }
            if (u.c) {
                x(C0201.m82(2681), e2);
            }
            t(e2);
            return false;
        }
    }

    private void x(String str, Exception exc) {
        if (exc instanceof UnknownHostException) {
            s30.r(s, str);
            s30.r(s, exc.toString());
            return;
        }
        s30.s(s, str, exc);
    }

    public e A(n20 n20, long j2) {
        e eVar;
        String str;
        StringBuilder sb;
        String r0 = C0201.m82(2682);
        if (!this.f.a()) {
            return e.NO_DATA;
        }
        try {
            long b2 = this.e.b();
            if (u.c) {
                String str2 = s;
                s30.r(str2, C0201.m82(2683) + b2);
            }
            k30.c().b();
            this.a.d(b2, n20.H());
            if (n20.H()) {
                this.a.c(n20.v());
            }
            m30 g2 = this.a.g(n20.L(), this.c, b2, this.d);
            if (g2 == null) {
                eVar = e.NO_DATA;
                if (u.c) {
                    str = s;
                    sb = new StringBuilder();
                }
                this.f.b();
                return eVar;
            }
            if (!v(n20, g2.f, g2.d, g2.a == j2)) {
                eVar = e.DATA_NOT_SENT;
                if (u.c) {
                    str = s;
                    sb = new StringBuilder();
                }
                this.f.b();
                return eVar;
            }
            this.a.e(g2);
            eVar = g2.g ? e.FINISHED : e.MORE_DATA_AVAILABLE;
            if (u.c) {
                str = s;
                sb = new StringBuilder();
            }
            this.f.b();
            return eVar;
            sb.append(r0);
            sb.append(this.e.b());
            s30.r(str, sb.toString());
            this.f.b();
            return eVar;
        } catch (Throwable th) {
            if (u.c) {
                String str3 = s;
                s30.r(str3, r0 + this.e.b());
            }
            this.f.b();
            throw th;
        }
    }

    public void B(long j2) {
        ThreadPoolExecutor threadPoolExecutor = this.q;
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdownNow();
        }
        this.i.set(false);
        Thread thread = this.j;
        if (u.c) {
            s30.r(s, String.format(C0201.m82(2684), Long.valueOf(j2), Long.valueOf(thread.getId())));
        }
        long b2 = this.e.b();
        synchronized (thread) {
            this.h.set(true);
            this.m = false;
            thread.notify();
        }
        if (thread.isAlive()) {
            try {
                thread.join(j2);
            } catch (InterruptedException e2) {
                if (u.c) {
                    s30.u(s, String.format(C0201.m82(2685), Long.valueOf(j2)), e2);
                }
            }
            if (thread.isAlive() && u.c) {
                s30.t(s, String.format(C0201.m82(2686), Long.valueOf(j2)));
            }
        }
        this.b.e();
        if (u.c) {
            s30.r(s, String.format(C0201.m82(2687), Long.valueOf(this.e.b() - b2), Long.valueOf(thread.getId())));
        }
    }

    public void C(g30 g30) {
        this.g.set(g30.g());
    }

    public synchronized void D(boolean z) {
        if (this.k == null) {
            if (z || this.l == null) {
                this.l = new i(3);
            } else {
                this.l.j();
            }
            Timer timer = new Timer(s);
            this.k = timer;
            timer.schedule(new b(), this.m ? 0 : 100, 10000);
        }
    }

    public void E(j30 j30, b20 b20) {
        this.a = j30;
        this.p = b20.r;
        j30.d(this.e.b(), b.d().e().H());
        if (this.p != null) {
            this.q = new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        }
        this.b = new v10(new n10(), b20, new o20(b20.a));
        Thread thread = this.j;
        if (thread != null && thread.isAlive()) {
            try {
                this.j.interrupt();
            } catch (Exception e2) {
                if (u.c) {
                    s30.u(s, C0201.m82(2688), e2);
                }
            }
        }
        c cVar = new c(this, null);
        this.j = cVar;
        cVar.start();
        this.i.set(true);
    }

    public synchronized void F() {
        if (this.k != null) {
            this.k.cancel();
            this.k.purge();
        }
        this.k = null;
        this.o.f();
        if (this.l != null) {
            this.l.c();
        }
    }

    public void p() {
        synchronized (this.j) {
            this.h.set(true);
            this.j.notify();
        }
    }

    public boolean w() {
        return this.i.get();
    }

    public void y() {
        synchronized (this.j) {
            this.g.set(true);
            this.j.notify();
        }
    }

    public boolean z(m mVar, String str, int i2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mVar.i().toString());
        u10 u10 = new u10(str, arrayList);
        boolean z = Thread.currentThread() == Looper.getMainLooper().getThread();
        boolean z2 = mVar.q() == 0;
        n20 e2 = b.d().e();
        if (!z) {
            return v(e2, u10, i2, z2);
        }
        d dVar = new d(this, e2, u10, i2, z2, null);
        dVar.start();
        try {
            dVar.join(5000);
        } catch (InterruptedException e3) {
            if (u.c) {
                s30.u(s, C0201.m82(2689), e3);
            }
        }
        return dVar.b();
    }
}
