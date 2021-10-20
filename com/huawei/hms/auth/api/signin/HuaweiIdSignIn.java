package com.huawei.hms.auth.api.signin;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.auth.api.signin.internal.e;
import com.huawei.hms.auth.api.signin.internal.i;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.hwid.HuaweiIdSignInOptions;
import com.huawei.hms.support.api.hwid.SignInHuaweiId;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import vigqyno.C0201;

public final class HuaweiIdSignIn {
    private static Intent a(Activity activity, Scope... scopeArr) {
        return getClient(activity, i.a(scopeArr)).getSignInIntent();
    }

    public static SignInHuaweiId getAccountForExtension(Context context, HuaweiIdSignInOptionsExtension huaweiIdSignInOptionsExtension) {
        Preconditions.checkNotNull(context, C0201.m82(7158));
        Preconditions.checkNotNull(huaweiIdSignInOptionsExtension, C0201.m82(7159));
        SignInHuaweiId lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = SignInHuaweiId.createDefault();
        }
        return lastSignedInAccount.requestExtraScopes(a(huaweiIdSignInOptionsExtension.getImpliedScopes()));
    }

    public static SignInHuaweiId getAccountForScopes(Context context, Scope scope, Scope... scopeArr) {
        Preconditions.checkNotNull(context, C0201.m82(7160));
        Preconditions.checkNotNull(scope, C0201.m82(7161));
        SignInHuaweiId lastSignedInAccount = getLastSignedInAccount(context);
        if (lastSignedInAccount == null) {
            lastSignedInAccount = SignInHuaweiId.createDefault();
        }
        lastSignedInAccount.requestExtraScopes(scope);
        lastSignedInAccount.requestExtraScopes(scopeArr);
        return lastSignedInAccount;
    }

    public static HuaweiIdSignInClient getClient(Context context, HuaweiIdSignInOptions huaweiIdSignInOptions) {
        return new e(context, huaweiIdSignInOptions);
    }

    public static SignInHuaweiId getLastSignedInAccount(Context context) {
        return i.b();
    }

    public static Task<SignInHuaweiId> getSignedInAccountFromIntent(Intent intent) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        HuaweiIdSignInResult a = i.a(intent);
        if (a == null) {
            taskCompletionSource.setException(new ApiException(new Status(8)));
        } else if (!a.isSuccess() || a.getSignInAccount() == null) {
            taskCompletionSource.setException(new ApiException(a.getStatus()));
        } else {
            taskCompletionSource.setResult(a.getSignInAccount());
        }
        return taskCompletionSource.getTask();
    }

    public static boolean hasPermissions(SignInHuaweiId signInHuaweiId, HuaweiIdSignInOptionsExtension huaweiIdSignInOptionsExtension) {
        Preconditions.checkNotNull(huaweiIdSignInOptionsExtension, C0201.m82(7162));
        return hasPermissions(signInHuaweiId, a(huaweiIdSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(Activity activity, int i, SignInHuaweiId signInHuaweiId, HuaweiIdSignInOptionsExtension huaweiIdSignInOptionsExtension) {
        Preconditions.checkNotNull(activity, C0201.m82(7163));
        Preconditions.checkNotNull(huaweiIdSignInOptionsExtension, C0201.m82(7164));
        requestPermissions(activity, i, signInHuaweiId, a(huaweiIdSignInOptionsExtension.getImpliedScopes()));
    }

    public static HuaweiIdSignInClient getClient(Activity activity, HuaweiIdSignInOptions huaweiIdSignInOptions) {
        return new e(activity, huaweiIdSignInOptions);
    }

    private static Scope[] a(List<Scope> list) {
        return list == null ? new Scope[0] : (Scope[]) list.toArray(new Scope[list.size()]);
    }

    public static boolean hasPermissions(SignInHuaweiId signInHuaweiId, Scope... scopeArr) {
        if (signInHuaweiId == null) {
            return false;
        }
        if (scopeArr == null) {
            return true;
        }
        HashSet hashSet = new HashSet();
        Collections.addAll(hashSet, scopeArr);
        return signInHuaweiId.getGrantedScopes().containsAll(hashSet);
    }

    public static void requestPermissions(Fragment fragment, int i, SignInHuaweiId signInHuaweiId, HuaweiIdSignInOptionsExtension huaweiIdSignInOptionsExtension) {
        Preconditions.checkNotNull(fragment, C0201.m82(7167));
        Preconditions.checkNotNull(huaweiIdSignInOptionsExtension, C0201.m82(7168));
        requestPermissions(fragment, i, signInHuaweiId, a(huaweiIdSignInOptionsExtension.getImpliedScopes()));
    }

    public static void requestPermissions(Activity activity, int i, SignInHuaweiId signInHuaweiId, Scope... scopeArr) {
        Preconditions.checkNotNull(activity, C0201.m82(7165));
        Preconditions.checkNotNull(scopeArr, C0201.m82(7166));
        activity.startActivityForResult(a(activity, scopeArr), i);
    }

    public static void requestPermissions(Fragment fragment, int i, SignInHuaweiId signInHuaweiId, Scope... scopeArr) {
        String r2 = C0201.m82(7169);
        Preconditions.checkNotNull(fragment, r2);
        Preconditions.checkNotNull(scopeArr, r2);
        fragment.startActivityForResult(a(fragment.getActivity(), scopeArr), i);
    }
}
