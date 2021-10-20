package defpackage;

import vigqyno.C0201;

/* renamed from: u82  reason: default package */
/* compiled from: UPCEReader */
public final class u82 extends t82 {
    private static final int[] i = {1, 1, 1, 1, 1, 1};
    public static final int[][] j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};
    private final int[] h = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb = new StringBuilder(12);
        sb.append(str.charAt(0));
        char c = cArr[5];
        String r6 = C0201.m82(3963);
        String r7 = C0201.m82(3964);
        switch (c) {
            case '0':
            case '1':
            case '2':
                sb.append(cArr, 0, 2);
                sb.append(c);
                sb.append(r7);
                sb.append(cArr, 2, 3);
                break;
            case '3':
                sb.append(cArr, 0, 3);
                sb.append(r6);
                sb.append(cArr, 3, 2);
                break;
            case '4':
                sb.append(cArr, 0, 4);
                sb.append(r6);
                sb.append(cArr[4]);
                break;
            default:
                sb.append(cArr, 0, 5);
                sb.append(r7);
                sb.append(c);
                break;
        }
        if (str.length() >= 8) {
            sb.append(str.charAt(7));
        }
        return sb.toString();
    }

    private static void t(StringBuilder sb, int i2) throws o62 {
        for (int i3 = 0; i3 <= 1; i3++) {
            for (int i4 = 0; i4 < 10; i4++) {
                if (i2 == j[i3][i4]) {
                    sb.insert(0, (char) (i3 + 48));
                    sb.append((char) (i4 + 48));
                    return;
                }
            }
        }
        throw o62.a();
    }

    @Override // defpackage.t82
    public boolean h(String str) throws k62 {
        return super.h(s(str));
    }

    @Override // defpackage.t82
    public int[] k(b72 b72, int i2) throws o62 {
        return t82.n(b72, i2, true, i);
    }

    @Override // defpackage.t82
    public int l(b72 b72, int[] iArr, StringBuilder sb) throws o62 {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = b72.g();
        int i2 = iArr[1];
        int i3 = 0;
        for (int i4 = 0; i4 < 6 && i2 < g; i4++) {
            int j2 = t82.j(b72, iArr2, i2, t82.g);
            sb.append((char) ((j2 % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (j2 >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        t(sb, i3);
        return i2;
    }

    @Override // defpackage.t82
    public f62 q() {
        return f62.UPC_E;
    }
}
