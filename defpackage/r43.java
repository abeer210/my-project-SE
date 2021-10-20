package defpackage;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import vigqyno.C0201;

/* renamed from: r43  reason: default package */
/* compiled from: Extensions */
public class r43 extends o03 {
    private Hashtable a = new Hashtable();
    private Vector b = new Vector();

    private r43(v03 v03) {
        Enumeration u = v03.u();
        while (u.hasMoreElements()) {
            q43 k = q43.k(u.nextElement());
            if (!this.a.containsKey(k.i())) {
                this.a.put(k.i(), k);
                this.b.addElement(k.i());
            } else {
                throw new IllegalArgumentException(C0201.m82(11014) + k.i());
            }
        }
    }

    public static r43 i(Object obj) {
        if (obj instanceof r43) {
            return (r43) obj;
        }
        if (obj != null) {
            return new r43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        h03 h03 = new h03();
        Enumeration elements = this.b.elements();
        while (elements.hasMoreElements()) {
            h03.a((q43) this.a.get((p03) elements.nextElement()));
        }
        return new e23(h03);
    }

    public q43 g(p03 p03) {
        return (q43) this.a.get(p03);
    }
}
