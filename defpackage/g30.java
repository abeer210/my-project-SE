package defpackage;

import com.dynatrace.android.agent.b;
import com.dynatrace.android.agent.c;
import com.dynatrace.android.agent.j;
import com.dynatrace.android.agent.u;
import com.dynatrace.android.agent.x;
import java.util.Random;
import vigqyno.C0201;

/* renamed from: g30  reason: default package */
/* compiled from: Session */
public class g30 {
    private static final String l = (u.b + C0201.m82(13894));
    public static f30 m = new f30();
    private static volatile g30 n = null;
    public final long a;
    public long b;
    public long c;
    public int d = 0;
    public final i30 e;
    public int f = -1;
    private h30 g = h30.CREATED;
    private Random h;
    private volatile int i = 0;
    private volatile long j;
    private l20 k;

    public g30(long j2, Random random, i30 i30, l20 l20) {
        this.a = j2;
        this.j = j2;
        this.h = random;
        this.e = i30;
        if (i30 == i30.V1_SERVER_SPLITTING) {
            this.d = -1;
        }
        this.k = l20;
    }

    public static g30 a() {
        if (n != null) {
            return n;
        }
        return l(l20.b);
    }

    public static g30 b(boolean z, boolean z2) {
        g30 a2 = a();
        if (a2.e == i30.V1_SERVER_SPLITTING) {
            return a2;
        }
        if (!z) {
            q20 f2 = b.d().f();
            long a3 = x.a();
            if (a2.j + f2.b() < a3 || a2.a + f2.f() < a3) {
                j.u(true, a2.c());
                a2 = n;
            } else if (z2 && a2.g() && a2.i >= f2.d()) {
                a2 = a2.j();
                a2.d++;
                n = a2;
                j.t(a2, true);
            }
        }
        if (z2) {
            a2.i++;
        }
        a2.j = x.a();
        return a2;
    }

    private boolean i(int i2, int i3) {
        return this.h.nextInt(i2) < i3;
    }

    private g30 j() {
        g30 g30 = new g30(x.a(), m.a(), this.e, this.k);
        g30.b = this.b;
        g30.c = this.c;
        g30.d = this.d;
        g30.f = this.f;
        g30.g = this.g;
        if (u.c) {
            s30.r(l, C0201.m82(13895));
        }
        return g30;
    }

    public static g30 k(l20 l20) {
        n = new g30(x.a(), m.a(), b.d().e().G(), l20);
        return n;
    }

    public static g30 l(l20 l20) {
        if (n == null) {
            synchronized (g30.class) {
                if (n == null) {
                    return k(l20);
                }
            }
        }
        return n;
    }

    public l20 c() {
        return this.k;
    }

    public long d() {
        return x.a() - this.a;
    }

    public void e(int i2, int i3, c cVar) {
        if (this.g == h30.CREATED) {
            boolean z = i3 > 0;
            this.f = i3;
            if (!z && u.c) {
                s30.r(l, C0201.m82(13896));
            }
            if (z && !(z = i(100, i2)) && u.c) {
                String str = l;
                s30.r(str, C0201.m82(13897) + i2);
            }
            this.g = z ? h30.ENABLED : h30.DISABLED;
            if (!z && cVar != null) {
                cVar.a(this);
            }
        }
    }

    @Deprecated
    public void f(l20 l20) {
        this.k = l20;
    }

    public boolean g() {
        return this.g.b();
    }

    public boolean h() {
        return this.g.d();
    }

    public synchronized void m(long j2) {
        if (j2 > this.j) {
            this.j = j2;
        }
    }
}
