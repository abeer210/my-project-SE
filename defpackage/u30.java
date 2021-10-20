package defpackage;

import android.app.Activity;
import android.content.Context;
import com.dynatrace.android.agent.e;
import com.dynatrace.android.agent.o;
import com.dynatrace.android.agent.p;
import com.dynatrace.android.agent.t;
import com.dynatrace.android.agent.u;
import com.dynatrace.android.agent.v;
import java.util.HashMap;
import java.util.Vector;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import vigqyno.C0201;

/* renamed from: u30  reason: default package */
/* compiled from: LcContext */
public final class u30 {
    private static final String d = (u.b + C0201.m82(27556));
    private static volatile u30 e = null;
    private static Vector<v> f;
    private static HashMap<String, v> g;
    private static AtomicLong h = null;
    private t30 a = null;
    private AtomicBoolean b = new AtomicBoolean(true);
    private AtomicBoolean c = new AtomicBoolean(false);

    /* access modifiers changed from: package-private */
    /* renamed from: u30$a */
    /* compiled from: LcContext */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            int[] iArr = new int[e30.values().length];
            a = iArr;
            iArr[e30.onActivityCreate.ordinal()] = 1;
            a[e30.onActivityRestart.ordinal()] = 2;
            a[e30.onActivityResume.ordinal()] = 3;
            try {
                a[e30.onActivityStart.ordinal()] = 4;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u30$b */
    /* compiled from: LcContext */
    public static class b implements o30 {
        private b() {
        }

        @Override // defpackage.o30
        public void a() {
            if (u.c) {
                String str = u30.d;
                s30.r(str, com.dynatrace.android.agent.b.l + C0201.m82(13217));
            }
            u30.n().c.set(true);
            u30.n().h(C0201.m82(13218));
        }

        @Override // defpackage.o30
        public void b() {
            if (u.c) {
                String str = u30.d;
                s30.r(str, com.dynatrace.android.agent.b.l + C0201.m82(13219));
            }
            u30.n().c.set(false);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    public u30(Context context, boolean z) {
        o(context, z);
        synchronized (u30.class) {
            e = this;
        }
    }

    private p j(String str, long j) {
        p e0 = p.e0();
        return e0 == null ? p.d0(str, g30.b(false, true), com.dynatrace.android.agent.b.d().c, j) : e0;
    }

    public static u30 n() {
        if (e == null) {
            synchronized (u30.class) {
                if (e == null) {
                    e = new u30();
                }
            }
        }
        return e;
    }

    private void o(Context context, boolean z) {
        h = new AtomicLong(0);
        g = new HashMap<>();
        f = new Vector<>();
        if (z) {
            com.dynatrace.android.agent.b d2 = com.dynatrace.android.agent.b.d();
            if (d2.c() == null) {
                d2.h(new g20(C0201.m82(27557), C0201.m82(27558)).a(), context);
                n20 d3 = d2.d.d(1);
                d2.i(d3);
                d2.c = d3.B();
            }
            this.a = new t30();
            g30.l(l20.b);
            v30.b().e(new b(null));
            v30.b().e(new e());
        } else if (u.c) {
            s30.w(d, C0201.m82(27559));
        }
    }

    private void t(v vVar) {
        if (vVar != null) {
            vVar.c();
            w(vVar);
            f.remove(vVar);
        }
    }

    private void w(v vVar) {
        o N;
        if (vVar != null && (N = vVar.N()) != null) {
            ((p) N).o0();
        }
    }

    public void c(Activity activity, e30 e30) {
        if (activity != null && k()) {
            v vVar = g.get(m(activity));
            if (vVar == null) {
                vVar = l();
            }
            if (vVar != null) {
                vVar.X(e30.toString());
            }
        }
    }

    public void d(v vVar) {
        v remove = g.remove(C0201.m82(27560));
        if (!(remove == null || remove == vVar || !u.c)) {
            s30.t(d, C0201.m82(27561));
        }
        f.remove(vVar);
    }

    public void e(v vVar) {
        f.remove(vVar);
    }

    public void f(Activity activity, e30 e30) {
        t tVar;
        if (activity != null && k()) {
            String m = m(activity);
            if (g.get(m) == null) {
                int i = a.a[e30.ordinal()];
                if (i == 1) {
                    tVar = t.DISPLAY;
                } else if (i == 2 || i == 3 || i == 4) {
                    tVar = t.REDISPLAY;
                } else {
                    return;
                }
                String simpleName = activity.getClass().getSimpleName();
                p e0 = p.e0();
                if (e0 == null) {
                    g30 b2 = g30.b(true, true);
                    int i2 = com.dynatrace.android.agent.b.d().c;
                    e0 = p.c0(C0201.m82(27562) + simpleName, b2, i2);
                }
                e0.Z();
                v Y = v.Y(simpleName, tVar, e0);
                Y.h0(simpleName);
                g.put(m, Y);
                f.add(Y);
            }
        }
    }

    public void g() {
        if (k()) {
            p j = j(C0201.m82(27563) + com.dynatrace.android.agent.b.l, 0);
            v Y = v.Y(com.dynatrace.android.agent.b.l, t.APP_START, j);
            g.put(C0201.m82(27564), Y);
            f.add(Y);
            j.m0(5000);
        }
    }

    public void h(String str) {
        if (u.c) {
            s30.r(d, String.format(C0201.m82(27565), Thread.currentThread().getName(), str));
        }
        com.dynatrace.android.agent.a.b();
        p.b0();
    }

    public t30 i() {
        return this.a;
    }

    public boolean k() {
        return this.b.get();
    }

    public v l() {
        Vector<v> vector = f;
        if (vector == null || vector.isEmpty()) {
            return null;
        }
        return f.lastElement();
    }

    public String m(Activity activity) {
        return activity.getClass().getSimpleName() + activity.hashCode() + h.get();
    }

    public boolean p() {
        return this.c.get();
    }

    public boolean q() {
        return this.a != null;
    }

    public void r(Activity activity, e30 e30) {
        if (activity != null) {
            t(g.remove(m(activity)));
        }
    }

    public void s(Activity activity) {
        v remove = g.remove(C0201.m82(27566));
        if (remove != null) {
            remove.h0(activity.getClass().getSimpleName());
            t(remove);
        }
    }

    public synchronized void u() {
        h(C0201.m82(27567));
        s30.n();
        h.incrementAndGet();
    }

    public void v(boolean z) {
        this.b.set(z);
    }

    private u30() {
        o(null, false);
    }
}
