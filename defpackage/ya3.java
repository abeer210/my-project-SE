package defpackage;

import java.lang.reflect.Array;

/* renamed from: ya3  reason: default package */
/* compiled from: GoppaCode */
public final class ya3 {
    public static wa3 a(xa3 xa3, eb3 eb3) {
        int d = xa3.d();
        int i = 1 << d;
        int g = eb3.g();
        int[] iArr = new int[2];
        iArr[1] = i;
        iArr[0] = g;
        int[][] iArr2 = (int[][]) Array.newInstance(int.class, iArr);
        int[] iArr3 = new int[2];
        iArr3[1] = i;
        iArr3[0] = g;
        int[][] iArr4 = (int[][]) Array.newInstance(int.class, iArr3);
        for (int i2 = 0; i2 < i; i2++) {
            iArr4[0][i2] = xa3.f(eb3.e(i2));
        }
        for (int i3 = 1; i3 < g; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                iArr4[i3][i4] = xa3.h(iArr4[i3 - 1][i4], i4);
            }
        }
        for (int i5 = 0; i5 < g; i5++) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 <= i5; i7++) {
                    iArr2[i5][i6] = xa3.a(iArr2[i5][i6], xa3.h(iArr4[i7][i6], eb3.f((g + i7) - i5)));
                }
            }
        }
        int[] iArr5 = new int[2];
        iArr5[1] = (i + 31) >>> 5;
        iArr5[0] = g * d;
        int[][] iArr6 = (int[][]) Array.newInstance(int.class, iArr5);
        for (int i8 = 0; i8 < i; i8++) {
            int i9 = i8 >>> 5;
            int i10 = 1 << (i8 & 31);
            for (int i11 = 0; i11 < g; i11++) {
                int i12 = iArr2[i11][i8];
                for (int i13 = 0; i13 < d; i13++) {
                    if (((i12 >>> i13) & 1) != 0) {
                        int[] iArr7 = iArr6[(((i11 + 1) * d) - i13) - 1];
                        iArr7[i9] = iArr7[i9] ^ i10;
                    }
                }
            }
        }
        return new wa3(i, iArr6);
    }
}
