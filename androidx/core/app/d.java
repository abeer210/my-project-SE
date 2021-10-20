package androidx.core.app;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import vigqyno.C0201;

/* compiled from: BundleCompat */
public final class d {

    /* compiled from: BundleCompat */
    static class a {
        private static Method a;
        private static boolean b;

        public static IBinder a(Bundle bundle, String str) {
            boolean z = b;
            String r2 = C0201.m82(13024);
            if (!z) {
                try {
                    Method method = Bundle.class.getMethod(C0201.m82(13025), String.class);
                    a = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(r2, C0201.m82(13026), e);
                }
                b = true;
            }
            Method method2 = a;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(r2, C0201.m82(13027), e2);
                    a = null;
                }
            }
            return null;
        }
    }

    public static IBinder a(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return a.a(bundle, str);
    }
}
