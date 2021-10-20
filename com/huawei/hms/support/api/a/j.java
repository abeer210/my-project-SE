package com.huawei.hms.support.api.a;

import android.app.Activity;
import android.content.Context;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.location.NavigationRequest;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.support.api.a.b.g;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.location.enhance.RequestNavigationStateRequest;
import com.huawei.hms.utils.JsonUtil;
import vigqyno.C0201;

/* compiled from: LocationEnhanceClientImpl */
public class j extends HuaweiApi<r> implements h {
    private static final i a = new i();
    private static final Api<r> b = new Api<>(C0201.m82(34471));

    public j(Activity activity, r rVar) {
        super(activity, (Api) b, (Api.ApiOptions) rVar, (AbstractClientBuilder) a);
    }

    @Override // com.huawei.hms.support.api.a.h
    public Task<NavigationResult> a(NavigationRequest navigationRequest) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        RequestNavigationStateRequest requestNavigationStateRequest = new RequestNavigationStateRequest(getContext());
        String tid = requestNavigationStateRequest.getTid();
        String r3 = C0201.m82(34472);
        if (navigationRequest != null) {
            try {
                requestNavigationStateRequest.setNavigationRequest(navigationRequest);
                return doWrite(new g(C0201.m82(34473), JsonUtil.createJsonString(requestNavigationStateRequest), requestNavigationStateRequest.getTid()));
            } catch (ApiException e) {
                b.d(r3, tid, C0201.m82(34475) + e.getMessage());
                taskCompletionSource.setException(e);
                return taskCompletionSource.getTask();
            } catch (Exception unused) {
                b.d(r3, tid, C0201.m82(34474));
                taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
                return taskCompletionSource.getTask();
            }
        } else {
            throw new ApiException(new Status(10801, a.a(10801)));
        }
    }

    @Override // com.huawei.hms.common.HuaweiApi
    public int getApiLevel() {
        return 2;
    }

    public j(Context context, r rVar) {
        super(context, b, rVar, a);
    }
}
