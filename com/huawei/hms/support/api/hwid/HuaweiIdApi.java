package com.huawei.hms.support.api.hwid;

import android.app.Activity;
import android.content.Intent;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInResult;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import vigqyno.C0201;

public interface HuaweiIdApi {
    public static final String EXTRA_SIGN_IN_ACCOUNT = null;

    static {
        C0201.m83(HuaweiIdApi.class, 629);
    }

    SignInResult getHwIdSignInResultFromIntent(Intent intent);

    @Deprecated
    Intent getSignInIntent(HuaweiApiClient huaweiApiClient);

    HuaweiIdSignInResult getSignInResultFromIntent(Intent intent);

    PendingResult<AddressResult> queryShippingAddress(HuaweiApiClient huaweiApiClient, SignInHuaweiId signInHuaweiId);

    PendingResult<Status> revokeAccess(HuaweiApiClient huaweiApiClient);

    PendingResult<SignInResult> signIn(Activity activity, HuaweiApiClient huaweiApiClient);

    PendingResult<SignInResult> signInBackend(HuaweiApiClient huaweiApiClient);

    PendingResult<Status> signOut(HuaweiApiClient huaweiApiClient);

    OptionalPendingResult<HuaweiIdSignInResult> silentSignIn(HuaweiApiClient huaweiApiClient);
}
