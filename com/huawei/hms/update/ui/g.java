package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.ResourceLoaderUtil;
import vigqyno.C0201;

/* compiled from: HiappWebWizard */
public class g extends a {
    private boolean d() {
        Activity b = b();
        if (b == null || b.isFinishing() || this.c == null || TextUtils.isEmpty(this.j)) {
            return false;
        }
        try {
            ResourceLoaderUtil.setmContext(b);
            String r3 = C0201.m82(35563);
            Intent intent = new Intent(r3, Uri.parse(ResourceLoaderUtil.getString(C0201.m82(35564)) + this.j));
            intent.setFlags(268435456);
            b.startActivityForResult(intent, getRequestCode());
            a(0, this.f);
            return true;
        } catch (ActivityNotFoundException unused) {
            HMSLog.e(C0201.m82(35565), C0201.m82(35566));
            return false;
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(b bVar) {
        HMSLog.d(C0201.m82(35567), C0201.m82(35568));
        if (bVar instanceof i) {
            a();
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void b(b bVar) {
        HMSLog.d(C0201.m82(35572), C0201.m82(35573));
        if (bVar instanceof i) {
            bVar.c();
            if (!d()) {
                b(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2004;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityCreate(Activity activity) {
        super.onBridgeActivityCreate(activity);
        UpdateBean updateBean = this.c;
        if (updateBean != null) {
            this.f = 4;
            if (updateBean.isNeedConfirm() && !TextUtils.isEmpty(this.h)) {
                a(i.class);
            } else if (!d()) {
                b(8, this.f);
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeActivityDestroy() {
        super.onBridgeActivityDestroy();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onBridgeConfigurationChanged() {
        super.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate, com.huawei.hms.update.ui.a
    public void onKeyUp(int i, KeyEvent keyEvent) {
        if (4 == i) {
            HMSLog.i(C0201.m82(35574), C0201.m82(35575));
            Activity b = b();
            if (b != null && !b.isFinishing()) {
                b.setResult(0, null);
                b.finish();
            }
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a(Class<? extends b> cls) {
        c();
        try {
            b bVar = (b) cls.newInstance();
            if (!TextUtils.isEmpty(this.h) && (bVar instanceof i)) {
                String string = ResourceLoaderUtil.getString(C0201.m82(35569));
                this.h = string;
                ((i) bVar).a(string);
            }
            bVar.a(this);
            this.d = bVar;
        } catch (IllegalAccessException | IllegalStateException | InstantiationException e) {
            HMSLog.e(C0201.m82(35571), C0201.m82(35570) + e.getMessage());
        }
    }

    @Override // com.huawei.hms.update.ui.a
    public void a() {
        b(13, this.f);
    }
}
