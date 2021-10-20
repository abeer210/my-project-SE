package com.huawei.hms.auth.api.signin.internal;

import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInResult;
import com.huawei.hms.auth.api.signin.internal.a.b;
import com.huawei.hms.auth.api.signin.internal.b.a;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: HuaweiIdSignInTaskApiCall */
public class f extends TaskApiCall<b, SignInHuaweiId> {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;

    static {
        C0201.m83(f.class, 96);
    }

    public f(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(b bVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<SignInHuaweiId> taskCompletionSource) {
        int i;
        SignInHuaweiId signInHuaweiId;
        String str2 = c;
        HMSLog.i(str2, b + String.valueOf(responseErrorCode.getErrorCode()));
        int errorCode = responseErrorCode.getErrorCode();
        if (!TextUtils.isEmpty(str)) {
            try {
                HuaweiIdSignInResult fromJson = new HuaweiIdSignInResult().fromJson(str);
                errorCode = fromJson.getStatus().getStatusCode();
                if (fromJson.isSuccess()) {
                    HMSLog.i(str2, g);
                    new b(bVar.getContext()).a();
                    signInHuaweiId = fromJson.getSignInAccount();
                    try {
                        taskCompletionSource.setResult(fromJson.getSignInAccount());
                    } catch (JSONException unused) {
                    }
                } else {
                    HMSLog.i(str2, e);
                    taskCompletionSource.setException(new ApiException(fromJson.getStatus()));
                    signInHuaweiId = null;
                }
            } catch (JSONException unused2) {
                signInHuaweiId = null;
                HMSLog.w(str2, d);
                taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
                i = errorCode;
                a.a().a(signInHuaweiId, (HuaweiIdSignInOptions) null);
                HiAnalyticsClient.reportExit(bVar.getContext(), f, getTransactionId(), com.huawei.hms.auth.api.signin.internal.c.b.a(i), i, com.huawei.hms.auth.api.signin.internal.c.a.a());
            }
            i = errorCode;
        } else {
            HMSLog.i(str2, a);
            taskCompletionSource.setException(new ApiException(new Status(responseErrorCode.getErrorCode(), responseErrorCode.getErrorReason())));
            i = errorCode;
            signInHuaweiId = null;
        }
        a.a().a(signInHuaweiId, (HuaweiIdSignInOptions) null);
        HiAnalyticsClient.reportExit(bVar.getContext(), f, getTransactionId(), com.huawei.hms.auth.api.signin.internal.c.b.a(i), i, com.huawei.hms.auth.api.signin.internal.c.a.a());
    }
}
