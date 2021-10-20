package defpackage;

import defpackage.gd1;
import java.io.IOException;

/* renamed from: gd1  reason: default package */
public abstract class gd1<M extends gd1<M>> extends md1 {
    public id1 b;

    @Override // defpackage.md1
    public void b(ed1 ed1) throws IOException {
        if (this.b != null) {
            for (int i = 0; i < this.b.c(); i++) {
                this.b.f(i).b(ed1);
            }
        }
    }

    @Override // defpackage.md1
    public int c() {
        if (this.b == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.b.c(); i2++) {
            i += this.b.f(i2).d();
        }
        return i;
    }

    @Override // defpackage.md1
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        gd1 gd1 = (gd1) super.clone();
        kd1.c(this, gd1);
        return gd1;
    }

    @Override // defpackage.md1
    public final /* synthetic */ md1 e() throws CloneNotSupportedException {
        return (gd1) clone();
    }

    public final boolean f(bd1 bd1, int i) throws IOException {
        int a = bd1.a();
        if (!bd1.f(i)) {
            return false;
        }
        int i2 = i >>> 3;
        od1 od1 = new od1(i, bd1.k(a, bd1.a() - a));
        hd1 hd1 = null;
        id1 id1 = this.b;
        if (id1 == null) {
            this.b = new id1();
        } else {
            hd1 = id1.e(i2);
        }
        if (hd1 == null) {
            hd1 = new hd1();
            this.b.d(i2, hd1);
        }
        hd1.c(od1);
        return true;
    }
}
