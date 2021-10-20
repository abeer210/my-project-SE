package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import vigqyno.C0201;

/* renamed from: n40  reason: default package */
/* compiled from: CacheKeyUtil */
public final class n40 {
    public static String a(m40 m40) {
        try {
            if (m40 instanceof o40) {
                return c(((o40) m40).c().get(0));
            }
            return c(m40);
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<String> b(m40 m40) {
        try {
            if (m40 instanceof o40) {
                List<m40> c = ((o40) m40).c();
                ArrayList arrayList = new ArrayList(c.size());
                for (int i = 0; i < c.size(); i++) {
                    arrayList.add(c(c.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c(m40));
            return arrayList2;
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    private static String c(m40 m40) throws UnsupportedEncodingException {
        return e70.a(m40.b().getBytes(C0201.m82(67)));
    }
}
