package defpackage;

import vigqyno.C0201;

/* renamed from: ox2 */
public class ox2 extends nx2 {
    public static final boolean b(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        ow2.c(charSequence, C0201.m82(36546));
        ow2.c(charSequence2, C0201.m82(36547));
        if (charSequence2 instanceof String) {
            if (h(charSequence, (String) charSequence2, 0, z, 2, null) >= 0) {
                return true;
            }
        } else if (g(charSequence, charSequence2, 0, charSequence.length(), z, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean c(CharSequence charSequence, CharSequence charSequence2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return b(charSequence, charSequence2, z);
    }

    public static final int d(CharSequence charSequence) {
        ow2.c(charSequence, C0201.m82(36548));
        return charSequence.length() - 1;
    }

    public static final int e(CharSequence charSequence, String str, int i, boolean z) {
        ow2.c(charSequence, C0201.m82(36549));
        ow2.c(str, C0201.m82(36550));
        if (z || !(charSequence instanceof String)) {
            return g(charSequence, str, i, charSequence.length(), z, false, 16, null);
        }
        return ((String) charSequence).indexOf(str, i);
    }

    private static final int f(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        sw2 sw2;
        if (!z2) {
            sw2 = new uw2(yw2.a(i, 0), yw2.b(i2, charSequence.length()));
        } else {
            sw2 = yw2.c(yw2.b(i, d(charSequence)), yw2.a(i2, 0));
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a = sw2.a();
            int b = sw2.b();
            int c = sw2.c();
            if (c >= 0) {
                if (a > b) {
                    return -1;
                }
            } else if (a < b) {
                return -1;
            }
            while (!i(charSequence2, 0, charSequence, a, charSequence2.length(), z)) {
                if (a == b) {
                    return -1;
                }
                a += c;
            }
            return a;
        }
        int a2 = sw2.a();
        int b2 = sw2.b();
        int c2 = sw2.c();
        if (c2 >= 0) {
            if (a2 > b2) {
                return -1;
            }
        } else if (a2 < b2) {
            return -1;
        }
        while (!nx2.a((String) charSequence2, 0, (String) charSequence, a2, charSequence2.length(), z)) {
            if (a2 == b2) {
                return -1;
            }
            a2 += c2;
        }
        return a2;
    }

    public static /* synthetic */ int g(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return f(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    public static /* synthetic */ int h(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return e(charSequence, str, i, z);
    }

    public static final boolean i(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        ow2.c(charSequence, C0201.m82(36551));
        ow2.c(charSequence2, C0201.m82(36552));
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ex2.a(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }
}
