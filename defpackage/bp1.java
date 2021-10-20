package defpackage;

import defpackage.bp1;
import java.io.IOException;

/* renamed from: bp1  reason: default package */
public abstract class bp1<M extends bp1<M>> extends hp1 {
    public dp1 b;

    @Override // defpackage.hp1
    public void c(zo1 zo1) throws IOException {
        if (this.b != null) {
            for (int i = 0; i < this.b.b(); i++) {
                this.b.e(i).b(zo1);
            }
        }
    }

    @Override // defpackage.hp1
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        bp1 bp1 = (bp1) super.clone();
        fp1.a(this, bp1);
        return bp1;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 g() throws CloneNotSupportedException {
        return (bp1) clone();
    }

    @Override // defpackage.hp1
    public int h() {
        if (this.b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.b(); i2++) {
            i += this.b.e(i2).e();
        }
        return i;
    }

    public final boolean i(yo1 yo1, int i) throws IOException {
        int a = yo1.a();
        if (!yo1.f(i)) {
            return false;
        }
        int i2 = i >>> 3;
        jp1 jp1 = new jp1(i, yo1.t(a, yo1.a() - a));
        ep1 ep1 = null;
        dp1 dp1 = this.b;
        if (dp1 == null) {
            this.b = new dp1();
        } else {
            ep1 = dp1.d(i2);
        }
        if (ep1 == null) {
            ep1 = new ep1();
            this.b.c(i2, ep1);
        }
        ep1.c(jp1);
        return true;
    }
}
