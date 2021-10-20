package defpackage;

import java.io.IOException;

/* renamed from: ij1  reason: default package */
public final class ij1 extends bp1<ij1> {
    public Float c = null;
    public Float d = null;
    public Float e = null;
    public Float f = null;
    public Float g = null;
    public Float h = null;

    public ij1() {
        this.a = -1;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 13) {
                this.c = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (l == 21) {
                this.d = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (l == 29) {
                this.e = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (l == 37) {
                this.f = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (l == 45) {
                this.g = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (l == 53) {
                this.h = Float.valueOf(Float.intBitsToFloat(yo1.o()));
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        Float f2 = this.c;
        if (f2 != null) {
            zo1.b(1, f2.floatValue());
        }
        Float f3 = this.d;
        if (f3 != null) {
            zo1.b(2, f3.floatValue());
        }
        Float f4 = this.e;
        if (f4 != null) {
            zo1.b(3, f4.floatValue());
        }
        Float f5 = this.f;
        if (f5 != null) {
            zo1.b(4, f5.floatValue());
        }
        Float f6 = this.g;
        if (f6 != null) {
            zo1.b(5, f6.floatValue());
        }
        Float f7 = this.h;
        if (f7 != null) {
            zo1.b(6, f7.floatValue());
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h2 = super.h();
        Float f2 = this.c;
        if (f2 != null) {
            f2.floatValue();
            h2 += zo1.e(1) + 4;
        }
        Float f3 = this.d;
        if (f3 != null) {
            f3.floatValue();
            h2 += zo1.e(2) + 4;
        }
        Float f4 = this.e;
        if (f4 != null) {
            f4.floatValue();
            h2 += zo1.e(3) + 4;
        }
        Float f5 = this.f;
        if (f5 != null) {
            f5.floatValue();
            h2 += zo1.e(4) + 4;
        }
        Float f6 = this.g;
        if (f6 != null) {
            f6.floatValue();
            h2 += zo1.e(5) + 4;
        }
        Float f7 = this.h;
        if (f7 == null) {
            return h2;
        }
        f7.floatValue();
        return h2 + zo1.e(6) + 4;
    }
}
