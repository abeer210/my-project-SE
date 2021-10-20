package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.LayoutInflater;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* renamed from: w2  reason: default package */
/* compiled from: LayoutInflaterCompat */
public final class w2 {
    private static Field a;
    private static boolean b;

    private static void a(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        boolean z = b;
        String r1 = C0201.m82(10492);
        String r2 = C0201.m82(10493);
        if (!z) {
            try {
                Field declaredField = LayoutInflater.class.getDeclaredField(C0201.m82(10494));
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e) {
                Log.e(r2, C0201.m82(10495) + LayoutInflater.class.getName() + r1, e);
            }
            b = true;
        }
        Field field = a;
        if (field != null) {
            try {
                field.set(layoutInflater, factory2);
            } catch (IllegalAccessException e2) {
                Log.e(r2, C0201.m82(10496) + layoutInflater + r1, e2);
            }
        }
    }

    public static void b(LayoutInflater layoutInflater, LayoutInflater.Factory2 factory2) {
        layoutInflater.setFactory2(factory2);
        if (Build.VERSION.SDK_INT < 21) {
            LayoutInflater.Factory factory = layoutInflater.getFactory();
            if (factory instanceof LayoutInflater.Factory2) {
                a(layoutInflater, (LayoutInflater.Factory2) factory);
            } else {
                a(layoutInflater, factory2);
            }
        }
    }
}
