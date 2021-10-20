package com.huawei.hms.rn.location.backend.utils;

import android.app.Activity;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;
import org.json.JSONObject;

/* compiled from: lambda */
public final /* synthetic */ class y implements OnSuccessListener {
    public final /* synthetic */ HMSMethod a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ HMSCallback c;
    public final /* synthetic */ JSONObject d;

    public /* synthetic */ y(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback, JSONObject jSONObject) {
        this.a = hMSMethod;
        this.b = activity;
        this.c = hMSCallback;
        this.d = jSONObject;
    }

    @Override // com.huawei.hmf.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        PlatformUtils.e(this.a, this.b, this.c, this.d, obj);
    }
}
