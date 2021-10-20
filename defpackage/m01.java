package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: m01  reason: default package */
public interface m01 {
    ScheduledExecutorService a(int i, ThreadFactory threadFactory, int i2);

    ExecutorService b(ThreadFactory threadFactory, int i);
}
