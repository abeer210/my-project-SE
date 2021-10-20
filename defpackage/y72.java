package defpackage;

/* renamed from: y72  reason: default package */
/* compiled from: Version */
public final class y72 {
    private static final y72[] h = a();
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final c f;
    private final int g;

    /* access modifiers changed from: package-private */
    /* renamed from: y72$b */
    /* compiled from: Version */
    public static final class b {
        private final int a;
        private final int b;

        public int a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        private b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    private y72(int i, int i2, int i3, int i4, int i5, c cVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = cVar;
        int b2 = cVar.b();
        b[] a2 = cVar.a();
        int i6 = 0;
        for (b bVar : a2) {
            i6 += bVar.a() * (bVar.b() + b2);
        }
        this.g = i6;
    }

    private static y72[] a() {
        return new y72[]{new y72(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new y72(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new y72(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new y72(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new y72(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new y72(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new y72(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new y72(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new y72(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new y72(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new y72(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new y72(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new y72(13, 44, 44, 20, 20, new c(56, new b(1, 144))), new y72(14, 48, 48, 22, 22, new c(68, new b(1, 174))), new y72(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new y72(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new y72(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new y72(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new y72(19, 88, 88, 20, 20, new c(56, new b(4, 144))), new y72(20, 96, 96, 22, 22, new c(68, new b(4, 174))), new y72(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new y72(22, 120, 120, 18, 18, new c(68, new b(6, 175))), new y72(23, 132, 132, 20, 20, new c(62, new b(8, 163))), new y72(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new y72(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new y72(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new y72(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new y72(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new y72(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new y72(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static y72 h(int i, int i2) throws k62 {
        if ((i & 1) == 0 && (i2 & 1) == 0) {
            y72[] y72Arr = h;
            for (y72 y72 : y72Arr) {
                if (y72.b == i && y72.c == i2) {
                    return y72;
                }
            }
            throw k62.a();
        }
        throw k62.a();
    }

    public int b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public c d() {
        return this.f;
    }

    public int e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public int g() {
        return this.g;
    }

    public int i() {
        return this.a;
    }

    public String toString() {
        return String.valueOf(this.a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y72$c */
    /* compiled from: Version */
    public static final class c {
        private final int a;
        private final b[] b;

        public b[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }

        private c(int i, b bVar) {
            this.a = i;
            this.b = new b[]{bVar};
        }

        private c(int i, b bVar, b bVar2) {
            this.a = i;
            this.b = new b[]{bVar, bVar2};
        }
    }
}
