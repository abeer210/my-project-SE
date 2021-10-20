package defpackage;

import java.util.concurrent.Executor;

/* renamed from: a12  reason: default package */
public final class a12<ResultT> implements b12<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final q02<? super ResultT> c;

    public a12(Executor executor, q02<? super ResultT> q02) {
        this.a = executor;
        this.c = q02;
    }

    @Override // defpackage.b12
    public final void a(s02<ResultT> s02) {
        if (s02.g()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new z02(this, s02));
                }
            }
        }
    }
}
