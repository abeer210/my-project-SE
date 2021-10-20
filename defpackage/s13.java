package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* renamed from: s13  reason: default package */
/* compiled from: DERExternal */
public class s13 extends u03 {
    private p03 a;
    private m03 b;
    private u03 c;
    private int d;
    private u03 e;

    public s13(h03 h03) {
        int i = 0;
        u03 q = q(h03, 0);
        if (q instanceof p03) {
            this.a = (p03) q;
            q = q(h03, 1);
            i = 1;
        }
        if (q instanceof m03) {
            this.b = (m03) q;
            i++;
            q = q(h03, i);
        }
        if (!(q instanceof b13)) {
            this.c = q;
            i++;
            q = q(h03, i);
        }
        if (h03.c() != i + 1) {
            throw new IllegalArgumentException(C0201.m82(35993));
        } else if (q instanceof b13) {
            b13 b13 = (b13) q;
            r(b13.s());
            this.e = b13.r();
        } else {
            throw new IllegalArgumentException(C0201.m82(35992));
        }
    }

    private u03 q(h03 h03, int i) {
        if (h03.c() > i) {
            return h03.b(i).b();
        }
        throw new IllegalArgumentException(C0201.m82(35994));
    }

    private void r(int i) {
        if (i < 0 || i > 2) {
            throw new IllegalArgumentException(C0201.m82(35995) + i);
        }
        this.d = i;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        u03 u032;
        m03 m03;
        p03 p03;
        if (!(u03 instanceof s13)) {
            return false;
        }
        if (this == u03) {
            return true;
        }
        s13 s13 = (s13) u03;
        p03 p032 = this.a;
        if (p032 != null && ((p03 = s13.a) == null || !p03.equals(p032))) {
            return false;
        }
        m03 m032 = this.b;
        if (m032 != null && ((m03 = s13.b) == null || !m03.equals(m032))) {
            return false;
        }
        u03 u033 = this.c;
        if (u033 == null || ((u032 = s13.c) != null && u032.equals(u033))) {
            return this.e.equals(s13.e);
        }
        return false;
    }

    @Override // defpackage.o03
    public int hashCode() {
        p03 p03 = this.a;
        int hashCode = p03 != null ? p03.hashCode() : 0;
        m03 m03 = this.b;
        if (m03 != null) {
            hashCode ^= m03.hashCode();
        }
        u03 u03 = this.c;
        if (u03 != null) {
            hashCode ^= u03.hashCode();
        }
        return hashCode ^ this.e.hashCode();
    }

    @Override // defpackage.u03
    public void i(s03 s03) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        p03 p03 = this.a;
        String r2 = C0201.m82(35996);
        if (p03 != null) {
            byteArrayOutputStream.write(p03.f(r2));
        }
        m03 m03 = this.b;
        if (m03 != null) {
            byteArrayOutputStream.write(m03.f(r2));
        }
        u03 u03 = this.c;
        if (u03 != null) {
            byteArrayOutputStream.write(u03.f(r2));
        }
        byteArrayOutputStream.write(new j23(true, this.d, this.e).f(r2));
        s03.f(32, 8, byteArrayOutputStream.toByteArray());
    }

    @Override // defpackage.u03
    public int j() throws IOException {
        return e().length;
    }

    @Override // defpackage.u03
    public boolean l() {
        return true;
    }
}
