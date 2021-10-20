package com.huawei.hms.support.api.a.b;

import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.ResponseErrorCode;
import com.huawei.hms.location.NavigationResult;
import com.huawei.hms.support.api.a.c.a.a;
import com.huawei.hms.support.api.a.c.b;
import com.huawei.hms.support.api.a.p;
import com.huawei.hms.support.api.client.Status;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: GetNavigationContextStateTaskApiCall */
public class g extends b<p, NavigationResult> {
    private int b = 0;
    private int c = 1;

    public g(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    /* renamed from: a */
    public void doExecute(p pVar, ResponseErrorCode responseErrorCode, String str, TaskCompletionSource<NavigationResult> taskCompletionSource) {
        String r5 = C0201.m82(4892);
        try {
            b.b(r5, this.a, C0201.m82(4893));
            if (responseErrorCode != null) {
                responseErrorCode.getErrorCode();
                b.a(r5, this.a, C0201.m82(4894));
                JSONObject jSONObject = new JSONObject(str);
                NavigationResult navigationResult = new NavigationResult();
                navigationResult.setState(jSONObject.getInt(C0201.m82(4895)));
                navigationResult.setPossibility(jSONObject.getInt(C0201.m82(4896)));
                com.huawei.hms.support.api.a.c.a.b.a().a(taskCompletionSource, responseErrorCode, navigationResult);
                b.a(r5, this.a, C0201.m82(4897));
                return;
            }
            throw new ApiException(new Status(10000, a.a(10000)));
        } catch (ApiException e) {
            e.getStatusCode();
            String str2 = this.a;
            b.d(r5, str2, C0201.m82(4899) + e.getMessage());
            taskCompletionSource.setException(e);
        } catch (Exception unused) {
            b.d(r5, this.a, C0201.m82(4898));
            taskCompletionSource.setException(new ApiException(new Status(10000, a.a(10000))));
        }
    }
}
