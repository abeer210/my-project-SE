package defpackage;

import vigqyno.C0201;

/* renamed from: hw0  reason: default package */
public final class hw0 implements pw0 {
    private pw0[] a;

    public hw0(pw0... pw0Arr) {
        this.a = pw0Arr;
    }

    @Override // defpackage.pw0
    public final ow0 a(Class<?> cls) {
        pw0[] pw0Arr = this.a;
        for (pw0 pw0 : pw0Arr) {
            if (pw0.b(cls)) {
                return pw0.a(cls);
            }
        }
        String r1 = C0201.m82(1456);
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? r1.concat(valueOf) : new String(r1));
    }

    @Override // defpackage.pw0
    public final boolean b(Class<?> cls) {
        for (pw0 pw0 : this.a) {
            if (pw0.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
