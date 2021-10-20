package defpackage;

import java.nio.charset.Charset;
import vigqyno.C0201;

/* renamed from: kd1  reason: default package */
public final class kd1 {
    public static final Charset a = Charset.forName(C0201.m82(20223));
    public static final Object b = new Object();

    static {
        Charset.forName(C0201.m82(20224));
    }

    public static boolean a(Object[] objArr, Object[] objArr2) {
        int i;
        int length = objArr == null ? 0 : objArr.length;
        if (objArr2 == null) {
            i = 0;
        } else {
            i = objArr2.length;
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length || objArr[i2] != null) {
                while (i3 < i && objArr2[i3] == null) {
                    i3++;
                }
                boolean z = i2 >= length;
                boolean z2 = i3 >= i;
                if (z && z2) {
                    return true;
                }
                if (z != z2 || !objArr[i2].equals(objArr2[i3])) {
                    return false;
                }
                i2++;
                i3++;
            } else {
                i2++;
            }
        }
    }

    public static int b(Object[] objArr) {
        int length = objArr == null ? 0 : objArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void c(gd1 gd1, gd1 gd12) {
        id1 id1 = gd1.b;
        if (id1 != null) {
            gd12.b = (id1) id1.clone();
        }
    }
}
