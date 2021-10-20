package defpackage;

import vigqyno.C0201;

/* renamed from: a11  reason: default package */
public final class a11 extends w01 {
    private final z01 a = new z01();

    @Override // defpackage.w01
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException(C0201.m82(12944), th2);
        } else if (th2 != null) {
            this.a.a(th, true).add(th2);
        } else {
            throw new NullPointerException(C0201.m82(12943));
        }
    }
}
