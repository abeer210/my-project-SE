package defpackage;

import java.math.BigInteger;
import vigqyno.C0201;

/* renamed from: u43  reason: default package */
/* compiled from: TBSCertificate */
public class u43 extends o03 {
    public v03 a;
    public m03 b;
    public m03 c;
    public j43 d;
    public t43 e;
    public r43 f;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c9  */
    private u43(v03 v03) {
        int i;
        boolean z;
        boolean z2;
        int size;
        this.a = v03;
        if (v03.t(0) instanceof b13) {
            this.b = m03.r((b13) v03.t(0), true);
            i = 0;
        } else {
            this.b = new m03(0);
            i = -1;
        }
        if (this.b.s().equals(BigInteger.valueOf(0))) {
            z2 = true;
        } else if (this.b.s().equals(BigInteger.valueOf(1))) {
            z2 = false;
            z = true;
            this.c = m03.q(v03.t(i + 1));
            o43.i(v03.t(i + 2));
            this.d = j43.g(v03.t(i + 3));
            v03 v032 = (v03) v03.t(i + 4);
            v43.g(v032.t(0));
            v43.g(v032.t(1));
            j43.g(v03.t(i + 5));
            int i2 = i + 6;
            this.e = t43.i(v03.t(i2));
            size = (v03.size() - i2) - 1;
            if (size != 0 || !z2) {
                while (size > 0) {
                    b13 b13 = (b13) v03.t(i2 + size);
                    int s = b13.s();
                    if (s == 1) {
                        r13.x(b13, false);
                    } else if (s == 2) {
                        r13.x(b13, false);
                    } else if (s != 3) {
                        continue;
                    } else if (!z) {
                        this.f = r43.i(v03.r(b13, true));
                    } else {
                        throw new IllegalArgumentException(C0201.m82(33791));
                    }
                    size--;
                }
            }
            throw new IllegalArgumentException(C0201.m82(33790));
        } else if (this.b.s().equals(BigInteger.valueOf(2))) {
            z2 = false;
        } else {
            throw new IllegalArgumentException(C0201.m82(33792));
        }
        z = false;
        this.c = m03.q(v03.t(i + 1));
        o43.i(v03.t(i + 2));
        this.d = j43.g(v03.t(i + 3));
        v03 v0322 = (v03) v03.t(i + 4);
        v43.g(v0322.t(0));
        v43.g(v0322.t(1));
        j43.g(v03.t(i + 5));
        int i22 = i + 6;
        this.e = t43.i(v03.t(i22));
        size = (v03.size() - i22) - 1;
        if (size != 0) {
        }
        while (size > 0) {
        }
    }

    public static u43 i(Object obj) {
        if (obj instanceof u43) {
            return (u43) obj;
        }
        if (obj != null) {
            return new u43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a;
    }

    public r43 g() {
        return this.f;
    }

    public j43 j() {
        return this.d;
    }

    public m03 k() {
        return this.c;
    }

    public t43 l() {
        return this.e;
    }
}
