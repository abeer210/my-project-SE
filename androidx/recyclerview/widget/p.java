package androidx.recyclerview.widget;

import androidx.core.util.Pools$SimplePool;
import androidx.core.util.e;
import androidx.recyclerview.widget.RecyclerView;
import vigqyno.C0201;

/* compiled from: ViewInfoStore */
public class p {
    public final x0<RecyclerView.d0, a> a = new x0<>();
    public final u0<RecyclerView.d0> b = new u0<>();

    /* access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore */
    public static class a {
        public static e<a> d = new Pools$SimplePool(20);
        public int a;
        public RecyclerView.l.c b;
        public RecyclerView.l.c c;

        private a() {
        }

        public static void a() {
            do {
            } while (d.b() != null);
        }

        public static a b() {
            a b2 = d.b();
            return b2 == null ? new a() : b2;
        }

        public static void c(a aVar) {
            aVar.a = 0;
            aVar.b = null;
            aVar.c = null;
            d.a(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ViewInfoStore */
    public interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void c(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);

        void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar, RecyclerView.l.c cVar2);
    }

    private RecyclerView.l.c l(RecyclerView.d0 d0Var, int i) {
        a m;
        RecyclerView.l.c cVar;
        int f = this.a.f(d0Var);
        if (f >= 0 && (m = this.a.m(f)) != null) {
            int i2 = m.a;
            if ((i2 & i) != 0) {
                m.a = (i ^ -1) & i2;
                if (i == 4) {
                    cVar = m.b;
                } else if (i == 8) {
                    cVar = m.c;
                } else {
                    throw new IllegalArgumentException(C0201.m82(15761));
                }
                if ((m.a & 12) == 0) {
                    this.a.k(f);
                    a.c(m);
                }
                return cVar;
            }
        }
        return null;
    }

    public void a(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 2;
        aVar.b = cVar;
    }

    public void b(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.a |= 1;
    }

    public void c(long j, RecyclerView.d0 d0Var) {
        this.b.m(j, d0Var);
    }

    public void d(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.c = cVar;
        aVar.a |= 8;
    }

    public void e(RecyclerView.d0 d0Var, RecyclerView.l.c cVar) {
        a aVar = this.a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.a.put(d0Var, aVar);
        }
        aVar.b = cVar;
        aVar.a |= 4;
    }

    public void f() {
        this.a.clear();
        this.b.b();
    }

    public RecyclerView.d0 g(long j) {
        return this.b.g(j);
    }

    public boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar == null || (aVar.a & 1) == 0) {
            return false;
        }
        return true;
    }

    public boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        return (aVar == null || (aVar.a & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    public RecyclerView.l.c m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    public RecyclerView.l.c n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 i = this.a.i(size);
            a k = this.a.k(size);
            int i2 = k.a;
            if ((i2 & 3) == 3) {
                bVar.a(i);
            } else if ((i2 & 1) != 0) {
                RecyclerView.l.c cVar = k.b;
                if (cVar == null) {
                    bVar.a(i);
                } else {
                    bVar.c(i, cVar, k.c);
                }
            } else if ((i2 & 14) == 14) {
                bVar.b(i, k.b, k.c);
            } else if ((i2 & 12) == 12) {
                bVar.d(i, k.b, k.c);
            } else if ((i2 & 4) != 0) {
                bVar.c(i, k.b, null);
            } else if ((i2 & 8) != 0) {
                bVar.b(i, k.b, k.c);
            }
            a.c(k);
        }
    }

    public void p(RecyclerView.d0 d0Var) {
        a aVar = this.a.get(d0Var);
        if (aVar != null) {
            aVar.a &= -2;
        }
    }

    public void q(RecyclerView.d0 d0Var) {
        int q = this.b.q() - 1;
        while (true) {
            if (q < 0) {
                break;
            } else if (d0Var == this.b.s(q)) {
                this.b.o(q);
                break;
            } else {
                q--;
            }
        }
        a remove = this.a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
