package com.huawei.hms.rn.location.backend.utils;

import android.app.Activity;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.rn.location.backend.interfaces.HMSCallback;
import com.huawei.hms.rn.location.backend.interfaces.Mapper;
import com.huawei.hms.rn.location.backend.logger.HMSMethod;

/* compiled from: lambda */
public final /* synthetic */ class w implements OnSuccessListener {
    public final /* synthetic */ HMSCallback a;
    public final /* synthetic */ HMSMethod b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ Mapper d;

    public /* synthetic */ w(HMSCallback hMSCallback, HMSMethod hMSMethod, Activity activity, Mapper mapper) {
        this.a = hMSCallback;
        this.b = hMSMethod;
        this.c = activity;
        this.d = mapper;
    }

    @Override // com.huawei.hmf.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        PlatformUtils.d(this.a, this.b, this.c, this.d, obj);
    }
}
