package defpackage;

import vigqyno.C0201;

/* renamed from: w7  reason: default package */
/* compiled from: TaskCompletionSource */
public class w7<TResult> {
    private final v7<TResult> a = new v7<>();

    public v7<TResult> a() {
        return this.a;
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException(C0201.m82(10879));
        }
    }

    public void c(Exception exc) {
        if (!f(exc)) {
            throw new IllegalStateException(C0201.m82(10880));
        }
    }

    public void d(TResult tresult) {
        if (!g(tresult)) {
            throw new IllegalStateException(C0201.m82(10881));
        }
    }

    public boolean e() {
        return this.a.p();
    }

    public boolean f(Exception exc) {
        return this.a.q(exc);
    }

    public boolean g(TResult tresult) {
        return this.a.r(tresult);
    }
}
