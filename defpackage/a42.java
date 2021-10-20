package defpackage;

import java.io.IOException;

/* renamed from: a42  reason: default package */
/* compiled from: TreeTypeAdapter */
public final class a42<T> extends x22<T> {
    private final v22<T> a;
    public final k22 b;
    private final g42<T> c;
    private final y22 d;
    private final a42<T>.b e = new b();
    private x22<T> f;

    /* renamed from: a42$b */
    /* compiled from: TreeTypeAdapter */
    private final class b implements u22 {
        private b(a42 a42) {
        }
    }

    public a42(v22<T> v22, n22<T> n22, k22 k22, g42<T> g42, y22 y22) {
        this.a = v22;
        this.b = k22;
        this.c = g42;
        this.d = y22;
    }

    private x22<T> d() {
        x22<T> x22 = this.f;
        if (x22 != null) {
            return x22;
        }
        x22<T> h = this.b.h(this.d, this.c);
        this.f = h;
        return h;
    }

    @Override // defpackage.x22
    public void c(h42 h42, T t) throws IOException {
        v22<T> v22 = this.a;
        if (v22 == null) {
            d().c(h42, t);
        } else if (t == null) {
            h42.x();
        } else {
            o32.a(v22.a(t, this.c.e(), this.e), h42);
        }
    }
}
