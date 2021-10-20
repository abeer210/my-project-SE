package defpackage;

import vigqyno.C0201;

/* renamed from: o92  reason: default package */
/* compiled from: AbstractExpandedDecoder */
public abstract class o92 {
    private final b72 a;
    private final x92 b;

    public o92(b72 b72) {
        this.a = b72;
        this.b = new x92(b72);
    }

    public static o92 a(b72 b72) {
        if (b72.c(1)) {
            return new l92(b72);
        }
        if (!b72.c(2)) {
            return new p92(b72);
        }
        int g = x92.g(b72, 1, 4);
        if (g == 4) {
            return new f92(b72);
        }
        if (g == 5) {
            return new g92(b72);
        }
        int g2 = x92.g(b72, 1, 5);
        if (g2 == 12) {
            return new h92(b72);
        }
        if (g2 == 13) {
            return new i92(b72);
        }
        int g3 = x92.g(b72, 1, 7);
        String r1 = C0201.m82(9944);
        String r2 = C0201.m82(9945);
        String r3 = C0201.m82(9946);
        String r4 = C0201.m82(9947);
        String r5 = C0201.m82(9948);
        String r6 = C0201.m82(9949);
        switch (g3) {
            case 56:
                return new j92(b72, r6, r4);
            case 57:
                return new j92(b72, r5, r4);
            case 58:
                return new j92(b72, r6, r3);
            case 59:
                return new j92(b72, r5, r3);
            case 60:
                return new j92(b72, r6, r2);
            case 61:
                return new j92(b72, r5, r2);
            case 62:
                return new j92(b72, r6, r1);
            case 63:
                return new j92(b72, r5, r1);
            default:
                throw new IllegalStateException(C0201.m82(9950).concat(String.valueOf(b72)));
        }
    }

    public final x92 b() {
        return this.b;
    }

    public final b72 c() {
        return this.a;
    }

    public abstract String d() throws o62, k62;
}
