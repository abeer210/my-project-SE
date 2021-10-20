package defpackage;

import java.io.IOException;

/* renamed from: ej1  reason: default package */
public final class ej1 extends bp1<ej1> {
    public mj1[] c = mj1.j();

    public ej1() {
        this.a = -1;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 10) {
                int a = kp1.a(yo1, 10);
                mj1[] mj1Arr = this.c;
                int length = mj1Arr == null ? 0 : mj1Arr.length;
                int i = a + length;
                mj1[] mj1Arr2 = new mj1[i];
                if (length != 0) {
                    System.arraycopy(this.c, 0, mj1Arr2, 0, length);
                }
                while (length < i - 1) {
                    mj1Arr2[length] = new mj1();
                    yo1.d(mj1Arr2[length]);
                    yo1.l();
                    length++;
                }
                mj1Arr2[length] = new mj1();
                yo1.d(mj1Arr2[length]);
                this.c = mj1Arr2;
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        mj1[] mj1Arr = this.c;
        if (mj1Arr != null && mj1Arr.length > 0) {
            int i = 0;
            while (true) {
                mj1[] mj1Arr2 = this.c;
                if (i >= mj1Arr2.length) {
                    break;
                }
                mj1 mj1 = mj1Arr2[i];
                if (mj1 != null) {
                    zo1.c(1, mj1);
                }
                i++;
            }
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        mj1[] mj1Arr = this.c;
        if (mj1Arr != null && mj1Arr.length > 0) {
            int i = 0;
            while (true) {
                mj1[] mj1Arr2 = this.c;
                if (i >= mj1Arr2.length) {
                    break;
                }
                mj1 mj1 = mj1Arr2[i];
                if (mj1 != null) {
                    h += zo1.g(1, mj1);
                }
                i++;
            }
        }
        return h;
    }
}
