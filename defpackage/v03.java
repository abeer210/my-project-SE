package defpackage;

import defpackage.hb3;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import vigqyno.C0201;

/* renamed from: v03  reason: default package */
/* compiled from: ASN1Sequence */
public abstract class v03 extends u03 implements Object<g03> {
    public Vector a;

    public v03() {
        this.a = new Vector();
    }

    public static v03 q(Object obj) {
        if (obj == null || (obj instanceof v03)) {
            return (v03) obj;
        }
        if (obj instanceof w03) {
            return q(((w03) obj).b());
        }
        if (obj instanceof byte[]) {
            try {
                return q(u03.k((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException(C0201.m82(18057) + e.getMessage());
            }
        } else {
            if (obj instanceof g03) {
                u03 b = ((g03) obj).b();
                if (b instanceof v03) {
                    return (v03) b;
                }
            }
            throw new IllegalArgumentException(C0201.m82(18058) + obj.getClass().getName());
        }
    }

    public static v03 r(b13 b13, boolean z) {
        if (z) {
            if (b13.t()) {
                u03 r = b13.r();
                r.b();
                return q(r);
            }
            throw new IllegalArgumentException(C0201.m82(18059));
        } else if (b13.t()) {
            if (b13 instanceof m13) {
                return new i13(b13.r());
            }
            return new q23(b13.r());
        } else if (b13.r() instanceof v03) {
            return (v03) b13.r();
        } else {
            throw new IllegalArgumentException(C0201.m82(18060) + b13.getClass().getName());
        }
    }

    private g03 s(Enumeration enumeration) {
        return (g03) enumeration.nextElement();
    }

    @Override // defpackage.u03
    public boolean g(u03 u03) {
        if (!(u03 instanceof v03)) {
            return false;
        }
        v03 v03 = (v03) u03;
        if (size() != v03.size()) {
            return false;
        }
        Enumeration u = u();
        Enumeration u2 = v03.u();
        while (u.hasMoreElements()) {
            g03 s = s(u);
            g03 s2 = s(u2);
            u03 b = s.b();
            u03 b2 = s2.b();
            if (b != b2 && !b.equals(b2)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.o03
    public int hashCode() {
        Enumeration u = u();
        int size = size();
        while (u.hasMoreElements()) {
            size = (size * 17) ^ s(u).hashCode();
        }
        return size;
    }

    public Iterator<g03> iterator() {
        return new hb3.a(v());
    }

    @Override // defpackage.u03
    public boolean l() {
        return true;
    }

    @Override // defpackage.u03
    public u03 o() {
        e23 e23 = new e23();
        e23.a = this.a;
        return e23;
    }

    @Override // defpackage.u03
    public u03 p() {
        q23 q23 = new q23();
        q23.a = this.a;
        return q23;
    }

    public int size() {
        return this.a.size();
    }

    public g03 t(int i) {
        return (g03) this.a.elementAt(i);
    }

    public String toString() {
        return this.a.toString();
    }

    public Enumeration u() {
        return this.a.elements();
    }

    public g03[] v() {
        g03[] g03Arr = new g03[size()];
        for (int i = 0; i != size(); i++) {
            g03Arr[i] = t(i);
        }
        return g03Arr;
    }

    public v03(g03 g03) {
        Vector vector = new Vector();
        this.a = vector;
        vector.addElement(g03);
    }

    public v03(h03 h03) {
        this.a = new Vector();
        for (int i = 0; i != h03.c(); i++) {
            this.a.addElement(h03.b(i));
        }
    }

    public v03(g03[] g03Arr) {
        this.a = new Vector();
        for (int i = 0; i != g03Arr.length; i++) {
            this.a.addElement(g03Arr[i]);
        }
    }
}
