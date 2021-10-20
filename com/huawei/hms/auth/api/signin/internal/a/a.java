package com.huawei.hms.auth.api.signin.internal.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcelable;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.auth.api.signin.internal.b;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.common.ActivityMgr;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import vigqyno.C0201;

/* compiled from: NoticeTaskApiCall */
public class a extends TaskApiCall<b, Intent> {
    public a(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<Intent> taskCompletionSource) {
        int statusCode = responseErrorCode.getStatusCode();
        String r10 = C0201.m82(14570);
        if (statusCode == 0 && responseErrorCode.getErrorCode() == 0) {
            HMSLog.i(r10, C0201.m82(14571));
            a(responseErrorCode.getParcelable());
        } else {
            HMSLog.w(r10, C0201.m82(14572) + responseErrorCode.getErrorCode() + C0201.m82(14573) + responseErrorCode.getErrorReason());
        }
        HiAnalyticsClient.reportExit(bVar.getContext(), getUri(), getTransactionId(), responseErrorCode.getStatusCode(), responseErrorCode.getErrorCode(), com.huawei.hms.auth.api.signin.internal.c.a.a());
    }

    private void a(Parcelable parcelable) {
        Activity currentActivity = ActivityMgr.INST.getCurrentActivity();
        String r0 = C0201.m82(14566);
        if (currentActivity == null || currentActivity.isFinishing() || currentActivity.isDestroyed()) {
            HMSLog.i(r0, C0201.m82(14569));
        } else if (parcelable instanceof Intent) {
            try {
                currentActivity.startActivity((Intent) parcelable);
            } catch (Exception unused) {
                HMSLog.e(r0, C0201.m82(14567));
            }
        } else if (parcelable instanceof PendingIntent) {
            try {
                currentActivity.startIntentSender(((PendingIntent) parcelable).getIntentSender(), null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                HMSLog.e(r0, C0201.m82(14568));
            }
        }
    }
}
