package defpackage;

import java.io.IOException;

/* renamed from: bj1  reason: default package */
public final class bj1 extends bp1<bj1> {
    public String c = null;
    public String d = null;

    public bj1() {
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
                this.c = yo1.b();
            } else if (l == 18) {
                this.d = yo1.b();
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final void c(zo1 zo1) throws IOException {
        String str = this.c;
        if (str != null) {
            zo1.d(1, str);
        }
        String str2 = this.d;
        if (str2 != null) {
            zo1.d(2, str2);
        }
        super.c(zo1);
    }

    @Override // defpackage.bp1, defpackage.hp1
    public final int h() {
        int h = super.h();
        String str = this.c;
        if (str != null) {
            h += zo1.h(1, str);
        }
        String str2 = this.d;
        return str2 != null ? h + zo1.h(2, str2) : h;
    }
}
