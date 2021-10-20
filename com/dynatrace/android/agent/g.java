package com.dynatrace.android.agent;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import vigqyno.C0201;

/* compiled from: CalloutTable */
public class g {
    private static final String f = (u.b + C0201.m82(2730));
    private long a;
    private long b;
    private List<b> c = new ArrayList();
    private Vector<c> d = null;
    private Object e = new Object();

    /* access modifiers changed from: private */
    /* compiled from: CalloutTable */
    public class b {
        private String a;
        private long b;

        public b(g gVar, m mVar, long j) {
            this.a = mVar.o() + mVar.hashCode();
            this.b = j;
        }

        public static /* synthetic */ long c(b bVar) {
            long j = bVar.b - 1;
            bVar.b = j;
            return j;
        }
    }

    /* compiled from: CalloutTable */
    public class c {
        private m a;
        private long b;

        private c(g gVar, m mVar) {
            this.a = mVar;
            this.b = x.a();
        }
    }

    public g(int i) {
        this.a = (long) i;
        this.b = 0;
    }

    private void h() {
        long a2 = x.a();
        Vector vector = new Vector(this.d);
        while (vector.size() > 0) {
            c cVar = (c) vector.remove(0);
            if (a2 - cVar.b > 540000) {
                this.d.remove(cVar);
            }
        }
    }

    public void a(m mVar) {
        if (mVar != null) {
            if (u.c) {
                s30.r(f, String.format(C0201.m82(2731), mVar.o() + mVar.hashCode(), Long.valueOf(mVar.u()), Long.valueOf(mVar.q()), Long.valueOf(this.b)));
            }
            synchronized (this.c) {
                long j = this.a - this.b;
                for (int i = 0; i < this.c.size(); i++) {
                    if (this.c.get(i).b >= j) {
                        this.c.get(i).b -= j;
                        this.c.add(i, new b(this, mVar, j));
                        return;
                    }
                    j -= this.c.get(i).b;
                }
                this.c.add(new b(this, mVar, j));
            }
        }
    }

    public void b() {
        synchronized (this.c) {
            if (this.c.size() <= 0) {
                if (this.b == 0) {
                    this.b = this.a;
                }
            }
        }
    }

    public void c(m mVar) {
        if (this.d == null) {
            this.d = new Vector<>(5);
        }
        this.d.add(new c(mVar));
        if (this.d.size() > 5) {
            h();
        }
    }

    public void d(long j) {
        synchronized (this.c) {
            if (j != this.a) {
                this.a = j;
                if (this.b > j) {
                    if (this.c.size() > 0) {
                        this.c.get(0).b += this.b - j;
                    }
                    this.b = j;
                }
            }
        }
    }

    public boolean e() {
        synchronized (this.c) {
            boolean z = true;
            if (this.b > 0) {
                long j = this.b - 1;
                this.b = j;
                if (j != 0) {
                    z = false;
                }
                return z;
            } else if (this.c.size() <= 0 || b.c(this.c.get(0)) != 0) {
                return false;
            } else {
                do {
                    this.c.remove(0);
                    if (this.c.size() <= 0) {
                        break;
                    }
                } while (this.c.get(0).b == 0);
                return true;
            }
        }
    }

    public void f() {
        synchronized (this.c) {
            this.c.clear();
            this.b = 0;
        }
    }

    public boolean g(m mVar) {
        boolean z = false;
        if (mVar == null) {
            return false;
        }
        String str = mVar.o() + mVar.hashCode();
        synchronized (this.c) {
            for (int i = 0; i < this.c.size(); i++) {
                if (this.c.get(i).a.equals(str)) {
                    int i2 = i + 1;
                    if (i2 < this.c.size()) {
                        this.c.get(i2).b += this.c.get(i).b;
                    } else if (this.b == 0) {
                        this.b = this.c.get(i).b;
                    }
                    if (this.c.remove(i) != null) {
                        z = true;
                    }
                    return z;
                }
            }
            return false;
        }
    }

    public Vector<c> i() {
        Vector<c> vector;
        Vector<c> vector2 = this.d;
        if (vector2 == null || vector2.size() < 1) {
            return null;
        }
        synchronized (this.e) {
            vector = this.d;
            this.d = null;
        }
        return vector;
    }

    public void j() {
        Vector<c> i = i();
        if (i != null) {
            while (i.size() > 0) {
                j.j(i.remove(0).a);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        String r1 = C0201.m82(2732);
        sb.append(r1);
        String sb2 = sb.toString();
        for (int i = 0; i < this.c.size(); i++) {
            sb2 = sb2 + this.c.get(i).b + r1;
        }
        return sb2;
    }
}
