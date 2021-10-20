package defpackage;

import java.util.concurrent.Callable;

/* renamed from: vt1  reason: default package */
public final class vt1 implements Runnable {
    private final /* synthetic */ ut1 a;
    private final /* synthetic */ Callable b;

    public vt1(ut1 ut1, Callable callable) {
        this.a = ut1;
        this.b = callable;
    }

    public final void run() {
        try {
            this.a.s(this.b.call());
        } catch (Exception e) {
            this.a.r(e);
        }
    }
}
