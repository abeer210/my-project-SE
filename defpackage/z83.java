package defpackage;

import defpackage.g93;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: z83  reason: default package */
/* compiled from: BDSStateMap */
public class z83 implements Serializable {
    private final Map<Integer, y83> a = new TreeMap();

    public z83() {
    }

    private void e(m93 m93, long j, byte[] bArr, byte[] bArr2) {
        s93 g = m93.g();
        int d = g.d();
        long j2 = v93.j(j, d);
        int i = v93.i(j, d);
        g93.b bVar = (g93.b) new g93.b().h(j2);
        bVar.p(i);
        g93 g93 = (g93) bVar.l();
        int i2 = (1 << d) - 1;
        if (i < i2) {
            if (a(0) == null || i == 0) {
                b(0, new y83(g, bArr, bArr2, g93));
            }
            d(0, bArr, bArr2, g93);
        }
        for (int i3 = 1; i3 < m93.d(); i3++) {
            int i4 = v93.i(j2, d);
            j2 = v93.j(j2, d);
            g93.b bVar2 = (g93.b) ((g93.b) new g93.b().g(i3)).h(j2);
            bVar2.p(i4);
            g93 g932 = (g93) bVar2.l();
            if (i4 < i2 && v93.m(j, d, i3)) {
                if (a(i3) == null) {
                    b(i3, new y83(m93.g(), bArr, bArr2, g932));
                }
                d(i3, bArr, bArr2, g932);
            }
        }
    }

    public y83 a(int i) {
        return this.a.get(ib3.a(i));
    }

    public void b(int i, y83 y83) {
        this.a.put(ib3.a(i), y83);
    }

    public void c(s93 s93) {
        for (Integer num : this.a.keySet()) {
            y83 y83 = this.a.get(num);
            y83.f(s93);
            y83.g();
        }
    }

    public y83 d(int i, byte[] bArr, byte[] bArr2, g93 g93) {
        return this.a.put(ib3.a(i), this.a.get(ib3.a(i)).c(bArr, bArr2, g93));
    }

    public z83(m93 m93, long j, byte[] bArr, byte[] bArr2) {
        for (long j2 = 0; j2 < j; j2++) {
            e(m93, j2, bArr, bArr2);
        }
    }
}
