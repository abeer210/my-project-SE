package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeBundle;
import com.huawei.hms.utils.ResourceLoaderUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import vigqyno.C0201;

/* compiled from: SilentUpdateWizard */
public class k extends a {
    private BroadcastReceiver k;
    private Handler l = new Handler();
    private int m = 0;
    private Handler n = new Handler() {
        /* class com.huawei.hms.update.ui.k.AnonymousClass1 */

        public void handleMessage(Message message) {
            SafeBundle safeBundle = new SafeBundle((Bundle) message.obj);
            switch (message.what) {
                case 101:
                    k.this.a((k) safeBundle);
                    return;
                case 102:
                    k.this.b((k) safeBundle);
                    return;
                case 103:
                    k.this.c((k) safeBundle);
                    return;
                default:
                    return;
            }
        }
    };

    /* access modifiers changed from: private */
    /* compiled from: SilentUpdateWizard */
    public class a implements Runnable {
        private a() {
        }

        public void run() {
            k.this.c((k) 14);
        }
    }

    private void d() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(C0201.m82(35765));
        intentFilter.addAction(C0201.m82(35766));
        intentFilter.addAction(C0201.m82(35767));
        this.k = new com.huawei.hms.update.c.a(this.n);
        Activity b = b();
        if (b != null) {
            b.registerReceiver(this.k, intentFilter);
        }
    }

    private void e() {
        BroadcastReceiver broadcastReceiver;
        Activity b = b();
        if (b != null && (broadcastReceiver = this.k) != null) {
            b.unregisterReceiver(broadcastReceiver);
            this.k = null;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2000;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        if (this.c != null) {
            this.f = 0;
            if (a(activity)) {
                return;
            }
            if (!a(true)) {
                b(8, this.f);
            } else {
                a(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityDestroy() {
        this.l.removeCallbacksAndMessages(null);
        e();
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        HMSLog.i(C0201.m82(35772), C0201.m82(35770) + i + C0201.m82(35771) + i2);
        if (i != getRequestCode()) {
            return false;
        }
        if (i2 == 0) {
            d();
            b(20000);
            return true;
        } else if (i2 == 4) {
            a();
            return true;
        } else {
            if (!a(true)) {
                b(i2, this.f);
            } else {
                a(i2, this.f);
            }
            return true;
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        super.onKeyUp(i, keyEvent);
    }

    private void b(int i) {
        this.l.removeCallbacksAndMessages(null);
        this.l.postDelayed(new a(), (long) i);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(int i) {
        this.l.removeCallbacksAndMessages(null);
        e();
        c();
        if (!a(false)) {
            b(i, this.f);
        } else {
            a(i, this.f);
        }
    }

    private boolean a(Activity activity) {
        String r0 = C0201.m82(35738);
        if (TextUtils.isEmpty(this.g)) {
            return false;
        }
        Intent intent = new Intent(C0201.m82(35739));
        intent.setPackage(C0201.m82(35740));
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C0201.m82(35741), this.g);
            jSONObject.put(C0201.m82(35742), this.i);
            jSONArray.put(jSONObject);
            intent.putExtra(C0201.m82(35743), jSONArray.toString());
            intent.putExtra(C0201.m82(35744), this.c.a());
            intent.putExtra(C0201.m82(35746), ResourceLoaderUtil.getString(C0201.m82(35745)));
            intent.putExtra(C0201.m82(35748), ResourceLoaderUtil.getString(C0201.m82(35747)));
            intent.putExtra(C0201.m82(35751), ResourceLoaderUtil.getString(C0201.m82(35750), C0201.m82(35749)));
            try {
                HMSLog.i(r0, C0201.m82(35752));
                activity.startActivityForResult(intent, getRequestCode());
                HMSLog.i(r0, C0201.m82(35753));
                return true;
            } catch (ActivityNotFoundException unused) {
                HMSLog.e(r0, C0201.m82(35754));
                return false;
            }
        } catch (JSONException e) {
            HMSLog.e(r0, C0201.m82(35755) + e.getMessage());
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(SafeBundle safeBundle) {
        String r0 = C0201.m82(35756);
        String string = safeBundle.containsKey(r0) ? safeBundle.getString(r0) : null;
        if (string != null && string.equals(this.g)) {
            String r02 = C0201.m82(35757);
            if (safeBundle.containsKey(r02) && safeBundle.containsKey(C0201.m82(35758))) {
                int i = safeBundle.getInt(r02);
                HMSLog.i(C0201.m82(35760), C0201.m82(35759) + i);
                b(20000);
                if (i >= 99) {
                    i = 99;
                }
                this.m = i;
                if (this.d == null) {
                    a(f.class);
                }
                b bVar = this.d;
                if (bVar != null) {
                    ((f) bVar).b(i);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(SafeBundle safeBundle) {
        String r0 = C0201.m82(35761);
        if (safeBundle.containsKey(r0)) {
            String r1 = C0201.m82(35762);
            if (safeBundle.containsKey(r1)) {
                String string = safeBundle.getString(r0);
                int i = safeBundle.getInt(r1);
                HMSLog.i(C0201.m82(35764), C0201.m82(35763) + i);
                if (string != null && string.equals(this.g)) {
                    if (i == 2) {
                        this.l.removeCallbacksAndMessages(null);
                        b bVar = this.d;
                        if (bVar != null) {
                            ((f) bVar).b(100);
                        }
                        b(0, this.f);
                    } else if (i == -1 || i == -2) {
                        c(i);
                    } else {
                        b(60000);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(SafeBundle safeBundle) {
        String r0 = C0201.m82(35734);
        String string = safeBundle.containsKey(r0) ? safeBundle.getString(r0) : null;
        if (string != null && string.equals(this.g)) {
            String r02 = C0201.m82(35735);
            if (safeBundle.containsKey(r02)) {
                int i = safeBundle.getInt(r02);
                HMSLog.i(C0201.m82(35737), C0201.m82(35736) + i);
                if (i == 3 || i == 5 || i == 6 || i == 8) {
                    c(i);
                } else if (i == 4) {
                    b(60000);
                } else {
                    b(20000);
                }
            }
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(Class<? extends b> cls) {
        try {
            b bVar = (b) cls.newInstance();
            if (this.m > 0 && (bVar instanceof f)) {
                ((f) bVar).a(this.m);
            }
            bVar.a(this);
            this.d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e(C0201.m82(35769), C0201.m82(35768) + e.getMessage());
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a() {
        b(13, this.f);
    }
}
