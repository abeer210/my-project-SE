package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: rb  reason: default package */
/* compiled from: IntegerKeyframeAnimation */
public class rb extends sb<Integer> {
    public rb(List<bg<Integer>> list) {
        super(list);
    }

    public int o() {
        return p(b(), d());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public int p(bg<Integer> bgVar, float f) {
        A b;
        if (bgVar.b == null || bgVar.c == null) {
            throw new IllegalStateException(C0201.m82(2508));
        }
        dg<A> dgVar = this.e;
        if (dgVar == null || (b = dgVar.b(bgVar.e, bgVar.f.floatValue(), bgVar.b, bgVar.c, f, e(), f())) == null) {
            return zf.k(bgVar.g(), bgVar.d(), f);
        }
        return b.intValue();
    }

    /* renamed from: q */
    public Integer i(bg<Integer> bgVar, float f) {
        return Integer.valueOf(p(bgVar, f));
    }
}
