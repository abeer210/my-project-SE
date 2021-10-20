package com.huawei.hms.support.api.entity.hwid;

import android.content.Intent;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;

public abstract class IHwIDRespEntity extends AbstractMessageEntity {
    @Packed
    private Intent data;
    @Packed
    private int retCode;

    public Intent getData() {
        return this.data;
    }

    public int getRetCode() {
        return this.retCode;
    }

    public void setData(Intent intent) {
        this.data = intent;
    }

    public void setRetCode(int i) {
        this.retCode = i;
    }
}
