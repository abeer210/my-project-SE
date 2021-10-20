package defpackage;

import vigqyno.C0188;

/* renamed from: hr  reason: default package */
/* compiled from: DateUtil */
public class hr {
    private static int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean a(int i, int i2, int i3) {
        if (i < 1 || i > 9999 || i2 < 0 || i2 > 11) {
            return false;
        }
        int i4 = a[i2];
        if (i2 == 1) {
            if (i % 4 == 0 && (i % 100 != 0 || i % C0188.f25 == 0)) {
                i4++;
            }
        }
        if (i3 < 1 || i3 > i4) {
            return false;
        }
        return true;
    }

    public static boolean b(int i, int i2, int i3) {
        return i >= 0 && i < 24 && i2 >= 0 && i2 < 60 && i3 >= 0 && i3 < 60;
    }
}
