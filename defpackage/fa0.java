package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: fa0  reason: default package */
/* compiled from: RoundingParams */
public class fa0 {
    private a a = a.BITMAP_ONLY;
    private boolean b = false;
    private float[] c = null;
    private int d = 0;
    private float e = 0.0f;
    private int f = 0;
    private float g = 0.0f;
    private boolean h = false;
    private boolean i = false;

    /* renamed from: fa0$a */
    /* compiled from: RoundingParams */
    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static fa0 a(float f2) {
        fa0 fa0 = new fa0();
        fa0.p(f2);
        return fa0;
    }

    private float[] e() {
        if (this.c == null) {
            this.c = new float[8];
        }
        return this.c;
    }

    public int b() {
        return this.f;
    }

    public float c() {
        return this.e;
    }

    public float[] d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fa0.class != obj.getClass()) {
            return false;
        }
        fa0 fa0 = (fa0) obj;
        if (this.b == fa0.b && this.d == fa0.d && Float.compare(fa0.e, this.e) == 0 && this.f == fa0.f && Float.compare(fa0.g, this.g) == 0 && this.a == fa0.a && this.h == fa0.h && this.i == fa0.i) {
            return Arrays.equals(this.c, fa0.c);
        }
        return false;
    }

    public int f() {
        return this.d;
    }

    public float g() {
        return this.g;
    }

    public boolean h() {
        return this.i;
    }

    public int hashCode() {
        a aVar = this.a;
        int i2 = 0;
        int hashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int hashCode2 = (((hashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f2 = this.e;
        int floatToIntBits = (((hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31) + this.f) * 31;
        float f3 = this.g;
        if (f3 != 0.0f) {
            i2 = Float.floatToIntBits(f3);
        }
        return ((((floatToIntBits + i2) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }

    public boolean i() {
        return this.b;
    }

    public a j() {
        return this.a;
    }

    public boolean k() {
        return this.h;
    }

    public fa0 l(int i2, float f2) {
        z50.c(f2 >= 0.0f, C0201.m82(8611));
        this.e = f2;
        this.f = i2;
        return this;
    }

    public fa0 m(int i2) {
        this.f = i2;
        return this;
    }

    public fa0 n(float f2) {
        z50.c(f2 >= 0.0f, C0201.m82(8612));
        this.e = f2;
        return this;
    }

    public fa0 o(float f2, float f3, float f4, float f5) {
        float[] e2 = e();
        e2[1] = f2;
        e2[0] = f2;
        e2[3] = f3;
        e2[2] = f3;
        e2[5] = f4;
        e2[4] = f4;
        e2[7] = f5;
        e2[6] = f5;
        return this;
    }

    public fa0 p(float f2) {
        Arrays.fill(e(), f2);
        return this;
    }

    public fa0 q(int i2) {
        this.d = i2;
        this.a = a.OVERLAY_COLOR;
        return this;
    }

    public fa0 r(float f2) {
        z50.c(f2 >= 0.0f, C0201.m82(8613));
        this.g = f2;
        return this;
    }

    public fa0 s(boolean z) {
        this.b = z;
        return this;
    }

    public fa0 t(a aVar) {
        this.a = aVar;
        return this;
    }
}
