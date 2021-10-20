package defpackage;

import vigqyno.C0201;

/* renamed from: j93  reason: default package */
/* compiled from: WOTSPlusParameters */
public final class j93 {
    private final r93 a;
    private final m63 b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;

    public j93(m63 m63) {
        if (m63 != null) {
            this.b = m63;
            int h = v93.h(m63);
            this.c = h;
            this.d = 16;
            double d2 = (double) (h * 8);
            double n = (double) v93.n(16);
            Double.isNaN(d2);
            Double.isNaN(n);
            int ceil = (int) Math.ceil(d2 / n);
            this.f = ceil;
            int floor = ((int) Math.floor((double) (v93.n(ceil * (this.d - 1)) / v93.n(this.d)))) + 1;
            this.g = floor;
            this.e = this.f + floor;
            i93 b2 = i93.b(m63.d(), this.c, this.d, this.e);
            this.a = b2;
            if (b2 == null) {
                throw new IllegalArgumentException(C0201.m82(1743) + m63.d());
            }
            return;
        }
        throw new NullPointerException(C0201.m82(1744));
    }

    public m63 a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.d;
    }
}
