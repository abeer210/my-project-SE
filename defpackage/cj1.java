package defpackage;

import java.io.IOException;

/* renamed from: cj1  reason: default package */
public final class cj1 extends bp1<cj1> {
    private int[] c = kp1.a;

    public cj1() {
        this.a = -1;
    }

    private final cj1 j(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 8) {
                int a = kp1.a(yo1, 8);
                int[] iArr = new int[a];
                int i = 0;
                for (int i2 = 0; i2 < a; i2++) {
                    if (i2 != 0) {
                        yo1.l();
                    }
                    int a2 = yo1.a();
                    try {
                        int m = yo1.m();
                        qj1.a(m);
                        iArr[i] = m;
                        i++;
                    } catch (IllegalArgumentException unused) {
                        yo1.j(a2);
                        i(yo1, l);
                    }
                }
                if (i != 0) {
                    int[] iArr2 = this.c;
                    int length = iArr2 == null ? 0 : iArr2.length;
                    if (length == 0 && i == a) {
                        this.c = iArr;
                    } else {
                        int[] iArr3 = new int[(length + i)];
                        if (length != 0) {
                            System.arraycopy(this.c, 0, iArr3, 0, length);
                        }
                        System.arraycopy(iArr, 0, iArr3, length, i);
                        this.c = iArr3;
                    }
                }
            } else if (l == 10) {
                int g = yo1.g(yo1.m());
                int a3 = yo1.a();
                int i3 = 0;
                while (yo1.r() > 0) {
                    try {
                        qj1.a(yo1.m());
                        i3++;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
                if (i3 != 0) {
                    yo1.j(a3);
                    int[] iArr4 = this.c;
                    int length2 = iArr4 == null ? 0 : iArr4.length;
                    int[] iArr5 = new int[(i3 + length2)];
                    if (length2 != 0) {
                        System.arraycopy(this.c, 0, iArr5, 0, length2);
                    }
                    while (yo1.r() > 0) {
                        int a4 = yo1.a();
                        try {
                            int m2 = yo1.m();
                            qj1.a(m2);
                            iArr5[length2] = m2;
                            length2++;
                        } catch (IllegalArgumentException unused3) {
                            yo1.j(a4);
                            i(yo1, 8);
                        }
                    }
                    this.c = iArr5;
                }
                yo1.h(g);
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        j(yo1);
        return this;
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        int[] iArr = this.c;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.c;
                if (i >= iArr2.length) {
                    break;
                }
                zo1.p(1, iArr2[i]);
                i++;
            }
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        int[] iArr = this.c;
        if (iArr == null || iArr.length <= 0) {
            return h;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr2 = this.c;
            if (i >= iArr2.length) {
                return h + i2 + (iArr2.length * 1);
            }
            i2 += zo1.f(iArr2[i]);
            i++;
        }
    }
}
