package defpackage;

import vigqyno.C0201;

/* renamed from: dp  reason: default package */
/* compiled from: MultiClassKey */
public class dp {
    private Class<?> a;
    private Class<?> b;
    private Class<?> c;

    public dp() {
    }

    public void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.a = cls;
        this.b = cls2;
        this.c = cls3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || dp.class != obj.getClass()) {
            return false;
        }
        dp dpVar = (dp) obj;
        return this.a.equals(dpVar.a) && this.b.equals(dpVar.b) && fp.c(this.c, dpVar.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Class<?> cls = this.c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public String toString() {
        return C0201.m82(10559) + this.a + C0201.m82(10560) + this.b + '}';
    }

    public dp(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
