package defpackage;

import java.util.Enumeration;

/* renamed from: j43  reason: default package */
/* compiled from: X500Name */
public class j43 extends o03 implements f03 {
    private static k43 e = m43.M;
    private boolean a;
    private int b;
    private k43 c;
    private i43[] d;

    private j43(v03 v03) {
        this(e, v03);
    }

    public static j43 g(Object obj) {
        if (obj instanceof j43) {
            return (j43) obj;
        }
        if (obj != null) {
            return new j43(v03.q(obj));
        }
        return null;
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return new e23(this.d);
    }

    @Override // defpackage.o03
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j43) && !(obj instanceof v03)) {
            return false;
        }
        if (b().equals(((g03) obj).b())) {
            return true;
        }
        try {
            return this.c.a(this, new j43(v03.q(((g03) obj).b())));
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // defpackage.o03
    public int hashCode() {
        if (this.a) {
            return this.b;
        }
        this.a = true;
        int c2 = this.c.c(this);
        this.b = c2;
        return c2;
    }

    public i43[] i() {
        i43[] i43Arr = this.d;
        int length = i43Arr.length;
        i43[] i43Arr2 = new i43[length];
        System.arraycopy(i43Arr, 0, i43Arr2, 0, length);
        return i43Arr2;
    }

    public String toString() {
        return this.c.b(this);
    }

    private j43(k43 k43, v03 v03) {
        this.c = k43;
        this.d = new i43[v03.size()];
        Enumeration u = v03.u();
        int i = 0;
        while (u.hasMoreElements()) {
            this.d[i] = i43.i(u.nextElement());
            i++;
        }
    }
}
