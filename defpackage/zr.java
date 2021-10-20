package defpackage;

import vigqyno.C0201;

/* renamed from: zr  reason: default package */
/* compiled from: Tag */
public class zr {
    private final int a;
    private final tr b;

    public zr(int i, tr trVar) {
        this.a = i;
        this.b = trVar;
    }

    public String a() {
        return this.b.f(this.a);
    }

    public String b() {
        return this.b.v(this.a);
    }

    public int c() {
        return this.a;
    }

    public String toString() {
        String a2 = a();
        if (a2 == null) {
            a2 = this.b.r(c()) + C0201.m82(22543);
        }
        return C0201.m82(22544) + this.b.n() + C0201.m82(22545) + b() + C0201.m82(22546) + a2;
    }
}
