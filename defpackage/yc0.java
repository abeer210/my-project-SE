package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: yc0  reason: default package */
/* compiled from: CountingMemoryCache */
public class yc0<K, V> implements gd0<K, V>, l60 {
    public final xc0<K, d<K, V>> a;
    public final xc0<K, d<K, V>> b;
    private final md0<V> c;
    private final c60<hd0> d;
    public hd0 e;
    private long f = SystemClock.uptimeMillis();

    /* access modifiers changed from: package-private */
    /* renamed from: yc0$a */
    /* compiled from: CountingMemoryCache */
    public class a implements md0<d<K, V>> {
        public final /* synthetic */ md0 a;

        public a(yc0 yc0, md0 md0) {
            this.a = md0;
        }

        /* renamed from: b */
        public int a(d<K, V> dVar) {
            return this.a.a(dVar.b.w());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yc0$b */
    /* compiled from: CountingMemoryCache */
    public class b implements x60<V> {
        public final /* synthetic */ d a;

        public b(d dVar) {
            this.a = dVar;
        }

        @Override // defpackage.x60
        public void a(V v) {
            yc0.this.x(this.a);
        }
    }

    /* renamed from: yc0$c */
    /* compiled from: CountingMemoryCache */
    public interface c {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yc0$d */
    /* compiled from: CountingMemoryCache */
    public static class d<K, V> {
        public final K a;
        public final v60<V> b;
        public int c = 0;
        public boolean d = false;
        public final e<K> e;

        private d(K k, v60<V> v60, e<K> eVar) {
            z50.g(k);
            this.a = k;
            v60<V> n = v60.n(v60);
            z50.g(n);
            this.b = n;
            this.e = eVar;
        }

        public static <K, V> d<K, V> a(K k, v60<V> v60, e<K> eVar) {
            return new d<>(k, v60, eVar);
        }
    }

    /* renamed from: yc0$e */
    /* compiled from: CountingMemoryCache */
    public interface e<K> {
        void a(K k, boolean z);
    }

    public yc0(md0<V> md0, c cVar, c60<hd0> c60) {
        new WeakHashMap();
        this.c = md0;
        this.a = new xc0<>(A(md0));
        this.b = new xc0<>(A(md0));
        this.d = c60;
        this.e = c60.get();
    }

    private md0<d<K, V>> A(md0<V> md0) {
        return new a(this, md0);
    }

    private synchronized boolean g(V v) {
        boolean z;
        int a2 = this.c.a(v);
        z = true;
        if (a2 > this.e.e || j() > this.e.b - 1 || k() > this.e.a - a2) {
            z = false;
        }
        return z;
    }

    private synchronized void i(d<K, V> dVar) {
        z50.g(dVar);
        z50.i(dVar.c > 0);
        dVar.c--;
    }

    private synchronized void l(d<K, V> dVar) {
        z50.g(dVar);
        z50.i(!dVar.d);
        dVar.c++;
    }

    private synchronized void m(d<K, V> dVar) {
        z50.g(dVar);
        z50.i(!dVar.d);
        dVar.d = true;
    }

    private synchronized void n(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                m(it.next());
            }
        }
    }

    private synchronized boolean o(d<K, V> dVar) {
        if (dVar.d || dVar.c != 0) {
            return false;
        }
        this.a.h(dVar.a, dVar);
        return true;
    }

    private void p(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                v60.s(w(it.next()));
            }
        }
    }

    private void q() {
        ArrayList<d<K, V>> z;
        synchronized (this) {
            z = z(Math.min(this.e.d, this.e.b - j()), Math.min(this.e.c, this.e.a - k()));
            n(z);
        }
        p(z);
        t(z);
    }

    private static <K, V> void r(d<K, V> dVar) {
        e<K> eVar;
        if (dVar != null && (eVar = dVar.e) != null) {
            eVar.a(dVar.a, true);
        }
    }

    private static <K, V> void s(d<K, V> dVar) {
        e<K> eVar;
        if (dVar != null && (eVar = dVar.e) != null) {
            eVar.a(dVar.a, false);
        }
    }

    private void t(ArrayList<d<K, V>> arrayList) {
        if (arrayList != null) {
            Iterator<d<K, V>> it = arrayList.iterator();
            while (it.hasNext()) {
                s(it.next());
            }
        }
    }

    private synchronized void u() {
        if (this.f + this.e.f <= SystemClock.uptimeMillis()) {
            this.f = SystemClock.uptimeMillis();
            this.e = this.d.get();
        }
    }

    private synchronized v60<V> v(d<K, V> dVar) {
        l(dVar);
        return v60.F(dVar.b.w(), new b(dVar));
    }

    private synchronized v60<V> w(d<K, V> dVar) {
        z50.g(dVar);
        return (!dVar.d || dVar.c != 0) ? null : dVar.b;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void x(d<K, V> dVar) {
        boolean o;
        v60<V> w;
        z50.g(dVar);
        synchronized (this) {
            i(dVar);
            o = o(dVar);
            w = w(dVar);
        }
        v60.s(w);
        if (!o) {
            dVar = null;
        }
        r(dVar);
        u();
        q();
    }

    private synchronized ArrayList<d<K, V>> z(int i, int i2) {
        int max = Math.max(i, 0);
        int max2 = Math.max(i2, 0);
        if (this.a.c() <= max && this.a.f() <= max2) {
            return null;
        }
        ArrayList<d<K, V>> arrayList = new ArrayList<>();
        while (true) {
            if (this.a.c() <= max && this.a.f() <= max2) {
                return arrayList;
            }
            K d2 = this.a.d();
            this.a.i(d2);
            arrayList.add(this.b.i(d2));
        }
    }

    @Override // defpackage.gd0
    public v60<V> b(K k, v60<V> v60) {
        return f(k, v60, null);
    }

    @Override // defpackage.gd0
    public int c(a60<K> a60) {
        ArrayList<d<K, V>> j;
        ArrayList<d<K, V>> j2;
        synchronized (this) {
            j = this.a.j(a60);
            j2 = this.b.j(a60);
            n(j2);
        }
        p(j2);
        t(j);
        u();
        q();
        return j2.size();
    }

    @Override // defpackage.gd0
    public synchronized boolean d(a60<K> a60) {
        return !this.b.e(a60).isEmpty();
    }

    public v60<V> f(K k, v60<V> v60, e<K> eVar) {
        d<K, V> i;
        v60<V> v602;
        v60<V> v603;
        z50.g(k);
        z50.g(v60);
        u();
        synchronized (this) {
            i = this.a.i(k);
            d<K, V> i2 = this.b.i(k);
            v602 = null;
            if (i2 != null) {
                m(i2);
                v603 = w(i2);
            } else {
                v603 = null;
            }
            if (g(v60.w())) {
                d<K, V> a2 = d.a(k, v60, eVar);
                this.b.h(k, a2);
                v602 = v(a2);
            }
        }
        v60.s(v603);
        s(i);
        q();
        return v602;
    }

    @Override // defpackage.gd0
    public v60<V> get(K k) {
        d<K, V> i;
        v60<V> v;
        z50.g(k);
        synchronized (this) {
            i = this.a.i(k);
            d<K, V> b2 = this.b.b(k);
            v = b2 != null ? v(b2) : null;
        }
        s(i);
        u();
        q();
        return v;
    }

    public synchronized boolean h(K k) {
        return this.b.a(k);
    }

    public synchronized int j() {
        return this.b.c() - this.a.c();
    }

    public synchronized int k() {
        return this.b.f() - this.a.f();
    }

    public v60<V> y(K k) {
        d<K, V> i;
        boolean z;
        v60<V> v60;
        z50.g(k);
        synchronized (this) {
            i = this.a.i(k);
            z = true;
            boolean z2 = false;
            if (i != null) {
                d<K, V> i2 = this.b.i(k);
                z50.g(i2);
                if (i2.c == 0) {
                    z2 = true;
                }
                z50.i(z2);
                v60 = i2.b;
            } else {
                v60 = null;
                z = false;
            }
        }
        if (z) {
            s(i);
        }
        return v60;
    }
}
