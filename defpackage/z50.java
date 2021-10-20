package defpackage;

import vigqyno.C0201;

/* renamed from: z50  reason: default package */
/* compiled from: Preconditions */
public final class z50 {
    private static String a(int i, int i2, String str) {
        if (i < 0) {
            return k(C0201.m82(35158), str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return k(C0201.m82(35159), str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C0201.m82(35160) + i2);
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void c(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void d(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(k(str, objArr));
        }
    }

    public static int e(int i, int i2) {
        f(i, i2, C0201.m82(35161));
        return i;
    }

    public static int f(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(a(i, i2, str));
    }

    public static <T> T g(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    public static <T> T h(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void i(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void j(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static String k(String str, Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = valueOf.indexOf(C0201.m82(35162), i2)) != -1) {
            sb.append(valueOf.substring(i2, indexOf));
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append(valueOf.substring(i2));
        if (i < objArr.length) {
            sb.append(C0201.m82(35163));
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(C0201.m82(35164));
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }
}
