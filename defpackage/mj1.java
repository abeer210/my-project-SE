package defpackage;

import java.io.IOException;

/* renamed from: mj1  reason: default package */
public final class mj1 extends bp1<mj1> {
    private static volatile mj1[] e;
    public Integer c = null;
    public Integer d = null;

    public mj1() {
        this.a = -1;
    }

    public static mj1[] j() {
        if (e == null) {
            synchronized (fp1.b) {
                if (e == null) {
                    e = new mj1[0];
                }
            }
        }
        return e;
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 8) {
                this.c = Integer.valueOf(yo1.m());
            } else if (l == 16) {
                this.d = Integer.valueOf(yo1.m());
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        Integer num = this.c;
        if (num != null) {
            zo1.p(1, num.intValue());
        }
        Integer num2 = this.d;
        if (num2 != null) {
            zo1.p(2, num2.intValue());
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        Integer num = this.c;
        if (num != null) {
            h += zo1.s(1, num.intValue());
        }
        Integer num2 = this.d;
        return num2 != null ? h + zo1.s(2, num2.intValue()) : h;
    }
}
