package com.huawei.hms.common.internal;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.huawei.hms.adapter.AvailableAdapter;
import com.huawei.hms.adapter.BinderAdapter;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.IPCTransport;
import com.huawei.hms.core.aidl.d;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.PackageNameManager;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

public abstract class BaseHmsClient implements AidlApiClient {
    private static final int BINDING = 0;
    private static final int CONNECTED = 0;
    private static final int DISCONNECTED = 0;
    private static final int DISCONNECTING = 0;
    private static final Object LOCK_CONNECT_TIMEOUT_HANDLER = new Object();
    private static final int MSG_CONN_TIMEOUT = 0;
    private static final String TAG = null;
    private String mAppID;
    private BinderAdapter mBinderAdapter;
    private final ClientSettings mClientSettings;
    private final AtomicInteger mConnStatus = new AtomicInteger(1);
    private Handler mConnectTimeoutHandler = null;
    private final ConnectionCallbacks mConnectionCallbacks;
    private final OnConnectionFailedListener mConnectionFailedListener;
    private final Context mContext;
    private volatile d mService;
    public String sessionId;

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 0;
        public static final int CAUSE_NETWORK_LOST = 0;
        public static final int CAUSE_SERVICE_DISCONNECTED = 0;

        static {
            C0201.m83(ConnectionCallbacks.class, 524);
        }

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    /* access modifiers changed from: private */
    public class VoidOnConnectionFailed implements PackageNameManager.QueryPublishCallback {
        private int errorCode;

        public VoidOnConnectionFailed(int i) {
            this.errorCode = i;
        }

        @Override // com.huawei.hms.update.manager.PackageNameManager.QueryPublishCallback
        public void onQueryResult() {
            BaseHmsClient.this.notifyFailed((BaseHmsClient) new ConnectionResult(26, HuaweiApiAvailability.getInstance().getErrPendingIntent(BaseHmsClient.this.mContext, this.errorCode, 0)));
        }
    }

    static {
        C0201.m83(BaseHmsClient.class, 425);
    }

    public BaseHmsClient(Context context, ClientSettings clientSettings, OnConnectionFailedListener onConnectionFailedListener, ConnectionCallbacks connectionCallbacks) {
        this.mContext = context;
        this.mClientSettings = clientSettings;
        this.mAppID = clientSettings.getAppID();
        this.mConnectionFailedListener = onConnectionFailedListener;
        this.mConnectionCallbacks = connectionCallbacks;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void bindCoreService() {
        String innerHmsPkg = this.mClientSettings.getInnerHmsPkg();
        HMSPackageManager.getInstance(this.mContext).refresh();
        if (C0201.m82(37337).equals(innerHmsPkg)) {
            innerHmsPkg = HMSPackageManager.getInstance(this.mContext).getHMSPackageName();
        }
        HMSLog.i(C0201.m82(37339), C0201.m82(37338) + innerHmsPkg);
        BinderAdapter binderAdapter = new BinderAdapter(this.mContext, getServiceAction(), innerHmsPkg);
        this.mBinderAdapter = binderAdapter;
        binderAdapter.binder(new BinderAdapter.BinderCallBack() {
            /* class com.huawei.hms.common.internal.BaseHmsClient.AnonymousClass1 */

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i) {
                onBinderFailed(i, null);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onNullBinding(ComponentName componentName) {
                BaseHmsClient.this.setConnectStatus(1);
                BaseHmsClient.this.notifyFailed((BaseHmsClient) 10);
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                String r2 = C0201.m82(5302);
                HMSLog.i(r2, C0201.m82(5303));
                BaseHmsClient.this.mService = d.a.a(iBinder);
                if (BaseHmsClient.this.mService == null) {
                    HMSLog.e(r2, C0201.m82(5304));
                    BaseHmsClient.this.mBinderAdapter.unBind();
                    BaseHmsClient.this.setConnectStatus(1);
                    BaseHmsClient.this.notifyFailed((BaseHmsClient) 10);
                    return;
                }
                BaseHmsClient.this.onConnecting();
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onServiceDisconnected(ComponentName componentName) {
                HMSLog.i(C0201.m82(5305), C0201.m82(5306));
                BaseHmsClient.this.setConnectStatus(1);
                if (BaseHmsClient.this.mConnectionCallbacks != null) {
                    BaseHmsClient.this.mConnectionCallbacks.onConnectionSuspended(1);
                }
            }

            @Override // com.huawei.hms.adapter.BinderAdapter.BinderCallBack
            public void onBinderFailed(int i, Intent intent) {
                String r1 = C0201.m82(5298);
                if (intent != null) {
                    Activity cpActivity = BaseHmsClient.this.mClientSettings.getCpActivity();
                    if (cpActivity != null) {
                        HMSLog.i(r1, C0201.m82(5299));
                        cpActivity.startActivity(intent);
                        return;
                    }
                    HMSLog.i(r1, C0201.m82(5300));
                    BaseHmsClient.this.notifyFailed((BaseHmsClient) new ConnectionResult(10, PendingIntent.getActivity(BaseHmsClient.this.mContext, 11, intent, 134217728)));
                    BaseHmsClient.this.mService = null;
                    return;
                }
                HMSLog.i(r1, C0201.m82(5301));
                BaseHmsClient.this.notifyFailed((BaseHmsClient) new ConnectionResult(10, (PendingIntent) null));
                BaseHmsClient.this.mService = null;
            }
        });
    }

    private void cancelConnDelayHandle() {
        synchronized (LOCK_CONNECT_TIMEOUT_HANDLER) {
            if (this.mConnectTimeoutHandler != null) {
                this.mConnectTimeoutHandler.removeMessages(2);
                this.mConnectTimeoutHandler = null;
            }
        }
    }

    private void checkAvailabilityAndConnect(int i, boolean z) {
        String r0 = C0201.m82(37340);
        HMSLog.i(r0, C0201.m82(37341));
        int i2 = this.mConnStatus.get();
        HMSLog.i(r0, C0201.m82(37342) + i2);
        if (z || !(i2 == 3 || i2 == 5 || i2 == 4)) {
            setConnectStatus(5);
            if (getMinApkVersion() > i) {
                i = getMinApkVersion();
            }
            HMSLog.i(r0, C0201.m82(37343) + i + C0201.m82(37344) + this.mClientSettings.getInnerHmsPkg());
            if (this.mContext.getPackageName().equals(this.mClientSettings.getInnerHmsPkg())) {
                HMSLog.i(r0, C0201.m82(37345));
                bindCoreService();
            } else if (Util.isAvailableLibExist(this.mContext)) {
                AvailableAdapter availableAdapter = new AvailableAdapter(i);
                int isHuaweiMobileServicesAvailable = availableAdapter.isHuaweiMobileServicesAvailable(this.mContext);
                HMSLog.i(r0, C0201.m82(37346) + isHuaweiMobileServicesAvailable);
                if (isHuaweiMobileServicesAvailable == 0) {
                    bindCoreService();
                } else if (availableAdapter.isUserResolvableError(isHuaweiMobileServicesAvailable)) {
                    HMSLog.i(r0, C0201.m82(37347));
                    resolution(availableAdapter, isHuaweiMobileServicesAvailable);
                } else {
                    HMSLog.i(r0, C0201.m82(37348) + isHuaweiMobileServicesAvailable + C0201.m82(37349));
                    notifyFailed(isHuaweiMobileServicesAvailable);
                }
            } else {
                int isHuaweiMobileServicesAvailable2 = HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(this.mContext, i);
                HMSLog.i(r0, C0201.m82(37350) + isHuaweiMobileServicesAvailable2);
                if (isHuaweiMobileServicesAvailable2 == 0) {
                    bindCoreService();
                } else {
                    notifyFailed(isHuaweiMobileServicesAvailable2);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void notifyFailed(int i) {
        HMSLog.i(C0201.m82(37352), C0201.m82(37351) + i);
        OnConnectionFailedListener onConnectionFailedListener = this.mConnectionFailedListener;
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(new ConnectionResult(i));
        }
    }

    private void onDisconnectionResult(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i(C0201.m82(37356), C0201.m82(37355) + resolveResult.getStatus().getStatusCode());
        this.mBinderAdapter.unBind();
        setConnectStatus(1);
    }

    private void resolution(AvailableAdapter availableAdapter, int i) {
        HMSLog.i(C0201.m82(37357), C0201.m82(37358));
        if (!getClientSettings().isHasActivity()) {
            PackageNameManager.getInstance(this.mContext).queryPackageName(new VoidOnConnectionFailed(i));
            return;
        }
        Activity activeActivity = Util.getActiveActivity(getClientSettings().getCpActivity(), getContext());
        if (activeActivity != null) {
            availableAdapter.startResolution(activeActivity, new AvailableAdapter.AvailableCallBack() {
                /* class com.huawei.hms.common.internal.BaseHmsClient.AnonymousClass2 */

                @Override // com.huawei.hms.adapter.AvailableAdapter.AvailableCallBack
                public void onComplete(int i) {
                    if (i == 0) {
                        BaseHmsClient.this.bindCoreService();
                    } else {
                        BaseHmsClient.this.notifyFailed((BaseHmsClient) i);
                    }
                }
            });
        } else {
            notifyFailed(26);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setConnectStatus(int i) {
        this.mConnStatus.set(i);
    }

    public final void checkConnected() {
        if (!isConnected()) {
            throw new IllegalStateException(C0201.m82(37359));
        }
    }

    public void connect(int i) {
        checkAvailabilityAndConnect(i, false);
    }

    public final void connectionConnected() {
        setConnectStatus(3);
        ConnectionCallbacks connectionCallbacks = this.mConnectionCallbacks;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnected();
        }
    }

    public void disconnect() {
        int i = this.mConnStatus.get();
        HMSLog.i(C0201.m82(37361), C0201.m82(37360) + i);
        if (i == 3) {
            BinderAdapter binderAdapter = this.mBinderAdapter;
            if (binderAdapter != null) {
                binderAdapter.unBind();
            }
            setConnectStatus(1);
        } else if (i == 5) {
            cancelConnDelayHandle();
            setConnectStatus(4);
        }
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        return this.mClientSettings.getApiName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.mAppID;
    }

    public ClientSettings getClientSettings() {
        return this.mClientSettings;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.mContext;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.mClientSettings.getCpID();
    }

    @Deprecated
    public int getMinApkVersion() {
        return 30000000;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.mClientSettings.getClientPackageName();
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public d getService() {
        return this.mService;
    }

    public String getServiceAction() {
        return C0201.m82(37362);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.sessionId;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public SubAppInfo getSubAppInfo() {
        return this.mClientSettings.getSubAppID();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        return this.mConnStatus.get() == 3 || this.mConnStatus.get() == 4;
    }

    public boolean isConnecting() {
        return this.mConnStatus.get() == 5;
    }

    public void onConnecting() {
        connectionConnected();
    }

    public void connect(int i, boolean z) {
        checkAvailabilityAndConnect(i, z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void notifyFailed(ConnectionResult connectionResult) {
        HMSLog.i(C0201.m82(37354), C0201.m82(37353) + connectionResult.getErrorCode());
        OnConnectionFailedListener onConnectionFailedListener = this.mConnectionFailedListener;
        if (onConnectionFailedListener != null) {
            onConnectionFailedListener.onConnectionFailed(connectionResult);
        }
    }
}
