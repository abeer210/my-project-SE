package com.huawei.hms.support.api.hwid;

import android.content.Intent;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.Status;

public class SignInResult extends Result {
    private Intent data;
    private SignInHuaweiId signInHuaweiId;

    public SignInResult() {
    }

    public Intent getData() {
        return this.data;
    }

    public SignInHuaweiId getSignInHuaweiId() {
        return this.signInHuaweiId;
    }

    public boolean isSuccess() {
        return getStatus().isSuccess();
    }

    public void setData(Intent intent) {
        this.data = intent;
    }

    public void setSignInHuaweiId(SignInHuaweiId signInHuaweiId2) {
        this.signInHuaweiId = signInHuaweiId2;
    }

    public SignInResult(Status status) {
        setStatus(status);
    }
}
