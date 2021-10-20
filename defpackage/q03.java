package defpackage;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: q03  reason: default package */
/* compiled from: ASN1OctetString */
public abstract class q03 extends u03 implements r03 {
    public byte[] a;

    public q03(byte[] bArr) {
        if (bArr != null) {
            this.a = bArr;
            return;
        }
        throw new NullPointerException(C0201.m82(14033));
    }

    public static q03 q(Object obj) {
        if (obj == null || (obj instanceof q03)) {
            return (q03) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return q(u03.k((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(14034) + e.getMessage());
            }
        } else {
            if (obj instanceof g03) {
                u03 b = ((g03) obj).b();
                if (b instanceof q03) {
                    return (q03) b;
                }
            }
            throw new IllegalArgumentException(C0201.m82(14035) + obj.getClass().getName());
        }
    }

    public static q03 r(b13 b13, boolean z) {
        u03 r = b13.r();
        if (z || (r instanceof q03)) {
            return q(r);
        }
        return g13.u(v03.q(r));
    }

    @Override // defpackage.r03
    public InputStream a() {
        return new ByteArrayInputStream(this.a);
    }

    @Override // defpackage.u23
    public u03 d() {
        b();
        return this;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof q03)) {
            return false;
        }
        return hb3.a(this.a, ((q03) u03).a);
    }

    @Override // defpackage.o03
    public int hashCode() {
        return hb3.h(s());
    }

    @Override // defpackage.u03
    public u03 o() {
        return new a23(this.a);
    }

    @Override // defpackage.u03
    public u03 p() {
        return new a23(this.a);
    }

    public byte[] s() {
        return this.a;
    }

    public String toString() {
        return C0201.m82(14036) + mb3.b(qb3.b(this.a));
    }
}
