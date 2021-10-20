package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: m10  reason: default package */
/* compiled from: XmpReader */
public class m10 implements wp {
    private static String h(wr wrVar) {
        for (l10 l10 : wrVar.c(l10.class)) {
            try {
                u8 H0 = l10.V().H0(C0201.m82(962), null, null);
                if (H0 != null) {
                    while (H0.hasNext()) {
                        z9 z9Var = (z9) H0.next();
                        if (C0201.m82(963).equals(z9Var.a())) {
                            return z9Var.getValue();
                        }
                    }
                    continue;
                }
            } catch (t8 unused) {
            }
        }
        return null;
    }

    private static byte[] i(wr wrVar, byte[] bArr, String str, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 75) {
            try {
                nr nrVar = new nr(bArr);
                nrVar.t((long) 35);
                if (str.equals(nrVar.m(32))) {
                    int q = (int) nrVar.q();
                    int q2 = (int) nrVar.q();
                    if (bArr2 == null) {
                        bArr2 = new byte[q];
                    }
                    if (bArr2.length == q) {
                        System.arraycopy(bArr, 75, bArr2, q2, length - 75);
                    } else {
                        l10 l10 = new l10();
                        l10.a(String.format(C0201.m82(964), Integer.valueOf(q), Integer.valueOf(bArr2.length)));
                        wrVar.a(l10);
                    }
                }
            } catch (IOException e) {
                l10 l102 = new l10();
                l102.a(e.getMessage());
                wrVar.a(l102);
            }
        }
        return bArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (vigqyno.C0201.m82(965).equalsIgnoreCase(new java.lang.String(r1, 0, 3)) != false) goto L_0x0038;
     */
    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        Iterator<byte[]> it = iterable.iterator();
        byte[] bArr = null;
        String str = null;
        while (it.hasNext()) {
            byte[] next = it.next();
            if (next.length >= 29) {
                if (!"http://ns.adobe.com/xap/1.0/\u0000".equalsIgnoreCase(new String(next, 0, 29))) {
                }
                int length = next.length - 29;
                byte[] bArr2 = new byte[length];
                System.arraycopy(next, 29, bArr2, 0, length);
                f(bArr2, wrVar);
                str = h(wrVar);
            }
            if (str != null && next.length >= 35 && "http://ns.adobe.com/xmp/extension/\u0000".equalsIgnoreCase(new String(next, 0, 35))) {
                bArr = i(wrVar, next, str, bArr);
            }
        }
        if (bArr != null) {
            f(bArr, wrVar);
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APP1);
    }

    public void c(String str, wr wrVar) {
        d(str, wrVar, null);
    }

    public void d(String str, wr wrVar, tr trVar) {
        l10 l10 = new l10();
        if (trVar != null) {
            l10.O(trVar);
        }
        try {
            l10.W(w8.f(str));
        } catch (t8 e) {
            l10.a(C0201.m82(966) + e.getMessage());
        }
        if (!l10.A()) {
            wrVar.a(l10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    public void e(byte[] bArr, int i, int i2, wr wrVar, tr trVar) {
        v8 v8Var;
        l10 l10 = new l10();
        if (trVar != null) {
            l10.O(trVar);
        }
        if (i == 0) {
            try {
                if (i2 == bArr.length) {
                    v8Var = w8.d(bArr);
                    l10.W(v8Var);
                    if (l10.A()) {
                        wrVar.a(l10);
                        return;
                    }
                    return;
                }
            } catch (t8 e) {
                l10.a(C0201.m82(967) + e.getMessage());
            }
        }
        v8Var = w8.b(new z8(bArr, i, i2).f());
        l10.W(v8Var);
        if (l10.A()) {
        }
    }

    public void f(byte[] bArr, wr wrVar) {
        g(bArr, wrVar, null);
    }

    public void g(byte[] bArr, wr wrVar, tr trVar) {
        e(bArr, 0, bArr.length, wrVar, trVar);
    }
}
