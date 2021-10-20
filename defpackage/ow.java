package defpackage;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collections;
import vigqyno.C0201;

/* renamed from: ow  reason: default package */
/* compiled from: IptcReader */
public class ow implements wp {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r7 != 582) goto L_0x005e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00aa  */
    private void e(or orVar, tr trVar, int i, int i2, int i3) throws IOException {
        Charset charset;
        yr yrVar;
        yr[] yrVarArr;
        int i4 = (i << 8) | i2;
        if (i3 == 0) {
            trVar.R(i4, C0201.m82(36200));
            return;
        }
        if (!(i4 == 256 || i4 == 278)) {
            if (i4 == 346) {
                byte[] d = orVar.d(i3);
                String a = pw.a(d);
                if (a == null) {
                    a = new String(d);
                }
                trVar.R(i4, a);
                return;
            } else if (!(i4 == 378 || i4 == 512)) {
                if (i4 == 522) {
                    trVar.J(i4, orVar.r());
                    orVar.t((long) (i3 - 1));
                    return;
                }
            }
        }
        if (i3 >= 2) {
            int p = orVar.p();
            orVar.t((long) (i3 - 2));
            trVar.J(i4, p);
            return;
        }
        String r = trVar.r(346);
        if (r != null) {
            try {
                charset = Charset.forName(r);
            } catch (Throwable unused) {
            }
            if (r == null) {
                yrVar = orVar.o(i3, charset);
            } else {
                byte[] d2 = orVar.d(i3);
                Charset b = pw.b(d2);
                yrVar = b != null ? new yr(d2, b) : new yr(d2, null);
            }
            if (!trVar.b(i4)) {
                yr[] u = trVar.u(i4);
                if (u == null) {
                    yrVarArr = new yr[1];
                } else {
                    yr[] yrVarArr2 = new yr[(u.length + 1)];
                    System.arraycopy(u, 0, yrVarArr2, 0, u.length);
                    yrVarArr = yrVarArr2;
                }
                yrVarArr[yrVarArr.length - 1] = yrVar;
                trVar.U(i4, yrVarArr);
                return;
            }
            trVar.T(i4, yrVar);
            return;
        }
        charset = null;
        if (r == null) {
        }
        if (!trVar.b(i4)) {
        }
    }

    @Override // defpackage.wp
    public void a(Iterable<byte[]> iterable, wr wrVar, yp ypVar) {
        for (byte[] bArr : iterable) {
            if (bArr.length != 0 && bArr[0] == 28) {
                c(new nr(bArr), wrVar, (long) bArr.length);
            }
        }
    }

    @Override // defpackage.wp
    public Iterable<yp> b() {
        return Collections.singletonList(yp.APPD);
    }

    public void c(or orVar, wr wrVar, long j) {
        d(orVar, wrVar, j, null);
    }

    public void d(or orVar, wr wrVar, long j, tr trVar) {
        nw nwVar = new nw();
        wrVar.a(nwVar);
        if (trVar != null) {
            nwVar.O(trVar);
        }
        int i = 0;
        while (((long) i) < j) {
            try {
                short r = orVar.r();
                int i2 = i + 1;
                if (r != 28) {
                    if (((long) i2) != j) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C0201.m82(36201));
                        sb.append(i2 - 1);
                        sb.append(C0201.m82(36202));
                        sb.append(Integer.toHexString(28));
                        sb.append(C0201.m82(36203));
                        sb.append(Integer.toHexString(r));
                        sb.append(C0201.m82(36204));
                        nwVar.a(sb.toString());
                        return;
                    }
                    return;
                } else if (((long) (i2 + 4)) > j) {
                    nwVar.a(C0201.m82(36205));
                    return;
                } else {
                    try {
                        short r2 = orVar.r();
                        short r3 = orVar.r();
                        int p = orVar.p();
                        if (p > 32767) {
                            p = ((p & 32767) << 16) | orVar.p();
                            i2 += 2;
                        }
                        i = i2 + 4 + p;
                        if (((long) i) > j) {
                            nwVar.a(C0201.m82(36206));
                            return;
                        }
                        try {
                            e(orVar, nwVar, r2, r3, p);
                        } catch (IOException unused) {
                            nwVar.a(C0201.m82(36207));
                            return;
                        }
                    } catch (IOException unused2) {
                        nwVar.a(C0201.m82(36208));
                        return;
                    }
                }
            } catch (IOException unused3) {
                nwVar.a(C0201.m82(36209));
                return;
            }
        }
    }
}
