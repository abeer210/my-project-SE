package com.huawei.hms.rn.location.backend.utils;

import android.app.Activity;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;

/* compiled from: lambda */
public final /* synthetic */ class x implements OnFailureListener {
    public final /* synthetic */ HMSMethod a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ HMSCallback c;

    public /* synthetic */ x(HMSMethod hMSMethod, Activity activity, HMSCallback hMSCallback) {
        this.a = hMSMethod;
        this.b = activity;
        this.c = hMSCallback;
    }

    @Override // com.huawei.hmf.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        PlatformUtils.a(this.a, this.b, this.c, exc);
    }
}
