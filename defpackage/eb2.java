package defpackage;

/* renamed from: eb2  reason: default package */
/* compiled from: FinderPattern */
public final class eb2 extends v62 {
    private final float c;
    private final int d;

    public eb2(float f, float f2, float f3) {
        this(f, f2, f3, 1);
    }

    public boolean f(float f, float f2, float f3) {
        if (Math.abs(f2 - d()) > f || Math.abs(f3 - c()) > f) {
            return false;
        }
        float abs = Math.abs(f - this.c);
        if (abs <= 1.0f || abs <= this.c) {
            return true;
        }
        return false;
    }

    public eb2 g(float f, float f2, float f3) {
        int i = this.d;
        int i2 = i + 1;
        float c2 = (((float) i) * c()) + f2;
        float f4 = (float) i2;
        return new eb2(c2 / f4, ((((float) this.d) * d()) + f) / f4, ((((float) this.d) * this.c) + f3) / f4, i2);
    }

    public int h() {
        return this.d;
    }

    public float i() {
        return this.c;
    }

    private eb2(float f, float f2, float f3, int i) {
        super(f, f2);
        this.c = f3;
        this.d = i;
    }
}
