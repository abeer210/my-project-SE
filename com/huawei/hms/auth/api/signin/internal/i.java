package com.huawei.hms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInResult;
import com.huawei.hms.auth.api.signin.internal.b.a;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import org.json.JSONException;
import vigqyno.C0201;

/* compiled from: HuaweiSignInCommon */
public final class i {
    public static Intent a(Context context, HuaweiIdSignInOptions huaweiIdSignInOptions, String str) {
        Intent intent = new Intent(C0201.m82(31549));
        intent.setPackage(context.getPackageName());
        intent.setClass(context, HwIdSignInHubActivity.class);
        String appId = Util.getAppId(context);
        String packageName = context.getPackageName();
        a aVar = new a();
        aVar.a(appId);
        aVar.b(packageName);
        aVar.a(30003300);
        aVar.c(str);
        HuaweiIdSignInRequest huaweiIdSignInRequest = new HuaweiIdSignInRequest();
        huaweiIdSignInRequest.setHuaweiIdSignInOptions(huaweiIdSignInOptions);
        try {
            intent.putExtra(C0201.m82(31550), aVar.b());
            intent.putExtra(C0201.m82(31551), huaweiIdSignInRequest.toJson());
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(31552), C0201.m82(31553));
        }
        return intent;
    }

    public static SignInHuaweiId b() {
        return a.a().b();
    }

    public static HuaweiIdSignInResult a(Intent intent) {
        if (intent != null) {
            String r1 = C0201.m82(31554);
            if (intent.hasExtra(r1)) {
                try {
                    return new HuaweiIdSignInResult().fromJson(intent.getStringExtra(r1));
                } catch (JSONException unused) {
                    HMSLog.e(C0201.m82(31555), C0201.m82(31556));
                }
            }
        }
        return null;
    }

    public static void a() {
        a.a().c();
    }

    public static HuaweiIdSignInOptions a(Scope... scopeArr) {
        HuaweiIdSignInOptions.Builder builder = new HuaweiIdSignInOptions.Builder();
        if (scopeArr.length > 0) {
            builder.requestScopes(scopeArr[0], scopeArr);
        }
        for (Scope scope : scopeArr) {
            if (a(scope, C0201.m82(31557))) {
                builder.requestShippingAddress();
            }
        }
        return builder.build();
    }

    private static boolean a(Scope scope, String str) {
        if (scope != null) {
            return TextUtils.equals(scope.getScopeUri(), str);
        }
        return false;
    }
}
