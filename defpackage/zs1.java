package defpackage;

import java.util.concurrent.Executor;
import vigqyno.C0201;

/* renamed from: zs1  reason: default package */
public abstract class zs1<TResult> {
    public zs1<TResult> a(Executor executor, ts1 ts1) {
        throw new UnsupportedOperationException(C0201.m82(20929));
    }

    public zs1<TResult> b(us1<TResult> us1) {
        throw new UnsupportedOperationException(C0201.m82(20930));
    }

    public zs1<TResult> c(Executor executor, us1<TResult> us1) {
        throw new UnsupportedOperationException(C0201.m82(20931));
    }

    public abstract zs1<TResult> d(vs1 vs1);

    public abstract zs1<TResult> e(Executor executor, vs1 vs1);

    public abstract zs1<TResult> f(ws1<? super TResult> ws1);

    public abstract zs1<TResult> g(Executor executor, ws1<? super TResult> ws1);

    public <TContinuationResult> zs1<TContinuationResult> h(ss1<TResult, TContinuationResult> ss1) {
        throw new UnsupportedOperationException(C0201.m82(20932));
    }

    public <TContinuationResult> zs1<TContinuationResult> i(Executor executor, ss1<TResult, TContinuationResult> ss1) {
        throw new UnsupportedOperationException(C0201.m82(20933));
    }

    public <TContinuationResult> zs1<TContinuationResult> j(Executor executor, ss1<TResult, zs1<TContinuationResult>> ss1) {
        throw new UnsupportedOperationException(C0201.m82(20934));
    }

    public abstract Exception k();

    public abstract TResult l();

    public abstract <X extends Throwable> TResult m(Class<X> cls) throws Throwable;

    public abstract boolean n();

    public abstract boolean o();

    public abstract boolean p();

    public <TContinuationResult> zs1<TContinuationResult> q(Executor executor, ys1<TResult, TContinuationResult> ys1) {
        throw new UnsupportedOperationException(C0201.m82(20935));
    }
}
