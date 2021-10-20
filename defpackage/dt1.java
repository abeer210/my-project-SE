package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dt1  reason: default package */
public final class dt1<TResult, TContinuationResult> implements rt1<TResult> {
    private final Executor a;
    private final ss1<TResult, TContinuationResult> b;
    private final ut1<TContinuationResult> c;

    public dt1(Executor executor, ss1<TResult, TContinuationResult> ss1, ut1<TContinuationResult> ut1) {
        this.a = executor;
        this.b = ss1;
        this.c = ut1;
    }

    @Override // defpackage.rt1
    public final void a(zs1<TResult> zs1) {
        this.a.execute(new et1(this, zs1));
    }
}
