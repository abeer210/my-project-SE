package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import vigqyno.C0201;

/* renamed from: j50  reason: default package */
/* compiled from: DefaultSerialExecutorService */
public class j50 extends i50 implements ExecutorService {
    public j50(Executor executor) {
        super(C0201.m82(31673), 1, executor, new LinkedBlockingQueue());
    }

    @Override // defpackage.i50
    public synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
