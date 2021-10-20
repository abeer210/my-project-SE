package defpackage;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: qg  reason: default package */
/* compiled from: GifHeaderParser */
public class qg {
    private final byte[] a = new byte[256];
    private ByteBuffer b;
    private pg c;
    private int d = 0;

    private boolean b() {
        return this.c.b != 0;
    }

    private int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    private void e() {
        this.c.d.a = n();
        this.c.d.b = n();
        this.c.d.c = n();
        this.c.d.d = n();
        int d2 = d();
        boolean z = false;
        boolean z2 = (d2 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        og ogVar = this.c.d;
        if ((d2 & 64) != 0) {
            z = true;
        }
        ogVar.e = z;
        if (z2) {
            this.c.d.k = g(pow);
        } else {
            this.c.d.k = null;
        }
        this.c.d.j = this.b.position();
        r();
        if (!b()) {
            pg pgVar = this.c;
            pgVar.c++;
            pgVar.e.add(pgVar.d);
        }
    }

    private void f() {
        int d2 = d();
        this.d = d2;
        if (d2 > 0) {
            int i = 0;
            int i2 = 0;
            while (i < this.d) {
                try {
                    i2 = this.d - i;
                    this.b.get(this.a, i, i2);
                    i += i2;
                } catch (Exception e) {
                    String r4 = C0201.m82(1184);
                    if (Log.isLoggable(r4, 3)) {
                        Log.d(r4, C0201.m82(1185) + i + C0201.m82(1186) + i2 + C0201.m82(1187) + this.d, e);
                    }
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i) {
        byte[] bArr = new byte[(i * 3)];
        int[] iArr = null;
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                int i5 = i4 + 1;
                int i6 = i5 + 1;
                int i7 = i2 + 1;
                iArr[i2] = ((bArr[i3] & 255) << 16) | -16777216 | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                i3 = i6;
                i2 = i7;
            }
        } catch (BufferUnderflowException e) {
            String r0 = C0201.m82(1188);
            if (Log.isLoggable(r0, 3)) {
                Log.d(r0, C0201.m82(1189), e);
            }
            this.c.b = 1;
        }
        return iArr;
    }

    private void h() {
        i(C0188.f24);
    }

    private void i(int i) {
        boolean z = false;
        while (!z && !b() && this.c.c <= i) {
            int d2 = d();
            if (d2 == 33) {
                int d3 = d();
                if (d3 == 1) {
                    q();
                } else if (d3 == 249) {
                    this.c.d = new og();
                    j();
                } else if (d3 == 254) {
                    q();
                } else if (d3 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < 11; i2++) {
                        sb.append((char) this.a[i2]);
                    }
                    if (sb.toString().equals(C0201.m82(1190))) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d2 == 44) {
                pg pgVar = this.c;
                if (pgVar.d == null) {
                    pgVar.d = new og();
                }
                e();
            } else if (d2 != 59) {
                this.c.b = 1;
            } else {
                z = true;
            }
        }
    }

    private void j() {
        d();
        int d2 = d();
        og ogVar = this.c.d;
        int i = (d2 & 28) >> 2;
        ogVar.g = i;
        boolean z = true;
        if (i == 0) {
            ogVar.g = 1;
        }
        og ogVar2 = this.c.d;
        if ((d2 & 1) == 0) {
            z = false;
        }
        ogVar2.f = z;
        int n = n();
        if (n < 2) {
            n = 10;
        }
        og ogVar3 = this.c.d;
        ogVar3.i = n * 10;
        ogVar3.h = d();
        d();
    }

    private void k() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            sb.append((char) d());
        }
        if (!sb.toString().startsWith(C0201.m82(1191))) {
            this.c.b = 1;
            return;
        }
        l();
        if (this.c.h && !b()) {
            pg pgVar = this.c;
            pgVar.a = g(pgVar.i);
            pg pgVar2 = this.c;
            pgVar2.l = pgVar2.a[pgVar2.j];
        }
    }

    private void l() {
        this.c.f = n();
        this.c.g = n();
        int d2 = d();
        this.c.h = (d2 & 128) != 0;
        this.c.i = (int) Math.pow(2.0d, (double) ((d2 & 7) + 1));
        this.c.j = d();
        this.c.k = d();
    }

    private void m() {
        do {
            f();
            byte[] bArr = this.a;
            if (bArr[0] == 1) {
                this.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
            }
            if (this.d <= 0) {
                return;
            }
        } while (!b());
    }

    private int n() {
        return this.b.getShort();
    }

    private void o() {
        this.b = null;
        Arrays.fill(this.a, (byte) 0);
        this.c = new pg();
        this.d = 0;
    }

    private void q() {
        int d2;
        do {
            d2 = d();
            this.b.position(Math.min(this.b.position() + d2, this.b.limit()));
        } while (d2 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.b = null;
        this.c = null;
    }

    public pg c() {
        if (this.b == null) {
            throw new IllegalStateException(C0201.m82(1192));
        } else if (b()) {
            return this.c;
        } else {
            k();
            if (!b()) {
                h();
                pg pgVar = this.c;
                if (pgVar.c < 0) {
                    pgVar.b = 1;
                }
            }
            return this.c;
        }
    }

    public qg p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
