package com.dynatrace.android.agent;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: DTXAutoAction */
public class p extends o implements p30 {
    private static final String K = (u.b + C0201.m82(3396));
    public static int L = e20.a().g;
    public static int M = e20.a().h;
    public static boolean N = true;
    private static volatile p O;
    private static List<p> P = Collections.synchronizedList(new ArrayList(5));
    public static final String k = null;
    private volatile int A = 0;
    private volatile int B = 0;
    private volatile boolean C = false;
    private volatile boolean D = false;
    private volatile boolean E = false;
    private volatile boolean F = false;
    private volatile boolean G = false;
    private volatile boolean H;
    private boolean I = false;
    private volatile Timer J = null;
    private volatile long z = 0;

    /* access modifiers changed from: package-private */
    /* compiled from: DTXAutoAction */
    public class a extends Thread {
        public a() {
        }

        public void run() {
            p.this.i0(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DTXAutoAction */
    public class b extends TimerTask {
        public int a = this.b;
        public final /* synthetic */ int b;
        public final /* synthetic */ boolean c;

        public b(int i, boolean z) {
            this.b = i;
            this.c = z;
        }

        public void run() {
            int i = this.a;
            if (i > 0) {
                this.a = i - 1;
                if (!this.c) {
                    return;
                }
            } else {
                p.this.Z();
            }
            p.this.i0(this.a);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: DTXAutoAction */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            int[] iArr = new int[t.values().length];
            a = iArr;
            iArr[t.VALUE_INT64.ordinal()] = 1;
            a[t.VALUE_DOUBLE.ordinal()] = 2;
            a[t.VALUE_STRING.ordinal()] = 3;
            a[t.ERROR_INT.ordinal()] = 4;
            a[t.ERROR_EXCEPTION.ordinal()] = 5;
            try {
                a[t.NAMED_EVENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        C0201.m83(p.class, 7);
    }

    public p(String str, g30 g30, int i) {
        super(str, t.ACTION_AUTO, 0, g30, i);
        j.a(str, 1, q(), this, g30, i, new String[0]);
    }

    private synchronized void Y(p pVar, boolean z2) {
        if (O == pVar) {
            O = null;
            if (z2 && pVar != null) {
                P.add(pVar);
            }
        }
    }

    private void a0(Timer timer) {
        this.H = this.G;
        if (u.c) {
            String str = K;
            s30.r(str, C0201.m82(3397) + timer + C0201.m82(3398) + this.H);
        }
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
    }

    public static void b0() {
        ArrayList<p> arrayList;
        p0(null);
        synchronized (P) {
            arrayList = new ArrayList(P);
        }
        for (p pVar : arrayList) {
            try {
                pVar.c();
            } catch (Exception e) {
                if (u.c) {
                    s30.u(K, C0201.m82(3399), e);
                }
            }
        }
    }

    public static p c0(String str, g30 g30, int i) {
        p pVar = new p(str, g30, i);
        p0(pVar);
        if (u.c) {
            s30.r(K, String.format(C0201.m82(3400), str, Long.valueOf(pVar.t())));
        }
        return pVar;
    }

    public static p d0(String str, g30 g30, int i, long j) {
        p c0 = c0(str, g30, i);
        if (j >= 0) {
            c0.B(j);
        }
        return c0;
    }

    public static p e0() {
        return O;
    }

    private synchronized Timer f0(boolean z2) {
        Timer timer;
        if (z2) {
            if (this.J != null) {
                a0(this.J);
            }
            timer = new Timer(K);
            this.J = timer;
        } else {
            timer = this.J;
            this.J = null;
        }
        return timer;
    }

    private boolean g0(m mVar) {
        switch (c.a[mVar.m().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void i0(int i) {
        int i2;
        this.H = true;
        if (u.c) {
            s30.r(K, String.format(C0201.m82(3401), o(), Integer.valueOf(i), Integer.valueOf(this.A), Integer.valueOf(this.B)));
        }
        if (!this.G) {
            Y(this, true);
        }
        if (this.A > 0 || this.B > 0) {
            if (!this.G) {
                this.G = true;
                if (u.c) {
                    s30.r(K, String.format(C0201.m82(3402), o()));
                }
                long s = ((long) M) - (s() - t());
                if (s > 1000) {
                    i2 = C0188.f18;
                } else {
                    i2 = 100;
                    if (s < 0) {
                        s = 0;
                    }
                }
                long j = (long) i2;
                n0(j, j, Math.round(((float) s) / ((float) i2)) - 1, true);
                return;
            } else if (i > 0) {
                return;
            }
        }
        Z();
        if (u.c) {
            s30.r(K, String.format(C0201.m82(3403), o()));
        }
        c();
    }

    public static void k0(b20 b20) {
        L = b20.g;
        M = b20.h;
        N = b20.i;
    }

    private void n0(long j, long j2, int i, boolean z2) {
        if (u.c) {
            s30.r(K, String.format(k, o(), Long.valueOf(j), Long.valueOf(j2), Integer.valueOf(i)));
        }
        b bVar = new b(i, z2);
        for (int i2 = 3; i2 > 0; i2--) {
            try {
                f0(true).schedule(bVar, j, j2);
                return;
            } catch (IllegalArgumentException unused) {
                return;
            } catch (IllegalStateException unused2) {
            }
        }
    }

    private static synchronized p p0(p pVar) {
        p pVar2;
        synchronized (p.class) {
            pVar2 = O;
            O = pVar;
            if (pVar2 != null) {
                P.add(pVar2);
            }
        }
        return pVar2;
    }

    @Override // com.dynatrace.android.agent.o
    public b0 L() {
        if (this.H) {
            return null;
        }
        return super.L();
    }

    @Override // com.dynatrace.android.agent.o
    public boolean O() {
        return super.O();
    }

    @Override // com.dynatrace.android.agent.o
    public void T(m mVar) {
        if (mVar != null) {
            if (u.c) {
                s30.r(K, String.format(C0201.m82(3404), mVar.o(), o()));
            }
            if (mVar.v() == 110 || mVar.v() == 100) {
                this.A++;
                this.C = true;
            } else if (mVar.v() == 5) {
                this.B++;
                this.D = true;
                o.U(this);
            } else if (mVar.v() == 11) {
                this.E = true;
            } else if (g0(mVar)) {
                this.F = true;
            }
        }
    }

    @Override // com.dynatrace.android.agent.o
    public void W(String str) {
        if (str.startsWith(b0.f())) {
            this.A--;
        } else {
            this.B--;
        }
        super.W(str);
    }

    public void Z() {
        a0(f0(false));
    }

    @Override // com.dynatrace.android.agent.n, com.dynatrace.android.agent.o
    public void c() {
        Z();
        boolean z2 = true;
        this.G = true;
        this.H = true;
        boolean z3 = false;
        Y(this, false);
        P.remove(this);
        if (u.c) {
            s30.r(K, String.format(C0201.m82(3405), o(), Boolean.valueOf(this.I), Boolean.valueOf(this.C), Boolean.valueOf(this.D), Boolean.valueOf(this.F), Long.valueOf(this.z)));
        }
        o.V(this);
        if (this.I) {
            super.R(false);
            return;
        }
        if (((!this.C && !this.D && !this.E) || this.z <= 0) && !N && !this.F) {
            z2 = false;
        }
        if (z2 && this.B > 0) {
            String o = o();
            if (o.equals(C0201.m82(3406) + b.l) && K().size() > 0) {
                m mVar = K().get(0);
                if (mVar.m() == t.APP_START && (mVar instanceof v)) {
                    ((v) mVar).R(false);
                    super.R(z3);
                }
            }
        }
        z3 = z2;
        super.R(z3);
    }

    @Override // defpackage.p30
    public void f(o oVar) {
        if (K().contains(oVar)) {
            if (u.c) {
                s30.r(K, String.format(C0201.m82(3407), oVar.o(), o()));
            }
            h0();
            this.B--;
        }
    }

    public synchronized void h0() {
        if (!x()) {
            this.z = s();
            if (u.c) {
                s30.r(K, String.format(C0201.m82(3408), Long.valueOf(this.z), Long.valueOf(this.z - t())));
            }
        }
    }

    @Override // com.dynatrace.android.agent.o, com.dynatrace.android.agent.m
    public StringBuilder i() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0201.m82(3409));
        sb.append(this.j.d());
        sb.append(C0201.m82(3410));
        sb.append(s30.q(o()));
        sb.append(C0201.m82(3411));
        sb.append(Thread.currentThread().getId());
        sb.append(C0201.m82(3412));
        sb.append(u());
        sb.append(C0201.m82(3413));
        sb.append(q());
        sb.append(C0201.m82(3414));
        sb.append(n());
        sb.append(C0201.m82(3415));
        sb.append(t());
        sb.append(C0201.m82(3416));
        sb.append(this.o);
        sb.append(C0201.m82(3417));
        sb.append(l() - t());
        if (this.j.b() != f20.OFF) {
            H(sb, C0201.m82(3418), C0201.m82(3419), C0201.m82(3420));
        }
        return sb;
    }

    public int j0(long j) {
        if (x()) {
            return this.A;
        }
        if (this.A > 0 && j == u()) {
            h0();
            this.A--;
        }
        return this.A;
    }

    public void l0() {
        m0(L);
        h0();
    }

    public void m0(int i) {
        Z();
        if (i <= 0) {
            new a().start();
            return;
        }
        if (u.c) {
            s30.r(K, String.format(C0201.m82(3421), o()));
        }
        long j = (long) i;
        n0(j, j, 0, false);
    }

    public void o0() {
        if (this.J == null) {
            m0(L);
        }
    }

    @Override // com.dynatrace.android.agent.m
    public long p() {
        if (this.C || this.D || this.E) {
            if (u.c) {
                s30.r(K, String.format(C0201.m82(3423), Long.valueOf(this.z), Long.valueOf(this.z - t())));
            }
            return this.z;
        } else if (this.z <= 0) {
            return super.p();
        } else {
            if (u.c) {
                s30.r(K, String.format(C0201.m82(3422), Long.valueOf(this.z), Long.valueOf(this.z - t())));
            }
            return this.z;
        }
    }
}
