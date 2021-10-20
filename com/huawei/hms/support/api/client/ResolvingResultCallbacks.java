package com.huawei.hms.support.api.client;

import android.app.Activity;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

@Deprecated
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {
    private static final String TAG = null;
    private final Activity mActivity;
    private final int requestCode;

    static {
        C0201.m83(ResolvingResultCallbacks.class, 715);
    }

    public ResolvingResultCallbacks(Activity activity, int i) {
        this.mActivity = (Activity) Preconditions.checkNotNull(activity, C0201.m82(12659));
        this.requestCode = i;
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public final void onFailure(Status status) {
        try {
            if (status.hasResolution()) {
                status.startResolutionForResult(this.mActivity, this.requestCode);
            } else {
                onUnresolvableFailure(status);
            }
        } catch (Exception e) {
            HMSLog.e(C0201.m82(12661), C0201.m82(12660) + e);
            onUnresolvableFailure(Status.RESULT_INTERNAL_ERROR);
        }
    }

    @Override // com.huawei.hms.support.api.client.ResultCallbacks
    public abstract void onSuccess(R r);

    public abstract void onUnresolvableFailure(Status status);
}
