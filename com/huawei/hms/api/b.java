package com.huawei.hms.api;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Fragment;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.activity.EnableServiceActivity;
import com.huawei.hms.activity.ForegroundIntentBuilder;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.common.ErrorDialogFragment;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.api.AvailabilityException;
import com.huawei.hms.common.api.HuaweiApiCallable;
import com.huawei.hms.common.internal.ConnectionErrorMessages;
import com.huawei.hms.common.internal.DialogRedirect;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.UpdateManager;
import com.huawei.hms.update.ui.UpdateBean;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import vigqyno.C0201;

/* compiled from: HuaweiApiAvailabilityImpl */
public final class b extends HuaweiApiAvailability {
    private static final b a = new b();

    private b() {
    }

    public static b a() {
        return a;
    }

    public Intent b(Context context, int i) {
        HMSLog.i(C0201.m82(17941), C0201.m82(17940) + i);
        if (i == 1 || i == 2) {
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            if (HMSPublishStateHolder.getPublishState() == 0) {
                updateBean.setClientPackageName(HMSPackageManager.getInstance(context.getApplicationContext()).getHMSPackageName());
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                updateBean.setClientPackageName(C0201.m82(17942));
            } else {
                updateBean.setClientPackageName(C0201.m82(17943));
            }
            updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
            updateBean.setClientAppId(C0201.m82(17944));
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(context.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString(C0201.m82(17945)));
            return UpdateManager.getStartUpdateIntent(context, updateBean);
        } else if (i != 6) {
            return null;
        } else {
            return a(context, BindingFailedResolution.class.getName());
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task<Void> checkApiAccessible(HuaweiApi<?> huaweiApi, HuaweiApi<?>... huaweiApiArr) {
        Task<Void> task = new TaskCompletionSource().getTask();
        if (huaweiApi != null) {
            try {
                a(huaweiApi);
            } catch (AvailabilityException e) {
                HMSLog.i(C0201.m82(17947), C0201.m82(17946) + e.getMessage());
            }
        }
        if (huaweiApiArr != null) {
            for (HuaweiApi<?> huaweiApi2 : huaweiApiArr) {
                a(huaweiApi2);
            }
        }
        return task;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        return a(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2) {
        Checker.checkNonNull(activity, C0201.m82(17953));
        HMSLog.i(C0201.m82(17955), C0201.m82(17954) + i);
        return getErrorDialog(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public String getErrorString(int i) {
        HMSLog.i(C0201.m82(17960), C0201.m82(17959) + i);
        return ConnectionResult.a(i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task<Void> getHuaweiServicesReady(Activity activity) {
        Preconditions.checkNotNull(activity);
        final TaskCompletionSource[] taskCompletionSourceArr = {new TaskCompletionSource()};
        Task<Void> task = taskCompletionSourceArr[0].getTask();
        int isHuaweiMobileServicesAvailable = isHuaweiMobileServicesAvailable(activity.getApplicationContext(), 30000000);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, isHuaweiMobileServicesAvailable);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, ResolutionDelegate.class.getName());
        if (resolveErrorIntent != null) {
            ForegroundIntentBuilder.registerResponseCallback(C0201.m82(17961), new BusResponseCallback() {
                /* class com.huawei.hms.api.b.AnonymousClass1 */

                @Override // com.huawei.hms.activity.internal.BusResponseCallback
                public BusResponseResult innerError(Activity activity, int i, String str) {
                    HMSLog.e(C0201.m82(13089), C0201.m82(13087) + i + C0201.m82(13088) + str);
                    taskCompletionSourceArr[0].setException(new AvailabilityException());
                    return null;
                }

                @Override // com.huawei.hms.activity.internal.BusResponseCallback
                public BusResponseResult succeedReturn(Activity activity, int i, Intent intent) {
                    HMSLog.i(C0201.m82(13092), C0201.m82(13090) + i + C0201.m82(13091) + intent);
                    return null;
                }
            });
            Bundle bundle = new Bundle();
            bundle.putParcelable(C0201.m82(17962), resolveErrorIntent);
            intentStartBridgeActivity.putExtras(bundle);
            activity.startActivity(intentStartBridgeActivity);
        } else if (isHuaweiMobileServicesAvailable == 3) {
            Intent intent = new Intent();
            intent.setClass(activity, EnableServiceActivity.class);
            activity.startActivity(intent);
        } else {
            String r7 = C0201.m82(17963);
            if (isHuaweiMobileServicesAvailable == 0) {
                HMSLog.i(r7, C0201.m82(17964));
            } else {
                HMSLog.e(r7, C0201.m82(17965));
                taskCompletionSourceArr[0].setException(new AvailabilityException());
            }
        }
        return task;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Intent getResolveErrorIntent(Activity activity, int i) {
        HMSLog.i(C0201.m82(17967), C0201.m82(17966) + i);
        if (!Util.isAvailableLibExist(activity.getApplicationContext())) {
            return null;
        }
        if (i == 1 || i == 2) {
            UpdateBean updateBean = new UpdateBean();
            updateBean.setHmsOrApkUpgrade(true);
            if (HMSPublishStateHolder.getPublishState() == 0) {
                updateBean.setClientPackageName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
            } else if (HMSPublishStateHolder.getPublishState() == 1) {
                updateBean.setClientPackageName(C0201.m82(17968));
            } else {
                updateBean.setClientPackageName(C0201.m82(17969));
            }
            updateBean.setClientVersionCode(HuaweiApiAvailability.getServicesVersionCode());
            updateBean.setClientAppId(C0201.m82(17970));
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(activity.getApplicationContext());
            }
            updateBean.setClientAppName(ResourceLoaderUtil.getString(C0201.m82(17971)));
            return UpdateManager.getStartUpdateIntent(activity, updateBean);
        } else if (i != 6) {
            return null;
        } else {
            return a(activity, BindingFailedResolution.class.getName());
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getResolveErrorPendingIntent(Activity activity, int i) {
        HMSLog.i(C0201.m82(17973), C0201.m82(17972) + i);
        Intent resolveErrorIntent = getResolveErrorIntent(activity, i);
        if (resolveErrorIntent != null) {
            return PendingIntent.getActivity(activity, 0, resolveErrorIntent, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileNoticeAvailable(Context context) {
        Checker.checkNonNull(context, C0201.m82(17974));
        if (PackageManagerHelper.PackageStates.NOT_INSTALLED.equals(new PackageManagerHelper(context).getPackageStates(HMSPackageManager.getInstance(context).getHMSPackageName()))) {
            return 1;
        }
        return HMSPackageManager.getInstance(context).isApkUpdateNecessary(20600000) ? 2 : 0;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context) {
        Checker.checkNonNull(context, C0201.m82(17975));
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, HuaweiApiAvailability.getServicesVersionCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i) {
        return isUserResolvableError(i, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean isUserResolvableError(int i, PendingIntent pendingIntent) {
        if (i == 0) {
            return false;
        }
        return pendingIntent != null || i == 1 || i == 2 || i == 6;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void popupErrNotification(Context context, ConnectionResult connectionResult) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(connectionResult);
        showErrorNotification(context, connectionResult.getErrorCode());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2) {
        resolveError(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2) {
        return showErrorDialogFragment(activity, i, i2, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void showErrorNotification(Context context, int i) {
        Checker.checkNonNull(context, C0201.m82(17984));
        String r1 = C0201.m82(17986);
        HMSLog.i(r1, C0201.m82(17985) + i);
        Dialog errorDialog = getErrorDialog((Activity) context, i, 0);
        if (errorDialog == null) {
            HMSLog.i(r1, C0201.m82(17987));
        } else {
            errorDialog.show();
        }
    }

    private static Intent a(Activity activity, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(activity, str);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public void resolveError(Activity activity, int i, int i2, PendingIntent pendingIntent) {
        Checker.checkNonNull(activity, C0201.m82(17977));
        String r0 = C0201.m82(17978);
        if (pendingIntent != null) {
            HMSLog.i(r0, C0201.m82(17979) + i);
        } else {
            HMSLog.i(r0, C0201.m82(17980) + i);
            pendingIntent = getResolveErrorPendingIntent(activity, i);
        }
        if (pendingIntent != null) {
            HMSLog.i(r0, C0201.m82(17981) + i);
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i2, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException unused) {
                HMSLog.e(r0, C0201.m82(17982) + i);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog errorDialog = getErrorDialog(activity, i, i2, onCancelListener);
        if (errorDialog == null) {
            return false;
        }
        a(activity, errorDialog, C0201.m82(17983), onCancelListener);
        return true;
    }

    private static Intent a(Context context, String str) {
        return BridgeActivity.getIntentStartBridgeActivity(context, str);
    }

    public PendingIntent a(Context context, int i) {
        HMSLog.i(C0201.m82(17939), C0201.m82(17938) + i);
        Intent b = b(context, i);
        if (b != null) {
            return PendingIntent.getActivity(context, 0, b, 134217728);
        }
        return null;
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Dialog getErrorDialog(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, C0201.m82(17956));
        HMSLog.i(C0201.m82(17958), C0201.m82(17957) + i);
        return a(activity, i, DialogRedirect.getInstance(activity, a(activity, i), i2), onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public int isHuaweiMobileServicesAvailable(Context context, int i) {
        Checker.checkNonNull(context, C0201.m82(17976));
        return HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(context, i);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public boolean showErrorDialogFragment(Activity activity, int i, Fragment fragment, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(activity, i, i2, onCancelListener);
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public PendingIntent getErrPendingIntent(Context context, int i, int i2) {
        HMSLog.i(C0201.m82(17952), C0201.m82(17950) + i + C0201.m82(17951) + i2);
        Intent b = b(context, i);
        if (b != null) {
            return PendingIntent.getActivity(context, i2, b, 134217728);
        }
        return null;
    }

    private Intent a(Activity activity, int i) {
        if (!Util.isAvailableLibExist(activity.getApplicationContext())) {
            return null;
        }
        if (i == 1 || i == 2) {
            return UpdateManager.startUpdateIntent(activity);
        }
        if (i != 6) {
            return null;
        }
        return BridgeActivity.getIntentStartBridgeActivity(activity, BindingFailedResolution.class.getName());
    }

    @Override // com.huawei.hms.api.HuaweiApiAvailability
    public Task<Void> checkApiAccessible(HuaweiApiCallable huaweiApiCallable, HuaweiApiCallable... huaweiApiCallableArr) {
        Task<Void> task = new TaskCompletionSource().getTask();
        if (huaweiApiCallable != null) {
            try {
                a(huaweiApiCallable);
            } catch (AvailabilityException e) {
                HMSLog.i(C0201.m82(17949), C0201.m82(17948) + e.getMessage());
            }
        }
        if (huaweiApiCallableArr != null) {
            for (HuaweiApiCallable huaweiApiCallable2 : huaweiApiCallableArr) {
                a(huaweiApiCallable2);
            }
        }
        return task;
    }

    public static int a(Activity activity) {
        return (a(activity) == 0 || Build.VERSION.SDK_INT < 16) ? 3 : 0;
    }

    private static int a(Context context) {
        if (context == null) {
            return 0;
        }
        return context.getResources().getIdentifier(C0201.m82(17934), null, null);
    }

    private static Dialog a(Activity activity, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        if (i == 0) {
            return null;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(activity, a(activity));
        builder.setMessage(ConnectionErrorMessages.getErrorMessage(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        builder.setPositiveButton(ConnectionErrorMessages.getErrorDialogButtonMessage(activity, i), dialogRedirect);
        String errorTitle = ConnectionErrorMessages.getErrorTitle(activity, i);
        if (errorTitle != null) {
            builder.setTitle(errorTitle);
        }
        return builder.create();
    }

    private static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        Checker.checkNonNull(activity, C0201.m82(17935));
        ErrorDialogFragment.newInstance(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    private void a(Object obj) throws AvailabilityException {
        ConnectionResult connectionResult;
        AvailabilityException availabilityException = new AvailabilityException();
        if (obj instanceof HuaweiApi) {
            connectionResult = availabilityException.getConnectionResult((HuaweiApi) obj);
        } else {
            connectionResult = availabilityException.getConnectionResult((HuaweiApiCallable) obj);
        }
        if (connectionResult.getErrorCode() != 0) {
            HMSLog.i(C0201.m82(17937), C0201.m82(17936) + availabilityException.getMessage());
            throw availabilityException;
        }
    }
}
