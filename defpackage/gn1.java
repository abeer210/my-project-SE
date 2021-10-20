package defpackage;

import defpackage.kl1;

/* renamed from: gn1  reason: default package */
public final class gn1 implements rm1 {
    private final tm1 a;
    private final String b;
    private final Object[] c;
    private final int d;

    public gn1(tm1 tm1, String str, Object[] objArr) {
        this.a = tm1;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = i | (charAt2 << i2);
                return;
            }
        }
    }

    @Override // defpackage.rm1
    public final tm1 a() {
        return this.a;
    }

    @Override // defpackage.rm1
    public final int b() {
        return (this.d & 1) == 1 ? kl1.f.i : kl1.f.j;
    }

    @Override // defpackage.rm1
    public final boolean c() {
        return (this.d & 2) == 2;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
