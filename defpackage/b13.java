package defpackage;

import java.io.IOException;
import vigqyno.C0201;

/* renamed from: b13  reason: default package */
/* compiled from: ASN1TaggedObject */
public abstract class b13 extends u03 implements g03, u23 {
    public int a;
    public boolean b = false;
    public boolean c = true;
    public g03 d = null;

    public b13(boolean z, int i, g03 g03) {
        if (g03 instanceof f03) {
            this.c = true;
        } else {
            this.c = z;
        }
        this.a = i;
        if (this.c) {
            this.d = g03;
            return;
        }
        boolean z2 = g03.b() instanceof x03;
        this.d = g03;
    }

    public static b13 q(Object obj) {
        if (obj == null || (obj instanceof b13)) {
            return (b13) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return q(u03.k((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(1203) + e.getMessage());
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(1204) + obj.getClass().getName());
        }
    }

    @Override // defpackage.u23
    public u03 d() {
        b();
        return this;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof b13)) {
            return false;
        }
        b13 b13 = (b13) u03;
        if (this.a != b13.a || this.b != b13.b || this.c != b13.c) {
            return false;
        }
        g03 g03 = this.d;
        if (g03 == null) {
            if (b13.d != null) {
                return false;
            }
            return true;
        } else if (!g03.b().equals(b13.d.b())) {
            return false;
        } else {
            return true;
        }
    }

    @Override // defpackage.o03
    public int hashCode() {
        int i = this.a;
        g03 g03 = this.d;
        return g03 != null ? i ^ g03.hashCode() : i;
    }

    @Override // defpackage.u03
    public u03 o() {
        return new j23(this.c, this.a, this.d);
    }

    @Override // defpackage.u03
    public u03 p() {
        return new s23(this.c, this.a, this.d);
    }

    public u03 r() {
        g03 g03 = this.d;
        if (g03 != null) {
            return g03.b();
        }
        return null;
    }

    public int s() {
        return this.a;
    }

    public boolean t() {
        return this.c;
    }

    public String toString() {
        return C0201.m82(1205) + this.a + C0201.m82(1206) + this.d;
    }
}
