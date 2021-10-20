package defpackage;

import java.util.concurrent.Executor;

/* renamed from: ft1  reason: default package */
public final class ft1<TResult, TContinuationResult> implements ts1, vs1, ws1<TContinuationResult>, rt1<TResult> {
    private final Executor a;
    private final ss1<TResult, zs1<TContinuationResult>> b;
    private final ut1<TContinuationResult> c;

    public ft1(Executor executor, ss1<TResult, zs1<TContinuationResult>> ss1, ut1<TContinuationResult> ut1) {
        this.a = executor;
        this.b = ss1;
        this.c = ut1;
    }

    @Override // defpackage.rt1
    public final void a(zs1<TResult> zs1) {
        this.a.execute(new gt1(this, zs1));
    }

    @Override // defpackage.ts1
    public final void onCanceled() {
        this.c.v();
    }

    @Override // defpackage.vs1
    public final void onFailure(Exception exc) {
        this.c.r(exc);
    }

    @Override // defpackage.ws1
    public final void onSuccess(TContinuationResult tcontinuationresult) {
        this.c.s(tcontinuationresult);
    }
}
