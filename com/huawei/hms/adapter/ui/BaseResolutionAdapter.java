package com.huawei.hms.adapter.ui;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public class BaseResolutionAdapter implements IBridgeActivityDelegate {
    private WeakReference<Activity> a;
    private String b = C0201.m82(10512);

    private void a() {
        Activity b2 = b();
        if (b2 != null && !b2.isFinishing()) {
            b2.finish();
        }
    }

    private Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void c() {
        SystemManager.getInstance().notifyResolutionResult(null, this.b);
        a();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 1001;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        if (intent == null) {
            c();
            return;
        }
        Bundle extras = intent.getExtras();
        this.b = intent.getStringExtra(C0201.m82(10513));
        if (extras == null) {
            c();
            return;
        }
        Parcelable parcelable = extras.getParcelable(C0201.m82(10514));
        if (parcelable == null) {
            c();
            return;
        }
        boolean z = parcelable instanceof Intent;
        String r2 = C0201.m82(10515);
        if (z) {
            try {
                activity.startActivityForResult((Intent) parcelable, 1001);
            } catch (ActivityNotFoundException unused) {
                c();
                HMSLog.e(r2, C0201.m82(10516));
            }
        } else if (parcelable instanceof PendingIntent) {
            try {
                activity.startIntentSenderForResult(((PendingIntent) parcelable).getIntentSender(), 1001, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused2) {
                c();
                HMSLog.e(r2, C0201.m82(10517));
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        HMSLog.i(C0201.m82(10518), C0201.m82(10519));
        this.a = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i(C0201.m82(10520), C0201.m82(10521));
        if (i2 == -1 || intent.hasExtra(C0201.m82(10522))) {
            SystemManager.getInstance().notifyResolutionResult(intent, this.b);
        } else {
            SystemManager.getInstance().notifyResolutionResult(null, this.b);
        }
        a();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        HMSLog.i(C0201.m82(10523), C0201.m82(10524));
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i(C0201.m82(10525), C0201.m82(10526));
    }
}
