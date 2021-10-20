package defpackage;

import vigqyno.C0201;

/* renamed from: ed  reason: default package */
/* compiled from: GradientColor */
public class ed {
    private final float[] a;
    private final int[] b;

    public ed(float[] fArr, int[] iArr) {
        this.a = fArr;
        this.b = iArr;
    }

    public int[] a() {
        return this.b;
    }

    public float[] b() {
        return this.a;
    }

    public int c() {
        return this.b.length;
    }

    public void d(ed edVar, ed edVar2, float f) {
        if (edVar.b.length == edVar2.b.length) {
            for (int i = 0; i < edVar.b.length; i++) {
                this.a[i] = zf.j(edVar.a[i], edVar2.a[i], f);
                this.b[i] = uf.c(f, edVar.b[i], edVar2.b[i]);
            }
            return;
        }
        throw new IllegalArgumentException(C0201.m82(12239) + edVar.b.length + C0201.m82(12240) + edVar2.b.length + C0201.m82(12241));
    }
}
