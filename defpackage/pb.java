package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: pb  reason: default package */
/* compiled from: FloatKeyframeAnimation */
public class pb extends sb<Float> {
    public pb(List<bg<Float>> list) {
        super(list);
    }

    public float o() {
        return p(b(), d());
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [T, java.lang.Object] */
    public float p(bg<Float> bgVar, float f) {
        A b;
        if (bgVar.b == null || bgVar.c == null) {
            throw new IllegalStateException(C0201.m82(36760));
        }
        dg<A> dgVar = this.e;
        if (dgVar == null || (b = dgVar.b(bgVar.e, bgVar.f.floatValue(), bgVar.b, bgVar.c, f, e(), f())) == null) {
            return zf.j(bgVar.f(), bgVar.c(), f);
        }
        return b.floatValue();
    }

    /* renamed from: q */
    public Float i(bg<Float> bgVar, float f) {
        return Float.valueOf(p(bgVar, f));
    }
}
