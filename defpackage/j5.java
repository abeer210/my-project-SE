package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: j5  reason: default package */
/* compiled from: CanvasUtils */
public class j5 {
    private static Method a;
    private static Method b;
    private static boolean c;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static void a(Canvas canvas, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            if (i >= 29) {
                if (z) {
                    canvas.enableZ();
                } else {
                    canvas.disableZ();
                }
            } else if (i != 28) {
                if (!c) {
                    try {
                        Method declaredMethod = Canvas.class.getDeclaredMethod(C0201.m82(20786), new Class[0]);
                        a = declaredMethod;
                        declaredMethod.setAccessible(true);
                        Method declaredMethod2 = Canvas.class.getDeclaredMethod(C0201.m82(20787), new Class[0]);
                        b = declaredMethod2;
                        declaredMethod2.setAccessible(true);
                    } catch (NoSuchMethodException unused) {
                    }
                    c = true;
                }
                if (z) {
                    try {
                        if (a != null) {
                            a.invoke(canvas, new Object[0]);
                        }
                    } catch (IllegalAccessException unused2) {
                        return;
                    } catch (InvocationTargetException e) {
                        throw new RuntimeException(e.getCause());
                    }
                }
                if (!z && b != null) {
                    b.invoke(canvas, new Object[0]);
                }
            } else {
                throw new IllegalStateException(C0201.m82(20788));
            }
        }
    }
}
