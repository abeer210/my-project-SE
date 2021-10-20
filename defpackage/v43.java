package defpackage;

import vigqyno.C0201;

/* renamed from: v43  reason: default package */
/* compiled from: Time */
public class v43 extends o03 implements f03 {
    public u03 a;

    public v43(u03 u03) {
        if ((u03 instanceof c13) || (u03 instanceof k03)) {
            this.a = u03;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(22342));
    }

    public static v43 g(Object obj) {
        if (obj == null || (obj instanceof v43)) {
            return (v43) obj;
        }
        if (obj instanceof c13) {
            return new v43((c13) obj);
        }
        if (obj instanceof k03) {
            return new v43((k03) obj);
        }
        throw new IllegalArgumentException(C0201.m82(22343) + obj.getClass().getName());
    }

    @Override // defpackage.o03, defpackage.g03
    public u03 b() {
        return this.a;
    }

    public String i() {
        u03 u03 = this.a;
        if (u03 instanceof c13) {
            return ((c13) u03).q();
        }
        return ((k03) u03).u();
    }

    public String toString() {
        return i();
    }
}
