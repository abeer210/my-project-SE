package com.huawei.hms.auth.api.signin.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.auth.api.signin.HuaweiIdSignInResult;
import com.huawei.hms.auth.api.signin.internal.c.a;
import com.huawei.hms.auth.api.signin.internal.c.b;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.entity.hwid.HuaweiIdSignInRequest;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.support.log.HMSLog;
import org.json.JSONException;
import vigqyno.C0201;

public class HwIdSignInHubActivity extends Activity {
    private static boolean a;
    private String b = null;
    private boolean c = false;
    private HuaweiIdSignInRequest d = null;
    private HuaweiIdSignInResult e = null;

    static {
        C0201.m83(HwIdSignInHubActivity.class, 640);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b() {
        String r0 = C0201.m82(15795);
        HMSLog.i(r0, C0201.m82(15796));
        Intent c2 = c();
        setSignningIn(true);
        try {
            startActivityForResult(c2, 16587);
        } catch (ActivityNotFoundException e2) {
            this.c = true;
            setSignningIn(false);
            HMSLog.e(r0, C0201.m82(15797) + e2.getClass().getSimpleName());
            a(17);
        }
    }

    private Intent c() {
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra(C0201.m82(15798));
        String stringExtra2 = intent.getStringExtra(C0201.m82(15799));
        String action = intent.getAction();
        try {
            a d2 = a.d(stringExtra);
            ForegroundIntentBuilder kitSdkVersion = new ForegroundIntentBuilder(this).setAction(action).setRequestBody(stringExtra2).setServiceName(C0201.m82(15800)).setTransactionId(this.b).setKitSdkVersion(a.a());
            if (d2.a() != null) {
                kitSdkVersion.setSubAppId(d2.a());
            }
            Intent build = kitSdkVersion.build();
            build.setPackage(C0201.m82(15801));
            return build;
        } catch (Exception e2) {
            HMSLog.e(C0201.m82(15803), C0201.m82(15802) + e2.getClass().getSimpleName());
            return new Intent();
        }
    }

    public static void setSignningIn(boolean z) {
        a = z;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        int i3;
        super.onActivityResult(i, i2, intent);
        if (!this.c && i == 16587) {
            setSignningIn(false);
            if (intent == null || (stringExtra = intent.getStringExtra(C0201.m82(15804))) == null) {
                if (i2 <= 0) {
                    i2 = 8;
                }
                a(i2);
                return;
            }
            try {
                this.e = new HuaweiIdSignInResult().fromJson(stringExtra);
                com.huawei.hms.auth.api.signin.internal.b.a.a().a(this.e.getSignInAccount(), this.d.getHuaweiIdSignInOptions());
                i3 = this.e.getStatus().getStatusCode();
            } catch (JSONException unused) {
                this.e = null;
                HMSLog.e(C0201.m82(15805), C0201.m82(15806));
                i3 = 8;
            }
            String str = this.b;
            if (str != null) {
                HiAnalyticsClient.reportExit(this, C0201.m82(15807), str, b.a(i3), i3, a.a());
            }
            setResult(i2, intent);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        w30.i(this);
        String r0 = C0201.m82(15808);
        HMSLog.i(r0, C0201.m82(15809));
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (a(intent)) {
            a(0, C0201.m82(15810));
        }
        String action = intent.getAction();
        if (!TextUtils.equals(C0201.m82(15811), action)) {
            String r4 = C0201.m82(15812);
            if (action != null) {
                r4 = r4 + action;
            }
            a(0, r4);
        }
        String stringExtra = intent.getStringExtra(C0201.m82(15813));
        try {
            this.d = HuaweiIdSignInRequest.fromJson(intent.getStringExtra(C0201.m82(15814)));
        } catch (JSONException unused) {
            this.d = null;
            HMSLog.e(r0, C0201.m82(15815));
        }
        if (TextUtils.isEmpty(stringExtra)) {
            a(0, C0201.m82(15816));
        } else if (this.d == null) {
            a(0, C0201.m82(15817));
        } else if (bundle != null) {
            restoreInstanceState(bundle);
        } else if (a) {
            a(2013);
        } else {
            this.b = HiAnalyticsClient.reportEntry(this, C0201.m82(15818), a.a());
            a();
        }
    }

    public /* synthetic */ void onDestroy() {
        w30.k(this);
        super.onDestroy();
    }

    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.b;
        if (str != null) {
            bundle.putString(C0201.m82(15819), str);
        }
    }

    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }

    public void restoreInstanceState(Bundle bundle) {
        this.b = bundle.getString(C0201.m82(15820));
    }

    private boolean a(Intent intent) {
        if (intent == null) {
            return true;
        }
        try {
            intent.getStringExtra(C0201.m82(15794));
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    private void a(int i, String str) {
        HMSLog.e(C0201.m82(15793), str);
        setResult(0);
        finish();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void a(int i) {
        String str = this.b;
        if (str != null) {
            HiAnalyticsClient.reportExit(this, C0201.m82(15789), str, b.a(i), i, a.a());
        }
        Status status = new Status(i);
        HuaweiIdSignInResult huaweiIdSignInResult = new HuaweiIdSignInResult();
        huaweiIdSignInResult.setStatus(status);
        Intent intent = new Intent();
        try {
            intent.putExtra(C0201.m82(15790), huaweiIdSignInResult.toJson());
        } catch (JSONException unused) {
            HMSLog.e(C0201.m82(15791), C0201.m82(15792));
        }
        setResult(0, intent);
        finish();
        setSignningIn(false);
    }

    private void a() {
        h.a(this, new AvailableAdapter.AvailableCallBack() {
            /* class com.huawei.hms.auth.api.signin.internal.HwIdSignInHubActivity.AnonymousClass1 */

            @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
            public void onComplete(int i) {
                if (i == 0) {
                    HwIdSignInHubActivity.this.b();
                    return;
                }
                HMSLog.i(C0201.m82(8495), C0201.m82(8496));
                HwIdSignInHubActivity.this.a((HwIdSignInHubActivity) i);
            }
        });
    }
}
