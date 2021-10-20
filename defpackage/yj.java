package defpackage;

import java.util.Queue;

/* renamed from: yj  reason: default package */
/* compiled from: ModelCache */
public class yj<A, B> {
    private final bp<b<A>, B> a;

    /* renamed from: yj$a */
    /* compiled from: ModelCache */
    class a extends bp<b<A>, B> {
        public a(yj yjVar, long j) {
            super(j);
        }

        /* renamed from: n */
        public void j(b<A> bVar, B b) {
            bVar.c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: yj$b */
    /* compiled from: ModelCache */
    public static final class b<A> {
        private static final Queue<b<?>> d = fp.e(0);
        private int a;
        private int b;
        private A c;

        private b() {
        }

        public static <A> b<A> a(A a2, int i, int i2) {
            b<A> bVar;
            synchronized (d) {
                bVar = (b<A>) d.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a2, i, i2);
            return bVar;
        }

        private void b(A a2, int i, int i2) {
            this.c = a2;
            this.b = i;
            this.a = i2;
        }

        public void c() {
            synchronized (d) {
                d.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b == bVar.b && this.a == bVar.a && this.c.equals(bVar.c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
        }
    }

    public yj(long j) {
        this.a = new a(this, j);
    }

    public B a(A a2, int i, int i2) {
        b<A> a3 = b.a(a2, i, i2);
        B g = this.a.g(a3);
        a3.c();
        return g;
    }

    public void b(A a2, int i, int i2, B b2) {
        this.a.k(b.a(a2, i, i2), b2);
    }
}
