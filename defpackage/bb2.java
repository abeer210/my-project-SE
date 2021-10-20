package defpackage;

/* renamed from: bb2  reason: default package */
/* compiled from: AlignmentPattern */
public final class bb2 extends v62 {
    private final float c;

    public bb2(float f, float f2, float f3) {
        super(f, f2);
        this.c = f3;
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

    public bb2 g(float f, float f2, float f3) {
        return new bb2((c() + f2) / 2.0f, (d() + f) / 2.0f, (this.c + f3) / 2.0f);
    }
}
