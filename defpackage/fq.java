package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import vigqyno.C0201;

/* renamed from: fq  reason: default package */
/* compiled from: PngChunkReader */
public class fq {
    private static final byte[] a = {-119, 80, 78, 71, 13, 10, 26, 10};

    public Iterable<eq> a(or orVar, Set<gq> set) throws kq, IOException {
        orVar.s(true);
        byte[] bArr = a;
        if (Arrays.equals(bArr, orVar.d(bArr.length))) {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            boolean z = false;
            boolean z2 = false;
            while (!z) {
                int f = orVar.f();
                if (f >= 0) {
                    gq gqVar = new gq(orVar.d(4));
                    boolean z3 = set == null || set.contains(gqVar);
                    byte[] d = orVar.d(f);
                    orVar.t(4);
                    if (!z3 || !hashSet.contains(gqVar) || gqVar.a()) {
                        if (gqVar.equals(gq.d)) {
                            z2 = true;
                        } else if (!z2) {
                            throw new kq(String.format(C0201.m82(15650), gq.d, gqVar));
                        }
                        if (gqVar.equals(gq.f)) {
                            z = true;
                        }
                        if (z3) {
                            arrayList.add(new eq(gqVar, d));
                        }
                        hashSet.add(gqVar);
                    } else {
                        throw new kq(String.format(C0201.m82(15649), gqVar));
                    }
                } else {
                    throw new kq(C0201.m82(15651));
                }
            }
            return arrayList;
        }
        throw new kq(C0201.m82(15652));
    }
}
