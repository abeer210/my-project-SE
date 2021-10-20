package com.huawei.hms.support.api.client;

import com.huawei.hms.common.api.Releasable;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

@Deprecated
public abstract class ResultCallbacks<R extends Result> implements ResultCallback<R> {
    private static final String TAG = null;

    static {
        C0201.m83(ResultCallbacks.class, 515);
    }

    public abstract void onFailure(Status status);

    public abstract void onSuccess(R r);

    public final void onResult(R r) {
        try {
            Status status = r.getStatus();
            if (status.isSuccess()) {
                onSuccess(r);
                return;
            }
            onFailure(status);
            if (r instanceof Releasable) {
                ((Releasable) r).release();
            }
        } catch (Exception e) {
            HMSLog.w(C0201.m82(2188), C0201.m82(2186) + r + C0201.m82(2187) + e);
        }
    }
}
