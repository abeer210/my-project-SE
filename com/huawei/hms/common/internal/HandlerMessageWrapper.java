package com.huawei.hms.common.internal;

import com.huawei.hms.common.HuaweiApi;

public class HandlerMessageWrapper {
    public final HuaweiApi<?> mApi;
    public final BaseContentWrapper mContentWrapper;

    public HandlerMessageWrapper(BaseContentWrapper baseContentWrapper, int i, HuaweiApi<?> huaweiApi) {
        this.mContentWrapper = baseContentWrapper;
        this.mApi = huaweiApi;
    }
}
