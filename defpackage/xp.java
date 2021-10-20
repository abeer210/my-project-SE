package defpackage;

import java.io.IOException;
import java.util.HashSet;
import vigqyno.C0201;

/* renamed from: xp  reason: default package */
/* compiled from: JpegSegmentReader */
public class xp {
    public static vp a(or orVar, Iterable<yp> iterable) throws up, IOException {
        int p = orVar.p();
        if (p == 65496) {
            HashSet hashSet = null;
            if (iterable != null) {
                hashSet = new HashSet();
                for (yp ypVar : iterable) {
                    hashSet.add(Byte.valueOf(ypVar.a));
                }
            }
            vp vpVar = new vp();
            while (true) {
                byte h = orVar.h();
                byte h2 = orVar.h();
                while (true) {
                    if (!(h != -1 || h2 == -1 || h2 == 0)) {
                        break;
                    }
                    h2 = orVar.h();
                    h = h2;
                }
                if (h2 == -38 || h2 == -39) {
                    return vpVar;
                }
                int p2 = orVar.p() - 2;
                if (p2 < 0) {
                    throw new up(C0201.m82(17812));
                } else if (hashSet == null || hashSet.contains(Byte.valueOf(h2))) {
                    vpVar.a(h2, orVar.d(p2));
                } else if (!orVar.u((long) p2)) {
                    return vpVar;
                }
            }
        } else {
            throw new up(C0201.m82(17813) + Integer.toHexString(p));
        }
    }
}
