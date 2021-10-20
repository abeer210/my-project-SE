package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import vigqyno.C0201;

/* renamed from: ss2  reason: default package */
/* compiled from: PDFXrefStreamParser */
public class ss2 extends ms2 {
    private final fr2 c;
    private final vs2 d;

    public ss2(fr2 fr2, wq2 wq2, vs2 vs2) throws IOException {
        super(new ps2(fr2.B1()));
        this.b = wq2;
        this.c = fr2;
        this.d = vs2;
    }

    public void I() throws IOException {
        tq2 k0 = this.c.k0(ar2.B0);
        if (k0 instanceof sq2) {
            sq2 sq2 = (sq2) k0;
            sq2 sq22 = (sq2) this.c.k0(ar2.R);
            if (sq22 == null) {
                sq22 = new sq2();
                sq22.r(zq2.e);
                sq22.r(this.c.k0(ar2.t0));
            }
            ArrayList arrayList = new ArrayList();
            Iterator<tq2> it = sq22.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                long E = ((zq2) it.next()).E();
                int A = ((zq2) it.next()).A();
                for (int i = 0; i < A; i++) {
                    arrayList.add(Long.valueOf(((long) i) + E));
                }
            }
            Iterator it2 = arrayList.iterator();
            int i2 = sq2.getInt(0);
            int i3 = sq2.getInt(1);
            int i4 = sq2.getInt(2);
            int i5 = i2 + i3 + i4;
            while (!this.a.j() && it2.hasNext()) {
                byte[] bArr = new byte[i5];
                this.a.read(bArr);
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    i6 += (bArr[i7] & 255) << (((i2 - i7) - 1) * 8);
                }
                Long l = (Long) it2.next();
                if (i6 == 1) {
                    int i8 = 0;
                    for (int i9 = 0; i9 < i3; i9++) {
                        i8 += (bArr[i9 + i2] & 255) << (((i3 - i9) - 1) * 8);
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < i4; i11++) {
                        i10 += (bArr[(i11 + i2) + i3] & 255) << (((i4 - i11) - 1) * 8);
                    }
                    this.d.i(new er2(l.longValue(), i10), (long) i8);
                } else if (i6 == 2) {
                    int i12 = 0;
                    for (int i13 = 0; i13 < i3; i13++) {
                        i12 += (bArr[i13 + i2] & 255) << (((i3 - i13) - 1) * 8);
                    }
                    this.d.i(new er2(l.longValue(), 0), (long) (-i12));
                }
            }
            return;
        }
        throw new IOException(C0201.m82(31290));
    }
}
