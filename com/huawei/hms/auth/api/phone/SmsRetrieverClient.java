package com.huawei.hms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.a.a.a.a;
import com.huawei.hms.a.a.a.d;
import com.huawei.hms.a.a.a.f;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

public class SmsRetrieverClient extends HuaweiApi<a> implements SmsRetrieverApi {
    public SmsRetrieverClient(Activity activity, Api<a> api, a aVar, AbstractClientBuilder abstractClientBuilder) {
        super(activity, (Api) api, (Api.ApiOptions) aVar, abstractClientBuilder);
    }

    private d a() {
        return new d(getContext().getPackageName());
    }

    @Override // com.huawei.hms.auth.api.phone.SmsRetrieverApi
    public Task<Void> startSmsRetriever() {
        String a = a().a();
        if (!TextUtils.isEmpty(a)) {
            return doWrite(new f(C0201.m82(35153), a));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        taskCompletionSource.setException(new ApiException(new Status(2020, C0201.m82(35152))));
        return taskCompletionSource.getTask();
    }

    public SmsRetrieverClient(Context context, Api<a> api, a aVar, AbstractClientBuilder abstractClientBuilder) {
        super(context, api, aVar, abstractClientBuilder);
    }
}
