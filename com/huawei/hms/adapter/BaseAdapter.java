package com.huawei.hms.adapter;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.adapter.sysobs.SystemManager;
import com.huawei.hms.adapter.sysobs.SystemObserver;
import com.huawei.hms.adapter.ui.BaseResolutionAdapter;
import com.huawei.hms.common.internal.RequestHeader;
import com.huawei.hms.common.internal.ResponseHeader;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.JsonUtil;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public class BaseAdapter {
    private static final String TAG = null;
    private WeakReference<Activity> activityWeakReference;
    private WeakReference<ApiClient> api;
    private Context appContext;
    private BaseCallBack baseCallBackReplay;
    private BaseCallBack callback;
    private String jsonHeaderReplay;
    private String jsonObjectReplay;
    private SystemObserver observer;
    private Parcelable parcelableReplay;
    private RequestHeader requestHeader = new RequestHeader();
    private ResponseHeader responseHeader = new ResponseHeader();
    private String transactionId;

    public interface BaseCallBack {
        void onComplete(String str, String str2, Parcelable parcelable);

        void onError(String str);
    }

    public class BaseRequestResultCallback implements ResultCallback<ResolveResult<CoreBaseResponse>> {
        private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

        public BaseRequestResultCallback() {
        }

        private void handleSolutionIntent(BaseCallBack baseCallBack, CoreBaseResponse coreBaseResponse) {
            HMSLog.i(C0201.m82(6252), C0201.m82(6253));
            PendingIntent pendingIntent = coreBaseResponse.getPendingIntent();
            if (pendingIntent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), pendingIntent);
                return;
            }
            Intent intent = coreBaseResponse.getIntent();
            if (intent != null) {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), intent);
            } else {
                baseCallBack.onComplete(coreBaseResponse.getJsonHeader(), coreBaseResponse.getJsonBody(), null);
            }
        }

        public void onResult(ResolveResult<CoreBaseResponse> resolveResult) {
            BaseCallBack callBack = BaseAdapter.this.getCallBack();
            String r1 = C0201.m82(6254);
            if (callBack == null) {
                HMSLog.e(r1, C0201.m82(6255));
            } else if (resolveResult == null) {
                HMSLog.e(r1, C0201.m82(6256));
                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
            } else {
                CoreBaseResponse value = resolveResult.getValue();
                if (value == null) {
                    HMSLog.e(r1, C0201.m82(6257));
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                } else if (TextUtils.isEmpty(value.getJsonHeader())) {
                    HMSLog.e(r1, C0201.m82(6258));
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-1));
                } else {
                    JsonUtil.jsonToEntity(value.getJsonHeader(), BaseAdapter.this.responseHeader);
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        BaseAdapter baseAdapter = BaseAdapter.this;
                        baseAdapter.biReportRequestReturnIpc(baseAdapter.appContext, BaseAdapter.this.responseHeader);
                    }
                    if (C0201.m82(6259).equals(BaseAdapter.this.responseHeader.getResolution())) {
                        Activity cpActivity = BaseAdapter.this.getCpActivity();
                        HMSLog.i(r1, C0201.m82(6260) + cpActivity);
                        if (cpActivity == null || cpActivity.isFinishing()) {
                            HMSLog.e(r1, C0201.m82(6262));
                            handleSolutionIntent(callBack, value);
                            return;
                        }
                        PendingIntent pendingIntent = value.getPendingIntent();
                        if (pendingIntent == null) {
                            Intent intent = value.getIntent();
                            if (intent == null) {
                                HMSLog.e(r1, C0201.m82(6261));
                                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-4));
                            } else if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                                BaseAdapter.this.startResolution(cpActivity, intent);
                            } else {
                                callBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                            }
                        } else if (Util.isAvailableLibExist(BaseAdapter.this.appContext)) {
                            BaseAdapter.this.startResolution(cpActivity, pendingIntent);
                        } else {
                            callBack.onError(BaseAdapter.this.getResponseHeaderForError(-9));
                        }
                    } else {
                        handleSolutionIntent(callBack, value);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public static class MPendingResultImpl extends PendingResultImpl<ResolveResult<CoreBaseResponse>, CoreBaseResponse> {
        public MPendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        public ResolveResult<CoreBaseResponse> onComplete(CoreBaseResponse coreBaseResponse) {
            ResolveResult<CoreBaseResponse> resolveResult = new ResolveResult<>(coreBaseResponse);
            resolveResult.setStatus(Status.SUCCESS);
            return resolveResult;
        }
    }

    static {
        C0201.m83(BaseAdapter.class, 679);
    }

    public BaseAdapter(ApiClient apiClient) {
        this.api = new WeakReference<>(apiClient);
    }

    private void biReportRequestEntryIpc(Context context, RequestHeader requestHeader2) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader2);
        mapFromRequestHeader.put(C0201.m82(33288), C0201.m82(33289));
        mapFromRequestHeader.put(C0201.m82(33290), HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader2.getKitSdkVersion())));
        mapFromRequestHeader.put(C0201.m82(33293), Util.getSystemProperties(C0201.m82(33291), C0201.m82(33292)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(33294), mapFromRequestHeader);
    }

    private void biReportRequestEntrySolution(Context context, RequestHeader requestHeader2) {
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getInstance().getMapFromRequestHeader(requestHeader2);
        mapFromRequestHeader.put(C0201.m82(33295), C0201.m82(33296));
        mapFromRequestHeader.put(C0201.m82(33297), HiAnalyticsUtil.versionCodeToName(String.valueOf(requestHeader2.getKitSdkVersion())));
        mapFromRequestHeader.put(C0201.m82(33300), Util.getSystemProperties(C0201.m82(33298), C0201.m82(33299)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(33301), mapFromRequestHeader);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void biReportRequestReturnIpc(Context context, ResponseHeader responseHeader2) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader2);
        mapFromRequestHeader.put(C0201.m82(33302), C0201.m82(33303));
        mapFromRequestHeader.put(C0201.m82(33304), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(C0201.m82(33307), Util.getSystemProperties(C0201.m82(33305), C0201.m82(33306)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(33308), mapFromRequestHeader);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void biReportRequestReturnSolution(Context context, ResponseHeader responseHeader2, long j) {
        HiAnalyticsUtil.getInstance();
        Map<String, String> mapFromRequestHeader = HiAnalyticsUtil.getMapFromRequestHeader(responseHeader2);
        mapFromRequestHeader.put(C0201.m82(33309), C0201.m82(33310));
        mapFromRequestHeader.put(C0201.m82(33311), String.valueOf(j));
        mapFromRequestHeader.put(C0201.m82(33312), HiAnalyticsUtil.versionCodeToName(String.valueOf(this.requestHeader.getKitSdkVersion())));
        mapFromRequestHeader.put(C0201.m82(33315), Util.getSystemProperties(C0201.m82(33313), C0201.m82(33314)));
        HiAnalyticsUtil.getInstance().onNewEvent(context, C0201.m82(33316), mapFromRequestHeader);
    }

    private BaseCallBack getBaseCallBackReplay() {
        return this.baseCallBackReplay;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private BaseCallBack getCallBack() {
        BaseCallBack baseCallBack = this.callback;
        if (baseCallBack != null) {
            return baseCallBack;
        }
        HMSLog.e(C0201.m82(33317), C0201.m82(33318));
        return null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.activityWeakReference;
        String r2 = C0201.m82(33319);
        if (weakReference == null) {
            HMSLog.i(r2, C0201.m82(33320) + this.activityWeakReference);
            return null;
        }
        ApiClient apiClient = this.api.get();
        if (apiClient == null) {
            HMSLog.i(r2, C0201.m82(33321) + apiClient);
            return null;
        }
        HMSLog.i(r2, C0201.m82(33322) + this.activityWeakReference.get());
        return Util.getActiveActivity(this.activityWeakReference.get(), apiClient.getContext());
    }

    private String getJsonHeaderReplay() {
        return this.jsonHeaderReplay;
    }

    private String getJsonObjectReplay() {
        return this.jsonObjectReplay;
    }

    private Parcelable getParcelableReplay() {
        return this.parcelableReplay;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private String getResponseHeaderForError(int i) {
        this.responseHeader.setTransactionId(this.requestHeader.getTransactionId());
        this.responseHeader.setAppID(this.requestHeader.getAppID());
        this.responseHeader.setApiName(this.requestHeader.getApiName());
        this.responseHeader.setSrvName(this.requestHeader.getSrvName());
        this.responseHeader.setPkgName(this.requestHeader.getPkgName());
        this.responseHeader.setStatusCode(1);
        this.responseHeader.setErrorCode(i);
        this.responseHeader.setErrorReason(C0201.m82(33323));
        return this.responseHeader.toJson();
    }

    private void initObserver() {
        this.observer = new SystemObserver() {
            /* class com.huawei.hms.adapter.BaseAdapter.AnonymousClass1 */

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onSolutionResult(Intent intent, String str) {
                boolean isEmpty = TextUtils.isEmpty(str);
                String r2 = C0201.m82(36379);
                if (isEmpty) {
                    HMSLog.e(r2, C0201.m82(36380));
                    BaseCallBack callBack = BaseAdapter.this.getCallBack();
                    if (callBack == null) {
                        HMSLog.e(r2, C0201.m82(36381));
                        return true;
                    }
                    callBack.onError(BaseAdapter.this.getResponseHeaderForError(-6));
                    return true;
                } else if (!str.equals(BaseAdapter.this.transactionId)) {
                    return false;
                } else {
                    HMSLog.i(r2, C0201.m82(36382) + str);
                    BaseCallBack callBack2 = BaseAdapter.this.getCallBack();
                    if (callBack2 == null) {
                        HMSLog.e(r2, C0201.m82(36383));
                        return true;
                    }
                    long j = 0;
                    if (intent == null) {
                        HMSLog.e(r2, C0201.m82(36384));
                        String responseHeaderForError = BaseAdapter.this.getResponseHeaderForError(-7);
                        BaseAdapter baseAdapter = BaseAdapter.this;
                        baseAdapter.biReportRequestReturnSolution(baseAdapter.appContext, BaseAdapter.this.responseHeader, 0);
                        callBack2.onError(responseHeaderForError);
                        return true;
                    }
                    String r0 = C0201.m82(36385);
                    if (intent.hasExtra(r0)) {
                        int intExtra = intent.getIntExtra(r0, 0);
                        HMSLog.i(r2, C0201.m82(36386) + intExtra);
                        if (intExtra == 1) {
                            HMSLog.e(r2, C0201.m82(36387));
                            BaseAdapter.this.replayRequest();
                        } else {
                            HMSLog.e(r2, C0201.m82(36388));
                            callBack2.onError(BaseAdapter.this.getResponseHeaderForError(-10));
                        }
                        return true;
                    }
                    HMSLog.e(r2, C0201.m82(36389));
                    String stringExtra = intent.getStringExtra(C0201.m82(36390));
                    String stringExtra2 = intent.getStringExtra(C0201.m82(36391));
                    Object infoFromJsonobject = JsonUtil.getInfoFromJsonobject(stringExtra, C0201.m82(36392));
                    Object infoFromJsonobject2 = JsonUtil.getInfoFromJsonobject(stringExtra, C0201.m82(36393));
                    String r7 = C0201.m82(36394);
                    if (intent.hasExtra(r7)) {
                        Object infoFromJsonobject3 = JsonUtil.getInfoFromJsonobject(intent.getStringExtra(r7), C0201.m82(36395));
                        if (infoFromJsonobject3 instanceof Long) {
                            j = ((Long) infoFromJsonobject3).longValue();
                        }
                    }
                    if (!(infoFromJsonobject instanceof Integer) || !(infoFromJsonobject2 instanceof Integer)) {
                        BaseAdapter.this.getResponseHeaderForError(-8);
                        BaseAdapter baseAdapter2 = BaseAdapter.this;
                        baseAdapter2.biReportRequestReturnSolution(baseAdapter2.appContext, BaseAdapter.this.responseHeader, j);
                    } else {
                        int intValue = ((Integer) infoFromJsonobject).intValue();
                        BaseAdapter.this.getResponseHeaderForError(((Integer) infoFromJsonobject2).intValue());
                        BaseAdapter.this.responseHeader.setStatusCode(intValue);
                        BaseAdapter baseAdapter3 = BaseAdapter.this;
                        baseAdapter3.biReportRequestReturnSolution(baseAdapter3.appContext, BaseAdapter.this.responseHeader, j);
                    }
                    callBack2.onComplete(stringExtra, stringExtra2, null);
                    return true;
                }
            }

            @Override // com.huawei.hms.adapter.sysobs.SystemObserver
            public boolean onUpdateResult(int i) {
                return false;
            }
        };
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void replayRequest() {
        if (this.jsonHeaderReplay != null && this.baseCallBackReplay != null) {
            this.responseHeader = null;
            this.responseHeader = new ResponseHeader();
            baseRequest(getJsonHeaderReplay(), getJsonObjectReplay(), getParcelableReplay(), getBaseCallBackReplay());
        }
    }

    private void setBaseCallBackReplay(BaseCallBack baseCallBack) {
        this.baseCallBackReplay = baseCallBack;
    }

    private void setJsonHeaderReplay(String str) {
        this.jsonHeaderReplay = str;
    }

    private void setJsonObjectReplay(String str) {
        this.jsonObjectReplay = str;
    }

    private void setParcelableReplay(Parcelable parcelable) {
        this.parcelableReplay = parcelable;
    }

    private void setReplayData(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setJsonHeaderReplay(str);
        setJsonObjectReplay(str2);
        setParcelableReplay(parcelable);
        setBaseCallBackReplay(baseCallBack);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void startResolution(Activity activity, Parcelable parcelable) {
        HMSLog.i(C0201.m82(33324), C0201.m82(33325));
        RequestHeader requestHeader2 = this.requestHeader;
        if (requestHeader2 != null) {
            biReportRequestEntrySolution(this.appContext, requestHeader2);
        }
        if (this.observer == null) {
            initObserver();
        }
        SystemManager.getSystemNotifier().registerObserver(this.observer);
        Intent intentStartBridgeActivity = BridgeActivity.getIntentStartBridgeActivity(activity, BaseResolutionAdapter.class.getName());
        Bundle bundle = new Bundle();
        bundle.putParcelable(C0201.m82(33326), parcelable);
        intentStartBridgeActivity.putExtras(bundle);
        intentStartBridgeActivity.putExtra(C0201.m82(33327), this.transactionId);
        activity.startActivity(intentStartBridgeActivity);
    }

    public void baseRequest(String str, String str2, Parcelable parcelable, BaseCallBack baseCallBack) {
        setReplayData(str, str2, parcelable, baseCallBack);
        WeakReference<ApiClient> weakReference = this.api;
        String r1 = C0201.m82(33328);
        if (weakReference == null) {
            HMSLog.e(r1, C0201.m82(33329));
            baseCallBack.onError(getResponseHeaderForError(-2));
            return;
        }
        this.callback = baseCallBack;
        JsonUtil.jsonToEntity(str, this.requestHeader);
        CoreBaseRequest coreBaseRequest = new CoreBaseRequest();
        coreBaseRequest.setJsonObject(str2);
        coreBaseRequest.setJsonHeader(str);
        coreBaseRequest.setParcelable(parcelable);
        String apiName = this.requestHeader.getApiName();
        if (TextUtils.isEmpty(apiName)) {
            HMSLog.e(r1, C0201.m82(33330));
            baseCallBack.onError(getResponseHeaderForError(-5));
            return;
        }
        String transactionId2 = this.requestHeader.getTransactionId();
        this.transactionId = transactionId2;
        if (TextUtils.isEmpty(transactionId2)) {
            HMSLog.e(r1, C0201.m82(33331));
            baseCallBack.onError(getResponseHeaderForError(-6));
            return;
        }
        HMSLog.i(r1, C0201.m82(33332) + apiName + C0201.m82(33333) + this.transactionId);
        biReportRequestEntryIpc(this.appContext, this.requestHeader);
        baseRequest(this.api.get(), apiName, coreBaseRequest).setResultCallback(new BaseRequestResultCallback());
    }

    public BaseAdapter(ApiClient apiClient, Activity activity) {
        this.api = new WeakReference<>(apiClient);
        this.activityWeakReference = new WeakReference<>(activity);
        this.appContext = activity.getApplicationContext();
    }

    private PendingResult<ResolveResult<CoreBaseResponse>> baseRequest(ApiClient apiClient, String str, CoreBaseRequest coreBaseRequest) {
        return new MPendingResultImpl(apiClient, str, coreBaseRequest);
    }
}
