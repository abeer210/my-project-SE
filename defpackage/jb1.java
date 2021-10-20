package defpackage;

import defpackage.l91;

/* renamed from: jb1  reason: default package */
public final class jb1 implements ua1 {
    private final wa1 a;
    private final String b;
    private final Object[] c;
    private final int d;

    public jb1(wa1 wa1, String str, Object[] objArr) {
        this.a = wa1;
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

    @Override // defpackage.ua1
    public final wa1 a() {
        return this.a;
    }

    @Override // defpackage.ua1
    public final boolean b() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.ua1
    public final int c() {
        return (this.d & 1) == 1 ? l91.d.i : l91.d.j;
    }

    public final String d() {
        return this.b;
    }

    public final Object[] e() {
        return this.c;
    }
}
