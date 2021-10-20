package defpackage;

import vigqyno.C0201;

/* renamed from: m92  reason: default package */
/* compiled from: AI01decoder */
public abstract class m92 extends o92 {
    public m92(b72 b72) {
        super(b72);
    }

    private static void e(StringBuilder sb, int i) {
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 13; i4++) {
            int charAt = sb.charAt(i4 + i) - '0';
            if ((i4 & 1) == 0) {
                charAt *= 3;
            }
            i3 += charAt;
        }
        int i5 = 10 - (i3 % 10);
        if (i5 != 10) {
            i2 = i5;
        }
        sb.append(i2);
    }

    public final void f(StringBuilder sb, int i) {
        sb.append(C0201.m82(24911));
        int length = sb.length();
        sb.append('9');
        g(sb, i, length);
    }

    public final void g(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            int f = b().f((i3 * 10) + i, 10);
            if (f / 100 == 0) {
                sb.append('0');
            }
            if (f / 10 == 0) {
                sb.append('0');
            }
            sb.append(f);
        }
        e(sb, i2);
    }
}
