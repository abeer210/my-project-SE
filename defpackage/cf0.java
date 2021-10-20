package defpackage;

import vigqyno.C0188;

/* renamed from: cf0  reason: default package */
/* compiled from: ImmutableQualityInfo */
public class cf0 implements df0 {
    public static final df0 d = d(C0188.f24, true, true);
    public int a;
    public boolean b;
    public boolean c;

    private cf0(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    public static df0 d(int i, boolean z, boolean z2) {
        return new cf0(i, z, z2);
    }

    @Override // defpackage.df0
    public boolean a() {
        return this.c;
    }

    @Override // defpackage.df0
    public boolean b() {
        return this.b;
    }

    @Override // defpackage.df0
    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf0)) {
            return false;
        }
        cf0 cf0 = (cf0) obj;
        if (this.a == cf0.a && this.b == cf0.b && this.c == cf0.c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.a ^ (this.b ? 4194304 : 0);
        if (this.c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
