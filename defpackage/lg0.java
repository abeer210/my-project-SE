package defpackage;

import android.util.Pair;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import vigqyno.C0201;

/* renamed from: lg0  reason: default package */
/* compiled from: MultiplexProducer */
public abstract class lg0<K, T extends Closeable> implements rg0<T> {
    public final Map<K, lg0<K, T>.b> a = new HashMap();
    private final rg0<T> b;

    /* access modifiers changed from: package-private */
    /* renamed from: lg0$b */
    /* compiled from: MultiplexProducer */
    public class b {
        private final K a;
        private final CopyOnWriteArraySet<Pair<sf0<T>, sg0>> b = b60.a();
        private T c;
        private float d;
        private int e;
        private lf0 f;
        private lg0<K, T>.b.C0151b g;

        /* access modifiers changed from: package-private */
        /* renamed from: lg0$b$a */
        /* compiled from: MultiplexProducer */
        public class a extends mf0 {
            public final /* synthetic */ Pair a;

            public a(Pair pair) {
                this.a = pair;
            }

            @Override // defpackage.tg0
            public void a() {
                boolean remove;
                List list;
                List list2;
                List list3;
                lf0 lf0;
                synchronized (b.this) {
                    remove = b.this.b.remove(this.a);
                    list = null;
                    if (!remove) {
                        lf0 = null;
                        list3 = null;
                    } else if (b.this.b.isEmpty()) {
                        lf0 = b.this.f;
                        list3 = null;
                    } else {
                        List s = b.this.s();
                        list3 = b.this.t();
                        list2 = b.this.r();
                        lf0 = null;
                        list = s;
                    }
                    list2 = list3;
                }
                lf0.k(list);
                lf0.l(list3);
                lf0.j(list2);
                if (lf0 != null) {
                    lf0.m();
                }
                if (remove) {
                    ((sf0) this.a.first).b();
                }
            }

            @Override // defpackage.mf0, defpackage.tg0
            public void b() {
                lf0.j(b.this.r());
            }

            @Override // defpackage.mf0, defpackage.tg0
            public void c() {
                lf0.l(b.this.t());
            }

            @Override // defpackage.mf0, defpackage.tg0
            public void d() {
                lf0.k(b.this.s());
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: lg0$b$b  reason: collision with other inner class name */
        /* compiled from: MultiplexProducer */
        public class C0151b extends jf0<T> {
            private C0151b() {
            }

            @Override // defpackage.jf0
            public void g() {
                try {
                    if (oh0.d()) {
                        oh0.a(C0201.m82(30638));
                    }
                    b.this.m(this);
                } finally {
                    if (oh0.d()) {
                        oh0.b();
                    }
                }
            }

            @Override // defpackage.jf0
            public void h(Throwable th) {
                try {
                    if (oh0.d()) {
                        oh0.a(C0201.m82(30639));
                    }
                    b.this.n(this, th);
                } finally {
                    if (oh0.d()) {
                        oh0.b();
                    }
                }
            }

            @Override // defpackage.jf0
            public void j(float f) {
                try {
                    if (oh0.d()) {
                        oh0.a(C0201.m82(30640));
                    }
                    b.this.p(this, f);
                } finally {
                    if (oh0.d()) {
                        oh0.b();
                    }
                }
            }

            /* renamed from: p */
            public void i(T t, int i) {
                try {
                    if (oh0.d()) {
                        oh0.a(C0201.m82(30641));
                    }
                    b.this.o(this, t, i);
                } finally {
                    if (oh0.d()) {
                        oh0.b();
                    }
                }
            }
        }

        public b(K k) {
            this.a = k;
        }

        private void g(Pair<sf0<T>, sg0> pair, sg0 sg0) {
            sg0.d(new a(pair));
        }

        private void i(Closeable closeable) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }

        private synchronized boolean j() {
            Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
            while (it.hasNext()) {
                if (((sg0) it.next().second).g()) {
                    return true;
                }
            }
            return false;
        }

        private synchronized boolean k() {
            Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
            while (it.hasNext()) {
                if (!((sg0) it.next().second).e()) {
                    return false;
                }
            }
            return true;
        }

        private synchronized qd0 l() {
            qd0 qd0;
            qd0 = qd0.LOW;
            Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
            while (it.hasNext()) {
                qd0 = qd0.b(qd0, ((sg0) it.next().second).b());
            }
            return qd0;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void q() {
            synchronized (this) {
                boolean z = true;
                z50.b(this.f == null);
                if (this.g != null) {
                    z = false;
                }
                z50.b(z);
                if (this.b.isEmpty()) {
                    lg0.this.j(this.a, this);
                    return;
                }
                sg0 sg0 = (sg0) this.b.iterator().next().second;
                this.f = new lf0(sg0.c(), sg0.t(), sg0.f(), sg0.a(), sg0.h(), k(), j(), l());
                lg0<K, T>.b.C0151b bVar = new C0151b();
                this.g = bVar;
                lg0.this.b.b(bVar, this.f);
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private synchronized List<tg0> r() {
            if (this.f == null) {
                return null;
            }
            return this.f.o(j());
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private synchronized List<tg0> s() {
            if (this.f == null) {
                return null;
            }
            return this.f.p(k());
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private synchronized List<tg0> t() {
            if (this.f == null) {
                return null;
            }
            return this.f.q(l());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: sf0<T extends java.io.Closeable> */
        /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: lg0 */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
            defpackage.lf0.k(r1);
            defpackage.lf0.l(r2);
            defpackage.lf0.j(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            monitor-enter(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
            if (r4 == r7.c) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0039, code lost:
            r4 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
            if (r4 == null) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
            r4 = r7.h.f(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
            monitor-exit(r7);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
            if (r4 == null) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
            if (r5 <= 0.0f) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
            r8.c(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
            r8.d(r4, r6);
            i(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
            g(r0, r9);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0059, code lost:
            return true;
         */
        public boolean h(sf0<T> sf0, sg0 sg0) {
            Pair<sf0<T>, sg0> create = Pair.create(sf0, sg0);
            synchronized (this) {
                if (lg0.this.h(this.a) != this) {
                    return false;
                }
                this.b.add(create);
                List<tg0> s = s();
                List<tg0> t = t();
                List<tg0> r = r();
                Closeable closeable = this.c;
                float f2 = this.d;
                int i = this.e;
            }
        }

        public void m(lg0<K, T>.b.C0151b bVar) {
            synchronized (this) {
                if (this.g == bVar) {
                    this.g = null;
                    this.f = null;
                    i(this.c);
                    this.c = null;
                    q();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x002e, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((defpackage.sf0) r0.first).a(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
            if (r3.hasNext() == false) goto L_0x003b;
         */
        public void n(lg0<K, T>.b.C0151b bVar, Throwable th) {
            synchronized (this) {
                if (this.g == bVar) {
                    Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
                    this.b.clear();
                    lg0.this.j(this.a, this);
                    i(this.c);
                    this.c = null;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
            if (r3.hasNext() == false) goto L_0x004c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            ((defpackage.sf0) r0.first).d(r4, r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
            return;
         */
        public void o(lg0<K, T>.b.C0151b bVar, T t, int i) {
            synchronized (this) {
                if (this.g == bVar) {
                    i(this.c);
                    this.c = null;
                    Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
                    if (jf0.f(i)) {
                        this.c = (T) lg0.this.f(t);
                        this.e = i;
                    } else {
                        this.b.clear();
                        lg0.this.j(this.a, this);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
            r0 = r3.next();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            monitor-enter(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            ((defpackage.sf0) r0.first).c(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0024, code lost:
            monitor-exit(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            if (r3.hasNext() == false) goto L_0x0029;
         */
        public void p(lg0<K, T>.b.C0151b bVar, float f2) {
            synchronized (this) {
                if (this.g == bVar) {
                    this.d = f2;
                    Iterator<Pair<sf0<T>, sg0>> it = this.b.iterator();
                }
            }
        }
    }

    public lg0(rg0<T> rg0) {
        this.b = rg0;
    }

    private synchronized lg0<K, T>.b g(K k) {
        lg0<K, T>.b bVar;
        bVar = new b(k);
        this.a.put(k, bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized lg0<K, T>.b h(K k) {
        return this.a.get(k);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private synchronized void j(K k, lg0<K, T>.b bVar) {
        if (this.a.get(k) == bVar) {
            this.a.remove(k);
        }
    }

    @Override // defpackage.rg0
    public void b(sf0<T> sf0, sg0 sg0) {
        boolean z;
        lg0<K, T>.b h;
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(19892));
            }
            K i = i(sg0);
            do {
                z = false;
                synchronized (this) {
                    h = h(i);
                    if (h == null) {
                        h = g(i);
                        z = true;
                    }
                }
            } while (!h.h(sf0, sg0));
            if (z) {
                h.q();
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public abstract T f(T t);

    public abstract K i(sg0 sg0);
}
