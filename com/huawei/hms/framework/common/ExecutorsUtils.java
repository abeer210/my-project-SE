package com.huawei.hms.framework.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0188;
import vigqyno.C0201;

public class ExecutorsUtils {
    private static final String THREADNAME_HEADER = null;

    static {
        C0201.m83(ExecutorsUtils.class, 589);
    }

    public static ThreadFactory createThreadFactory(final String str) {
        if (str != null && !str.trim().isEmpty()) {
            return new ThreadFactory() {
                /* class com.huawei.hms.framework.common.ExecutorsUtils.AnonymousClass1 */
                private final AtomicInteger threadNumbers = new AtomicInteger(0);

                public Thread newThread(Runnable runnable) {
                    return new Thread(runnable, C0201.m82(5002) + str + C0201.m82(5003) + this.threadNumbers.getAndIncrement());
                }
            };
        }
        throw new NullPointerException(C0201.m82(17322));
    }

    public static ExecutorService newCachedThreadPool(String str) {
        return new ThreadPoolExcutorEnhance(0, C0188.f24, 60, TimeUnit.SECONDS, new SynchronousQueue(), createThreadFactory(str));
    }

    public static ExecutorService newFixedThreadPool(int i, String str) {
        return new ThreadPoolExcutorEnhance(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), createThreadFactory(str));
    }

    public static ScheduledExecutorService newScheduledThreadPool(int i, String str) {
        return new ScheduledThreadPoolExecutorEnhance(i, createThreadFactory(str));
    }

    public static ExecutorService newSingleThreadExecutor(String str) {
        return ExecutorsEnhance.newSingleThreadExecutor(createThreadFactory(str));
    }
}
