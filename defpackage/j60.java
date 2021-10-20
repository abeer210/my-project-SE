package defpackage;

import android.webkit.MimeTypeMap;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: j60  reason: default package */
/* compiled from: MimeTypeMapWrapper */
public class j60 {
    private static final MimeTypeMap a = MimeTypeMap.getSingleton();
    private static final Map<String, String> b;

    static {
        String r0 = C0201.m82(37590);
        String r1 = C0201.m82(37591);
        String r2 = C0201.m82(37592);
        String r3 = C0201.m82(37593);
        w50.c(r0, r1, r2, r3);
        b = w50.c(r1, r0, r3, r2);
    }

    public static String a(String str) {
        String str2 = b.get(str);
        if (str2 != null) {
            return str2;
        }
        return a.getMimeTypeFromExtension(str);
    }
}
