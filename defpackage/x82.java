package defpackage;

/* renamed from: x82  reason: default package */
/* compiled from: FinderPattern */
public final class x82 {
    private final int a;
    private final int[] b;
    private final v62[] c;

    public x82(int i, int[] iArr, int i2, int i3, int i4) {
        this.a = i;
        this.b = iArr;
        float f = (float) i4;
        this.c = new v62[]{new v62((float) i2, f), new v62((float) i3, f)};
    }

    public v62[] a() {
        return this.c;
    }

    public int[] b() {
        return this.b;
    }

    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof x82) && this.a == ((x82) obj).a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a;
    }
}
