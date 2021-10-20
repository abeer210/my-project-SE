package androidx.lifecycle;

import androidx.lifecycle.d;
import java.util.Map;
import vigqyno.C0201;

public abstract class LiveData<T> {
    public static final Object j = new Object();
    public final Object a = new Object();
    private i0<m<? super T>, LiveData<T>.b> b = new i0<>();
    public int c = 0;
    private volatile Object d = j;
    public volatile Object e = j;
    private int f = -1;
    private boolean g;
    private boolean h;
    private final Runnable i = new a();

    class LifecycleBoundObserver extends LiveData<T>.b implements Object {
        public final g e;

        public LifecycleBoundObserver(g gVar, m<? super T> mVar) {
            super(mVar);
            this.e = gVar;
        }

        public void c(g gVar, d.a aVar) {
            if (this.e.getLifecycle().b() == d.b.DESTROYED) {
                LiveData.this.k(this.a);
            } else {
                h(k());
            }
        }

        @Override // androidx.lifecycle.LiveData.b
        public void i() {
            this.e.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean j(g gVar) {
            return this.e == gVar;
        }

        @Override // androidx.lifecycle.LiveData.b
        public boolean k() {
            return this.e.getLifecycle().b().b(d.b.STARTED);
        }
    }

    class a implements Runnable {
        public a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: androidx.lifecycle.LiveData */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.e;
                LiveData.this.e = LiveData.j;
            }
            LiveData.this.l(obj);
        }
    }

    /* access modifiers changed from: private */
    public abstract class b {
        public final m<? super T> a;
        public boolean b;
        public int c = -1;

        public b(m<? super T> mVar) {
            this.a = mVar;
        }

        public void h(boolean z) {
            if (z != this.b) {
                this.b = z;
                int i = 1;
                boolean z2 = LiveData.this.c == 0;
                LiveData liveData = LiveData.this;
                int i2 = liveData.c;
                if (!this.b) {
                    i = -1;
                }
                liveData.c = i2 + i;
                if (z2 && this.b) {
                    LiveData.this.h();
                }
                LiveData liveData2 = LiveData.this;
                if (liveData2.c == 0 && !this.b) {
                    liveData2.i();
                }
                if (this.b) {
                    LiveData.this.d(this);
                }
            }
        }

        public void i() {
        }

        public boolean j(g gVar) {
            return false;
        }

        public abstract boolean k();
    }

    private static void b(String str) {
        if (!e0.c().a()) {
            throw new IllegalStateException(C0201.m82(13815) + str + C0201.m82(13816) + C0201.m82(13817));
        }
    }

    private void c(LiveData<T>.b bVar) {
        if (bVar.b) {
            if (!bVar.k()) {
                bVar.h(false);
                return;
            }
            int i2 = bVar.c;
            int i3 = this.f;
            if (i2 < i3) {
                bVar.c = i3;
                bVar.a.a((Object) this.d);
            }
        }
    }

    public void d(LiveData<T>.b bVar) {
        if (this.g) {
            this.h = true;
            return;
        }
        this.g = true;
        do {
            this.h = false;
            if (bVar == null) {
                i0<K, V>.d c2 = this.b.c();
                while (c2.hasNext()) {
                    c((b) ((Map.Entry) c2.next()).getValue());
                    if (this.h) {
                        break;
                    }
                }
            } else {
                c(bVar);
                bVar = null;
            }
        } while (this.h);
        this.g = false;
    }

    public T e() {
        T t = (T) this.d;
        if (t != j) {
            return t;
        }
        return null;
    }

    public boolean f() {
        return this.c > 0;
    }

    public void g(g gVar, m<? super T> mVar) {
        b(C0201.m82(13818));
        if (gVar.getLifecycle().b() != d.b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(gVar, mVar);
            LiveData<T>.b f2 = this.b.f(mVar, lifecycleBoundObserver);
            if (f2 != null && !f2.j(gVar)) {
                throw new IllegalArgumentException(C0201.m82(13819));
            } else if (f2 == null) {
                gVar.getLifecycle().a(lifecycleBoundObserver);
            }
        }
    }

    public void h() {
    }

    public void i() {
    }

    public void j(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.e == j;
            this.e = t;
        }
        if (z) {
            e0.c().b(this.i);
        }
    }

    public void k(m<? super T> mVar) {
        b(C0201.m82(13820));
        LiveData<T>.b g2 = this.b.g(mVar);
        if (g2 != null) {
            g2.i();
            g2.h(false);
        }
    }

    public void l(T t) {
        b(C0201.m82(13821));
        this.f++;
        this.d = t;
        d(null);
    }
}
