package defpackage;

import vigqyno.C0201;

/* renamed from: r72  reason: default package */
/* compiled from: ReedSolomonDecoder */
public final class r72 {
    private final p72 a;

    public r72(p72 p72) {
        this.a = p72;
    }

    private int[] b(q72 q72) throws s72 {
        int d = q72.d();
        int i = 0;
        if (d == 1) {
            return new int[]{q72.c(1)};
        }
        int[] iArr = new int[d];
        for (int i2 = 1; i2 < this.a.f() && i < d; i2++) {
            if (q72.b(i2) == 0) {
                iArr[i] = this.a.h(i2);
                i++;
            }
        }
        if (i == d) {
            return iArr;
        }
        throw new s72(C0201.m82(23785));
    }

    private int[] c(q72 q72, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int h = this.a.h(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int j = this.a.j(iArr[i3], h);
                    i2 = this.a.j(i2, (j & 1) == 0 ? j | 1 : j & -2);
                }
            }
            iArr2[i] = this.a.j(q72.b(h), this.a.h(i2));
            if (this.a.d() != 0) {
                iArr2[i] = this.a.j(iArr2[i], h);
            }
        }
        return iArr2;
    }

    private q72[] d(q72 q72, q72 q722, int i) throws s72 {
        if (q72.d() < q722.d()) {
            q722 = q72;
            q72 = q722;
        }
        q72 g = this.a.g();
        q72 e = this.a.e();
        do {
            q722 = q72;
            q72 = q722;
            g = e;
            if (q72.d() < i / 2) {
                int c = g.c(0);
                if (c != 0) {
                    int h = this.a.h(c);
                    return new q72[]{g.f(h), q72.f(h)};
                }
                throw new s72(C0201.m82(23788));
            } else if (!q72.e()) {
                q72 g2 = this.a.g();
                int h2 = this.a.h(q72.c(q72.d()));
                while (q722.d() >= q72.d() && !q722.e()) {
                    int d = q722.d() - q72.d();
                    int j = this.a.j(q722.c(q722.d()), h2);
                    g2 = g2.a(this.a.b(d, j));
                    q722 = q722.a(q72.h(d, j));
                }
                e = g2.g(g).a(g);
            } else {
                throw new s72(C0201.m82(23787));
            }
        } while (q722.d() < q72.d());
        throw new IllegalStateException(C0201.m82(23786));
    }

    public void a(int[] iArr, int i) throws s72 {
        q72 q72 = new q72(this.a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            p72 p72 = this.a;
            int b = q72.b(p72.c(p72.d() + i2));
            iArr2[(i - 1) - i2] = b;
            if (b != 0) {
                z = false;
            }
        }
        if (!z) {
            q72[] d = d(this.a.b(i, 1), new q72(this.a, iArr2), i);
            q72 q722 = d[0];
            q72 q723 = d[1];
            int[] b2 = b(q722);
            int[] c = c(q723, b2);
            for (int i3 = 0; i3 < b2.length; i3++) {
                int length = (iArr.length - 1) - this.a.i(b2[i3]);
                if (length >= 0) {
                    iArr[length] = p72.a(iArr[length], c[i3]);
                } else {
                    throw new s72(C0201.m82(23789));
                }
            }
        }
    }
}
