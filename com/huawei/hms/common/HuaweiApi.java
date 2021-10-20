package com.huawei.hms.common;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.Api.ApiOptions;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.common.internal.ConnectionManagerKey;
import com.huawei.hms.common.internal.HuaweiApiManager;
import com.huawei.hms.common.internal.TaskApiCall;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import vigqyno.C0188;
import vigqyno.C0201;

public class HuaweiApi<TOption extends Api.ApiOptions> {
    private static final String TAG = null;
    private int apiLevel = 1;
    private String innerHmsPkg;
    private boolean isFirstReqSent = false;
    private WeakReference<Activity> mActivity;
    private String mAppID;
    private AbstractClientBuilder<?, TOption> mClientBuilder;
    private ConnectionManagerKey<TOption> mConnectionManagerKey;
    private Context mContext;
    private String mCpID;
    private String mHostAppid;
    private HuaweiApiManager mHuaweiApiManager;
    private int mKitSdkVersion;
    private TOption mOption;
    private SubAppInfo mSubAppInfo;

    static {
        C0201.m83(HuaweiApi.class, C0188.f17);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(activity, C0201.m82(1130));
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, null);
    }

    private void init(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mHuaweiApiManager = HuaweiApiManager.getInstance(applicationContext);
        this.mConnectionManagerKey = ConnectionManagerKey.createConnectionManagerKey(context, api, toption, str);
        this.mOption = toption;
        this.mClientBuilder = abstractClientBuilder;
        String appId = Util.getAppId(context);
        this.mHostAppid = appId;
        this.mAppID = appId;
        this.mCpID = Util.getCpId(context);
        this.mSubAppInfo = new SubAppInfo(C0201.m82(1135));
        this.mKitSdkVersion = i;
        if (!TextUtils.isEmpty(str)) {
            boolean equals = str.equals(this.mHostAppid);
            String r4 = C0201.m82(1136);
            if (equals) {
                HMSLog.e(r4, C0201.m82(1137));
            } else {
                HMSLog.i(r4, C0201.m82(1138) + str);
                this.mSubAppInfo = new SubAppInfo(str);
            }
        }
        initBI(context);
    }

    private void initBI(Context context) {
        HMSBIInitializer.getInstance(context).initBI();
    }

    private <TResult, TClient extends AnyClient> Task<TResult> sendRequest(TaskApiCall<TClient, TResult> taskApiCall) {
        TaskCompletionSource<TResult> taskCompletionSource;
        if (taskApiCall.getToken() == null) {
            taskCompletionSource = new TaskCompletionSource<>();
        } else {
            taskCompletionSource = new TaskCompletionSource<>(taskApiCall.getToken());
        }
        this.mHuaweiApiManager.sendRequest(this, taskApiCall, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public Task<Boolean> disconnectService() {
        TaskCompletionSource<Boolean> taskCompletionSource = new TaskCompletionSource<>();
        this.mHuaweiApiManager.disconnectService(this, taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public <TResult, TClient extends AnyClient> Task<TResult> doWrite(TaskApiCall<TClient, TResult> taskApiCall) {
        this.isFirstReqSent = true;
        if (taskApiCall == null) {
            HMSLog.e(C0201.m82(1139), C0201.m82(1140));
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            taskCompletionSource.setException(new ApiException(Status.FAILURE));
            return taskCompletionSource.getTask();
        }
        HiAnalyticsInnerClient.reportEntryClient(this.mContext, taskApiCall.getUri(), TextUtils.isEmpty(this.mSubAppInfo.getSubAppID()) ? this.mAppID : this.mSubAppInfo.getSubAppID(), taskApiCall.getTransactionId(), String.valueOf(getKitSdkVersion()));
        return sendRequest(taskApiCall);
    }

    public Activity getActivity() {
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int getApiLevel() {
        return this.apiLevel;
    }

    public String getAppID() {
        return this.mAppID;
    }

    public AnyClient getClient(Looper looper, HuaweiApiManager.ConnectionManager connectionManager) {
        return this.mClientBuilder.buildClient(this.mContext, getClientSetting(), connectionManager, connectionManager);
    }

    public ClientSettings getClientSetting() {
        ClientSettings clientSettings = new ClientSettings(this.mContext.getPackageName(), this.mContext.getClass().getName(), getScopes(), this.mHostAppid, null, this.mSubAppInfo);
        clientSettings.setCpID(this.mCpID);
        if (TextUtils.isEmpty(this.innerHmsPkg)) {
            this.innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageName();
            HMSLog.i(C0201.m82(1142), C0201.m82(1141) + this.innerHmsPkg);
        }
        clientSettings.setInnerHmsPkg(this.innerHmsPkg);
        WeakReference<Activity> weakReference = this.mActivity;
        if (weakReference != null) {
            clientSettings.setCpActivity(weakReference.get());
        }
        return clientSettings;
    }

    public ConnectionManagerKey<TOption> getConnectionManagerKey() {
        return this.mConnectionManagerKey;
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getKitSdkVersion() {
        return this.mKitSdkVersion;
    }

    public TOption getOption() {
        return this.mOption;
    }

    public List<Scope> getScopes() {
        return Collections.emptyList();
    }

    public String getSubAppID() {
        return this.mSubAppInfo.getSubAppID();
    }

    public void setApiLevel(int i) {
        this.apiLevel = i;
    }

    public void setInnerHms() {
        this.innerHmsPkg = this.mContext.getPackageName();
        HMSLog.i(C0201.m82(1144), C0201.m82(1143) + this.innerHmsPkg);
    }

    public void setKitSdkVersion(int i) {
        this.mKitSdkVersion = i;
    }

    public void setSubAppId(String str) throws ApiException {
        if (!setSubAppInfo(new SubAppInfo(str))) {
            throw new ApiException(Status.FAILURE);
        }
    }

    @Deprecated
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        String r0 = C0201.m82(1145);
        HMSLog.i(r0, C0201.m82(1146));
        SubAppInfo subAppInfo2 = this.mSubAppInfo;
        if (subAppInfo2 != null && !TextUtils.isEmpty(subAppInfo2.getSubAppID())) {
            HMSLog.e(r0, C0201.m82(1147));
            return false;
        } else if (subAppInfo == null) {
            HMSLog.e(r0, C0201.m82(1148));
            return false;
        } else {
            String subAppID = subAppInfo.getSubAppID();
            if (TextUtils.isEmpty(subAppID)) {
                HMSLog.e(r0, C0201.m82(1149));
                return false;
            } else if (subAppID.equals(this.mHostAppid)) {
                HMSLog.e(r0, C0201.m82(1150));
                return false;
            } else if (this.isFirstReqSent) {
                HMSLog.e(r0, C0201.m82(1151));
                return false;
            } else {
                this.mSubAppInfo = new SubAppInfo(subAppInfo);
                return true;
            }
        }
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(activity, C0201.m82(1131));
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Activity activity, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(activity, C0201.m82(1129));
        this.mActivity = new WeakReference<>(activity);
        init(activity, api, toption, abstractClientBuilder, 0, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i) {
        Checker.checkNonNull(context, C0201.m82(1133));
        init(context, api, toption, abstractClientBuilder, i, null);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder, int i, String str) {
        Checker.checkNonNull(context, C0201.m82(1134));
        init(context, api, toption, abstractClientBuilder, i, str);
    }

    public HuaweiApi(Context context, Api<TOption> api, TOption toption, AbstractClientBuilder abstractClientBuilder) {
        Checker.checkNonNull(context, C0201.m82(1132));
        init(context, api, toption, abstractClientBuilder, 0, null);
    }
}
