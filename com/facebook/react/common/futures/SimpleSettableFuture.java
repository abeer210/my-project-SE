package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import vigqyno.C0201;

public class SimpleSettableFuture<T> implements Future<T> {
    private final CountDownLatch a = new CountDownLatch(1);
    private T b;
    private Exception c;

    private void a() {
        if (this.a.getCount() == 0) {
            throw new RuntimeException(C0201.m82(18534));
        }
    }

    public T b() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public void c(T t) {
        a();
        this.b = t;
        this.a.countDown();
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void d(Exception exc) {
        a();
        this.c = exc;
        this.a.countDown();
    }

    @Override // java.util.concurrent.Future
    public T get() throws InterruptedException, ExecutionException {
        this.a.await();
        if (this.c == null) {
            return this.b;
        }
        throw new ExecutionException(this.c);
    }

    public boolean isCancelled() {
        return false;
    }

    public boolean isDone() {
        return this.a.getCount() == 0;
    }

    @Override // java.util.concurrent.Future
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.a.await(j, timeUnit)) {
            throw new TimeoutException(C0201.m82(18535));
        } else if (this.c == null) {
            return this.b;
        } else {
            throw new ExecutionException(this.c);
        }
    }
}
