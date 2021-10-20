package com.dynatrace.android.agent;

import com.dynatrace.android.agent.f;
import vigqyno.C0201;

/* compiled from: CrashReporter */
public class k implements w20 {
    private static final String c = (u.b + C0201.m82(3180));
    public static boolean d = false;
    public h a;
    private final c30 b = new c30();

    public k(h hVar) {
        this.a = hVar;
    }

    private l d(String str, String str2, String str3, o oVar, g30 g30, int i, y20 y20) {
        l lVar = new l(str, str2, str3, 0, g30, i, y20.b());
        if (oVar != null) {
            lVar.A(oVar.u());
            oVar.E(lVar);
        }
        return lVar;
    }

    public static boolean e() {
        return d;
    }

    @Override // defpackage.w20
    public synchronized void a(String str, String str2, String str3, String str4) {
    }

    @Override // defpackage.w20
    public synchronized void b(Thread thread, Throwable th) {
        g30 b2;
        int i;
        d = true;
        if (!q.e()) {
            if (u.c) {
                s30.v(c, C0201.m82(3181));
            }
            return;
        }
        o c2 = c();
        if (c2 != null) {
            b2 = c2.h;
            i = c2.i;
        } else {
            b2 = g30.b(true, false);
            i = b.d().c;
        }
        this.a.F();
        if (b2.g()) {
            f(thread, th, j.p(b2), c2, b2, i);
        }
        j.s(5000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: com.dynatrace.android.agent.p */
    /* JADX WARN: Multi-variable type inference failed */
    public o c() {
        v l = u30.n().l();
        v vVar = l;
        if (l == null) {
            p e0 = p.e0();
            vVar = e0;
            if (e0 != 0) {
                e0.h0();
                vVar = e0;
            }
        }
        if (vVar == null || vVar.x()) {
            return null;
        }
        return vVar;
    }

    public void f(Thread thread, Throwable th, boolean z, o oVar, g30 g30, int i) {
        if (u.c) {
            String str = c;
            Object[] objArr = new Object[1];
            objArr[0] = thread != null ? thread.getName() : C0201.m82(3182);
            s30.u(str, String.format(C0201.m82(3183), objArr), th);
        }
        if (z) {
            a30 a2 = this.b.a(th, b.d().b().v).a();
            l d2 = d(a2.a(), a2.b(), a2.c(), oVar, g30, i, a2.d());
            String a3 = new f.a().a(g30.a, g30.f);
            h hVar = this.a;
            if (!hVar.z(d2, j.g(d2.h) + a3, i)) {
                j.l(d2);
            }
        }
        u30.n().h(C0201.m82(3184));
    }
}
