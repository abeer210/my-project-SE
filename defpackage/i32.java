package defpackage;

import vigqyno.C0201;

/* renamed from: i32  reason: default package */
/* compiled from: JavaVersion */
public final class i32 {
    private static final int a = a();

    private static int a() {
        return d(System.getProperty(C0201.m82(37874)));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return a;
    }

    public static int d(String str) {
        int f = f(str);
        if (f == -1) {
            f = b(str);
        }
        if (f == -1) {
            return 6;
        }
        return f;
    }

    public static boolean e() {
        return a >= 9;
    }

    private static int f(String str) {
        try {
            String[] split = str.split(C0201.m82(37875));
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
