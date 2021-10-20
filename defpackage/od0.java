package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import vigqyno.C0201;

/* renamed from: od0  reason: default package */
/* compiled from: ImageDecodeOptions */
public class od0 {
    private static final od0 j = b().a();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Bitmap.Config f;
    public final qe0 g;
    public final xh0 h;
    public final ColorSpace i;

    public od0(pd0 pd0) {
        this.a = pd0.i();
        this.b = pd0.g();
        this.c = pd0.j();
        this.d = pd0.f();
        this.e = pd0.h();
        this.f = pd0.b();
        this.g = pd0.e();
        this.h = pd0.c();
        this.i = pd0.d();
    }

    public static od0 a() {
        return j;
    }

    public static pd0 b() {
        return new pd0();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || od0.class != obj.getClass()) {
            return false;
        }
        od0 od0 = (od0) obj;
        return this.b == od0.b && this.c == od0.c && this.d == od0.d && this.e == od0.e && this.f == od0.f && this.g == od0.g && this.h == od0.h && this.i == od0.i;
    }

    public int hashCode() {
        int ordinal = ((((((((((this.a * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + this.f.ordinal()) * 31;
        qe0 qe0 = this.g;
        int i2 = 0;
        int hashCode = (ordinal + (qe0 != null ? qe0.hashCode() : 0)) * 31;
        xh0 xh0 = this.h;
        int hashCode2 = (hashCode + (xh0 != null ? xh0.hashCode() : 0)) * 31;
        ColorSpace colorSpace = this.i;
        if (colorSpace != null) {
            i2 = colorSpace.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        return String.format(null, C0201.m82(25512), Integer.valueOf(this.a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f.name(), this.g, this.h, this.i);
    }
}
