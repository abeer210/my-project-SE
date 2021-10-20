package com.huawei.hms.support.api.entity.hwid;

import android.os.Bundle;
import vigqyno.C0201;

public class SignInResp extends IHwIDRespEntity {
    @Checked(permission = "https://www.huawei.com/auth/account/base.profile/accesstoken", value = "ACCESSTOKEN")
    private String mAccessToken;
    @Checked(permission = "com.huawei.android.hms.account.getCountry", scope = "https://www.huawei.com/auth/account/country", value = "COUNTRY_CODE")
    private String mCountryCode;
    @Checked(permission = "com.huawei.android.hms.account.getBaseProfile", scope = "https://www.huawei.com/auth/account/base.profile", value = "GENDER")
    private String mGender;
    @Checked(permission = "com.huawei.android.hms.account.getBaseProfile", scope = "https://www.huawei.com/auth/account/base.profile", value = "DISPLAY_NAME")
    private String mLoginUserName;
    @Checked(permission = "com.huawei.android.hms.account.getOpenID", value = "OPEN_ID")
    private String mOpenId;
    @Checked("SCOPE")
    private String mScopeUri;
    @Checked(permission = "https://www.huawei.com/auth/account/base.profile/serviceauthcode", value = "SERVICE_AUTH_CODE")
    private String mServiceAuthCode;
    @Checked(permission = "com.huawei.android.hms.account.getCountry", scope = "https://www.huawei.com/auth/account/country", value = "SERVICE_COUNTRY_CODE")
    private String mServiceCountryCode;
    @Checked(permission = "com.huawei.android.hms.account.getUID", value = "USER_ID")
    private String mUid;
    @Checked(permission = "com.huawei.android.hms.account.getUnionId", value = "UNION_ID")
    private String mUnionID;
    @Checked(permission = "com.huawei.android.hms.account.getBaseProfile", scope = "https://www.huawei.com/auth/account/base.profile", value = "STATUS")
    private String mUserStatus;
    @Checked(permission = "com.huawei.android.hms.account.getBaseProfile", scope = "https://www.huawei.com/auth/account/base.profile", value = "PHOTO_URL")
    private String photoUrl;

    public static SignInResp buildSignInResp(Bundle bundle) {
        SignInResp signInResp = new SignInResp();
        String r1 = C0201.m82(20714);
        String r2 = C0201.m82(20715);
        signInResp.mUid = bundle.getString(r1, r2);
        signInResp.mLoginUserName = bundle.getString(C0201.m82(20716), r2);
        signInResp.photoUrl = bundle.getString(C0201.m82(20717), r2);
        signInResp.mAccessToken = bundle.getString(C0201.m82(20718), r2);
        signInResp.mUserStatus = bundle.getString(C0201.m82(20719), r2);
        signInResp.mGender = bundle.getString(C0201.m82(20720), r2);
        signInResp.mScopeUri = bundle.getString(C0201.m82(20721), r2);
        signInResp.mOpenId = bundle.getString(C0201.m82(20722), r2);
        signInResp.mServiceCountryCode = bundle.getString(C0201.m82(20723), r2);
        signInResp.mCountryCode = bundle.getString(C0201.m82(20724), r2);
        signInResp.mServiceAuthCode = bundle.getString(C0201.m82(20725), r2);
        signInResp.mUnionID = bundle.getString(C0201.m82(20726), r2);
        return signInResp;
    }

    public String getAccessToken() {
        return this.mAccessToken;
    }

    public String getCountryCode() {
        return this.mCountryCode;
    }

    public String getGender() {
        return this.mGender;
    }

    public String getLoginUserName() {
        return this.mLoginUserName;
    }

    public String getOpenId() {
        return this.mOpenId;
    }

    public String getPhotoUrl() {
        return this.photoUrl;
    }

    public String getScopeUri() {
        return this.mScopeUri;
    }

    public String getServiceAuthCode() {
        return this.mServiceAuthCode;
    }

    public String getServiceCountryCode() {
        return this.mServiceCountryCode;
    }

    public String getUid() {
        return this.mUid;
    }

    public String getUserStatus() {
        return this.mUserStatus;
    }

    public String getmUnionID() {
        return this.mUnionID;
    }
}
