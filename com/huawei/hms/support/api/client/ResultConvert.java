package com.huawei.hms.support.api.client;

import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Result;
import vigqyno.C0201;

public abstract class ResultConvert<R extends Result, S extends Result> {

    public class FailPendingResult extends EmptyPendingResult {
        public FailPendingResult(Status status) {
            setResult(status);
        }
    }

    public final PendingResult newFailedPendingResult(Status status) {
        Preconditions.checkNotNull(status, C0201.m82(7370));
        Preconditions.checkArgument(!status.isSuccess(), C0201.m82(7371));
        return new FailPendingResult(status);
    }

    public Status onFailed(Status status) {
        Preconditions.checkNotNull(status, C0201.m82(7372));
        if (status.getStatusCode() != 0) {
            return status;
        }
        return Status.CoreException;
    }

    public abstract PendingResult onSuccess(Result result);
}
