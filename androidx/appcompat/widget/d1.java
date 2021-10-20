package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: ViewUtils */
public class d1 {
    private static Method a;

    static {
        if (Build.VERSION.SDK_INT >= 18) {
            try {
                Method declaredMethod = View.class.getDeclaredMethod(C0201.m82(3527), Rect.class, Rect.class);
                a = declaredMethod;
                if (!declaredMethod.isAccessible()) {
                    a.setAccessible(true);
                }
            } catch (NoSuchMethodException unused) {
                Log.d(C0201.m82(3528), C0201.m82(3529));
            }
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e) {
                Log.d(C0201.m82(3530), C0201.m82(3531), e);
            }
        }
    }

    public static boolean b(View view) {
        return k3.w(view) == 1;
    }

    public static void c(View view) {
        String r0 = C0201.m82(3532);
        String r1 = C0201.m82(3533);
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                Method method = view.getClass().getMethod(C0201.m82(3534), new Class[0]);
                if (!method.isAccessible()) {
                    method.setAccessible(true);
                }
                method.invoke(view, new Object[0]);
            } catch (NoSuchMethodException unused) {
                Log.d(r1, C0201.m82(3535));
            } catch (InvocationTargetException e) {
                Log.d(r1, r0, e);
            } catch (IllegalAccessException e2) {
                Log.d(r1, r0, e2);
            }
        }
    }
}
