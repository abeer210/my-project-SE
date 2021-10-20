package com.huawei.hms.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.common.api.ConnectionPostProcessor;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.core.aidl.ResponseHeader;
import com.huawei.hms.core.aidl.c;
import com.huawei.hms.core.aidl.d;
import com.huawei.hms.support.api.PendingResultImpl;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.core.ConnectService;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.update.manager.HMSPublishStateHolder;
import com.huawei.hms.update.manager.PackageNameManager;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import com.huawei.updatesdk.UpdateSdkAPI;
import com.huawei.updatesdk.service.appmgr.bean.ApkUpgradeInfo;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

public class HuaweiApiClientImpl extends HuaweiApiClient implements ServiceConnection, InnerApiClient {
    public static final String DEFAULT_ACCOUNT = null;
    public static final int SIGN_IN_MODE_OPTIONAL = 0;
    public static final int SIGN_IN_MODE_REQUIRED = 0;
    private static final Object a = new Object();
    private static final Object b = new Object();
    private Handler A;
    private CheckUpdatelistener B;
    private CheckUpdateCallBack C;
    private int c = -1;
    private final Context d;
    private final String e;
    private String f;
    private String g;
    private volatile com.huawei.hms.core.aidl.d h;
    private String i;
    private WeakReference<Activity> j;
    private WeakReference<Activity> k;
    private boolean l = false;
    private AtomicInteger m = new AtomicInteger(1);
    private List<Scope> n;
    private List<PermissionInfo> o;
    private Map<Api<?>, Api.ApiOptions> p;
    private SubAppInfo q;
    private long r = 0;
    private int s = 0;
    private final Object t = new Object();
    private final ReentrantLock u;
    private final Condition v;
    private ConnectionResult w;
    private HuaweiApiClient.ConnectionCallbacks x;
    private HuaweiApiClient.OnConnectionFailedListener y;
    private Handler z;

    static class a extends PendingResultImpl<Status, IMessageEntity> {
        public a(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
            super(apiClient, str, iMessageEntity);
        }

        /* renamed from: a */
        public Status onComplete(IMessageEntity iMessageEntity) {
            return new Status(0);
        }
    }

    /* access modifiers changed from: private */
    public class b implements ResultCallback<ResolveResult<ConnectResp>> {
        private b() {
        }

        /* renamed from: a */
        public void onResult(final ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.huawei.hms.api.HuaweiApiClientImpl.b.AnonymousClass1 */

                public void run() {
                    HuaweiApiClientImpl.this.b((HuaweiApiClientImpl) resolveResult);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public class c implements ResultCallback<ResolveResult<DisconnectResp>> {
        private c() {
        }

        /* renamed from: a */
        public void onResult(final ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                /* class com.huawei.hms.api.HuaweiApiClientImpl.c.AnonymousClass1 */

                public void run() {
                    HuaweiApiClientImpl.this.a((HuaweiApiClientImpl) resolveResult);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public class d implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        private d() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult != null && resolveResult.getStatus().isSuccess() && (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) != null && value.getStatusCode() == 0) {
                String r4 = C0201.m82(5433);
                HMSLog.i(r4, C0201.m82(5434));
                Activity validActivity = Util.getValidActivity((Activity) HuaweiApiClientImpl.this.j.get(), HuaweiApiClientImpl.this.getTopActivity());
                if (validActivity == null) {
                    HMSLog.e(r4, C0201.m82(5435));
                    return;
                }
                HuaweiApiClientImpl.this.l = true;
                validActivity.startActivity(noticeIntent);
            }
        }
    }

    /* access modifiers changed from: private */
    public class e implements PackageNameManager.QueryPublishCallback {
        private int b;

        public e(int i) {
            this.b = i;
        }

        @Override // com.huawei.hms.update.manager.PackageNameManager.QueryPublishCallback
        public void onQueryResult() {
            HuaweiApiClientImpl.this.b((HuaweiApiClientImpl) this.b);
        }
    }

    static {
        C0201.m83(HuaweiApiClientImpl.class, 426);
    }

    public HuaweiApiClientImpl(Context context) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.u = reentrantLock;
        this.v = reentrantLock.newCondition();
        this.z = null;
        this.A = null;
        this.B = null;
        this.d = context;
        String appId = Util.getAppId(context);
        this.e = appId;
        this.f = appId;
        this.g = Util.getCpId(context);
    }

    private int e() {
        Integer num;
        int intValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i2 = 0;
        if (apiMap == null) {
            return 0;
        }
        for (Api<?> api : apiMap.keySet()) {
            String apiName = api.getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (intValue = num.intValue()) > i2) {
                i2 = intValue;
            }
        }
        return i2;
    }

    private boolean f() {
        Map<Api<?>, Api.ApiOptions> map = this.p;
        if (map == null) {
            return false;
        }
        for (Api<?> api : map.keySet()) {
            if (C0201.m82(6005).equals(api.getApiName())) {
                return true;
            }
        }
        return false;
    }

    private void g() {
        Intent intent = new Intent(C0201.m82(6006));
        HMSPackageManager.getInstance(this.d).refresh();
        intent.setPackage(HMSPackageManager.getInstance(this.d).getHMSPackageName());
        synchronized (a) {
            if (this.d.bindService(intent, this, 1)) {
                h();
                return;
            }
            c(1);
            HMSLog.e(C0201.m82(6007), C0201.m82(6008));
            c();
        }
    }

    private void h() {
        Handler handler = this.z;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.z = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                /* class com.huawei.hms.api.HuaweiApiClientImpl.AnonymousClass2 */

                public boolean handleMessage(Message message) {
                    if (message == null || message.what != 2) {
                        return false;
                    }
                    HMSLog.e(C0201.m82(31377), C0201.m82(31378));
                    if (HuaweiApiClientImpl.this.m.get() == 5) {
                        HuaweiApiClientImpl.this.c((HuaweiApiClientImpl) 1);
                        HuaweiApiClientImpl.this.c();
                    }
                    return true;
                }
            });
        }
        this.z.sendEmptyMessageDelayed(2, 5000);
    }

    private void i() {
        synchronized (b) {
            if (this.A != null) {
                this.A.removeMessages(3);
            } else {
                this.A = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                    /* class com.huawei.hms.api.HuaweiApiClientImpl.AnonymousClass3 */

                    public boolean handleMessage(Message message) {
                        if (message == null || message.what != 3) {
                            return false;
                        }
                        HMSLog.e(C0201.m82(31439), C0201.m82(31440));
                        if (HuaweiApiClientImpl.this.m.get() == 2) {
                            HuaweiApiClientImpl.this.c((HuaweiApiClientImpl) 1);
                            HuaweiApiClientImpl.this.c();
                        }
                        return true;
                    }
                });
            }
            boolean sendEmptyMessageDelayed = this.A.sendEmptyMessageDelayed(3, 3000);
            String r2 = C0201.m82(6009);
            HMSLog.d(r2, C0201.m82(6010) + sendEmptyMessageDelayed);
        }
    }

    private void j() {
        ConnectService.disconnect(this, k()).setResultCallback(new c());
    }

    private DisconnectInfo k() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.p;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return new DisconnectInfo(this.n, arrayList);
    }

    private void l() {
        HMSLog.i(C0201.m82(6011), C0201.m82(6012));
        ConnectService.connect(this, m()).setResultCallback(new b());
    }

    private ConnectInfo m() {
        String packageSignature = new PackageManagerHelper(this.d).getPackageSignature(this.d.getPackageName());
        if (packageSignature == null) {
            packageSignature = C0201.m82(6013);
        }
        SubAppInfo subAppInfo = this.q;
        return new ConnectInfo(getApiNameList(), this.n, packageSignature, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    private void n() {
        Util.unBindServiceCatchException(this.d, this);
        this.h = null;
    }

    private void o() {
        if (this.l) {
            HMSLog.i(C0201.m82(6014), C0201.m82(6015));
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.d) == 0) {
            ConnectService.getNotice(this, 0, C0201.m82(6016)).setResultCallback(new d());
        }
    }

    public int asyncRequest(Bundle bundle, String str, int i2, final ResultCallback<BundleResult> resultCallback) {
        String r0 = C0201.m82(6017);
        HMSLog.i(r0, C0201.m82(6018));
        if (resultCallback == null || str == null || bundle == null) {
            HMSLog.e(r0, C0201.m82(6021));
            return 907135000;
        } else if (!innerIsConnected()) {
            HMSLog.e(r0, C0201.m82(6019));
            return 907135003;
        } else {
            com.huawei.hms.core.aidl.b bVar = new com.huawei.hms.core.aidl.b(str, i2);
            com.huawei.hms.core.aidl.e a2 = com.huawei.hms.core.aidl.a.a(bVar.c());
            bVar.a(bundle);
            RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), 50004301, getSessionId());
            requestHeader.setApiNameList(getApiNameList());
            bVar.b = a2.a(requestHeader, new Bundle());
            try {
                getService().a(bVar, new c.a() {
                    /* class com.huawei.hms.api.HuaweiApiClientImpl.AnonymousClass4 */

                    @Override // com.huawei.hms.core.aidl.c
                    public void call(com.huawei.hms.core.aidl.b bVar) {
                        String r0 = C0201.m82(31614);
                        if (bVar != null) {
                            com.huawei.hms.core.aidl.e a2 = com.huawei.hms.core.aidl.a.a(bVar.c());
                            ResponseHeader responseHeader = new ResponseHeader();
                            a2.a(bVar.b, responseHeader);
                            BundleResult bundleResult = new BundleResult(responseHeader.getStatusCode(), bVar.a());
                            HMSLog.i(r0, C0201.m82(31615));
                            resultCallback.onResult(bundleResult);
                            return;
                        }
                        HMSLog.i(r0, C0201.m82(31616));
                        resultCallback.onResult(new BundleResult(-1, null));
                    }
                });
                return 0;
            } catch (RemoteException e2) {
                HMSLog.e(r0, C0201.m82(6020) + e2.getMessage());
                return 907135001;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener) {
        boolean isAvailableLibExist = Util.isAvailableLibExist(this.d);
        String r1 = C0201.m82(6022);
        if (isAvailableLibExist) {
            HMSLog.i(r1, C0201.m82(6023));
            if (checkUpdatelistener == null) {
                HMSLog.e(r1, C0201.m82(6024));
            } else if (activity == null || activity.isFinishing()) {
                HMSLog.e(r1, C0201.m82(6025) + activity);
                checkUpdatelistener.onResult(-1);
            } else {
                this.B = checkUpdatelistener;
                if (this.C == null) {
                    a();
                }
                UpdateSdkAPI.checkClientOTAUpdate(activity, this.C, true, 0, true);
            }
        } else {
            HMSLog.e(r1, C0201.m82(6026));
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(Activity activity) {
        String r0 = C0201.m82(6027);
        HMSLog.i(r0, C0201.m82(6028));
        int i2 = this.m.get();
        HMSLog.i(r0, C0201.m82(6029) + i2);
        if (i2 != 3 && i2 != 5 && i2 != 2 && i2 != 4) {
            if (activity != null) {
                this.j = new WeakReference<>(activity);
                this.k = new WeakReference<>(activity);
            }
            this.f = TextUtils.isEmpty(this.e) ? Util.getAppId(this.d) : this.e;
            int d2 = d();
            HMSLog.i(r0, C0201.m82(6030) + d2);
            HuaweiApiAvailability.setServicesVersionCode(d2);
            int isHuaweiMobileServicesAvailable = HuaweiMobileServicesUtil.isHuaweiMobileServicesAvailable(this.d, d2);
            HMSLog.i(r0, C0201.m82(6031) + isHuaweiMobileServicesAvailable);
            this.s = HMSPackageManager.getInstance(this.d).getHmsVersionCode();
            if (isHuaweiMobileServicesAvailable == 0) {
                c(5);
                if (this.h == null) {
                    g();
                    return;
                }
                c(2);
                l();
                i();
            } else if (this.y != null) {
                a(isHuaweiMobileServicesAvailable);
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connectForeground() {
        String r0 = C0201.m82(6032);
        HMSLog.i(r0, C0201.m82(6033));
        int i2 = this.m.get();
        HMSLog.i(r0, C0201.m82(6034) + i2);
        if (i2 != 3 && i2 != 5 && i2 != 2 && i2 != 4) {
            this.f = TextUtils.isEmpty(this.e) ? Util.getAppId(this.d) : this.e;
            b();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disableLifeCycleManagement(Activity activity) {
        if (this.c >= 0) {
            AutoLifecycleFragment instance = AutoLifecycleFragment.getInstance(activity);
            if (instance != null) {
                instance.stopAutoManage(this.c);
                return;
            }
            return;
        }
        throw new IllegalStateException(C0201.m82(6035));
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public PendingResult<Status> discardAndReconnect() {
        return new a(this, null, null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void disconnect() {
        int i2 = this.m.get();
        HMSLog.i(C0201.m82(6037), C0201.m82(6036) + i2);
        if (i2 == 2) {
            c(4);
        } else if (i2 == 3) {
            c(4);
            j();
        } else if (i2 == 5) {
            d(2);
            c(4);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.p;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.p;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getAppID() {
        return this.f;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult getConnectionResult(Api<?> api) {
        if (isConnected()) {
            this.w = null;
            return new ConnectionResult(0, (PendingIntent) null);
        }
        ConnectionResult connectionResult = this.w;
        if (connectionResult != null) {
            return connectionResult;
        }
        return new ConnectionResult(13, (PendingIntent) null);
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public Context getContext() {
        return this.d;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getCpID() {
        return this.g;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getPackageName() {
        return this.d.getPackageName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<PermissionInfo> getPermissionInfos() {
        return this.o;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public List<Scope> getScopes() {
        return this.n;
    }

    @Override // com.huawei.hms.support.api.client.AidlApiClient
    public com.huawei.hms.core.aidl.d getService() {
        return this.h;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getSessionId() {
        return this.i;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final SubAppInfo getSubAppInfo() {
        return this.q;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public Activity getTopActivity() {
        WeakReference<Activity> weakReference = this.k;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public String getTransportName() {
        return IPCTransport.class.getName();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectedApi(Api<?> api) {
        return isConnected();
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, C0201.m82(6038));
        synchronized (this.t) {
            if (this.y == onConnectionFailedListener) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean hasConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, C0201.m82(6039));
        synchronized (this.t) {
            if (this.x == connectionCallbacks) {
                return true;
            }
            return false;
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect() {
        ConnectionResult connectionResult;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.u.lock();
            try {
                connect((Activity) null);
                while (isConnecting()) {
                    try {
                        this.v.await();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        connectionResult = new ConnectionResult(15, (PendingIntent) null);
                    }
                }
                if (isConnected()) {
                    this.w = null;
                    connectionResult = new ConnectionResult(0, (PendingIntent) null);
                } else if (this.w != null) {
                    ConnectionResult connectionResult2 = this.w;
                    this.u.unlock();
                    return connectionResult2;
                } else {
                    connectionResult = new ConnectionResult(13, (PendingIntent) null);
                }
                return connectionResult;
            } finally {
                this.u.unlock();
            }
        } else {
            throw new IllegalStateException(C0201.m82(6040));
        }
    }

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public boolean innerIsConnected() {
        return this.m.get() == 3 || this.m.get() == 4;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.s == 0) {
            this.s = HMSPackageManager.getInstance(this.d).getHmsVersionCode();
        }
        if (this.s >= 20504000) {
            return innerIsConnected();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.r;
        if (currentTimeMillis > 0 && currentTimeMillis < 300000) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = ConnectService.checkconnect(this, new CheckConnectInfo()).awaitOnAnyThread(2000, TimeUnit.MILLISECONDS).getStatus();
        if (status.isSuccess()) {
            this.r = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        HMSLog.e(C0201.m82(6043), C0201.m82(6042) + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        n();
        c(1);
        this.r = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean isConnecting() {
        int i2 = this.m.get();
        return i2 == 2 || i2 == 5;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onPause(Activity activity) {
        HMSLog.i(C0201.m82(6044), C0201.m82(6045));
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void onResume(Activity activity) {
        if (activity != null) {
            HMSLog.i(C0201.m82(6046), C0201.m82(6047));
            this.k = new WeakReference<>(activity);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        String r2 = C0201.m82(6048);
        HMSLog.i(r2, C0201.m82(6049));
        d(2);
        this.h = d.a.a(iBinder);
        if (this.h == null) {
            HMSLog.e(r2, C0201.m82(6050));
            n();
            c(1);
            if (this.y != null) {
                PendingIntent pendingIntent = null;
                WeakReference<Activity> weakReference = this.j;
                if (!(weakReference == null || weakReference.get() == null)) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.j.get(), 10);
                }
                ConnectionResult connectionResult = new ConnectionResult(10, pendingIntent);
                this.y.onConnectionFailed(connectionResult);
                this.w = connectionResult;
            }
        } else if (this.m.get() == 5) {
            c(2);
            l();
            i();
        } else if (this.m.get() != 3) {
            n();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i(C0201.m82(6051), C0201.m82(6052));
        this.h = null;
        c(1);
        HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.x;
        if (connectionCallbacks != null) {
            connectionCallbacks.onConnectionSuspended(1);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void reconnect() {
        disconnect();
        connect((Activity) null);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionFailureListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        Checker.checkNonNull(onConnectionFailedListener, C0201.m82(6053));
        synchronized (this.t) {
            if (this.y != onConnectionFailedListener) {
                HMSLog.w(C0201.m82(6054), C0201.m82(6055));
            } else {
                this.y = null;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void removeConnectionSuccessListener(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        Checker.checkNonNull(connectionCallbacks, C0201.m82(6056));
        synchronized (this.t) {
            if (this.x != connectionCallbacks) {
                HMSLog.w(C0201.m82(6057), C0201.m82(6058));
            } else {
                this.x = null;
            }
        }
    }

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.p = map;
    }

    public void setAutoLifecycleClientId(int i2) {
        this.c = i2;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.x = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.y = onConnectionFailedListener;
    }

    public void setHasShowNotice(boolean z2) {
        this.l = z2;
    }

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.o = list;
    }

    public void setScopes(List<Scope> list) {
        this.n = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public boolean setSubAppInfo(SubAppInfo subAppInfo) {
        String r0 = C0201.m82(6059);
        HMSLog.i(r0, C0201.m82(6060));
        if (subAppInfo == null) {
            HMSLog.e(r0, C0201.m82(6061));
            return false;
        }
        String subAppID = subAppInfo.getSubAppID();
        if (TextUtils.isEmpty(subAppID)) {
            HMSLog.e(r0, C0201.m82(6062));
            return false;
        }
        if (subAppID.equals(TextUtils.isEmpty(this.e) ? Util.getAppId(this.d) : this.e)) {
            HMSLog.e(r0, C0201.m82(6063));
            return false;
        }
        this.q = new SubAppInfo(subAppInfo);
        return true;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c() {
        n();
        if (this.y != null) {
            int i2 = Util.isBackground(this.d) ? 7 : 6;
            PendingIntent pendingIntent = null;
            WeakReference<Activity> weakReference = this.j;
            if (!(weakReference == null || weakReference.get() == null)) {
                pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.j.get(), i2);
            }
            ConnectionResult connectionResult = new ConnectionResult(i2, pendingIntent);
            this.y.onConnectionFailed(connectionResult);
            this.w = connectionResult;
        }
    }

    private int d() {
        int hmsVersion = Util.getHmsVersion(this.d);
        if (hmsVersion != 0 && hmsVersion >= 20503000) {
            return hmsVersion;
        }
        int e2 = e();
        if (f()) {
            if (e2 < 20503000) {
                return 20503000;
            }
            return e2;
        } else if (e2 < 20600000) {
            return 20600000;
        } else {
            return e2;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(int i2) {
        PendingIntent pendingIntent;
        WeakReference<Activity> weakReference = this.j;
        if (weakReference == null || weakReference.get() == null) {
            pendingIntent = null;
        } else {
            pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.j.get(), i2);
            HMSLog.i(C0201.m82(5998), C0201.m82(5997) + i2);
        }
        ConnectionResult connectionResult = new ConnectionResult(i2, pendingIntent);
        this.y.onConnectionFailed(connectionResult);
        this.w = connectionResult;
    }

    private void d(int i2) {
        if (i2 == 2) {
            synchronized (a) {
                if (this.z != null) {
                    this.z.removeMessages(i2);
                    this.z = null;
                }
            }
        }
        if (i2 == 3) {
            synchronized (b) {
                if (this.A != null) {
                    this.A.removeMessages(i2);
                    this.A = null;
                }
            }
        }
        synchronized (a) {
            if (this.z != null) {
                this.z.removeMessages(2);
                this.z = null;
            }
        }
    }

    private void a() {
        this.C = new CheckUpdateCallBack() {
            /* class com.huawei.hms.api.HuaweiApiClientImpl.AnonymousClass1 */

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketInstallInfo(Intent intent) {
                if (intent != null) {
                    int intExtra = intent.getIntExtra(C0201.m82(31303), -99);
                    int intExtra2 = intent.getIntExtra(C0201.m82(31304), -99);
                    int intExtra3 = intent.getIntExtra(C0201.m82(31305), -99);
                    HMSLog.i(C0201.m82(31309), C0201.m82(31306) + intExtra2 + C0201.m82(31307) + intExtra3 + C0201.m82(31308) + intExtra);
                }
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onMarketStoreError(int i) {
                HMSLog.e(C0201.m82(31311), C0201.m82(31310) + i);
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateInfo(Intent intent) {
                String r0 = C0201.m82(31312);
                if (intent != null && HuaweiApiClientImpl.this.B != null) {
                    try {
                        int intExtra = intent.getIntExtra(C0201.m82(31313), -99);
                        int intExtra2 = intent.getIntExtra(C0201.m82(31314), -99);
                        boolean booleanExtra = intent.getBooleanExtra(C0201.m82(31315), false);
                        HMSLog.i(r0, C0201.m82(31316) + intExtra + C0201.m82(31317) + intExtra2 + C0201.m82(31318) + booleanExtra);
                        if (intExtra == 7) {
                            ApkUpgradeInfo apkUpgradeInfo = (ApkUpgradeInfo) intent.getSerializableExtra(C0201.m82(31319));
                            if (apkUpgradeInfo != null) {
                                HMSLog.i(r0, C0201.m82(31320) + apkUpgradeInfo.toString());
                            }
                            HuaweiApiClientImpl.this.B.onResult(1);
                        } else if (intExtra == 3) {
                            HuaweiApiClientImpl.this.B.onResult(0);
                        } else {
                            HuaweiApiClientImpl.this.B.onResult(-1);
                        }
                        HuaweiApiClientImpl.this.B = null;
                    } catch (Exception e) {
                        HMSLog.e(r0, C0201.m82(31321) + e.getMessage());
                        HuaweiApiClientImpl.this.B.onResult(-1);
                    }
                }
            }

            @Override // com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack
            public void onUpdateStoreError(int i) {
                HMSLog.e(C0201.m82(31323), C0201.m82(31322) + i);
            }
        };
    }

    private void a(int i2) {
        if (!Util.isAvailableLibExist(this.d)) {
            b(i2);
        } else if (i2 == 1 && HMSPublishStateHolder.getPublishState() == 0) {
            WeakReference weakReference = new WeakReference(this.d);
            PackageNameManager.getInstance((Context) weakReference.get()).queryPackageName(new e(i2));
        } else {
            b(i2);
        }
    }

    private void b() {
        HMSLog.i(C0201.m82(5995), C0201.m82(5996));
        ConnectService.forceConnect(this, m()).setResultCallback(new b());
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void c(int i2) {
        this.m.set(i2);
        if (i2 == 1 || i2 == 3 || i2 == 2) {
            this.u.lock();
            try {
                this.v.signalAll();
            } finally {
                this.u.unlock();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void b(ResolveResult<ConnectResp> resolveResult) {
        String r0 = C0201.m82(5999);
        HMSLog.i(r0, C0201.m82(6000));
        if (this.h == null || this.m.get() != 2) {
            HMSLog.e(r0, C0201.m82(6004));
            return;
        }
        d(3);
        ConnectResp value = resolveResult.getValue();
        if (value != null) {
            this.i = value.sessionId;
        }
        SubAppInfo subAppInfo = this.q;
        PendingIntent pendingIntent = null;
        String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
        if (!TextUtils.isEmpty(subAppID)) {
            this.f = subAppID;
        }
        int statusCode = resolveResult.getStatus().getStatusCode();
        HMSLog.i(r0, C0201.m82(6001) + statusCode);
        if (Status.SUCCESS.equals(resolveResult.getStatus())) {
            if (resolveResult.getValue() != null) {
                ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
            }
            c(3);
            this.w = null;
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.x;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            if (this.j != null) {
                o();
            }
            for (Map.Entry<Api<?>, Api.ApiOptions> entry : getApiMap().entrySet()) {
                if (entry.getKey().getmConnetctPostList() != null && !entry.getKey().getmConnetctPostList().isEmpty()) {
                    HMSLog.i(r0, C0201.m82(6002));
                    for (ConnectionPostProcessor connectionPostProcessor : entry.getKey().getmConnetctPostList()) {
                        HMSLog.i(r0, C0201.m82(6003));
                        connectionPostProcessor.run(this, this.j);
                    }
                }
            }
        } else if (resolveResult.getStatus() == null || resolveResult.getStatus().getStatusCode() != 1001) {
            n();
            c(1);
            if (this.y != null) {
                WeakReference<Activity> weakReference = this.j;
                if (!(weakReference == null || weakReference.get() == null)) {
                    pendingIntent = HuaweiApiAvailability.getInstance().getResolveErrorPendingIntent(this.j.get(), statusCode);
                }
                ConnectionResult connectionResult = new ConnectionResult(statusCode, pendingIntent);
                this.y.onConnectionFailed(connectionResult);
                this.w = connectionResult;
            }
        } else {
            n();
            c(1);
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks2 = this.x;
            if (connectionCallbacks2 != null) {
                connectionCallbacks2.onConnectionSuspended(3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(ResolveResult<DisconnectResp> resolveResult) {
        HMSLog.i(C0201.m82(5994), C0201.m82(5993) + resolveResult.getStatus().getStatusCode());
        n();
        c(1);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public ConnectionResult holdUpConnect(long j2, TimeUnit timeUnit) {
        ConnectionResult connectionResult;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.u.lock();
            try {
                connect((Activity) null);
                long nanos = timeUnit.toNanos(j2);
                while (true) {
                    if (isConnecting()) {
                        if (nanos <= 0) {
                            disconnect();
                            connectionResult = new ConnectionResult(14, (PendingIntent) null);
                            break;
                        }
                        try {
                            nanos = this.v.awaitNanos(nanos);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            connectionResult = new ConnectionResult(15, (PendingIntent) null);
                        }
                    } else if (isConnected()) {
                        this.w = null;
                        connectionResult = new ConnectionResult(0, (PendingIntent) null);
                    } else if (this.w != null) {
                        connectionResult = this.w;
                    } else {
                        connectionResult = new ConnectionResult(13, (PendingIntent) null);
                    }
                }
                return connectionResult;
            } finally {
                this.u.unlock();
            }
        } else {
            throw new IllegalStateException(C0201.m82(6041));
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void connect(int i2) {
        connect((Activity) null);
    }
}
