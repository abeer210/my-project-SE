package defpackage;

import vigqyno.C0201;

/* renamed from: jw2  reason: default package */
/* compiled from: ClassReference.kt */
public final class jw2 implements ax2<Object>, iw2 {
    private final Class<?> a;

    public jw2(Class<?> cls) {
        ow2.c(cls, C0201.m82(27234));
        this.a = cls;
    }

    @Override // defpackage.iw2
    public Class<?> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jw2) && ow2.a(fw2.a(this), fw2.a((ax2) obj));
    }

    public int hashCode() {
        return fw2.a(this).hashCode();
    }

    public String toString() {
        return a().toString() + C0201.m82(27235);
    }
}
