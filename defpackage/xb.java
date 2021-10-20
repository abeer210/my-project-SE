package defpackage;

import java.util.List;
import vigqyno.C0201;

/* renamed from: xb  reason: default package */
/* compiled from: ScaleKeyframeAnimation */
public class xb extends sb<eg> {
    private final eg i = new eg();

    public xb(List<bg<eg>> list) {
        super(list);
    }

    /* renamed from: o */
    public eg i(bg<eg> bgVar, float f) {
        T t;
        A b;
        T t2 = bgVar.b;
        if (t2 == null || (t = bgVar.c) == null) {
            throw new IllegalStateException(C0201.m82(16993));
        }
        T t3 = t2;
        T t4 = t;
        dg<A> dgVar = this.e;
        if (dgVar != null && (b = dgVar.b(bgVar.e, bgVar.f.floatValue(), t3, t4, f, e(), f())) != null) {
            return b;
        }
        this.i.d(zf.j(t3.b(), t4.b(), f), zf.j(t3.c(), t4.c(), f));
        return this.i;
    }
}
