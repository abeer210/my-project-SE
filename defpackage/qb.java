package defpackage;

import java.util.List;

/* renamed from: qb  reason: default package */
/* compiled from: GradientColorKeyframeAnimation */
public class qb extends sb<ed> {
    private final ed i;

    public qb(List<bg<ed>> list) {
        super(list);
        int i2 = 0;
        T t = list.get(0).b;
        i2 = t != null ? t.c() : i2;
        this.i = new ed(new float[i2], new int[i2]);
    }

    /* renamed from: o */
    public ed i(bg<ed> bgVar, float f) {
        this.i.d(bgVar.b, bgVar.c, f);
        return this.i;
    }
}
