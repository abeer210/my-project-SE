package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.internal.AutoLifecycleFragment;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.support.api.client.AidlApiClient;
import com.huawei.hms.support.api.client.PendingResult;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSBIInitializer;
import com.huawei.hms.utils.ResourceLoaderUtil;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import vigqyno.C0201;

public abstract class HuaweiApiClient implements AidlApiClient {

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 0;
        public static final int CAUSE_NETWORK_LOST = 0;
        public static final int CAUSE_SERVICE_DISCONNECTED = 0;

        static {
            C0201.m83(ConnectionCallbacks.class, 256);
        }

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener);

    public void connect(int i) {
        throw new UnsupportedOperationException();
    }

    public abstract void connect(Activity activity);

    public abstract void connectForeground();

    public abstract void disableLifeCycleManagement(Activity activity);

    public abstract PendingResult<Status> discardAndReconnect();

    public abstract void disconnect();

    public abstract Map<Api<?>, Api.ApiOptions> getApiMap();

    public abstract ConnectionResult getConnectionResult(Api<?> api);

    public abstract List<PermissionInfo> getPermissionInfos();

    public abstract List<Scope> getScopes();

    public abstract Activity getTopActivity();

    public abstract boolean hasConnectedApi(Api<?> api);

    public abstract boolean hasConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean hasConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract ConnectionResult holdUpConnect();

    public abstract ConnectionResult holdUpConnect(long j, TimeUnit timeUnit);

    @Override // com.huawei.hms.support.api.client.ApiClient
    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void print(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void reconnect();

    public abstract void removeConnectionFailureListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract void removeConnectionSuccessListener(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean setSubAppInfo(SubAppInfo subAppInfo);

    public static final class Builder {
        private final Context a;
        private final List<Scope> b = new ArrayList();
        private final List<PermissionInfo> c = new ArrayList();
        private final Map<Api<?>, Api.ApiOptions> d = new HashMap();
        private OnConnectionFailedListener e;
        private ConnectionCallbacks f;
        private int g;
        private Activity h;

        public Builder(Context context) throws NullPointerException {
            Checker.checkNonNull(context, C0201.m82(3157));
            Context applicationContext = context.getApplicationContext();
            this.a = applicationContext;
            this.g = -1;
            ResourceLoaderUtil.setmContext(applicationContext);
            a(context);
        }

        private void a(Context context) {
            HMSBIInitializer.getInstance(context).initBI();
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.d.put(api, null);
            if (C0201.m82(3160).equals(api.getApiName())) {
                HiAnalyticsUtil instance = HiAnalyticsUtil.getInstance();
                Context applicationContext = this.a.getApplicationContext();
                instance.onEvent(applicationContext, C0201.m82(3162), C0201.m82(3161) + System.currentTimeMillis());
            }
            return this;
        }

        public Builder addApiWithScope(Api<? extends Api.ApiOptions.NotRequiredOptions> api, Scope... scopeArr) {
            Checker.checkNonNull(api, C0201.m82(3168));
            Checker.checkNonNull(scopeArr, C0201.m82(3169));
            this.d.put(api, null);
            this.b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            Checker.checkNonNull(connectionCallbacks, C0201.m82(3170));
            this.f = connectionCallbacks;
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            Checker.checkNonNull(onConnectionFailedListener, C0201.m82(3171));
            this.e = onConnectionFailedListener;
            return this;
        }

        public Builder addScope(Scope scope) {
            Checker.checkNonNull(scope, C0201.m82(3172));
            this.b.add(scope);
            return this;
        }

        public Builder allowLifeCycleManagement(Activity activity, int i, OnConnectionFailedListener onConnectionFailedListener) {
            if (i >= 0) {
                this.g = i;
                this.h = (Activity) Preconditions.checkNotNull(activity, C0201.m82(3173));
                return this;
            }
            throw new IllegalArgumentException(C0201.m82(3174));
        }

        public Builder applyDefaultAccount() {
            return this;
        }

        public HuaweiApiClient build() {
            addApi(new Api<>(C0201.m82(3175)));
            HuaweiApiClientImpl huaweiApiClientImpl = new HuaweiApiClientImpl(this.a);
            huaweiApiClientImpl.setScopes(this.b);
            huaweiApiClientImpl.setPermissionInfos(this.c);
            huaweiApiClientImpl.setApiMap(this.d);
            huaweiApiClientImpl.setConnectionCallbacks(this.f);
            huaweiApiClientImpl.setConnectionFailedListener(this.e);
            huaweiApiClientImpl.setAutoLifecycleClientId(this.g);
            if (this.g >= 0) {
                a(huaweiApiClientImpl);
            }
            return huaweiApiClientImpl;
        }

        public Builder setAccountName(String str) {
            return this;
        }

        public Builder setHandler(Handler handler) {
            return this;
        }

        public Builder setPopupsGravity(int i) {
            return this;
        }

        public Builder setViewForPopups(View view) {
            return this;
        }

        private void a(HuaweiApiClient huaweiApiClient) {
            AutoLifecycleFragment instance = AutoLifecycleFragment.getInstance(this.h);
            if (instance == null) {
                HMSLog.e(C0201.m82(3158), C0201.m82(3159));
            } else {
                instance.startAutoMange(this.g, huaweiApiClient);
            }
        }

        public Builder allowLifeCycleManagement(Activity activity, OnConnectionFailedListener onConnectionFailedListener) {
            return allowLifeCycleManagement(activity, 0, onConnectionFailedListener);
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApiWithScope(Api<O> api, O o, Scope... scopeArr) {
            Checker.checkNonNull(api, C0201.m82(3165));
            Checker.checkNonNull(o, C0201.m82(3166));
            Checker.checkNonNull(scopeArr, C0201.m82(3167));
            this.d.put(api, o);
            if (api.getOptions() != null) {
                this.b.addAll(api.getOptions().getScopeList(o));
                this.c.addAll(api.getOptions().getPermissionInfoList(o));
            }
            this.b.addAll(new ArrayList(Arrays.asList(scopeArr)));
            return this;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            Checker.checkNonNull(api, C0201.m82(3163));
            Checker.checkNonNull(o, C0201.m82(3164));
            this.d.put(api, o);
            if (api.getOptions() != null) {
                this.b.addAll(api.getOptions().getScopeList(o));
                this.c.addAll(api.getOptions().getPermissionInfoList(o));
            }
            return this;
        }
    }
}
