package defpackage;

import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: q20  reason: default package */
/* compiled from: SessionSplitConfiguration */
public final class q20 {
    public static final q20 d = a().d();
    private final int a;
    private final int b;
    private final int c;

    /* renamed from: q20$b */
    /* compiled from: SessionSplitConfiguration */
    public static class b {
        private int a = 360;
        private int b = 600;
        private int c = 200;

        public q20 d() {
            return new q20(this);
        }

        public b e(int i) {
            this.b = i;
            return this;
        }

        public b f(int i) {
            this.c = i;
            return this;
        }

        public b g(int i) {
            this.a = i;
            return this;
        }
    }

    public static b a() {
        return new b();
    }

    public long b() {
        return (long) (this.b * C0188.f18);
    }

    public long c() {
        return (long) this.b;
    }

    public int d() {
        return this.c;
    }

    public long e() {
        return (long) this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q20.class != obj.getClass()) {
            return false;
        }
        q20 q20 = (q20) obj;
        if (this.a == q20.a && this.b == q20.b && this.c == q20.c) {
            return true;
        }
        return false;
    }

    public long f() {
        return (long) (this.a * 60 * C0188.f18);
    }

    public int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }

    public String toString() {
        return C0201.m82(18512) + this.a + C0201.m82(18513) + this.b + C0201.m82(18514) + this.c + '}';
    }

    private q20(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}
