package defpackage;

import java.util.Map;

/* renamed from: p82  reason: default package */
/* compiled from: UPCAReader */
public final class p82 extends t82 {
    private final t82 h = new i82();

    private static t62 s(t62 t62) throws k62 {
        String f = t62.f();
        if (f.charAt(0) == '0') {
            t62 t622 = new t62(f.substring(1), null, t62.e(), f62.UPC_A);
            if (t62.d() != null) {
                t622.g(t62.d());
            }
            return t622;
        }
        throw k62.a();
    }

    @Override // defpackage.o82, defpackage.r62
    public t62 b(h62 h62, Map<j62, ?> map) throws o62, k62 {
        return s(this.h.b(h62, map));
    }

    @Override // defpackage.o82, defpackage.t82
    public t62 c(int i, b72 b72, Map<j62, ?> map) throws o62, k62, i62 {
        return s(this.h.c(i, b72, map));
    }

    @Override // defpackage.t82
    public int l(b72 b72, int[] iArr, StringBuilder sb) throws o62 {
        return this.h.l(b72, iArr, sb);
    }

    @Override // defpackage.t82
    public t62 m(int i, b72 b72, int[] iArr, Map<j62, ?> map) throws o62, k62, i62 {
        return s(this.h.m(i, b72, iArr, map));
    }

    @Override // defpackage.t82
    public f62 q() {
        return f62.UPC_A;
    }
}
