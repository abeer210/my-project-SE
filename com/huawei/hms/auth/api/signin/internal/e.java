package com.huawei.hms.auth.api.signin.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInClient;
import com.huawei.hms.auth.api.signin.internal.c.a;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: HuaweiIdSignInClientImpl */
public class e extends HuaweiApi<HuaweiIdSignInOptions> implements HuaweiIdSignInClient {
    private static final Api<HuaweiIdSignInOptions> a = new Api<>(C0201.m82(31208));

    public e(Activity activity, HuaweiIdSignInOptions huaweiIdSignInOptions) {
        super(activity, (Api) a, (Api.ApiOptions) huaweiIdSignInOptions, (AbstractClientBuilder) new c());
        setKitSdkVersion(a.a());
    }

    @Override // com.huawei.hms.auth.api.signin.HuaweiIdSignInClient
    public Intent getSignInIntent() {
        return i.a(getContext(), (HuaweiIdSignInOptions) getOption(), getSubAppID());
    }

    @Override // com.huawei.hms.auth.api.signin.HuaweiIdSignInClient
    public Task<Void> revokeAccess() {
        String r0 = C0201.m82(31209);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdSignInOptions((HuaweiIdSignInOptions) getOption());
        try {
            return doWrite(new d(r0, huaweiIdSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), r0, a.a())));
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(31210), 2015, C0201.m82(31211));
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(new Status(2015)));
            return taskCompletionSource.getTask();
        }
    }

    @Override // com.huawei.hms.auth.api.signin.HuaweiIdSignInClient
    public Task<Void> signOut() {
        i.a();
        return doWrite(new g(C0201.m82(31212), new SignOutReq().toJson()));
    }

    @Override // com.huawei.hms.auth.api.signin.HuaweiIdSignInClient
    public Task<SignInHuaweiId> silentSignIn() {
        String r0 = C0201.m82(31213);
        String r1 = C0201.m82(31214);
        HMSLog.i(r1, C0201.m82(31215));
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdSignInOptions((HuaweiIdSignInOptions) getOption());
        try {
            return doWrite(new f(r0, huaweiIdSignInRequest.toJson(), HiAnalyticsClient.reportEntry(getContext(), r0, a.a())));
        } catch (JSONException unused) {
            HMSLog.e(r1, 2015, C0201.m82(31216));
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(new Status(2015)));
            return taskCompletionSource.getTask();
        }
    }

    public e(Context context, HuaweiIdSignInOptions huaweiIdSignInOptions) {
        super(context, a, huaweiIdSignInOptions, new c());
        setKitSdkVersion(a.a());
    }
}
