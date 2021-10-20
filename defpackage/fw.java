package defpackage;

import defpackage.aw;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: fw  reason: default package */
/* compiled from: GifReader */
public class fw {
    private static byte[] b(or orVar) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte b = orVar.b();
            if (b == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            int i = b & 255;
            bArr[0] = b;
            orVar.c(bArr, 1, i);
            byteArrayOutputStream.write(bArr, 0, i + 1);
        }
    }

    private static byte[] c(or orVar, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            byteArrayOutputStream.write(orVar.d(i), 0, i);
            i = orVar.b() & 255;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static void d(or orVar, int i, wr wrVar) throws IOException {
        if (i != 11) {
            wrVar.a(new ur(String.format(C0201.m82(15882), Integer.valueOf(i))));
            return;
        }
        String n = orVar.n(i, fr.a);
        if (n.equals(C0201.m82(15883))) {
            byte[] b = b(orVar);
            new m10().e(b, 0, b.length - 257, wrVar, null);
        } else if (n.equals(C0201.m82(15884))) {
            byte[] c = c(orVar, orVar.b() & 255);
            if (c.length != 0) {
                new iw().c(new br(c), wrVar);
            }
        } else if (n.equals(C0201.m82(15885))) {
            orVar.t(2);
            int p = orVar.p();
            orVar.t(1);
            wv wvVar = new wv();
            wvVar.J(1, p);
            wrVar.a(wvVar);
        } else {
            k(orVar);
        }
    }

    private static yv e(or orVar, int i) throws IOException {
        return new yv(new yr(c(orVar, i), fr.c));
    }

    private static aw f(or orVar, int i) throws IOException {
        aw awVar = new aw();
        short r = orVar.r();
        awVar.M(2, aw.b.b((r >> 2) & 7));
        boolean z = false;
        awVar.B(3, ((r & 2) >> 1) == 1);
        if ((r & 1) == 1) {
            z = true;
        }
        awVar.B(4, z);
        awVar.J(1, orVar.p());
        awVar.J(5, orVar.r());
        orVar.t(1);
        return awVar;
    }

    private static void g(or orVar, wr wrVar) throws IOException {
        byte h = orVar.h();
        short r = orVar.r();
        long l = orVar.l();
        if (h == -7) {
            wrVar.a(f(orVar, r));
        } else if (h == 1) {
            tr j = j(orVar, r);
            if (j != null) {
                wrVar.a(j);
            }
        } else if (h == -2) {
            wrVar.a(e(orVar, r));
        } else if (h != -1) {
            wrVar.a(new ur(String.format(C0201.m82(15886), Byte.valueOf(h))));
        } else {
            d(orVar, r, wrVar);
        }
        long l2 = (l + ((long) r)) - orVar.l();
        if (l2 > 0) {
            orVar.t(l2);
        }
    }

    private static cw h(or orVar) throws IOException {
        cw cwVar = new cw();
        if (!orVar.m(3).equals(C0201.m82(15887))) {
            cwVar.a(C0201.m82(15888));
            return cwVar;
        }
        String m = orVar.m(3);
        boolean equals = m.equals(C0201.m82(15889));
        String r4 = C0201.m82(15890);
        if (equals || m.equals(r4)) {
            boolean z = true;
            cwVar.R(1, m);
            cwVar.J(2, orVar.p());
            cwVar.J(3, orVar.p());
            short r = orVar.r();
            int i = 1 << ((r & 7) + 1);
            int i2 = ((r & 112) >> 4) + 1;
            boolean z2 = (r >> 7) != 0;
            cwVar.J(4, i);
            if (m.equals(r4)) {
                if ((r & 8) == 0) {
                    z = false;
                }
                cwVar.B(5, z);
            }
            cwVar.J(6, i2);
            cwVar.B(7, z2);
            cwVar.J(8, orVar.r());
            short r2 = orVar.r();
            if (r2 != 0) {
                double d = (double) r2;
                Double.isNaN(d);
                cwVar.H(9, (float) ((d + 15.0d) / 64.0d));
            }
            return cwVar;
        }
        cwVar.a(C0201.m82(15891));
        return cwVar;
    }

    private static ew i(or orVar) throws IOException {
        ew ewVar = new ew();
        boolean z = true;
        ewVar.J(1, orVar.p());
        ewVar.J(2, orVar.p());
        ewVar.J(3, orVar.p());
        ewVar.J(4, orVar.p());
        byte b = orVar.b();
        boolean z2 = (b >> 7) != 0;
        boolean z3 = (b & 64) != 0;
        ewVar.B(5, z2);
        ewVar.B(6, z3);
        if (z2) {
            if ((b & 32) == 0) {
                z = false;
            }
            ewVar.B(7, z);
            int i = b & 7;
            ewVar.J(8, i + 1);
            orVar.t((long) ((2 << i) * 3));
        }
        orVar.b();
        return ewVar;
    }

    private static tr j(or orVar, int i) throws IOException {
        if (i != 12) {
            return new ur(String.format(C0201.m82(15892), Integer.valueOf(i)));
        }
        orVar.t(12);
        k(orVar);
        return null;
    }

    private static void k(or orVar) throws IOException {
        while (true) {
            short r = orVar.r();
            if (r != 0) {
                orVar.t((long) r);
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r7.a(new defpackage.ur(vigqyno.C0201.m82(15894)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        r7.a(new defpackage.ur(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
    public void a(or orVar, wr wrVar) {
        byte h;
        String r0 = C0201.m82(15893);
        orVar.s(false);
        try {
            cw h2 = h(orVar);
            wrVar.a(h2);
            if (!h2.y()) {
                Integer num = null;
                if (h2.c(7)) {
                    num = h2.l(4);
                }
                if (num != null) {
                    orVar.t((long) (num.intValue() * 3));
                }
                while (true) {
                    try {
                        h = orVar.h();
                        if (h == 33) {
                            g(orVar, wrVar);
                        } else if (h != 44) {
                            break;
                        } else {
                            wrVar.a(i(orVar));
                            k(orVar);
                        }
                    } catch (IOException unused) {
                        return;
                    }
                }
                if (h != 59) {
                    wrVar.a(new ur(C0201.m82(15895)));
                }
            }
        } catch (IOException unused2) {
            wrVar.a(new ur(r0));
        }
    }
}
