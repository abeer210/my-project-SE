package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.log.HMSLog;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public abstract class ErrorResultImpl<R extends Result> extends PendingResult<R> {
    private static final String TAG = null;
    private R result = null;
    private int statusCode;

    static {
        C0201.m83(ErrorResultImpl.class, 358);
    }

    public ErrorResultImpl(int i) {
        this.statusCode = i;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private R newResultInstance(int i) {
        String r0 = C0201.m82(24162);
        Type genericSuperclass = ErrorResultImpl.class.getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        try {
            R r = (R) ((Result) GenericTypeReflector.getType(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]).newInstance());
            this.result = r;
            r.setStatus(new Status(i));
        } catch (InstantiationException unused) {
            HMSLog.e(r0, C0201.m82(24164));
        } catch (IllegalAccessException unused2) {
            HMSLog.e(r0, C0201.m82(24163));
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        return await(0, null);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(ResultCallback<R> resultCallback) {
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return newResultInstance(this.statusCode);
        }
        throw new IllegalStateException(C0201.m82(24165));
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, final ResultCallback<R> resultCallback) {
        if (looper == null) {
            looper = Looper.myLooper();
        }
        new Handler(looper).post(new Runnable() {
            /* class com.huawei.hms.support.api.ErrorResultImpl.AnonymousClass1 */

            public void run() {
                ResultCallback resultCallback = resultCallback;
                ErrorResultImpl errorResultImpl = ErrorResultImpl.this;
                resultCallback.onResult(errorResultImpl.newResultInstance(errorResultImpl.statusCode));
            }
        });
    }
}
