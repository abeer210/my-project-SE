package defpackage;

import defpackage.hb3;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import vigqyno.C0201;

/* renamed from: x03  reason: default package */
/* compiled from: ASN1Set */
public abstract class x03 extends u03 implements Object<g03> {
    private Vector a;
    private boolean b;

    public x03() {
        this.a = new Vector();
        this.b = false;
    }

    private byte[] q(g03 g03) {
        try {
            return g03.b().f(C0201.m82(3138));
        } catch (IOException unused) {
            throw new IllegalArgumentException(C0201.m82(3139));
        }
    }

    public static x03 r(Object obj) {
        if (obj == null || (obj instanceof x03)) {
            return (x03) obj;
        }
        if (obj instanceof y03) {
            return r(((y03) obj).b());
        }
        if (obj instanceof byte[]) {
            try {
                return r(u03.k((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(3140) + e.getMessage());
            }
        } else {
            if (obj instanceof g03) {
                u03 b2 = ((g03) obj).b();
                if (b2 instanceof x03) {
                    return (x03) b2;
                }
            }
            throw new IllegalArgumentException(C0201.m82(3141) + obj.getClass().getName());
        }
    }

    public static x03 s(b13 b13, boolean z) {
        if (z) {
            if (b13.t()) {
                return (x03) b13.r();
            }
            throw new IllegalArgumentException(C0201.m82(3142));
        } else if (b13.t()) {
            if (b13 instanceof m13) {
                return new k13(b13.r());
            }
            return new r23(b13.r());
        } else if (b13.r() instanceof x03) {
            return (x03) b13.r();
        } else {
            if (b13.r() instanceof v03) {
                v03 v03 = (v03) b13.r();
                if (b13 instanceof m13) {
                    return new k13(v03.v());
                }
                return new r23(v03.v());
            }
            throw new IllegalArgumentException(C0201.m82(3143) + b13.getClass().getName());
        }
    }

    private g03 t(Enumeration enumeration) {
        g03 g03 = (g03) enumeration.nextElement();
        return g03 == null ? y13.a : g03;
    }

    private boolean w(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i != min; i++) {
            if (bArr[i] != bArr2[i]) {
                if ((bArr[i] & 255) < (bArr2[i] & 255)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        if (min == bArr.length) {
            return true;
        }
        return false;
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof x03)) {
            return false;
        }
        x03 x03 = (x03) u03;
        if (size() != x03.size()) {
            return false;
        }
        Enumeration v = v();
        Enumeration v2 = x03.v();
        while (v.hasMoreElements()) {
            g03 t = t(v);
            g03 t2 = t(v2);
            u03 b2 = t.b();
            u03 b3 = t2.b();
            if (b2 != b3 && !b2.equals(b3)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.o03
    public int hashCode() {
        Enumeration v = v();
        int size = size();
        while (v.hasMoreElements()) {
            size = (size * 17) ^ t(v).hashCode();
        }
        return size;
    }

    public Iterator<g03> iterator() {
        return new hb3.a(y());
    }

    @Override // defpackage.u03
    public boolean l() {
        return true;
    }

    @Override // defpackage.u03
    public u03 o() {
        if (this.b) {
            g23 g23 = new g23();
            g23.a = this.a;
            return g23;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.a.size(); i++) {
            vector.addElement(this.a.elementAt(i));
        }
        g23 g232 = new g23();
        g232.a = vector;
        g232.x();
        return g232;
    }

    @Override // defpackage.u03
    public u03 p() {
        r23 r23 = new r23();
        r23.a = this.a;
        return r23;
    }

    public int size() {
        return this.a.size();
    }

    public String toString() {
        return this.a.toString();
    }

    public g03 u(int i) {
        return (g03) this.a.elementAt(i);
    }

    public Enumeration v() {
        return this.a.elements();
    }

    public void x() {
        if (!this.b) {
            this.b = true;
            if (this.a.size() > 1) {
                int size = this.a.size() - 1;
                boolean z = true;
                while (z) {
                    int i = 0;
                    byte[] q = q((g03) this.a.elementAt(0));
                    z = false;
                    int i2 = 0;
                    while (i2 != size) {
                        int i3 = i2 + 1;
                        byte[] q2 = q((g03) this.a.elementAt(i3));
                        if (w(q, q2)) {
                            q = q2;
                        } else {
                            Object elementAt = this.a.elementAt(i2);
                            Vector vector = this.a;
                            vector.setElementAt(vector.elementAt(i3), i2);
                            this.a.setElementAt(elementAt, i3);
                            i = i2;
                            z = true;
                        }
                        i2 = i3;
                    }
                    size = i;
                }
            }
        }
    }

    public g03[] y() {
        g03[] g03Arr = new g03[size()];
        for (int i = 0; i != size(); i++) {
            g03Arr[i] = u(i);
        }
        return g03Arr;
    }

    public x03(g03 g03) {
        Vector vector = new Vector();
        this.a = vector;
        this.b = false;
        vector.addElement(g03);
    }

    public x03(h03 h03, boolean z) {
        this.a = new Vector();
        this.b = false;
        for (int i = 0; i != h03.c(); i++) {
            this.a.addElement(h03.b(i));
        }
        if (z) {
            x();
        }
    }

    public x03(g03[] g03Arr, boolean z) {
        this.a = new Vector();
        this.b = false;
        for (int i = 0; i != g03Arr.length; i++) {
            this.a.addElement(g03Arr[i]);
        }
        if (z) {
            x();
        }
    }
}
