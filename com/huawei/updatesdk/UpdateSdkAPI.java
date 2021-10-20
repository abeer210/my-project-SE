package com.huawei.updatesdk;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Toast;
import com.huawei.updatesdk.a.a.c.i.b;
import com.huawei.updatesdk.b.b.a;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.appmgr.bean.AppInfoAdapter;
import com.huawei.updatesdk.service.otaupdate.AppUpdateActivity;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.huawei.updatesdk.service.otaupdate.UpdateParams;
import com.huawei.updatesdk.service.otaupdate.d;
import com.huawei.updatesdk.service.otaupdate.e;
import com.huawei.updatesdk.service.otaupdate.g;
import com.huawei.updatesdk.service.otaupdate.h;
import java.util.List;
import java.util.concurrent.Executors;
import vigqyno.C0201;

public final class UpdateSdkAPI {
    public static final String TAG = null;

    static {
        C0201.m83(UpdateSdkAPI.class, 287);
    }

    public static void checkAppUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, boolean z2) {
        if (context != null) {
            if (b.d(context)) {
                init(context);
                new e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).build(), checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                return;
            }
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra(C0201.m82(33511), 2);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
            Toast.makeText(context, g.e(context, C0201.m82(33512)), 0).show();
        }
    }

    public static void checkAppUpdate(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context != null && updateParams != null && checkUpdateCallBack != null) {
            init(context);
            updateParams.resetParamList();
            checkAppUpdateForHMSKit(context, updateParams, checkUpdateCallBack);
        }
    }

    public static void checkAppUpdateByAppInfo(Context context, CheckUpdateCallBack checkUpdateCallBack, AppInfoAdapter appInfoAdapter) {
        String str;
        h hVar;
        if (context != null) {
            UpdateParams.Builder builder = new UpdateParams.Builder();
            if (appInfoAdapter == null || TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
                hVar = h.g();
                str = null;
            } else {
                hVar = h.g();
                str = appInfoAdapter.getBusiness();
            }
            hVar.c(str);
            if (appInfoAdapter != null) {
                if (!TextUtils.isEmpty(appInfoAdapter.getServiceZone())) {
                    builder.setServiceZone(appInfoAdapter.getServiceZone());
                }
                setAppStorePkgName(appInfoAdapter.getAppStorePkgName());
                builder.setTargetPkgName(appInfoAdapter.getTargetPkgName()).setPackageList(appInfoAdapter.getPackageList()).setMustBtnOne(appInfoAdapter.isMustBtnOne()).setIsShowImmediate(appInfoAdapter.isShowImmediate()).setMinIntervalDay(appInfoAdapter.getMinIntervalDay());
            }
            checkAppUpdate(context, builder.build(), checkUpdateCallBack);
        }
    }

    public static void checkAppUpdateForHMSKit(Context context, UpdateParams updateParams, CheckUpdateCallBack checkUpdateCallBack) {
        if (context != null && updateParams != null && checkUpdateCallBack != null) {
            init(context);
            long currentTimeMillis = System.currentTimeMillis();
            long b = a.c().b();
            if (updateParams.getMinIntervalDay() != 0 && Math.abs(currentTimeMillis - b) < ((long) updateParams.getMinIntervalDay()) * 86400000) {
                return;
            }
            if (b.d(context)) {
                a.c().a(currentTimeMillis);
                new e(context, updateParams, checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
                return;
            }
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(33513), 2);
            checkUpdateCallBack.onUpdateInfo(intent);
        }
    }

    public static void checkClientOTAUpdate(Context context, CheckUpdateCallBack checkUpdateCallBack, boolean z, int i, boolean z2) {
        if (context != null && b.d(context)) {
            init(context);
            long currentTimeMillis = System.currentTimeMillis();
            long b = a.c().b();
            if (i == 0 || Math.abs(currentTimeMillis - b) >= ((long) i) * 86400000) {
                a.c().a(currentTimeMillis);
                e eVar = new e(context, new UpdateParams.Builder().setIsShowImmediate(z).setMustBtnOne(z2).setMinIntervalDay(i).build(), checkUpdateCallBack);
                eVar.a(true);
                eVar.executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
            }
        }
    }

    public static void checkTargetAppUpdate(Context context, String str, CheckUpdateCallBack checkUpdateCallBack) {
        String r0 = C0201.m82(33514);
        if (context == null || TextUtils.isEmpty(str) || checkUpdateCallBack == null) {
            if (checkUpdateCallBack != null) {
                Intent intent = new Intent();
                intent.putExtra(r0, 1);
                checkUpdateCallBack.onUpdateInfo(intent);
            }
        } else if (b.d(context)) {
            init(context);
            new e(context, new UpdateParams.Builder().setMustBtnOne(false).setTargetPkgName(str).build(), checkUpdateCallBack).executeOnExecutor(Executors.newSingleThreadExecutor(), new Void[0]);
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra(r0, 2);
            checkUpdateCallBack.onUpdateInfo(intent2);
        }
    }

    private static void init(Context context) {
        com.huawei.updatesdk.a.b.a.a.a(context);
        Log.i(C0201.m82(33516), C0201.m82(33515) + context.getPackageName());
    }

    public static void releaseCallBack() {
        d.a().a((CheckUpdateCallBack) null);
        List<AsyncTask> a = com.huawei.updatesdk.b.e.a.b.a();
        if (!(a == null || a.isEmpty())) {
            for (AsyncTask asyncTask : a) {
                if (asyncTask != null) {
                    asyncTask.cancel(true);
                }
                Log.d(C0201.m82(33517), C0201.m82(33518));
            }
            a.clear();
        }
    }

    public static void setAppStorePkgName(String str) {
        h.g().d(str);
    }

    public static void setServiceZone(String str) {
        h.g().b(str);
    }

    public static void showUpdateDialog(Context context, ApkUpgradeInfo apkUpgradeInfo, boolean z) {
        StringBuilder sb;
        String str;
        String r0 = C0201.m82(33519);
        if (context != null && apkUpgradeInfo != null) {
            Intent intent = new Intent(context, AppUpdateActivity.class);
            Bundle bundle = new Bundle();
            bundle.putSerializable(C0201.m82(33520), apkUpgradeInfo);
            bundle.putBoolean(C0201.m82(33521), z);
            intent.putExtras(bundle);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                sb = new StringBuilder();
                sb.append(C0201.m82(33523));
                str = e.toString();
            } catch (SecurityException e2) {
                sb = new StringBuilder();
                sb.append(C0201.m82(33522));
                str = e2.toString();
            }
        } else {
            return;
        }
        sb.append(str);
        Log.e(r0, sb.toString());
    }

    public static void showUpdateDialogByAppInfo(Context context, ApkUpgradeInfo apkUpgradeInfo, AppInfoAdapter appInfoAdapter) {
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName()) && !TextUtils.equals(h.g().c(), appInfoAdapter.getAppStorePkgName())) {
            h.g().d(appInfoAdapter.getAppStorePkgName());
        }
        if (appInfoAdapter != null && !TextUtils.isEmpty(appInfoAdapter.getAppStorePkgName())) {
            h.g().c(appInfoAdapter.getBusiness());
        }
        showUpdateDialog(context, apkUpgradeInfo, appInfoAdapter != null && appInfoAdapter.isMustBtnOne());
    }
}
