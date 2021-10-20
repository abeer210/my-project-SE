package defpackage;

import java.io.IOException;

/* renamed from: q13  reason: default package */
/* compiled from: DERBMPString */
public class q13 extends u03 implements a13 {
    private final char[] a;

    public q13(char[] cArr) {
        this.a = cArr;
    }

    @Override // defpackage.a13
    public String c() {
        return new String(this.a);
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof q13)) {
            return false;
        }
        return hb3.b(this.a, ((q13) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.i(this.a);
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        s03.c(30);
        s03.i(this.a.length * 2);
        int i = 0;
        while (true) {
            char[] cArr = this.a;
            if (i != cArr.length) {
                char c = cArr[i];
                s03.c((byte) (c >> '\b'));
                s03.c((byte) c);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.u03
    public int j() {
        return a33.a(this.a.length * 2) + 1 + (this.a.length * 2);
    }

    @Override // defpackage.u03
    public boolean l() {
        return false;
    }

    public String toString() {
        return c();
    }
}
