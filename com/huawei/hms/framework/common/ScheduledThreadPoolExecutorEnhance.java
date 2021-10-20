package com.huawei.hms.framework.common;

import java.util.concurrent.Callable;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import vigqyno.C0201;

public class ScheduledThreadPoolExecutorEnhance extends ScheduledThreadPoolExecutor {
    private static final String TAG = null;

    static {
        C0201.m83(ScheduledThreadPoolExecutorEnhance.class, 508);
    }

    public ScheduledThreadPoolExecutorEnhance(int i, ThreadFactory threadFactory) {
        super(i, threadFactory);
    }

    public void beforeExecute(Thread thread, Runnable runnable) {
        if (runnable instanceof RunnableScheduledFutureEnhance) {
            String parentName = ((RunnableScheduledFutureEnhance) runnable).getParentName();
            String r1 = C0201.m82(20226);
            int lastIndexOf = parentName.lastIndexOf(r1);
            if (lastIndexOf != -1) {
                parentName = StringUtils.substring(parentName, lastIndexOf + 4);
            }
            String name = thread.getName();
            int lastIndexOf2 = name.lastIndexOf(r1);
            if (lastIndexOf2 != -1) {
                name = StringUtils.substring(name, lastIndexOf2 + 4);
            }
            thread.setName(parentName + r1 + name);
        }
        super.beforeExecute(thread, runnable);
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Runnable runnable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(runnable, runnableScheduledFuture));
    }

    @Override // java.util.concurrent.ScheduledThreadPoolExecutor
    public <V> RunnableScheduledFuture<V> decorateTask(Callable<V> callable, RunnableScheduledFuture<V> runnableScheduledFuture) {
        return new RunnableScheduledFutureEnhance(super.decorateTask(callable, runnableScheduledFuture));
    }
}
