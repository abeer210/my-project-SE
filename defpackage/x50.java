package defpackage;

/* renamed from: x50  reason: default package */
/* compiled from: Ints */
public class x50 {
    public static int a(int... iArr) {
        z50.b(iArr.length > 0);
        int i = iArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
