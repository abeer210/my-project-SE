package defpackage;

import java.util.concurrent.Executor;

/* renamed from: r12  reason: default package */
public final /* synthetic */ class r12 implements Executor {
    public static final Executor a = new r12();

    private r12() {
    }

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
