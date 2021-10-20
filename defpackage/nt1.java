package defpackage;

import java.util.concurrent.Executor;

/* renamed from: nt1  reason: default package */
public final class nt1<TResult> implements rt1<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private ws1<? super TResult> c;

    public nt1(Executor executor, ws1<? super TResult> ws1) {
        this.a = executor;
        this.c = ws1;
    }

    @Override // defpackage.rt1
    public final void a(zs1<TResult> zs1) {
        if (zs1.p()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new ot1(this, zs1));
                }
            }
        }
    }
}
