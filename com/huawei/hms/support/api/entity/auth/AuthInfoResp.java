package com.huawei.hms.support.api.entity.auth;

import com.huawei.hms.core.aidl.annotation.Packed;

public class AuthInfoResp extends AbstractResp {
    @Packed
    private AuthorizationInfo authInfo;

    public AuthorizationInfo getAuthInfo() {
        return this.authInfo;
    }

    @Override // com.huawei.hms.support.api.entity.auth.AbstractResp
    public int getRtnCode() {
        return super.getRtnCode();
    }

    public void setAuthInfo(AuthorizationInfo authorizationInfo) {
        this.authInfo = authorizationInfo;
    }
}
