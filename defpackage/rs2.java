package defpackage;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import vigqyno.C0201;

/* renamed from: rs2  reason: default package */
/* compiled from: PDFParser */
public class rs2 extends ns2 {
    private String w = C0201.m82(4360);
    private InputStream x = null;
    private String y = null;
    private et2 z;

    public rs2(is2 is2, String str, InputStream inputStream, String str2, boolean z2) throws IOException {
        super(is2);
        this.f = is2.length();
        this.w = str;
        this.x = inputStream;
        this.y = str2;
        A0(z2);
    }

    private void A0(boolean z2) throws IOException {
        String property = System.getProperty(C0201.m82(4361));
        if (property != null) {
            try {
                x0(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
                Log.w(C0201.m82(4364), C0201.m82(4362) + property + C0201.m82(4363));
            }
        }
        this.b = new wq2(z2);
    }

    private void D0(dr2 dr2) throws IOException {
        j0(dr2, true);
        for (tq2 tq2 : ((vq2) dr2.x()).a1()) {
            if (tq2 instanceof dr2) {
                dr2 dr22 = (dr2) tq2;
                if (dr22.x() == null) {
                    D0(dr22);
                }
            }
        }
    }

    private void E0() throws IOException {
        ft2 ft2;
        tq2 G0 = this.b.s0().G0(ar2.H);
        if (G0 != null && !(G0 instanceof br2)) {
            if (G0 instanceof dr2) {
                D0((dr2) G0);
            }
            try {
                jt2 jt2 = new jt2(this.b.H());
                if (this.x != null) {
                    KeyStore instance = KeyStore.getInstance(C0201.m82(4365));
                    instance.load(this.x, this.w.toCharArray());
                    ft2 = new lt2(instance, this.y, this.w);
                } else {
                    ft2 = new rt2(this.w);
                }
                pt2 k = jt2.k();
                this.l = k;
                k.m(jt2, this.b.E(), ft2);
                this.z = this.l.l();
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new IOException(C0201.m82(4366) + e2.getClass().getSimpleName() + C0201.m82(4367), e2);
            }
        }
    }

    public void B0() throws IOException {
        vq2 vq2;
        long Y = Y();
        if (Y > -1) {
            vq2 = p0(Y);
        } else {
            vq2 = Z() ? v0() : null;
        }
        E0();
        o0(vq2);
        dr2 A = this.b.A();
        if (A != null && (A.x() instanceof vq2)) {
            e0((vq2) A.x(), null);
            this.b.t0();
        }
        this.h = true;
    }

    public void C0() throws IOException {
        try {
            if (!l0()) {
                if (!f0()) {
                    throw new IOException(C0201.m82(4368));
                }
            }
            if (!this.h) {
                B0();
            }
            bs2.a(this.x);
        } catch (Throwable th) {
            bs2.a(this.x);
            wq2 wq2 = this.b;
            if (wq2 != null) {
                bs2.a(wq2);
                this.b = null;
            }
            throw th;
        }
    }

    public xs2 z0() throws IOException {
        return new xs2(V(), this.d, this.z);
    }
}
