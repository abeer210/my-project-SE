package com.huawei.hms.auth.api.signin;

import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;

public interface HuaweiIdSignInClient {
    Intent getSignInIntent();

    Task<Void> revokeAccess();

    boolean setSubAppInfo(SubAppInfo subAppInfo);

    Task<Void> signOut();

    Task<SignInHuaweiId> silentSignIn();
}
