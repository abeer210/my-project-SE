package defpackage;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import vigqyno.C0201;

/* renamed from: q2  reason: default package */
/* compiled from: TextUtilsCompat */
public final class q2 {
    private static final Locale a;

    static {
        String r1 = C0201.m82(35608);
        a = new Locale(r1, r1);
    }

    private static int a(Locale locale) {
        byte directionality = Character.getDirectionality(locale.getDisplayName(locale).charAt(0));
        return (directionality == 1 || directionality == 2) ? 1 : 0;
    }

    public static int b(Locale locale) {
        if (Build.VERSION.SDK_INT >= 17) {
            return TextUtils.getLayoutDirectionFromLocale(locale);
        }
        if (locale == null || locale.equals(a)) {
            return 0;
        }
        String c = m2.c(locale);
        if (c == null) {
            return a(locale);
        }
        return (c.equalsIgnoreCase(C0201.m82(35609)) || c.equalsIgnoreCase(C0201.m82(35610))) ? 1 : 0;
    }
}
