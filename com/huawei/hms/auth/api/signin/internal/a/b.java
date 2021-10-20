package com.huawei.hms.auth.api.signin.internal.a;

import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.auth.api.signin.internal.c;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: SignInNoticeClientImpl */
public class b extends HuaweiApi<a> {
    private static final Api<a> a = new Api<>(C0201.m82(14913));
    private static final a c = new a();
    private Context b;

    /* compiled from: SignInNoticeClientImpl */
    public static class a implements Api.ApiOptions.Optional {
    }

    public b(Context context) {
        super(context, a, c, new c());
        this.b = context;
        setKitSdkVersion(com.huawei.hms.auth.api.signin.internal.c.a.a());
    }

    public void a() {
        String r0 = C0201.m82(14914);
        HMSLog.i(r0, C0201.m82(14915));
        Context context = getContext();
        int a2 = com.huawei.hms.auth.api.signin.internal.c.a.a();
        String r3 = C0201.m82(14916);
        String reportEntry = HiAnalyticsClient.reportEntry(context, r3, a2);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(14917), 1);
            jSONObject.put(C0201.m82(14918), C0201.m82(14919));
            jSONObject.put(C0201.m82(14920), Util.getCpId(this.b));
            doWrite(new a(r3, jSONObject.toString(), reportEntry));
        } catch (JSONException unused) {
            HMSLog.w(r0, C0201.m82(14921));
        }
    }
}
