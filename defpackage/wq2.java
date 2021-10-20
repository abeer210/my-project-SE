package defpackage;

import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import vigqyno.C0201;

/* renamed from: wq2  reason: default package */
/* compiled from: COSDocument */
public class wq2 extends tq2 implements Closeable {
    private final Map<er2, dr2> a;
    private final Map<er2, Long> b;
    private vq2 c;
    private boolean d;
    private boolean e;
    private ks2 f;

    public wq2(boolean z) {
        this(null, z);
    }

    public dr2 A() throws IOException {
        dr2 g0 = g0(ar2.l);
        if (g0 != null) {
            return g0;
        }
        throw new IOException(C0201.m82(2692));
    }

    public sq2 E() {
        return (sq2) s0().k0(ar2.P);
    }

    public void F0(long j) {
    }

    public void G0(vq2 vq2) {
        this.c = vq2;
    }

    public vq2 H() {
        return (vq2) this.c.k0(ar2.H);
    }

    public void H0(float f2) {
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.e) {
            List<dr2> q0 = q0();
            if (q0 != null) {
                for (dr2 dr2 : q0) {
                    tq2 x = dr2.x();
                    if (x instanceof fr2) {
                        ((fr2) x).close();
                    }
                }
            }
            ks2 ks2 = this.f;
            if (ks2 != null) {
                ks2.close();
            }
            this.e = true;
        }
    }

    @Override // java.lang.Object
    public void finalize() throws IOException {
        if (!this.e) {
            if (this.d) {
                Log.w(C0201.m82(2693), C0201.m82(2694));
            }
            close();
        }
    }

    public dr2 g0(ar2 ar2) throws IOException {
        String r0 = C0201.m82(2695);
        for (dr2 dr2 : this.a.values()) {
            tq2 x = dr2.x();
            if (x instanceof vq2) {
                try {
                    tq2 G0 = ((vq2) x).G0(ar2.x0);
                    if (G0 instanceof ar2) {
                        if (((ar2) G0).equals(ar2)) {
                            return dr2;
                        }
                    } else if (G0 != null) {
                        Log.d(r0, C0201.m82(2696) + G0 + C0201.m82(2697));
                    }
                } catch (ClassCastException e2) {
                    Log.w(r0, e2.getMessage(), e2);
                }
            }
        }
        return null;
    }

    public boolean isClosed() {
        return this.e;
    }

    public dr2 k0(er2 er2) throws IOException {
        dr2 dr2 = er2 != null ? this.a.get(er2) : null;
        if (dr2 == null) {
            dr2 = new dr2(null);
            if (er2 != null) {
                dr2.g0(er2.e());
                dr2.E(er2.d());
                this.a.put(er2, dr2);
            }
        }
        return dr2;
    }

    public List<dr2> q0() {
        return new ArrayList(this.a.values());
    }

    public void r(Map<er2, Long> map) {
        this.b.putAll(map);
    }

    public vq2 s0() {
        return this.c;
    }

    public void t0() {
    }

    public void u0(boolean z) {
    }

    public fr2 x(vq2 vq2) {
        fr2 fr2 = new fr2(this.f);
        for (Map.Entry<ar2, tq2> entry : vq2.A()) {
            fr2.n1(entry.getKey(), entry.getValue());
        }
        return fr2;
    }

    public wq2(File file, boolean z) {
        this.a = new HashMap();
        this.b = new HashMap();
        this.d = true;
        this.e = false;
        if (z) {
            try {
                this.f = new ks2(file);
            } catch (IOException e2) {
                Log.e(C0201.m82(2690), C0201.m82(2691), e2);
            }
        }
    }
}
