package defpackage;

/* renamed from: j82  reason: default package */
/* compiled from: EAN8Reader */
public final class j82 extends t82 {
    private final int[] h = new int[4];

    @Override // defpackage.t82
    public int l(b72 b72, int[] iArr, StringBuilder sb) throws o62 {
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g = b72.g();
        int i = iArr[1];
        for (int i2 = 0; i2 < 4 && i < g; i2++) {
            sb.append((char) (t82.j(b72, iArr2, i, t82.f) + 48));
            for (int i3 : iArr2) {
                i += i3;
            }
        }
        int i4 = t82.n(b72, i, true, t82.e)[1];
        for (int i5 = 0; i5 < 4 && i4 < g; i5++) {
            sb.append((char) (t82.j(b72, iArr2, i4, t82.f) + 48));
            for (int i6 : iArr2) {
                i4 += i6;
            }
        }
        return i4;
    }

    @Override // defpackage.t82
    public f62 q() {
        return f62.EAN_8;
    }
}
