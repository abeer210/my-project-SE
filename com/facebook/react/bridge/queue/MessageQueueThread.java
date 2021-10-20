package com.facebook.react.bridge.queue;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@zh0
public interface MessageQueueThread {
    @zh0
    void assertIsOnThread();

    @zh0
    void assertIsOnThread(String str);

    @zh0
    <T> Future<T> callOnQueue(Callable<T> callable);

    @zh0
    MessageQueueThreadPerfStats getPerfStats();

    @zh0
    boolean isOnThread();

    @zh0
    void quitSynchronous();

    @zh0
    void resetPerfStats();

    @zh0
    void runOnQueue(Runnable runnable);
}
