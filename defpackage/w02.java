package defpackage;

import java.util.concurrent.Executor;

/* renamed from: w02  reason: default package */
public final class w02<ResultT> implements b12<ResultT> {
    private final Executor a;
    private final Object b = new Object();
    private final o02<ResultT> c;

    public w02(Executor executor, o02<ResultT> o02) {
        this.a = executor;
        this.c = o02;
    }

    @Override // defpackage.b12
    public final void a(s02<ResultT> s02) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new v02(this, s02));
            }
        }
    }
}
