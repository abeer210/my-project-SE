package com.huawei.hms.update.ui;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.common.util.AGCUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.NetWorkUtil;
import com.huawei.hms.utils.PackageManagerHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import vigqyno.C0201;

/* compiled from: AbsUpdateWizard */
public abstract class a implements IBridgeActivityDelegate {
    public WeakReference<Activity> a;
    public IBridgeActivityDelegate b;
    public UpdateBean c = null;
    public b d = null;
    public boolean e = false;
    public int f = -1;
    public String g = null;
    public String h = null;
    public int i = 0;
    public String j = null;

    public static String a(int i2) {
        if (i2 == 0) {
            return k.class.getName();
        }
        if (i2 == 4) {
            return g.class.getName();
        }
        if (i2 == 5) {
            return h.class.getName();
        }
        if (i2 != 6) {
            return i2 != 7 ? C0201.m82(35349) : c.class.getName();
        }
        return l.class.getName();
    }

    public abstract void a();

    public void a(b bVar) {
    }

    public abstract void a(Class<? extends b> cls);

    public Activity b() {
        WeakReference<Activity> weakReference = this.a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void b(b bVar) {
    }

    public void c() {
        b bVar = this.d;
        if (bVar != null) {
            try {
                bVar.c();
                this.d = null;
            } catch (IllegalStateException e2) {
                HMSLog.e(C0201.m82(35372), C0201.m82(35371) + e2.getMessage());
            }
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.a = new WeakReference<>(activity);
        if (this.c == null) {
            Intent intent = activity.getIntent();
            if (intent != null) {
                UpdateBean updateBean = (UpdateBean) intent.getSerializableExtra(C0201.m82(35373));
                this.c = updateBean;
                if (updateBean == null) {
                    return;
                }
            } else {
                return;
            }
        }
        this.g = this.c.b();
        this.h = this.c.getClientAppName();
        this.i = this.c.c();
        this.j = this.c.d();
        this.b = null;
        this.e = false;
        this.f = -1;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        this.a = null;
        c();
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.update.ui.a */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (!this.e || (iBridgeActivityDelegate = this.b) == null) {
            b bVar = this.d;
            if (bVar != null) {
                Class<?> cls = bVar.getClass();
                this.d.c();
                this.d = null;
                a((Class<? extends b>) cls);
                return;
            }
            return;
        }
        iBridgeActivityDelegate.onBridgeConfigurationChanged();
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i2, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate;
        if (this.e && (iBridgeActivityDelegate = this.b) != null) {
            iBridgeActivityDelegate.onKeyUp(i2, keyEvent);
        }
    }

    public void b(int i2, int i3) {
        Activity b2 = b();
        if (b2 != null && !b2.isFinishing()) {
            a(i2, i3);
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(35369), getClass().getName());
            intent.putExtra(C0201.m82(35370), i2);
            b2.setResult(-1, intent);
            b2.finish();
        }
    }

    private String c(int i2, int i3) {
        String valueOf = String.valueOf(i2);
        if (i3 == 0) {
            return C0201.m82(35355) + valueOf;
        } else if (i3 == 4) {
            return C0201.m82(35354) + valueOf;
        } else if (i3 == 5) {
            return C0201.m82(35353) + valueOf;
        } else if (i3 != 6) {
            return valueOf;
        } else {
            return C0201.m82(35352) + valueOf;
        }
    }

    public void a(int i2, int i3) {
        if (!SystemUtils.isChinaROM()) {
            HMSLog.i(C0201.m82(35356), C0201.m82(35357));
            return;
        }
        Activity b2 = b();
        if (b2 != null && !b2.isFinishing()) {
            int packageVersionCode = new PackageManagerHelper(b2).getPackageVersionCode(this.g);
            HashMap hashMap = new HashMap();
            hashMap.put(C0201.m82(35358), b2.getPackageName());
            hashMap.put(C0201.m82(35359), this.g);
            hashMap.put(C0201.m82(35360), String.valueOf(packageVersionCode));
            hashMap.put(C0201.m82(35361), String.valueOf(50004301));
            hashMap.put(C0201.m82(35362), AGCUtils.getAppId(b2));
            hashMap.put(C0201.m82(35363), C0201.m82(35364));
            hashMap.put(C0201.m82(35365), String.valueOf(i3));
            hashMap.put(C0201.m82(35366), String.valueOf(NetWorkUtil.getNetworkType(b2)));
            hashMap.put(C0201.m82(35367), c(i2, i3));
            HiAnalyticsUtils.getInstance().onEvent(b2, C0201.m82(35368), hashMap);
        }
    }

    public boolean a(boolean z) {
        Activity b2 = b();
        boolean z2 = false;
        if (b2 == null) {
            return false;
        }
        ArrayList typeList = this.c.getTypeList();
        if (typeList.size() > 0) {
            typeList.remove(0);
        }
        if (this.b == null) {
            a(typeList);
        }
        if (this.b != null) {
            z2 = true;
            this.e = true;
            this.c.setTypeList(typeList);
            this.c.setNeedConfirm(z);
            IBridgeActivityDelegate iBridgeActivityDelegate = this.b;
            if (iBridgeActivityDelegate instanceof a) {
                ((a) iBridgeActivityDelegate).a(this.c);
            }
            this.b.onBridgeActivityCreate(b2);
        }
        return z2;
    }

    private void a(ArrayList arrayList) {
        String a2 = (arrayList == null || arrayList.size() <= 0) ? null : a(((Integer) arrayList.get(0)).intValue());
        if (a2 != null) {
            try {
                this.b = (IBridgeActivityDelegate) Class.forName(a2).asSubclass(IBridgeActivityDelegate.class).newInstance();
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
                HMSLog.e(C0201.m82(35351), C0201.m82(35350) + e2.getMessage());
            }
        }
    }

    private void a(UpdateBean updateBean) {
        this.c = updateBean;
    }

    public boolean a(String str, int i2) {
        Activity b2;
        if (!TextUtils.isEmpty(str) && (b2 = b()) != null && !b2.isFinishing() && new PackageManagerHelper(b2).getPackageVersionCode(str) >= i2) {
            return true;
        }
        return false;
    }
}
