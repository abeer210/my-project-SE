package defpackage;

import defpackage.y50;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

/* renamed from: r70  reason: default package */
/* compiled from: IncreasingQualityDataSourceSupplier */
public class r70<T> implements c60<n70<T>> {
    private final List<c60<n70<T>>> a;
    private final boolean b;

    /* access modifiers changed from: private */
    /* renamed from: r70$a */
    /* compiled from: IncreasingQualityDataSourceSupplier */
    public class a extends l70<T> {
        private ArrayList<n70<T>> g;
        private int h;
        private int i;
        private AtomicInteger j;
        private Throwable k;

        /* access modifiers changed from: private */
        /* renamed from: r70$a$a  reason: collision with other inner class name */
        /* compiled from: IncreasingQualityDataSourceSupplier */
        public class C0169a implements p70<T> {
            private int a;

            public C0169a(int i) {
                this.a = i;
            }

            @Override // defpackage.p70
            public void a(n70<T> n70) {
            }

            @Override // defpackage.p70
            public void b(n70<T> n70) {
                a.this.D(this.a, n70);
            }

            @Override // defpackage.p70
            public void c(n70<T> n70) {
                if (n70.a()) {
                    a.this.E(this.a, n70);
                } else if (n70.b()) {
                    a.this.D(this.a, n70);
                }
            }

            @Override // defpackage.p70
            public void d(n70<T> n70) {
                if (this.a == 0) {
                    a.this.p(n70.d());
                }
            }
        }

        public a() {
            if (!r70.this.b) {
                x();
            }
        }

        private synchronized n70<T> A() {
            return z(this.h);
        }

        private void B() {
            Throwable th;
            if (this.j.incrementAndGet() == this.i && (th = this.k) != null) {
                n(th);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (r0 <= r4) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            w(y(r0));
            r0 = r0 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
            return;
         */
        private void C(int i2, n70<T> n70, boolean z) {
            synchronized (this) {
                int i3 = this.h;
                int i4 = this.h;
                if (n70 == z(i2)) {
                    if (i2 != this.h) {
                        if (A() != null) {
                            if (!z || i2 >= this.h) {
                                i2 = i4;
                            }
                        }
                        this.h = i2;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void D(int i2, n70<T> n70) {
            w(F(i2, n70));
            if (i2 == 0) {
                this.k = n70.c();
            }
            B();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void E(int i2, n70<T> n70) {
            C(i2, n70, n70.b());
            if (n70 == A()) {
                r(null, i2 == 0 && n70.b());
            }
            B();
        }

        private synchronized n70<T> F(int i2, n70<T> n70) {
            if (n70 == A()) {
                return null;
            }
            if (n70 != z(i2)) {
                return n70;
            }
            return y(i2);
        }

        private void w(n70<T> n70) {
            if (n70 != null) {
                n70.close();
            }
        }

        private void x() {
            if (this.j == null) {
                synchronized (this) {
                    if (this.j == null) {
                        int i2 = 0;
                        this.j = new AtomicInteger(0);
                        int size = r70.this.a.size();
                        this.i = size;
                        this.h = size;
                        this.g = new ArrayList<>(size);
                        while (true) {
                            if (i2 >= size) {
                                break;
                            }
                            n70<T> n70 = (n70) ((c60) r70.this.a.get(i2)).get();
                            this.g.add(n70);
                            n70.g(new C0169a(i2), h50.a());
                            if (n70.a()) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }

        private synchronized n70<T> y(int i2) {
            n70<T> n70;
            n70 = null;
            if (this.g != null && i2 < this.g.size()) {
                n70 = this.g.set(i2, null);
            }
            return n70;
        }

        private synchronized n70<T> z(int i2) {
            return (this.g == null || i2 >= this.g.size()) ? null : this.g.get(i2);
        }

        @Override // defpackage.l70, defpackage.n70
        public synchronized boolean a() {
            n70<T> A;
            if (r70.this.b) {
                x();
            }
            A = A();
            return A != null && A.a();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
            if (r0 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
            if (r1 >= r0.size()) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
            w(r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return true;
         */
        @Override // defpackage.l70, defpackage.n70
        public boolean close() {
            if (r70.this.b) {
                x();
            }
            synchronized (this) {
                int i2 = 0;
                if (!super.close()) {
                    return false;
                }
                ArrayList<n70<T>> arrayList = this.g;
                this.g = null;
            }
        }

        @Override // defpackage.l70, defpackage.n70
        public synchronized T f() {
            n70<T> A;
            if (r70.this.b) {
                x();
            }
            A = A();
            return A != null ? A.f() : null;
        }
    }

    private r70(List<c60<n70<T>>> list, boolean z) {
        z50.c(!list.isEmpty(), C0201.m82(23886));
        this.a = list;
        this.b = z;
    }

    public static <T> r70<T> c(List<c60<n70<T>>> list, boolean z) {
        return new r70<>(list, z);
    }

    /* renamed from: d */
    public n70<T> get() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r70)) {
            return false;
        }
        return y50.a(this.a, ((r70) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        y50.b d = y50.d(this);
        d.b(C0201.m82(23887), this.a);
        return d.toString();
    }
}
