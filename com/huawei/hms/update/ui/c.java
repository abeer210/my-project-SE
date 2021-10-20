package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

/* compiled from: AppTouchWizard */
public class c extends a {
    private boolean d() {
        Activity b = b();
        if (b == null || b.isFinishing() || TextUtils.isEmpty(this.g)) {
            return false;
        }
        try {
            Intent intent = new Intent();
            intent.setAction(C0201.m82(35434));
            intent.putExtra(C0201.m82(35435), this.g);
            a(intent);
            b.startActivityForResult(intent, getRequestCode());
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e(C0201.m82(35436), C0201.m82(35437));
            return false;
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(b bVar) {
        HMSLog.i(C0201.m82(35438), C0201.m82(35439));
        if (bVar instanceof i) {
            a();
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void b(b bVar) {
        HMSLog.i(C0201.m82(35443), C0201.m82(35444));
        if (bVar instanceof i) {
            bVar.c();
            if (!d()) {
                a(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2007;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.c;
        if (updateBean != null) {
            this.f = 7;
            if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
                a(i.class);
            } else if (!d()) {
                a(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            return iBridgeActivityDelegate.onBridgeActivityResult(i, i2, intent);
        }
        if (this.f != 7 || i != getRequestCode()) {
            return false;
        }
        if (a(this.g, this.i)) {
            b(0, this.f);
            return true;
        }
        b(8, this.f);
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        } else if (4 == i) {
            HMSLog.i(C0201.m82(35445), C0201.m82(35446));
            Activity b = b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    private void a(Intent intent) {
        String str;
        List<ResolveInfo> queryIntentServices = b().getPackageManager().queryIntentServices(new Intent(C0201.m82(35433)), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    str = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                }
            }
            if (TextUtils.isEmpty(str)) {
                intent.setPackage(str);
                return;
            }
            return;
        }
        str = null;
        if (TextUtils.isEmpty(str)) {
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(Class<? extends b> cls) {
        c();
        try {
            b bVar = (b) cls.newInstance();
            if (!TextUtils.isEmpty(this.h) && (bVar instanceof i)) {
                String string = ResourceLoaderUtil.getString(C0201.m82(35440));
                this.h = string;
                ((i) bVar).a(string);
            }
            bVar.a(this);
            this.d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e(C0201.m82(35442), C0201.m82(35441) + e.getMessage());
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a() {
        b(13, this.f);
    }
}
