package com.huawei.hms.support.api.hwid;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hmf.tasks.OnCompleteListener;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.api.HuaweiApiClientImpl;
import com.huawei.hms.auth.api.signin.HuaweiIdSignIn;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInResult;
import com.huawei.hms.auth.api.signin.internal.i;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.common.api.OptionalPendingResult;
import com.huawei.hms.common.api.internal.OptionalPendingResultImpl;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.api.entity.hwid.QueryShippingAddressReq;
import com.huawei.hms.support.api.entity.hwid.QueryShippingAddressResp;
import com.huawei.hms.support.api.entity.hwid.RevokeAccessResp;
import com.huawei.hms.support.api.entity.hwid.ShippingAddressInfo;
import com.huawei.hms.support.api.entity.hwid.ShippingAddressParcelable;
import com.huawei.hms.support.api.entity.hwid.SignInReq;
import com.huawei.hms.support.api.entity.hwid.SignInResp;
import com.huawei.hms.support.api.entity.hwid.SignOutReq;
import com.huawei.hms.support.api.entity.hwid.SignOutResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import vigqyno.C0201;

public class HuaweiIdApiImpl implements HuaweiIdApi {
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;
    public static final String j = null;
    public static final String k = null;
    public static final String l = null;
    public static final String m = null;
    public static final String n = null;
    public static final String o = null;
    public static final String p = null;
    public static final String q = null;
    public static final String r = null;
    public static final String s = null;
    public static final String t = null;
    public static final String u = null;
    private HuaweiApiClient a = null;
    private WeakReference<Activity> b = null;

    /* access modifiers changed from: protected */
    public static class SignOutNoConnectPendingResult extends PendingResultImpl<Status, SignOutResp> {
        private ResultCallback a;

        public SignOutNoConnectPendingResult(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        public ResultCallback getCallback() {
            return this.a;
        }

        @Override // com.huawei.hms.support.api.client.PendingResult, com.huawei.hms.support.api.PendingResultImpl
        public void setResultCallback(ResultCallback<Status> resultCallback) {
            this.a = resultCallback;
        }

        public Status onComplete(SignOutResp signOutResp) {
            Status status = new Status(0);
            HMSLog.i(C0201.m82(35422), C0201.m82(35423));
            return status;
        }
    }

    /* access modifiers changed from: protected */
    public static class SignOutOnCompleteListener implements OnCompleteListener<Void> {
        private final SignOutNoConnectPendingResult a;

        public SignOutOnCompleteListener(SignOutNoConnectPendingResult signOutNoConnectPendingResult) {
            this.a = signOutNoConnectPendingResult;
        }

        @Override // com.huawei.hmf.tasks.OnCompleteListener
        public void onComplete(Task<Void> task) {
            String r0 = C0201.m82(3663);
            HMSLog.i(r0, C0201.m82(3664));
            if (this.a == null) {
                HMSLog.e(r0, C0201.m82(3665));
                return;
            }
            Status status = Status.FAILURE;
            if (task.isSuccessful()) {
                status = Status.SUCCESS;
            } else {
                Exception exception = task.getException();
                if (exception == null || !(exception instanceof ApiException)) {
                    HMSLog.e(r0, C0201.m82(3666));
                } else {
                    status = new Status(((ApiException) exception).getStatusCode());
                }
            }
            ResultCallback callback = this.a.getCallback();
            if (callback != null) {
                callback.onResult(status);
            } else {
                HMSLog.e(r0, C0201.m82(3667));
            }
        }
    }

    private class a implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private a() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult != null && resolveResult.getStatus().isSuccess() && (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) != null && value.getStatusCode() == 0) {
                String r4 = C0201.m82(142);
                HMSLog.d(r4, C0201.m82(143));
                Activity validActivity = Util.getValidActivity((Activity) HuaweiIdApiImpl.this.b.get(), HuaweiIdApiImpl.this.a.getTopActivity());
                if (validActivity == null) {
                    HMSLog.e(r4, C0201.m82(144));
                } else {
                    validActivity.startActivity(noticeIntent);
                }
            }
        }
    }

    static class b extends PendingResultImpl<AddressResult, QueryShippingAddressResp> {
        public b(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        /* renamed from: a */
        public AddressResult onComplete(QueryShippingAddressResp queryShippingAddressResp) {
            Bundle extras;
            String r0 = C0201.m82(20);
            if (queryShippingAddressResp == null) {
                HMSLog.e(r0, C0201.m82(21));
                return new AddressResult(new Status(2005));
            }
            HMSLog.i(r0, C0201.m82(22) + queryShippingAddressResp.getRetCode());
            int retCode = queryShippingAddressResp.getRetCode();
            AddressResult addressResult = new AddressResult();
            addressResult.setStatus(queryShippingAddressResp.getCommonStatus());
            ArrayList<ShippingAddressInfo> arrayList = null;
            if (retCode == 0) {
                Intent data = queryShippingAddressResp.getData();
                if (data == null || (extras = data.getExtras()) == null) {
                    HMSLog.e(r0, C0201.m82(25));
                } else {
                    extras.setClassLoader(b.class.getClassLoader());
                    ShippingAddressParcelable shippingAddressParcelable = (ShippingAddressParcelable) extras.getParcelable(C0201.m82(23));
                    if (shippingAddressParcelable != null) {
                        arrayList = shippingAddressParcelable.getShippingAddressInfoList();
                    } else {
                        HMSLog.e(r0, C0201.m82(24));
                    }
                }
            } else {
                HMSLog.e(r0, C0201.m82(26));
            }
            addressResult.setShippingAddressInfoList(arrayList);
            return addressResult;
        }
    }

    static class c extends PendingResultImpl<Status, RevokeAccessResp> {
        public c(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        /* renamed from: a */
        public Status onComplete(RevokeAccessResp revokeAccessResp) {
            HMSLog.i(C0201.m82(64), C0201.m82(65));
            return new Status(revokeAccessResp.getRetCode());
        }
    }

    static class d extends PendingResultImpl<Status, SignOutResp> {
        public d(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        /* renamed from: a */
        public Status onComplete(SignOutResp signOutResp) {
            Status status = new Status(0);
            HMSLog.i(C0201.m82(490), C0201.m82(491));
            return status;
        }
    }

    static {
        C0201.m83(HuaweiIdApiImpl.class, 87);
    }

    private SignInReq c(HuaweiApiClient huaweiApiClient) {
        List<Scope> a2 = a(huaweiApiClient);
        List<PermissionInfo> b2 = b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        for (Scope scope : a2) {
            hashSet.add(scope.getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        for (PermissionInfo permissionInfo : b2) {
            hashSet2.add(permissionInfo.getPermission());
        }
        return new SignInReq(hashSet, hashSet2);
    }

    public static int conversionGender(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(28127);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static HashSet<Scope> conversionScopes(String str) {
        HashSet<Scope> hashSet = new HashSet<>();
        if (str != null) {
            for (String str2 : str.split(C0201.m82(28128))) {
                hashSet.add(new Scope(str2));
            }
        }
        return hashSet;
    }

    public static int conversionStatus(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(28129);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private PendingResult<Status> d(HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28130), C0201.m82(28131));
        Task<Void> signOut = HuaweiIdSignIn.getClient(huaweiApiClient.getContext(), getSignInOption(huaweiApiClient)).signOut();
        SignOutNoConnectPendingResult signOutNoConnectPendingResult = new SignOutNoConnectPendingResult(huaweiApiClient, C0201.m82(28132), new SignOutReq());
        signOut.addOnCompleteListener(new SignOutOnCompleteListener(signOutNoConnectPendingResult));
        return signOutNoConnectPendingResult;
    }

    public HuaweiIdSignInResult getHuaweiIdSignInResultFromIntent(Intent intent) {
        Status status;
        Bundle extras;
        HuaweiIdSignInResult huaweiIdSignInResult = new HuaweiIdSignInResult();
        String r1 = C0201.m82(28133);
        if (intent == null || (extras = intent.getExtras()) == null) {
            status = new Status(2003);
            HMSLog.e(r1, C0201.m82(28137));
        } else {
            int i2 = extras.getInt(C0201.m82(28134), 0);
            status = new Status(i2);
            if (i2 == 0) {
                huaweiIdSignInResult.setSignInHuaweiId(a(extras));
                HMSLog.i(r1, C0201.m82(28135));
            } else {
                HMSLog.i(r1, C0201.m82(28136));
            }
        }
        huaweiIdSignInResult.setStatus(status);
        return huaweiIdSignInResult;
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public SignInResult getHwIdSignInResultFromIntent(Intent intent) {
        Bundle extras;
        PendingIntent pendingIntent;
        String r1 = C0201.m82(28138);
        if (intent == null || (extras = intent.getExtras()) == null) {
            SignInResult signInResult = new SignInResult(new Status(2003));
            HMSLog.e(r1, C0201.m82(28159));
            return signInResult;
        }
        int i2 = extras.getInt(C0201.m82(28139), 0);
        if (i2 == 0) {
            String string = extras.getString(C0201.m82(28140));
            String r4 = C0201.m82(28141);
            String r5 = C0201.m82(28142);
            String string2 = extras.getString(r4, r5);
            String string3 = extras.getString(C0201.m82(28143));
            String string4 = extras.getString(C0201.m82(28144));
            String string5 = extras.getString(C0201.m82(28145));
            String string6 = extras.getString(C0201.m82(28146));
            String string7 = extras.getString(C0201.m82(28147));
            String string8 = extras.getString(C0201.m82(28148));
            SignInHuaweiId build = SignInHuaweiId.build(extras.getString(C0201.m82(28149), r5), string2, extras.getString(C0201.m82(28150), r5), extras.getString(C0201.m82(28151)), extras.getString(C0201.m82(28152), r5), extras.getString(C0201.m82(28153), r5), conversionStatus(string3), conversionGender(string), conversionScopes(string4), extras.getString(C0201.m82(28154), r5), extras.getString(C0201.m82(28155), r5), extras.getString(C0201.m82(28156), r5));
            build.setIdToken(string5);
            build.setEmail(string6);
            build.setFamilyName(string7);
            build.setGivenName(string8);
            Status status = new Status(i2);
            SignInResult signInResult2 = new SignInResult(status);
            signInResult2.setStatus(status);
            signInResult2.setSignInHuaweiId(build);
            HMSLog.i(r1, C0201.m82(28157));
            return signInResult2;
        }
        if (i2 == 2002 || i2 == 2004) {
            pendingIntent = PendingIntent.getActivity(this.a.getContext(), new SecureRandom().nextInt(), intent, 0);
        } else {
            pendingIntent = null;
        }
        Status status2 = new Status(i2, (String) null, pendingIntent);
        SignInResult signInResult3 = new SignInResult(status2);
        signInResult3.setStatus(status2);
        signInResult3.setData(intent);
        HMSLog.i(r1, C0201.m82(28158));
        return signInResult3;
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public Intent getSignInIntent(HuaweiApiClient huaweiApiClient) {
        Context context = huaweiApiClient.getContext();
        HuaweiIdSignInOptions signInOption = getSignInOption(huaweiApiClient);
        String str = null;
        if (signInOption == null) {
            return null;
        }
        if (huaweiApiClient.getSubAppInfo() != null) {
            str = huaweiApiClient.getSubAppInfo().getSubAppID();
        }
        return i.a(context, signInOption, str);
    }

    public HuaweiIdSignInOptions getSignInOption(HuaweiApiClient huaweiApiClient) {
        Api.ApiOptions apiOptions;
        Map<Api<?>, Api.ApiOptions> apiMap = huaweiApiClient.getApiMap();
        if (apiMap == null || (apiOptions = apiMap.get(HuaweiId.SIGN_IN_API)) == null || !(apiOptions instanceof HuaweiIdSignInOptions)) {
            return null;
        }
        return (HuaweiIdSignInOptions) apiOptions;
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public HuaweiIdSignInResult getSignInResultFromIntent(Intent intent) {
        return i.a(intent);
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public PendingResult<AddressResult> queryShippingAddress(HuaweiApiClient huaweiApiClient, SignInHuaweiId signInHuaweiId) {
        HMSLog.i(C0201.m82(28160), C0201.m82(28161));
        return new b(huaweiApiClient, C0201.m82(28162), new QueryShippingAddressReq(signInHuaweiId));
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public PendingResult<Status> revokeAccess(HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28163), C0201.m82(28164));
        this.a = huaweiApiClient;
        return new c(huaweiApiClient, C0201.m82(28165), c(huaweiApiClient));
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public PendingResult<SignInResult> signIn(Activity activity, HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28166), C0201.m82(28167));
        Checker.checkNonNull(activity, C0201.m82(28168));
        Checker.checkNonNull(huaweiApiClient, C0201.m82(28169));
        List<Scope> a2 = a(huaweiApiClient);
        List<PermissionInfo> b2 = b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        for (Scope scope : a2) {
            hashSet.add(scope.getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        for (PermissionInfo permissionInfo : b2) {
            hashSet2.add(permissionInfo.getPermission());
        }
        SignInReq signInReq = new SignInReq(hashSet, hashSet2);
        this.a = huaweiApiClient;
        this.b = new WeakReference<>(activity);
        return new PendingResultImpl<SignInResult, SignInResp>(huaweiApiClient, C0201.m82(28170), signInReq) {
            /* class com.huawei.hms.support.api.hwid.HuaweiIdApiImpl.AnonymousClass1 */

            /* renamed from: a */
            public SignInResult onComplete(SignInResp signInResp) {
                HMSLog.i(C0201.m82(3669), C0201.m82(3668) + signInResp.getRetCode());
                HuaweiIdApiImpl.this.a((HuaweiIdApiImpl) signInResp.getRetCode());
                Intent data = signInResp.getData();
                data.putExtra(C0201.m82(3670), signInResp.getRetCode());
                return HuaweiIdApiImpl.this.getHwIdSignInResultFromIntent(data);
            }
        };
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public PendingResult<SignInResult> signInBackend(HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28171), C0201.m82(28172));
        Checker.checkNonNull(huaweiApiClient, C0201.m82(28173));
        this.a = huaweiApiClient;
        List<Scope> a2 = a(huaweiApiClient);
        List<PermissionInfo> b2 = b(huaweiApiClient);
        HashSet hashSet = new HashSet();
        for (Scope scope : a2) {
            hashSet.add(scope.getScopeUri());
        }
        HashSet hashSet2 = new HashSet();
        for (PermissionInfo permissionInfo : b2) {
            hashSet2.add(permissionInfo.getPermission());
        }
        return new PendingResultImpl<SignInResult, SignInResp>(huaweiApiClient, C0201.m82(28174), new SignInReq(hashSet, hashSet2)) {
            /* class com.huawei.hms.support.api.hwid.HuaweiIdApiImpl.AnonymousClass2 */

            /* renamed from: a */
            public SignInResult onComplete(SignInResp signInResp) {
                HMSLog.i(C0201.m82(3805), C0201.m82(3804) + signInResp.getRetCode());
                Intent data = signInResp.getData();
                data.putExtra(C0201.m82(3806), signInResp.getRetCode());
                return HuaweiIdApiImpl.this.getHwIdSignInResultFromIntent(data);
            }
        };
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public PendingResult<Status> signOut(HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28175), C0201.m82(28176));
        if (!huaweiApiClient.isConnected()) {
            return d(huaweiApiClient);
        }
        return new d(huaweiApiClient, C0201.m82(28177), new SignOutReq());
    }

    @Override // com.huawei.hms.support.api.hwid.HuaweiIdApi
    public OptionalPendingResult<HuaweiIdSignInResult> silentSignIn(HuaweiApiClient huaweiApiClient) {
        HMSLog.i(C0201.m82(28178), C0201.m82(28179));
        Checker.checkNonNull(huaweiApiClient, C0201.m82(28180));
        this.a = huaweiApiClient;
        return new OptionalPendingResultImpl(new PendingResultImpl<HuaweiIdSignInResult, SignInResp>(huaweiApiClient, C0201.m82(28181), c(huaweiApiClient)) {
            /* class com.huawei.hms.support.api.hwid.HuaweiIdApiImpl.AnonymousClass3 */

            /* renamed from: a */
            public HuaweiIdSignInResult onComplete(SignInResp signInResp) {
                HMSLog.i(C0201.m82(4317), C0201.m82(4316) + signInResp.getRetCode());
                Intent data = signInResp.getData();
                data.putExtra(C0201.m82(4318), signInResp.getRetCode());
                return HuaweiIdApiImpl.this.getHuaweiIdSignInResultFromIntent(data);
            }
        });
    }

    public static List<PermissionInfo> b(HuaweiApiClient huaweiApiClient) {
        return ((HuaweiApiClientImpl) huaweiApiClient).getPermissionInfos();
    }

    public static List<Scope> a(HuaweiApiClient huaweiApiClient) {
        return ((HuaweiApiClientImpl) huaweiApiClient).getScopes();
    }

    private SignInHuaweiId a(Bundle bundle) {
        int i2;
        String str = d;
        String str2 = q;
        String string = bundle.getString(str, str2);
        String string2 = bundle.getString(k, str2);
        String string3 = bundle.getString(g, str2);
        String string4 = bundle.getString(h);
        if (TextUtils.isEmpty(string4)) {
            string4 = e;
        }
        try {
            i2 = Integer.parseInt(string4);
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        String string5 = bundle.getString(r, str2);
        String string6 = bundle.getString(t, str2);
        String string7 = bundle.getString(i);
        String string8 = bundle.getString(j, str2);
        String string9 = bundle.getString(p, str2);
        String string10 = bundle.getString(c, str2);
        int a2 = a(bundle.getString(u));
        String string11 = bundle.getString(s);
        HashSet hashSet = new HashSet();
        if (string11 != null) {
            String[] split = string11.split(n);
            int length = split.length;
            int i3 = 0;
            while (i3 < length) {
                hashSet.add(new Scope(split[i3]));
                i3++;
                length = length;
                split = split;
            }
        }
        SignInHuaweiId build = SignInHuaweiId.build(string6, string5, string3, string7, string, string8, a2, i2, hashSet, string2, string10, string9);
        build.setIdToken(bundle.getString(m));
        build.setEmail(bundle.getString(o));
        build.setFamilyName(bundle.getString(l));
        build.setGivenName(bundle.getString(f));
        return build;
    }

    private int a(String str) {
        if (TextUtils.isEmpty(str)) {
            str = C0201.m82(28126);
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i2) {
        if (i2 == 0 && HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.a.getContext()) == 0) {
            new Timer().schedule(new TimerTask() {
                /* class com.huawei.hms.support.api.hwid.HuaweiIdApiImpl.AnonymousClass4 */

                public void run() {
                    ConnectService.getNotice(HuaweiIdApiImpl.this.a, 1, C0201.m82(4351)).setResultCallback(new a());
                }
            }, 200);
        }
    }
}
