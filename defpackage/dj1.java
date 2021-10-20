package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: dj1  reason: default package */
public final class dj1 extends bp1<dj1> {
    private Integer c;
    private Integer d;
    private String e = null;

    public dj1() {
        this.a = -1;
    }

    private final dj1 j(yo1 yo1) throws IOException {
        int m;
        while (true) {
            int l = yo1.l();
            if (l == 0) {
                return this;
            }
            if (l == 8) {
                int a = yo1.a();
                try {
                    int m2 = yo1.m();
                    qj1.a(m2);
                    this.c = Integer.valueOf(m2);
                } catch (IllegalArgumentException unused) {
                    yo1.j(a);
                    i(yo1, l);
                }
            } else if (l == 16) {
                try {
                    m = yo1.m();
                    if (m <= 0 || m > 12) {
                        StringBuilder sb = new StringBuilder(50);
                        sb.append(m);
                        sb.append(C0201.m82(4579));
                    } else {
                        this.d = Integer.valueOf(m);
                    }
                } catch (IllegalArgumentException unused2) {
                    yo1.j(yo1.a());
                    i(yo1, l);
                }
            } else if (l == 26) {
                this.e = yo1.b();
            } else if (!super.i(yo1, l)) {
                return this;
            }
        }
        StringBuilder sb2 = new StringBuilder(50);
        sb2.append(m);
        sb2.append(C0201.m82(4579));
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // defpackage.hp1
    public final /* synthetic */ hp1 a(yo1 yo1) throws IOException {
        j(yo1);
        return this;
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
        String str = this.e;
        if (str != null) {
            zo1.d(3, str);
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
        if (num2 != null) {
            h += zo1.s(2, num2.intValue());
        }
        String str = this.e;
        return str != null ? h + zo1.h(3, str) : h;
    }
}
