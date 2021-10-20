package defpackage;

import defpackage.y50;
import java.util.List;
import vigqyno.C0201;

/* renamed from: q70  reason: default package */
/* compiled from: FirstAvailableDataSourceSupplier */
public class q70<T> implements c60<n70<T>> {
    private final List<c60<n70<T>>> a;

    /* access modifiers changed from: private */
    /* renamed from: q70$b */
    /* compiled from: FirstAvailableDataSourceSupplier */
    public class b extends l70<T> {
        private int g = 0;
        private n70<T> h = null;
        private n70<T> i = null;

        /* access modifiers changed from: private */
        /* renamed from: q70$b$a */
        /* compiled from: FirstAvailableDataSourceSupplier */
        public class a implements p70<T> {
            private a() {
            }

            @Override // defpackage.p70
            public void a(n70<T> n70) {
            }

            @Override // defpackage.p70
            public void b(n70<T> n70) {
                b.this.B(n70);
            }

            @Override // defpackage.p70
            public void c(n70<T> n70) {
                if (n70.a()) {
                    b.this.C(n70);
                } else if (n70.b()) {
                    b.this.B(n70);
                }
            }

            @Override // defpackage.p70
            public void d(n70<T> n70) {
                b.this.p(Math.max(b.this.d(), n70.d()));
            }
        }

        public b() {
            if (!E()) {
                n(new RuntimeException(C0201.m82(19893)));
            }
        }

        private void A(n70<T> n70, boolean z) {
            n70<T> n702;
            synchronized (this) {
                if (n70 == this.h) {
                    if (n70 != this.i) {
                        if (this.i != null) {
                            if (!z) {
                                n702 = null;
                                x(n702);
                            }
                        }
                        n70<T> n703 = this.i;
                        this.i = n70;
                        n702 = n703;
                        x(n702);
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void B(n70<T> n70) {
            if (w(n70)) {
                if (n70 != y()) {
                    x(n70);
                }
                if (!E()) {
                    n(n70.c());
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void C(n70<T> n70) {
            A(n70, n70.b());
            if (n70 == y()) {
                r(null, n70.b());
            }
        }

        private synchronized boolean D(n70<T> n70) {
            if (j()) {
                return false;
            }
            this.h = n70;
            return true;
        }

        private boolean E() {
            c60<n70<T>> z = z();
            n70<T> n70 = z != null ? z.get() : null;
            if (!D(n70) || n70 == null) {
                x(n70);
                return false;
            }
            n70.g(new a(), h50.a());
            return true;
        }

        private synchronized boolean w(n70<T> n70) {
            if (!j()) {
                if (n70 == this.h) {
                    this.h = null;
                    return true;
                }
            }
            return false;
        }

        private void x(n70<T> n70) {
            if (n70 != null) {
                n70.close();
            }
        }

        private synchronized n70<T> y() {
            return this.i;
        }

        private synchronized c60<n70<T>> z() {
            if (j() || this.g >= q70.this.a.size()) {
                return null;
            }
            List list = q70.this.a;
            int i2 = this.g;
            this.g = i2 + 1;
            return (c60) list.get(i2);
        }

        @Override // defpackage.l70, defpackage.n70
        public synchronized boolean a() {
            n70<T> y;
            y = y();
            return y != null && y.a();
        }

        @Override // defpackage.l70, defpackage.n70
        public boolean close() {
            synchronized (this) {
                if (!super.close()) {
                    return false;
                }
                n70<T> n70 = this.h;
                this.h = null;
                n70<T> n702 = this.i;
                this.i = null;
                x(n702);
                x(n70);
                return true;
            }
        }

        @Override // defpackage.l70, defpackage.n70
        public synchronized T f() {
            n70<T> y;
            y = y();
            return y != null ? y.f() : null;
        }
    }

    private q70(List<c60<n70<T>>> list) {
        z50.c(!list.isEmpty(), C0201.m82(26580));
        this.a = list;
    }

    public static <T> q70<T> b(List<c60<n70<T>>> list) {
        return new q70<>(list);
    }

    /* renamed from: c */
    public n70<T> get() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q70)) {
            return false;
        }
        return y50.a(this.a, ((q70) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        y50.b d = y50.d(this);
        d.b(C0201.m82(26581), this.a);
        return d.toString();
    }
}
