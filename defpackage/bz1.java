package defpackage;

import vigqyno.C0201;

/* renamed from: bz1  reason: default package */
public final class bz1 extends yy1 {
    private final az1 a = new az1();

    @Override // defpackage.yy1
    public final void a(Throwable th, Throwable th2) {
        if (th2 == th) {
            throw new IllegalArgumentException(C0201.m82(11560), th2);
        } else if (th2 != null) {
            this.a.a(th).add(th2);
        } else {
            throw new NullPointerException(C0201.m82(11559));
        }
    }
}
