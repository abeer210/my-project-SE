package defpackage;

import java.util.concurrent.Executor;

/* renamed from: y02  reason: default package */
public final class y02<ResultT> implements b12<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final p02 c;

    public y02(Executor executor, p02 p02) {
        this.a = executor;
        this.c = p02;
    }

    @Override // defpackage.b12
    public final void a(s02<ResultT> s02) {
        if (!s02.g()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new x02(this, s02));
                }
            }
        }
    }
}
