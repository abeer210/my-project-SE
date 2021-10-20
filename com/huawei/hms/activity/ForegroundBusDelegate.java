package com.huawei.hms.activity;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.text.TextUtils;
import android.view.KeyEvent;
import com.huawei.hms.activity.internal.BusResponseCallback;
import com.huawei.hms.activity.internal.BusResponseResult;
import com.huawei.hms.activity.internal.ForegroundBusResponseMgr;
import com.huawei.hms.activity.internal.ForegroundInnerHeader;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;
import vigqyno.C0201;

public class ForegroundBusDelegate implements IBridgeActivityDelegate {
    private static final String EXTRA_DELEGATE_NAME = null;
    private static final String EXTRA_DELEGATE_VALUE = null;
    public static final String HMS_FOREGROUND_REQ_BODY = null;
    public static final String HMS_FOREGROUND_REQ_HEADER = null;
    public static final String HMS_FOREGROUND_REQ_INNER = null;
    public static final String HMS_FOREGROUND_RESP_HEADER = null;
    private static final int REQUEST_CODE_BUS = 0;
    private static final String TAG = null;
    private static final String UI_JUMP_ACTIVITY_NAME = null;
    private String foregroundBody;
    private RequestHeader foregroundHeader;
    private ForegroundInnerHeader innerHeader = new ForegroundInnerHeader();
    private WeakReference<Activity> mThisWeakRef;
    private ResponseHeader responseHeader;

    /* access modifiers changed from: private */
    public class MyAvailableCallBack implements AvailableAdapter.AvailableCallBack {
        private MyAvailableCallBack() {
        }

        @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
        public void onComplete(int i) {
            if (i == 0) {
                ForegroundBusDelegate.this.startApkHubActivity();
                return;
            }
            HMSLog.i(C0201.m82(20082), C0201.m82(20083));
            ForegroundBusDelegate.this.errorReturn(0, C0201.m82(20084));
        }
    }

    static {
        C0201.m83(ForegroundBusDelegate.class, 346);
    }

    private void biReportRequestEntryForegroundBus() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.foregroundHeader);
        mapFromForegroundRequestHeader.put(C0201.m82(37828), C0201.m82(37829));
        mapFromForegroundRequestHeader.put(C0201.m82(37830), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.foregroundHeader.getKitSdkVersion())));
        if (getActivity() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(getActivity().getApplicationContext(), C0201.m82(37831), mapFromForegroundRequestHeader);
        }
    }

    private void biReportRequestEntryStartCore() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.foregroundHeader);
        mapFromForegroundRequestHeader.put(C0201.m82(37832), C0201.m82(37833));
        mapFromForegroundRequestHeader.put(C0201.m82(37834), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.foregroundHeader.getKitSdkVersion())));
        if (getActivity() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(getActivity().getApplicationContext(), C0201.m82(37835), mapFromForegroundRequestHeader);
        }
    }

    private void biReportRequestReturnForegroundBus() {
        if (this.foregroundHeader != null) {
            Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.foregroundHeader);
            mapFromForegroundRequestHeader.put(C0201.m82(37836), C0201.m82(37837));
            mapFromForegroundRequestHeader.put(C0201.m82(37838), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.foregroundHeader.getKitSdkVersion())));
            ResponseHeader responseHeader2 = this.responseHeader;
            if (responseHeader2 != null) {
                mapFromForegroundRequestHeader.put(C0201.m82(37839), String.valueOf(responseHeader2.getStatusCode()));
                mapFromForegroundRequestHeader.put(C0201.m82(37840), String.valueOf(this.responseHeader.getErrorCode()));
            }
            if (getActivity() != null) {
                HiAnalyticsUtil.getInstance().onNewEvent(getActivity().getApplicationContext(), C0201.m82(37841), mapFromForegroundRequestHeader);
            }
        }
    }

    private void biReportRequestReturnStartCore() {
        Map<String, String> mapFromForegroundRequestHeader = HiAnalyticsUtil.getInstance().getMapFromForegroundRequestHeader(this.foregroundHeader);
        mapFromForegroundRequestHeader.put(C0201.m82(37842), C0201.m82(37843));
        mapFromForegroundRequestHeader.put(C0201.m82(37844), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.foregroundHeader.getKitSdkVersion())));
        ResponseHeader responseHeader2 = this.responseHeader;
        if (responseHeader2 != null) {
            mapFromForegroundRequestHeader.put(C0201.m82(37845), String.valueOf(responseHeader2.getStatusCode()));
            mapFromForegroundRequestHeader.put(C0201.m82(37846), String.valueOf(this.responseHeader.getErrorCode()));
        }
        if (getActivity() != null) {
            HiAnalyticsUtil.getInstance().onNewEvent(getActivity().getApplicationContext(), C0201.m82(37847), mapFromForegroundRequestHeader);
        }
    }

    private void checkMinVersion() {
        Activity activity = getActivity();
        String r1 = C0201.m82(37848);
        if (activity == null) {
            HMSLog.e(r1, C0201.m82(37849));
        } else if (Util.isAvailableLibExist(getActivity().getApplicationContext())) {
            MyAvailableCallBack myAvailableCallBack = new MyAvailableCallBack();
            AvailableAdapter availableAdapter = new AvailableAdapter(this.innerHeader.getApkVersion());
            int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(getActivity());
            if (isHuaweiMobileServicesAvailable == 0) {
                myAvailableCallBack.onComplete(isHuaweiMobileServicesAvailable);
            } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                resolution(getActivity(), availableAdapter, myAvailableCallBack);
            } else {
                myAvailableCallBack.onComplete(isHuaweiMobileServicesAvailable);
            }
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(getActivity().getApplicationContext(), this.innerHeader.getApkVersion()) != 0) {
            HMSLog.e(r1, C0201.m82(37850));
        } else {
            startApkHubActivity();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void errorReturn(int i, String str) {
        HMSLog.e(C0201.m82(37851), str);
        Activity activity = getActivity();
        if (activity != null) {
            BusResponseCallback responseCallback = getResponseCallback(this.innerHeader.getResponseCallbackKey());
            if (responseCallback != null) {
                BusResponseResult innerError = responseCallback.innerError(this.mThisWeakRef.get(), i, str);
                if (innerError == null) {
                    activity.setResult(0);
                } else {
                    activity.setResult(innerError.getCode(), innerError.getIntent());
                }
            } else {
                activity.setResult(0);
            }
            finishBridgeActivity();
        }
    }

    private void finishBridgeActivity() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            activity.finish();
        }
    }

    private Activity getActivity() {
        WeakReference<Activity> weakReference = this.mThisWeakRef;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private BusResponseCallback getResponseCallback(String str) {
        return ForegroundBusResponseMgr.getInstance().get(str);
    }

    private static void resolution(Activity activity, AvailableAdapter availableAdapter, AvailableAdapter.AvailableCallBack availableCallBack) {
        if (activity == null) {
            HMSLog.i(C0201.m82(37852), C0201.m82(37853));
        }
        availableAdapter.startResolution(activity, availableCallBack);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startApkHubActivity() {
        String r0 = C0201.m82(37854);
        HMSLog.i(r0, C0201.m82(37855));
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.e(r0, C0201.m82(37856));
            return;
        }
        String hMSPackageName = HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName();
        Intent intent = new Intent(this.innerHeader.getAction());
        intent.putExtra(C0201.m82(37857), this.foregroundBody);
        intent.setPackage(hMSPackageName);
        intent.setClassName(hMSPackageName, C0201.m82(37858));
        intent.putExtra(C0201.m82(37859), this.foregroundHeader.toJson());
        intent.putExtra(C0201.m82(37860), C0201.m82(37861));
        try {
            biReportRequestEntryStartCore();
            activity.startActivityForResult(intent, 431057);
        } catch (ActivityNotFoundException e) {
            HMSLog.e(r0, C0201.m82(37862), e);
            errorReturn(0, C0201.m82(37863));
        }
    }

    private void succeedReturn(int i, Intent intent) {
        HMSLog.i(C0201.m82(37864), C0201.m82(37865));
        Activity activity = getActivity();
        if (activity != null) {
            activity.setResult(i, intent);
            finishBridgeActivity();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 431057;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.mThisWeakRef = new WeakReference<>(activity);
        Intent intent = activity.getIntent();
        String stringExtra = intent.getStringExtra(C0201.m82(37866));
        RequestHeader requestHeader = new RequestHeader();
        this.foregroundHeader = requestHeader;
        if (!requestHeader.fromJson(stringExtra)) {
            errorReturn(0, C0201.m82(37867));
            return;
        }
        this.foregroundBody = intent.getStringExtra(C0201.m82(37868));
        this.innerHeader.fromJson(intent.getStringExtra(C0201.m82(37869)));
        if (this.innerHeader == null) {
            errorReturn(0, C0201.m82(37870));
        } else if (TextUtils.isEmpty(this.foregroundHeader.getApiName())) {
            errorReturn(0, C0201.m82(37871));
        } else {
            biReportRequestEntryForegroundBus();
            checkMinVersion();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        biReportRequestReturnForegroundBus();
        this.mThisWeakRef = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != 431057) {
            return false;
        }
        if (intent != null) {
            String r2 = C0201.m82(37872);
            if (intent.hasExtra(r2)) {
                String stringExtra = intent.getStringExtra(r2);
                ResponseHeader responseHeader2 = new ResponseHeader();
                this.responseHeader = responseHeader2;
                JsonUtil.jsonToEntity(stringExtra, responseHeader2);
            }
        }
        biReportRequestReturnStartCore();
        BusResponseCallback responseCallback = getResponseCallback(this.innerHeader.getResponseCallbackKey());
        if (responseCallback == null) {
            succeedReturn(i2, intent);
            return true;
        }
        BusResponseResult succeedReturn = responseCallback.succeedReturn(this.mThisWeakRef.get(), i2, intent);
        if (succeedReturn == null) {
            succeedReturn(i2, intent);
            return true;
        }
        succeedReturn(succeedReturn.getCode(), succeedReturn.getIntent());
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
    }
}
