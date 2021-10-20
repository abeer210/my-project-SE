package com.huawei.hms.rn.location.backend.utils;

import android.app.Activity;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;

/* compiled from: lambda */
public final /* synthetic */ class z implements OnSuccessListener {
    public final /* synthetic */ HMSMethod a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ HMSCallback c;

    public /* synthetic */ z(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback) {
        this.a = hMSMethod;
        this.b = activity;
        this.c = hMSCallback;
    }

    @Override // com.huawei.hmf.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        PlatformUtils.c(this.a, this.b, this.c, obj);
    }
}
