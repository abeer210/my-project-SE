package defpackage;

import vigqyno.C0201;

/* renamed from: ka1  reason: default package */
public final class ka1 implements ta1 {
    private ta1[] a;

    public ka1(ta1... ta1Arr) {
        this.a = ta1Arr;
    }

    @Override // defpackage.ta1
    public final ua1 a(Class<?> cls) {
        ta1[] ta1Arr = this.a;
        for (ta1 ta1 : ta1Arr) {
            if (ta1.b(cls)) {
                return ta1.a(cls);
            }
        }
        String r1 = C0201.m82(12775);
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
    }

    @Override // defpackage.ta1
    public final boolean b(Class<?> cls) {
        for (ta1 ta1 : this.a) {
            if (ta1.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
