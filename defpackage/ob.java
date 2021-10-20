package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: ob  reason: default package */
/* compiled from: ColorKeyframeAnimation */
public class ob extends sb<Integer> {
    public ob(List<bg<Integer>> list) {
        super(list);
    }

    public int o() {
        return p(b(), d());
    }

    public int p(bg<Integer> bgVar, float f) {
        A b;
        T t = bgVar.b;
        if (t == null || bgVar.c == null) {
            throw new IllegalStateException(C0201.m82(35076));
        }
        int intValue = t.intValue();
        int intValue2 = bgVar.c.intValue();
        dg<A> dgVar = this.e;
        if (dgVar == null || (b = dgVar.b(bgVar.e, bgVar.f.floatValue(), (A) Integer.valueOf(intValue), (A) Integer.valueOf(intValue2), f, e(), f())) == null) {
            return uf.c(zf.b(f, 0.0f, 1.0f), intValue, intValue2);
        }
        return b.intValue();
    }

    /* renamed from: q */
    public Integer i(bg<Integer> bgVar, float f) {
        return Integer.valueOf(p(bgVar, f));
    }
}
