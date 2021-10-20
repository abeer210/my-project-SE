package androidx.core.util;

import java.io.PrintWriter;
import vigqyno.C0201;

/* compiled from: TimeUtils */
public final class h {
    private static final Object a = new Object();
    private static char[] b = new char[24];

    private static int a(int i, int i2, boolean z, int i3) {
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    public static void b(long j, long j2, PrintWriter printWriter) {
        if (j == 0) {
            printWriter.print(C0201.m82(8584));
        } else {
            d(j - j2, printWriter, 0);
        }
    }

    public static void c(long j, PrintWriter printWriter) {
        d(j, printWriter, 0);
    }

    public static void d(long j, PrintWriter printWriter, int i) {
        synchronized (a) {
            printWriter.print(new String(b, 0, e(j, i)));
        }
    }

    private static int e(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2 = j;
        if (b.length < i) {
            b = new char[i];
        }
        char[] cArr = b;
        if (j2 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (j2 > 0) {
            c = '+';
        } else {
            c = '-';
            j2 = -j2;
        }
        int i8 = (int) (j2 % 1000);
        int floor = (int) Math.floor((double) (j2 / 1000));
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            int i9 = floor / 60;
            i4 = floor - (i9 * 60);
            i5 = i9;
        } else {
            i4 = floor;
            i5 = 0;
        }
        if (i != 0) {
            int a2 = a(i2, 1, false, 0);
            int a3 = a2 + a(i3, 1, a2 > 0, 2);
            int a4 = a3 + a(i5, 1, a3 > 0, 2);
            int a5 = a4 + a(i4, 1, a4 > 0, 2);
            i6 = 0;
            for (int a6 = a5 + a(i8, 2, true, a5 > 0 ? 3 : 0) + 1; a6 < i; a6++) {
                cArr[i6] = ' ';
                i6++;
            }
        } else {
            i6 = 0;
        }
        cArr[i6] = c;
        int i10 = i6 + 1;
        boolean z = i != 0;
        int f = f(cArr, i2, 'd', i10, false, 0);
        int f2 = f(cArr, i3, 'h', f, f != i10, z ? 2 : 0);
        int f3 = f(cArr, i5, 'm', f2, f2 != i10, z ? 2 : 0);
        int f4 = f(cArr, i4, 's', f3, f3 != i10, z ? 2 : 0);
        int f5 = f(cArr, i8, 'm', f4, true, (!z || f4 == i10) ? 0 : 3);
        cArr[f5] = 's';
        return f5 + 1;
    }

    private static int f(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        int i7 = i4 + 1;
        cArr[i7] = c;
        return i7 + 1;
    }
}
