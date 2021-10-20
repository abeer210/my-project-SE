package defpackage;

import java.util.Locale;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: i60  reason: default package */
/* compiled from: MediaUtils */
public class i60 {
    public static final Map<String, String> a = w50.c(C0201.m82(1733), C0201.m82(1734), C0201.m82(1735), C0201.m82(1736));

    private static String a(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf < 0 || lastIndexOf == str.length() - 1) {
            return null;
        }
        return str.substring(lastIndexOf + 1);
    }

    public static String b(String str) {
        String a2 = a(str);
        if (a2 == null) {
            return null;
        }
        String lowerCase = a2.toLowerCase(Locale.US);
        String a3 = j60.a(lowerCase);
        return a3 == null ? a.get(lowerCase) : a3;
    }

    public static boolean c(String str) {
        return str != null && str.startsWith(C0201.m82(1737));
    }
}
