package defpackage;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: q6  reason: default package */
/* compiled from: ViewGroupUtils */
public class q6 {
    private static boolean a;
    private static Method b;
    private static boolean c;

    static {
        C0201.m83(q6.class, 468);
    }

    public static int a(ViewGroup viewGroup, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return viewGroup.getChildDrawingOrder(i);
        }
        if (!c) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod(C0201.m82(35793), Integer.TYPE, Integer.TYPE);
                b = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            c = true;
        }
        Method method = b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(i))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return i;
    }

    public static p6 b(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new o6(viewGroup);
        }
        return n6.g(viewGroup);
    }

    @SuppressLint({"NewApi"})
    private static void c(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }

    public static void d(ViewGroup viewGroup, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            viewGroup.suppressLayout(z);
        } else if (i >= 18) {
            c(viewGroup, z);
        } else {
            r6.b(viewGroup, z);
        }
    }
}
