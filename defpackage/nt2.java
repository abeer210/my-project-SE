package defpackage;

import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: nt2  reason: default package */
/* compiled from: PublicKeySecurityHandler */
public final class nt2 extends pt2 {
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;

    static {
        C0201.m83(nt2.class, 95);
    }

    private void q(StringBuilder sb, u53 u53, X509Certificate x509Certificate, z43 z43) {
        Object obj;
        BigInteger b = u53.b();
        if (b != null) {
            BigInteger serialNumber = x509Certificate.getSerialNumber();
            String bigInteger = serialNumber != null ? serialNumber.toString(16) : C0201.m82(30486);
            sb.append(C0201.m82(30487));
            sb.append(b.toString(16));
            sb.append(C0201.m82(30488));
            sb.append(bigInteger);
            sb.append(C0201.m82(30489));
            sb.append(u53.a());
            sb.append(C0201.m82(30490));
            if (z43 == null) {
                obj = C0201.m82(30491);
            } else {
                obj = z43.b();
            }
            sb.append(obj);
            sb.append(C0201.m82(30492));
        }
    }

    @Override // defpackage.pt2
    public void m(jt2 jt2, sq2 sq2, ft2 ft2) throws IOException {
        if (ft2 instanceof lt2) {
            p(jt2.p());
            if (jt2.c() != 0) {
                this.a = jt2.c();
            }
            lt2 lt2 = (lt2) ft2;
            try {
                int i = jt2.i();
                byte[][] bArr = new byte[i][];
                StringBuilder sb = new StringBuilder();
                int i2 = 0;
                boolean z = false;
                byte[] bArr2 = null;
                int i3 = 0;
                while (i2 < jt2.i()) {
                    byte[] r = jt2.h(i2).r();
                    Iterator<c63> it = new e53(r).a().a().iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        c63 next = it.next();
                        X509Certificate a = lt2.a();
                        z43 z43 = a != null ? new z43(a.getEncoded()) : null;
                        b63 c2 = next.c();
                        if (c2.k(z43) && !z) {
                            j63 j63 = new j63((PrivateKey) lt2.b());
                            j63.h(e);
                            bArr2 = next.a(j63);
                            z = true;
                            break;
                        }
                        i4++;
                        if (a != null) {
                            sb.append('\n');
                            sb.append(i4);
                            sb.append(d);
                            if (c2 instanceof u53) {
                                q(sb, (u53) c2, a, z43);
                            }
                        }
                    }
                    bArr[i2] = r;
                    i3 += r.length;
                    i2++;
                }
                if (!z || bArr2 == null) {
                    throw new IOException(f + i2 + h + sb.toString());
                } else if (bArr2.length == 24) {
                    byte[] bArr3 = new byte[4];
                    int i5 = 20;
                    System.arraycopy(bArr2, 20, bArr3, 0, 4);
                    et2 et2 = new et2(bArr3);
                    et2.k();
                    o(et2);
                    byte[] bArr4 = new byte[(i3 + 20)];
                    int i6 = 0;
                    System.arraycopy(bArr2, 0, bArr4, 0, 20);
                    int i7 = 0;
                    while (i7 < i) {
                        byte[] bArr5 = bArr[i7];
                        System.arraycopy(bArr5, i6, bArr4, i5, bArr5.length);
                        i5 += bArr5.length;
                        i7++;
                        i6 = 0;
                    }
                    byte[] digest = ht2.b().digest(bArr4);
                    byte[] bArr6 = new byte[(this.a / 8)];
                    this.b = bArr6;
                    System.arraycopy(digest, 0, bArr6, 0, this.a / 8);
                } else {
                    throw new IOException(g);
                }
            } catch (h53 e2) {
                throw new IOException(e2);
            } catch (KeyStoreException e3) {
                throw new IOException(e3);
            } catch (CertificateEncodingException e4) {
                throw new IOException(e4);
            }
        } else {
            throw new IOException(c);
        }
    }
}
