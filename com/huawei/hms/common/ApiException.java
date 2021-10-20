package com.huawei.hms.common;

import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

public class ApiException extends Exception {
    public final Status mStatus;

    /* JADX WARNING: Illegal instructions before constructor call */
    public ApiException(Status status) {
        super(r0.toString());
        StringBuilder sb = new StringBuilder();
        sb.append(status.getStatusCode());
        sb.append(C0201.m82(17201));
        sb.append(status.getStatusMessage() != null ? status.getStatusMessage() : C0201.m82(17202));
        this.mStatus = status;
    }

    public int getStatusCode() {
        return this.mStatus.getStatusCode();
    }

    @Deprecated
    public String getStatusMessage() {
        return this.mStatus.getStatusMessage();
    }
}
