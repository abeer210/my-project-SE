package defpackage;

import android.icu.util.ULocale;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: m2  reason: default package */
/* compiled from: ICUCompat */
public final class m2 {
    private static Method a;
    private static Method b;

    static {
        String r1 = C0201.m82(27721);
        int i = Build.VERSION.SDK_INT;
        String r3 = C0201.m82(27722);
        if (i < 21) {
            try {
                Class<?> cls = Class.forName(r1);
                if (cls != null) {
                    a = cls.getMethod(C0201.m82(27723), String.class);
                    b = cls.getMethod(r3, String.class);
                }
            } catch (Exception e) {
                a = null;
                b = null;
                Log.w(C0201.m82(27724), e);
            }
        } else if (i < 24) {
            try {
                b = Class.forName(r1).getMethod(r3, Locale.class);
            } catch (Exception e2) {
                throw new IllegalStateException(e2);
            }
        }
    }

    private static String a(Locale locale) {
        String r0 = C0201.m82(27725);
        String locale2 = locale.toString();
        try {
            if (b != null) {
                return (String) b.invoke(null, locale2);
            }
        } catch (IllegalAccessException e) {
            Log.w(r0, e);
        } catch (InvocationTargetException e2) {
            Log.w(r0, e2);
        }
        return locale2;
    }

    private static String b(String str) {
        String r0 = C0201.m82(27726);
        try {
            if (a != null) {
                return (String) a.invoke(null, str);
            }
        } catch (IllegalAccessException e) {
            Log.w(r0, e);
        } catch (InvocationTargetException e2) {
            Log.w(r0, e2);
        }
        return null;
    }

    public static String c(Locale locale) {
        String r0 = C0201.m82(27727);
        int i = Build.VERSION.SDK_INT;
        if (i >= 24) {
            return ULocale.addLikelySubtags(ULocale.forLocale(locale)).getScript();
        }
        if (i >= 21) {
            try {
                return ((Locale) b.invoke(null, locale)).getScript();
            } catch (InvocationTargetException e) {
                Log.w(r0, e);
                return locale.getScript();
            } catch (IllegalAccessException e2) {
                Log.w(r0, e2);
                return locale.getScript();
            }
        } else {
            String a2 = a(locale);
            if (a2 != null) {
                return b(a2);
            }
            return null;
        }
    }
}
