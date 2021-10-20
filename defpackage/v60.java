package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* renamed from: v60  reason: default package */
/* compiled from: CloseableReference */
public final class v60<T> implements Cloneable, Closeable {
    private static Class<v60> e = v60.class;
    private static final x60<Closeable> f = new a();
    private static final c g = new b();
    private boolean a = false;
    private final y60<T> b;
    private final c c;
    private final Throwable d;

    /* renamed from: v60$a */
    /* compiled from: CloseableReference */
    static class a implements x60<Closeable> {
        /* renamed from: b */
        public void a(Closeable closeable) {
            try {
                s50.a(closeable, true);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: v60$b */
    /* compiled from: CloseableReference */
    static class b implements c {
        @Override // defpackage.v60.c
        public void a(y60<Object> y60, Throwable th) {
            f60.y(v60.e, C0201.m82(6234), Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(y60)), y60.f().getClass().getName());
        }

        @Override // defpackage.v60.c
        public boolean b() {
            return false;
        }
    }

    /* renamed from: v60$c */
    /* compiled from: CloseableReference */
    public interface c {
        void a(y60<Object> y60, Throwable th);

        boolean b();
    }

    private v60(y60<T> y60, c cVar, Throwable th) {
        z50.g(y60);
        this.b = y60;
        y60.b();
        this.c = cVar;
        this.d = th;
    }

    public static <T extends Closeable> v60<T> B(T t) {
        return F(t, f);
    }

    public static <T extends Closeable> v60<T> D(T t, c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        x60<Closeable> x60 = f;
        if (cVar.b()) {
            th = new Throwable();
        }
        return new v60<>(t, x60, cVar, th);
    }

    public static <T> v60<T> F(T t, x60<T> x60) {
        return G(t, x60, g);
    }

    public static <T> v60<T> G(T t, x60<T> x60, c cVar) {
        Throwable th = null;
        if (t == null) {
            return null;
        }
        if (cVar.b()) {
            th = new Throwable();
        }
        return new v60<>(t, x60, cVar, th);
    }

    public static <T> v60<T> n(v60<T> v60) {
        if (v60 != null) {
            return v60.m();
        }
        return null;
    }

    public static <T> List<v60<T>> o(Collection<v60<T>> collection) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (v60<T> v60 : collection) {
            arrayList.add(n(v60));
        }
        return arrayList;
    }

    public static void s(v60<?> v60) {
        if (v60 != null) {
            v60.close();
        }
    }

    public static void u(Iterable<? extends v60<?>> iterable) {
        if (iterable != null) {
            Iterator<? extends v60<?>> it = iterable.iterator();
            while (it.hasNext()) {
                s((v60) it.next());
            }
        }
    }

    public static boolean z(v60<?> v60) {
        return v60 != null && v60.y();
    }

    /* renamed from: c */
    public synchronized v60<T> clone() {
        z50.i(y());
        return new v60<>(this.b, this.c, this.d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (!this.a) {
                this.a = true;
                this.b.d();
            }
        }
    }

    @Override // java.lang.Object
    public void finalize() throws Throwable {
        try {
            synchronized (this) {
                if (!this.a) {
                    this.c.a(this.b, this.d);
                    close();
                    super.finalize();
                }
            }
        } finally {
            super.finalize();
        }
    }

    public synchronized v60<T> m() {
        if (!y()) {
            return null;
        }
        return clone();
    }

    public synchronized T w() {
        z50.i(!this.a);
        return this.b.f();
    }

    public int x() {
        if (y()) {
            return System.identityHashCode(this.b.f());
        }
        return 0;
    }

    public synchronized boolean y() {
        return !this.a;
    }

    private v60(T t, x60<T> x60, c cVar, Throwable th) {
        this.b = new y60<>(t, x60);
        this.c = cVar;
        this.d = th;
    }
}
