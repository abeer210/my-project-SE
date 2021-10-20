package defpackage;

import vigqyno.C0201;

/* renamed from: jm1  reason: default package */
public final class jm1 implements sm1 {
    private sm1[] a;

    public jm1(sm1... sm1Arr) {
        this.a = sm1Arr;
    }

    @Override // defpackage.sm1
    public final boolean a(Class<?> cls) {
        for (sm1 sm1 : this.a) {
            if (sm1.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.sm1
    public final rm1 b(Class<?> cls) {
        sm1[] sm1Arr = this.a;
        for (sm1 sm1 : sm1Arr) {
            if (sm1.a(cls)) {
                return sm1.b(cls);
            }
        }
        String r1 = C0201.m82(7985);
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
    }
}
