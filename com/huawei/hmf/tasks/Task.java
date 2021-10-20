package com.huawei.hmf.tasks;

import android.app.Activity;
import java.util.concurrent.Executor;
import vigqyno.C0201;

public abstract class Task<TResult> {
    public Task<TResult> addOnCanceledListener(Activity activity, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(C0201.m82(3965));
    }

    public Task<TResult> addOnCanceledListener(OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(C0201.m82(3966));
    }

    public Task<TResult> addOnCanceledListener(Executor executor, OnCanceledListener onCanceledListener) {
        throw new UnsupportedOperationException(C0201.m82(3967));
    }

    public Task<TResult> addOnCompleteListener(Activity activity, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(C0201.m82(3968));
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(C0201.m82(3969));
    }

    public Task<TResult> addOnCompleteListener(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException(C0201.m82(3970));
    }

    public abstract Task<TResult> addOnFailureListener(Activity activity, OnFailureListener onFailureListener);

    public abstract Task<TResult> addOnFailureListener(OnFailureListener onFailureListener);

    public abstract Task<TResult> addOnFailureListener(Executor executor, OnFailureListener onFailureListener);

    public abstract Task<TResult> addOnSuccessListener(Activity activity, OnSuccessListener<TResult> onSuccessListener);

    public abstract Task<TResult> addOnSuccessListener(OnSuccessListener<TResult> onSuccessListener);

    public abstract Task<TResult> addOnSuccessListener(Executor executor, OnSuccessListener<TResult> onSuccessListener);

    public <TContinuationResult> Task<TContinuationResult> continueWith(Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException(C0201.m82(3971));
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(Executor executor, Continuation<TResult, TContinuationResult> continuation) {
        throw new UnsupportedOperationException(C0201.m82(3972));
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(C0201.m82(3973));
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(Executor executor, Continuation<TResult, Task<TContinuationResult>> continuation) {
        throw new UnsupportedOperationException(C0201.m82(3974));
    }

    public abstract Exception getException();

    public abstract TResult getResult();

    public abstract <E extends Throwable> TResult getResultThrowException(Class<E> cls) throws Throwable;

    public abstract boolean isCanceled();

    public abstract boolean isComplete();

    public abstract boolean isSuccessful();

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException(C0201.m82(3975));
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(Executor executor, SuccessContinuation<TResult, TContinuationResult> successContinuation) {
        throw new UnsupportedOperationException(C0201.m82(3976));
    }
}
