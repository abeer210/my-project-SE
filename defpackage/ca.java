package defpackage;

import vigqyno.C0201;

/* renamed from: ca  reason: default package */
/* compiled from: L */
public class ca {
    public static boolean a;
    private static boolean b;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;

    static {
        C0201.m83(ca.class, 280);
    }

    public static void a(String str) {
        if (b) {
            int i = e;
            if (i == 20) {
                f++;
                return;
            }
            c[i] = str;
            d[i] = System.nanoTime();
            g2.a(str);
            e++;
        }
    }

    public static float b(String str) {
        int i = f;
        if (i > 0) {
            f = i - 1;
            return 0.0f;
        } else if (!b) {
            return 0.0f;
        } else {
            int i2 = e - 1;
            e = i2;
            if (i2 == -1) {
                throw new IllegalStateException(C0201.m82(7760));
            } else if (str.equals(c[i2])) {
                g2.b();
                return ((float) (System.nanoTime() - d[e])) / 1000000.0f;
            } else {
                throw new IllegalStateException(C0201.m82(7757) + str + C0201.m82(7758) + c[e] + C0201.m82(7759));
            }
        }
    }
}
