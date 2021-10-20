package defpackage;

import vigqyno.C0201;

/* renamed from: v9  reason: default package */
public abstract class v9 {
    private int a = 0;

    public v9() {
    }

    public v9(int i) throws t8 {
        b(i);
        g(i);
    }

    private void b(int i) throws t8 {
        int e = (e() ^ -1) & i;
        if (e == 0) {
            a(i);
            return;
        }
        throw new t8(C0201.m82(9001) + Integer.toHexString(e) + C0201.m82(9002), 103);
    }

    public void a(int i) throws t8 {
    }

    public boolean c(int i) {
        return (i & this.a) != 0;
    }

    public int d() {
        return this.a;
    }

    public abstract int e();

    public boolean equals(Object obj) {
        return d() == ((v9) obj).d();
    }

    public void f(int i, boolean z) {
        int i2;
        if (z) {
            i2 = i | this.a;
        } else {
            i2 = (i ^ -1) & this.a;
        }
        this.a = i2;
    }

    public void g(int i) throws t8 {
        b(i);
        this.a = i;
    }

    public int hashCode() {
        return d();
    }

    public String toString() {
        return C0201.m82(9003) + Integer.toHexString(this.a);
    }
}
