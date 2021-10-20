package defpackage;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* renamed from: r5  reason: default package */
/* compiled from: GhostViewPlatform */
public class r5 implements p5 {
    private static Class<?> b;
    private static boolean c;
    private static Method d;
    private static boolean e;
    private static Method f;
    private static boolean g;
    private final View a;

    private r5(View view) {
        this.a = view;
    }

    public static p5 b(View view, ViewGroup viewGroup, Matrix matrix) {
        c();
        Method method = d;
        if (method != null) {
            try {
                return new r5((View) method.invoke(null, view, viewGroup, matrix));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
        return null;
    }

    private static void c() {
        if (!e) {
            try {
                d();
                Method declaredMethod = b.getDeclaredMethod(C0201.m82(38320), View.class, ViewGroup.class, Matrix.class);
                d = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i(C0201.m82(38321), C0201.m82(38322), e2);
            }
            e = true;
        }
    }

    private static void d() {
        if (!c) {
            try {
                b = Class.forName(C0201.m82(38323));
            } catch (ClassNotFoundException e2) {
                Log.i(C0201.m82(38324), C0201.m82(38325), e2);
            }
            c = true;
        }
    }

    private static void e() {
        if (!g) {
            try {
                d();
                Method declaredMethod = b.getDeclaredMethod(C0201.m82(38326), View.class);
                f = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e2) {
                Log.i(C0201.m82(38327), C0201.m82(38328), e2);
            }
            g = true;
        }
    }

    public static void f(View view) {
        e();
        Method method = f;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    @Override // defpackage.p5
    public void a(ViewGroup viewGroup, View view) {
    }

    @Override // defpackage.p5
    public void setVisibility(int i) {
        this.a.setVisibility(i);
    }
}
