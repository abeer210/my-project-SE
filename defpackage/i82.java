package defpackage;

/* renamed from: i82  reason: default package */
/* compiled from: EAN13Reader */
public final class i82 extends t82 {
    public static final int[] i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] h = new int[4];

    private static void s(StringBuilder sb, int i2) throws o62 {
        for (int i3 = 0; i3 < 10; i3++) {
            if (i2 == i[i3]) {
                sb.insert(0, (char) (i3 + 48));
                return;
            }
        }
        throw o62.a();
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
            int j = t82.j(b72, iArr2, i2, t82.g);
            sb.append((char) ((j % 10) + 48));
            for (int i5 : iArr2) {
                i2 += i5;
            }
            if (j >= 10) {
                i3 |= 1 << (5 - i4);
            }
        }
        s(sb, i3);
        int i6 = t82.n(b72, i2, true, t82.e)[1];
        for (int i7 = 0; i7 < 6 && i6 < g; i7++) {
            sb.append((char) (t82.j(b72, iArr2, i6, t82.f) + 48));
            for (int i8 : iArr2) {
                i6 += i8;
            }
        }
        return i6;
    }

    @Override // defpackage.t82
    public f62 q() {
        return f62.EAN_13;
    }
}
