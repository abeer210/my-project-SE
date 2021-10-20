package com.huawei.hms.update.manager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.update.ui.a;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import vigqyno.C0201;

public class UpdateManager {
    private static boolean a(Context context, String str) {
        PackageManagerHelper.PackageStates packageStates = new PackageManagerHelper(context).getPackageStates(str);
        HMSLog.i(C0201.m82(37729), C0201.m82(37727) + str + C0201.m82(37728) + packageStates);
        return PackageManagerHelper.PackageStates.ENABLED == packageStates;
    }

    private static void b(Context context, ArrayList<Integer> arrayList) {
        String r0 = C0201.m82(37730);
        if (a(context, r0) && !r0.equals(context.getPackageName()) && a(context)) {
            arrayList.add(5);
        } else if (d(context)) {
            arrayList.add(7);
        } else if (!b(context)) {
            arrayList.add(6);
        }
    }

    private static void c(Context context, ArrayList<Integer> arrayList) {
        String r0 = C0201.m82(37736);
        if (!a(context, r0) || r0.equals(context.getPackageName())) {
            arrayList.add(4);
        } else {
            arrayList.add(5);
        }
    }

    private static boolean d(Context context) {
        String str;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent(C0201.m82(37740)), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            Iterator<ResolveInfo> it = queryIntentServices.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ServiceInfo serviceInfo = it.next().serviceInfo;
                if (serviceInfo != null) {
                    str = serviceInfo.packageName;
                    if (!TextUtils.isEmpty(str) && SystemUtils.isSystemApp(context.getApplicationContext(), str)) {
                        break;
                    }
                }
            }
        }
        str = null;
        if (str != null) {
            return true;
        }
        return false;
    }

    public static Intent getStartUpdateIntent(Activity activity, UpdateBean updateBean) {
        if (activity == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        } else {
            a(activity, (ArrayList<Integer>) arrayList);
        }
        int i = -2;
        if (arrayList.size() > 0) {
            i = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i(C0201.m82(37741), C0201.m82(37742));
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, a.a(i));
        intentStartBridgeActivity.putExtra(C0201.m82(37743), updateBean);
        return intentStartBridgeActivity;
    }

    public static void startUpdate(Activity activity, int i, UpdateBean updateBean) {
        Intent startUpdateIntent = getStartUpdateIntent(activity, updateBean);
        if (startUpdateIntent != null) {
            activity.startActivityForResult(startUpdateIntent, i);
        }
    }

    public static Intent startUpdateIntent(Activity activity) {
        Intent intent;
        if (activity == null) {
            return null;
        }
        UpdateBean updateBean = new UpdateBean();
        updateBean.setHmsOrApkUpgrade(true);
        updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        updateBean.setClientVersionCode(HMSPackageManager.getInstance(activity.getApplicationContext()).getHmsVersionCode());
        updateBean.setClientAppId(C0201.m82(37747));
        updateBean.setNeedConfirm(false);
        if (ResourceLoaderUtil.getmContext() == null) {
            ResourceLoaderUtil.setmContext(activity.getApplicationContext());
        }
        updateBean.setClientAppName(ResourceLoaderUtil.getString(C0201.m82(37748)));
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a((Context) activity, (ArrayList<Integer>) arrayList);
        } else {
            a(activity, (ArrayList<Integer>) arrayList);
        }
        updateBean.setTypeList(arrayList);
        if (arrayList.size() > 1) {
            intent = BridgeActivity.getIntentStartBridgeActivity(activity, a.a(((Integer) arrayList.get(1)).intValue()));
        } else {
            int i = -2;
            if (arrayList.size() > 0) {
                i = ((Integer) arrayList.get(0)).intValue();
            } else {
                HMSLog.i(C0201.m82(37749), C0201.m82(37750));
            }
            intent = BridgeActivity.getIntentStartBridgeActivity(activity, a.a(i));
        }
        intent.putExtra(C0201.m82(37751), updateBean);
        return intent;
    }

    private static void a(Context context, ArrayList<Integer> arrayList) {
        if (SystemUtils.isTVDevice()) {
            arrayList.add(5);
        } else if (!SystemUtils.isSystemApp(context.getApplicationContext(), C0201.m82(37719)) || !c(context) || !SystemUtils.isChinaROM()) {
            b(context, arrayList);
        } else {
            arrayList.add(0);
        }
    }

    private static boolean c(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode(C0201.m82(37737));
        HMSLog.i(C0201.m82(37739), C0201.m82(37738) + packageVersionCode);
        return ((long) packageVersionCode) >= 70203000;
    }

    private static boolean b(Context context) {
        String r0 = C0201.m82(37731);
        String r2 = C0201.m82(37732);
        if (context == null) {
            HMSLog.e(r2, C0201.m82(37733));
            return true;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(context.getPackageName(), 128).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(r0))) {
                    return applicationInfo.metaData.getBoolean(r0, true);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.e(r2, C0201.m82(37734));
            }
        }
        HMSLog.i(r2, C0201.m82(37735));
        return true;
    }

    private static boolean a(Context context) {
        String r0 = C0201.m82(37720);
        String r2 = C0201.m82(37721);
        if (context == null) {
            HMSLog.i(r2, C0201.m82(37722));
            return false;
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                ApplicationInfo applicationInfo = packageManager.getPackageInfo(C0201.m82(37723), 128).applicationInfo;
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(r0))) {
                    String string = applicationInfo.metaData.getString(r0);
                    if (!TextUtils.isEmpty(string)) {
                        String[] split = string.split(C0201.m82(37724));
                        if (split.length == 2 && StringUtil.convertVersion2Integer(split[1]) >= 50004100) {
                            return true;
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                HMSLog.e(r2, C0201.m82(37725));
            }
        }
        HMSLog.i(r2, C0201.m82(37726));
        return false;
    }

    public static Intent getStartUpdateIntent(Context context, UpdateBean updateBean) {
        if (context == null || updateBean == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(updateBean.getClientAppName())) {
            a(context, arrayList);
        } else {
            c(context, arrayList);
        }
        int i = -2;
        if (arrayList.size() > 0) {
            i = ((Integer) arrayList.get(0)).intValue();
        } else {
            HMSLog.i(C0201.m82(37744), C0201.m82(37745));
        }
        updateBean.setTypeList(arrayList);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(context, a.a(i));
        intentStartBridgeActivity.putExtra(C0201.m82(37746), updateBean);
        return intentStartBridgeActivity;
    }

    private static void a(Activity activity, ArrayList<Integer> arrayList) {
        String r0 = C0201.m82(37718);
        if (!a(activity, r0) || r0.equals(activity.getPackageName())) {
            arrayList.add(4);
        } else {
            arrayList.add(5);
        }
    }
}
