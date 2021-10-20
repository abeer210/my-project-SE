package defpackage;

import defpackage.ih0;
import java.util.ArrayList;
import java.util.List;

/* renamed from: lf0  reason: default package */
/* compiled from: BaseProducerContext */
public class lf0 implements sg0 {
    private final ih0 a;
    private final String b;
    private final ug0 c;
    private final Object d;
    private final ih0.b e;
    private boolean f;
    private qd0 g;
    private boolean h;
    private boolean i = false;
    private final List<tg0> j = new ArrayList();

    public lf0(ih0 ih0, String str, ug0 ug0, Object obj, ih0.b bVar, boolean z, boolean z2, qd0 qd0) {
        this.a = ih0;
        this.b = str;
        this.c = ug0;
        this.d = obj;
        this.e = bVar;
        this.f = z;
        this.g = qd0;
        this.h = z2;
    }

    public static void i(List<tg0> list) {
        if (list != null) {
            for (tg0 tg0 : list) {
                tg0.a();
            }
        }
    }

    public static void j(List<tg0> list) {
        if (list != null) {
            for (tg0 tg0 : list) {
                tg0.b();
            }
        }
    }

    public static void k(List<tg0> list) {
        if (list != null) {
            for (tg0 tg0 : list) {
                tg0.d();
            }
        }
    }

    public static void l(List<tg0> list) {
        if (list != null) {
            for (tg0 tg0 : list) {
                tg0.c();
            }
        }
    }

    @Override // defpackage.sg0
    public Object a() {
        return this.d;
    }

    @Override // defpackage.sg0
    public synchronized qd0 b() {
        return this.g;
    }

    @Override // defpackage.sg0
    public ih0 c() {
        return this.a;
    }

    @Override // defpackage.sg0
    public void d(tg0 tg0) {
        boolean z;
        synchronized (this) {
            this.j.add(tg0);
            z = this.i;
        }
        if (z) {
            tg0.a();
        }
    }

    @Override // defpackage.sg0
    public synchronized boolean e() {
        return this.f;
    }

    @Override // defpackage.sg0
    public ug0 f() {
        return this.c;
    }

    @Override // defpackage.sg0
    public synchronized boolean g() {
        return this.h;
    }

    @Override // defpackage.sg0
    public ih0.b h() {
        return this.e;
    }

    public void m() {
        i(n());
    }

    public synchronized List<tg0> n() {
        if (this.i) {
            return null;
        }
        this.i = true;
        return new ArrayList(this.j);
    }

    public synchronized List<tg0> o(boolean z) {
        if (z == this.h) {
            return null;
        }
        this.h = z;
        return new ArrayList(this.j);
    }

    public synchronized List<tg0> p(boolean z) {
        if (z == this.f) {
            return null;
        }
        this.f = z;
        return new ArrayList(this.j);
    }

    public synchronized List<tg0> q(qd0 qd0) {
        if (qd0 == this.g) {
            return null;
        }
        this.g = qd0;
        return new ArrayList(this.j);
    }

    @Override // defpackage.sg0
    public String t() {
        return this.b;
    }
}
