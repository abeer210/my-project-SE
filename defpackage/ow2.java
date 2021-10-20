package defpackage;

import java.util.Arrays;
import vigqyno.C0201;

/* renamed from: ow2  reason: default package */
/* compiled from: Intrinsics */
public class ow2 {
    private ow2() {
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj, String str) {
        if (obj == null) {
            IllegalStateException illegalStateException = new IllegalStateException(str + C0201.m82(29785));
            d(illegalStateException);
            throw illegalStateException;
        }
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            g(str);
            throw null;
        }
    }

    private static <T extends Throwable> T d(T t) {
        e(t, ow2.class.getName());
        return t;
    }

    public static <T extends Throwable> T e(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        t.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i + 1, length));
        return t;
    }

    public static void f() {
        dv2 dv2 = new dv2();
        d(dv2);
        throw dv2;
    }

    private static void g(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(C0201.m82(29786) + className + C0201.m82(29787) + methodName + C0201.m82(29788) + str);
        d(illegalArgumentException);
        throw illegalArgumentException;
    }

    public static void h(String str) {
        gv2 gv2 = new gv2(str);
        d(gv2);
        throw gv2;
    }

    public static void i(String str) {
        h(C0201.m82(29789) + str + C0201.m82(29790));
        throw null;
    }
}
