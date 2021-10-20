package com.huawei.hms.auth.api.phone;

import com.huawei.hmf.tasks.Task;

public interface SmsRetrieverApi {
    Task<Void> startSmsRetriever();
}
