package com.huawei.hms.update.manager;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import java.io.Serializable;
import vigqyno.C0201;

public class PackageNameManager {
    private static final Object a = new Object();
    private static PackageNameManager b;
    private Context c;

    public interface QueryPublishCallback {
        void onQueryResult();
    }

    private PackageNameManager(Context context) {
        this.c = context;
    }

    public static PackageNameManager getInstance(Context context) {
        synchronized (a) {
            if (b == null) {
                b = new PackageNameManager(context);
            }
        }
        return b;
    }

    public void queryPackageName(final QueryPublishCallback queryPublishCallback) {
        UpdateSdkAPI.checkTargetAppUpdate(this.c, C0201.m82(2362), new CheckUpdateCallBack() {
            /* class com.huawei.hms.update.manager.PackageNameManager.AnonymousClass1 */

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketInstallInfo(Intent intent) {
                if (HMSPublishStateHolder.getPublishState() != 1) {
                    HMSPublishStateHolder.setPublishState(2);
                }
                queryPublishCallback.onQueryResult();
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketStoreError(int i) {
                HMSLog.e(C0201.m82(3590), C0201.m82(3589) + i);
                if (HMSPublishStateHolder.getPublishState() != 1) {
                    HMSPublishStateHolder.setPublishState(2);
                }
                queryPublishCallback.onQueryResult();
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateInfo(Intent intent) {
                String r0 = C0201.m82(3591);
                if (intent != null) {
                    try {
                        int intExtra = intent.getIntExtra(C0201.m82(3592), -99);
                        HMSLog.i(r0, C0201.m82(3593) + intExtra);
                        String stringExtra = intent.getStringExtra(C0201.m82(3594));
                        if (!TextUtils.isEmpty(stringExtra)) {
                            HMSLog.e(r0, C0201.m82(3595) + stringExtra);
                        }
                        if (intExtra == 7) {
                            Serializable serializableExtra = intent.getSerializableExtra(C0201.m82(3596));
                            if ((serializableExtra instanceof ApkUpgradeInfo) && ((ApkUpgradeInfo) serializableExtra).getPackage_().equalsIgnoreCase(C0201.m82(3597))) {
                                HMSLog.i(r0, C0201.m82(3598));
                                HMSPublishStateHolder.setPublishState(1);
                            }
                        }
                    } catch (Exception e) {
                        HMSLog.e(r0, C0201.m82(3599) + e.getMessage());
                    }
                }
                if (HMSPublishStateHolder.getPublishState() != 1) {
                    HMSPublishStateHolder.setPublishState(2);
                }
                queryPublishCallback.onQueryResult();
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateStoreError(int i) {
                HMSLog.e(C0201.m82(3601), C0201.m82(3600) + i);
                if (HMSPublishStateHolder.getPublishState() != 1) {
                    HMSPublishStateHolder.setPublishState(2);
                }
                queryPublishCallback.onQueryResult();
            }
        });
    }
}
