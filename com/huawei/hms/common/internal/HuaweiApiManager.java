package com.huawei.hms.common.internal;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hmf.tasks.TaskCompletionSource;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AnyClient;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.hianalytics.HiAnalyticsInnerClient;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.Util;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import vigqyno.C0201;

public class HuaweiApiManager implements Handler.Callback {
    private static final String HANDLER_NAME = null;
    private static final Object LOCK_OBJECT = new Object();
    private static final int MSG_RECEIVE_SEND_REQ = 0;
    private static final String TAG = null;
    private static HuaweiApiManager mInstance;
    private final Map<ConnectionManagerKey<?>, ConnectionManager<?>> mConnectionCache = new ConcurrentHashMap(5, 0.75f, 1);
    private final Handler mHandler;
    private final AtomicInteger mSerial = new AtomicInteger(0);

    public class ConnectionManager<OptionsT extends Api.ApiOptions> implements BaseHmsClient.ConnectionCallbacks, BaseHmsClient.OnConnectionFailedListener {
        private final Queue<TaskApiCallbackWrapper> callbackQueue = new LinkedList();
        private final HuaweiApi<OptionsT> mApi;
        private final AnyClient mClient;
        private final ConnectionManagerKey mConnectionManagerKey;
        private ConnectionResult mConnectionResult;
        private ResolveClientBean mResolveClientBean;

        public ConnectionManager(HuaweiApi<OptionsT> huaweiApi) {
            this.mApi = huaweiApi;
            this.mClient = huaweiApi.getClient(HuaweiApiManager.this.mHandler.getLooper(), this);
            this.mConnectionResult = null;
            this.mConnectionManagerKey = huaweiApi.getConnectionManagerKey();
        }

        private String errorReason(ConnectionResult connectionResult) {
            boolean isAvailableLibExist = Util.isAvailableLibExist(this.mApi.getContext());
            String r1 = C0201.m82(37554);
            String r2 = C0201.m82(37555);
            String r3 = C0201.m82(37556);
            String r4 = C0201.m82(37557);
            if (isAvailableLibExist) {
                int errorCode = connectionResult.getErrorCode();
                if (errorCode != -1) {
                    if (errorCode == 3) {
                        return C0201.m82(37563);
                    }
                    if (errorCode != 8) {
                        if (errorCode != 10) {
                            if (errorCode == 13) {
                                return C0201.m82(37562);
                            }
                            if (errorCode == 21) {
                                return C0201.m82(37561);
                            }
                            switch (errorCode) {
                                case 25:
                                    return C0201.m82(37560);
                                case 26:
                                    return C0201.m82(37559);
                                case 27:
                                    return C0201.m82(37558);
                                default:
                                    return r1;
                            }
                        }
                    }
                    return r3;
                }
                return r4;
            }
            int errorCode2 = connectionResult.getErrorCode();
            if (errorCode2 != -1) {
                if (errorCode2 != 8) {
                    if (errorCode2 != 10) {
                        return r1;
                    }
                }
                return r3;
            }
            return r4;
            return r2;
        }

        private String getTransactionId(String str, String str2) {
            return TextUtils.isEmpty(str) ? TransactionIdCreater.getId(this.mApi.getAppID(), str2) : str;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void innerConnected() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = null;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                postMessage(taskApiCallbackWrapper);
            }
            this.callbackQueue.clear();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void innerConnectionFailed(ConnectionResult connectionResult) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mConnectionResult = connectionResult;
            boolean z = true;
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, 907135003, C0201.m82(37564) + errorReason(connectionResult) + C0201.m82(37565) + connectionResult.getErrorCode() + C0201.m82(37566));
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                HiAnalyticsInnerClient.reportEntryExit(this.mApi.getContext(), responseHeader, String.valueOf(this.mApi.getKitSdkVersion()));
                if (this.mConnectionResult.getResolution() != null && z) {
                    responseHeader.setParcelable(this.mConnectionResult.getResolution());
                    z = false;
                    if (Util.isAvailableLibExist(this.mApi.getContext()) && this.mConnectionResult.getErrorCode() == 26) {
                        responseHeader.setResolution(C0201.m82(37567));
                    }
                }
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void innerConnectionSuspended(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            for (TaskApiCallbackWrapper taskApiCallbackWrapper : this.callbackQueue) {
                TaskApiCallWrapper apiCallWrapper = taskApiCallbackWrapper.getApiCallWrapper();
                ResponseHeader responseHeader = new ResponseHeader(1, 907135003, C0201.m82(37568));
                responseHeader.setTransactionId(apiCallWrapper.getTaskApiCall().getTransactionId());
                apiCallWrapper.getTaskApiCall().onResponse(this.mClient, responseHeader, null, apiCallWrapper.getTaskCompletionSource());
            }
            this.callbackQueue.clear();
            this.mConnectionResult = null;
            this.mClient.disconnect();
            HuaweiApiManager.this.mConnectionCache.remove(this.mConnectionManagerKey);
        }

        private void postMessage(TaskApiCallbackWrapper taskApiCallbackWrapper) {
            String uri = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall().getUri();
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setSrvName(uri.split(C0201.m82(37569))[0]);
            requestHeader.setApiName(uri);
            requestHeader.setAppID(this.mApi.getAppID() + C0201.m82(37570) + this.mApi.getSubAppID());
            requestHeader.setPkgName(this.mApi.getContext().getPackageName());
            requestHeader.setSessionId(this.mClient.getSessionId());
            TaskApiCall taskApiCall = taskApiCallbackWrapper.getApiCallWrapper().getTaskApiCall();
            requestHeader.setTransactionId(getTransactionId(taskApiCall.getTransactionId(), uri));
            requestHeader.setParcelable(taskApiCall.getParcelable());
            requestHeader.setKitSdkVersion(this.mApi.getKitSdkVersion());
            requestHeader.setApiLevel(Math.max(this.mApi.getApiLevel(), taskApiCall.getApiLevel()));
            this.mClient.post(requestHeader, taskApiCall.getRequestJson(), taskApiCallbackWrapper.getCallBack());
        }

        private TaskApiCallbackWrapper wrapperRequest(final TaskApiCallWrapper taskApiCallWrapper) {
            return new TaskApiCallbackWrapper(taskApiCallWrapper, new AnyClient.CallBack() {
                /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.AnonymousClass1 */
                private AtomicBoolean isFirstRsp = new AtomicBoolean(true);

                @Override // com.huawei.hms.common.internal.AnyClient.CallBack
                public void onCallback(IMessageEntity iMessageEntity, String str) {
                    boolean z = iMessageEntity instanceof ResponseHeader;
                    String r1 = C0201.m82(2489);
                    if (!z) {
                        HMSLog.e(r1, C0201.m82(2490));
                        return;
                    }
                    ResponseHeader responseHeader = (ResponseHeader) iMessageEntity;
                    if (!TextUtils.isEmpty(responseHeader.getResolution())) {
                        HMSLog.e(r1, C0201.m82(2491) + responseHeader.getResolution());
                    }
                    if (this.isFirstRsp.compareAndSet(true, false)) {
                        HiAnalyticsInnerClient.reportEntryExit(ConnectionManager.this.mApi.getContext(), responseHeader, String.valueOf(ConnectionManager.this.mApi.getKitSdkVersion()));
                    }
                    taskApiCallWrapper.getTaskApiCall().onResponse(ConnectionManager.this.mClient, responseHeader, str, taskApiCallWrapper.getTaskCompletionSource());
                }
            });
        }

        public synchronized void connect(int i) {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            if (this.mClient.isConnected()) {
                HMSLog.d(C0201.m82(37571), C0201.m82(37572));
            } else if (this.mClient.isConnecting()) {
                HMSLog.d(C0201.m82(37573), C0201.m82(37574));
            } else {
                if (this.mApi.getActivity() != null) {
                    if (this.mResolveClientBean == null) {
                        this.mResolveClientBean = new ResolveClientBean(this.mClient, i);
                    }
                    if (BindResolveClients.getInstance().isClientRegistered(this.mResolveClientBean)) {
                        HMSLog.i(C0201.m82(37575), C0201.m82(37576));
                        return;
                    }
                    BindResolveClients.getInstance().register(this.mResolveClientBean);
                }
                this.mClient.connect(i);
            }
        }

        public boolean disconnect() {
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            this.mClient.disconnect();
            return true;
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnected() {
            HMSLog.d(C0201.m82(37577), C0201.m82(37578));
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnected();
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.AnonymousClass3 */

                    public void run() {
                        ConnectionManager.this.innerConnected();
                    }
                });
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.OnConnectionFailedListener
        public void onConnectionFailed(final ConnectionResult connectionResult) {
            HMSLog.i(C0201.m82(37579), C0201.m82(37580));
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionFailed(connectionResult);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.AnonymousClass2 */

                    public void run() {
                        ConnectionManager.this.innerConnectionFailed(connectionResult);
                    }
                });
            }
        }

        @Override // com.huawei.hms.common.internal.BaseHmsClient.ConnectionCallbacks
        public void onConnectionSuspended(final int i) {
            HMSLog.i(C0201.m82(37581), C0201.m82(37582));
            BindResolveClients.getInstance().unRegister(this.mResolveClientBean);
            this.mResolveClientBean = null;
            if (Looper.myLooper() == HuaweiApiManager.this.mHandler.getLooper()) {
                innerConnectionSuspended(i);
            } else {
                HuaweiApiManager.this.mHandler.post(new Runnable() {
                    /* class com.huawei.hms.common.internal.HuaweiApiManager.ConnectionManager.AnonymousClass4 */

                    public void run() {
                        ConnectionManager.this.innerConnectionSuspended(i);
                    }
                });
            }
        }

        public void sendRequest(TaskApiCallWrapper taskApiCallWrapper) {
            HMSLog.i(C0201.m82(37583), C0201.m82(37584));
            Checker.assertHandlerThread(HuaweiApiManager.this.mHandler);
            TaskApiCallbackWrapper wrapperRequest = wrapperRequest(taskApiCallWrapper);
            int minApkVersion = taskApiCallWrapper.getTaskApiCall().getMinApkVersion();
            if (!this.mClient.isConnected()) {
                this.callbackQueue.add(wrapperRequest);
                ConnectionResult connectionResult = this.mConnectionResult;
                if (connectionResult == null || connectionResult.getErrorCode() == 0) {
                    connect(minApkVersion);
                } else {
                    onConnectionFailed(this.mConnectionResult);
                }
            } else if (HMSPackageManager.getInstance(this.mApi.getContext()).hmsVerHigherThan(minApkVersion)) {
                postMessage(wrapperRequest);
            } else {
                disconnect();
                this.callbackQueue.add(wrapperRequest);
                connect(minApkVersion);
            }
        }
    }

    /* access modifiers changed from: private */
    public static class TaskApiCallbackWrapper {
        private final TaskApiCallWrapper mApiCallWrapper;
        private final AnyClient.CallBack mCallBack;

        public TaskApiCallbackWrapper(TaskApiCallWrapper taskApiCallWrapper, AnyClient.CallBack callBack) {
            this.mApiCallWrapper = taskApiCallWrapper;
            this.mCallBack = callBack;
        }

        public TaskApiCallWrapper getApiCallWrapper() {
            return this.mApiCallWrapper;
        }

        public AnyClient.CallBack getCallBack() {
            return this.mCallBack;
        }
    }

    static {
        C0201.m83(HuaweiApiManager.class, 604);
    }

    private HuaweiApiManager(Context context, Looper looper, HuaweiApiAvailability huaweiApiAvailability) {
        this.mHandler = new Handler(looper, this);
    }

    private void connectAndSendRequest(HandlerMessageWrapper handlerMessageWrapper) {
        HuaweiApi<?> huaweiApi = handlerMessageWrapper.mApi;
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            connectionManager = new ConnectionManager<>(huaweiApi);
            this.mConnectionCache.put(huaweiApi.getConnectionManagerKey(), connectionManager);
        }
        connectionManager.sendRequest((TaskApiCallWrapper) handlerMessageWrapper.mContentWrapper);
    }

    public static HuaweiApiManager getInstance(Context context) {
        synchronized (LOCK_OBJECT) {
            if (mInstance == null) {
                HandlerThread handlerThread = new HandlerThread(C0201.m82(35635));
                handlerThread.start();
                mInstance = new HuaweiApiManager(context.getApplicationContext(), handlerThread.getLooper(), HuaweiApiAvailability.getInstance());
            }
        }
        return mInstance;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void innerDisconnect(HuaweiApi<?> huaweiApi, TaskCompletionSource<Boolean> taskCompletionSource) {
        ConnectionManager<?> connectionManager = this.mConnectionCache.get(huaweiApi.getConnectionManagerKey());
        if (connectionManager == null) {
            taskCompletionSource.setResult(Boolean.FALSE);
        } else {
            taskCompletionSource.setResult(Boolean.valueOf(connectionManager.disconnect()));
        }
    }

    public void disconnectService(final HuaweiApi<?> huaweiApi, final TaskCompletionSource<Boolean> taskCompletionSource) {
        if (Looper.myLooper() == this.mHandler.getLooper()) {
            innerDisconnect(huaweiApi, taskCompletionSource);
        } else {
            this.mHandler.post(new Runnable() {
                /* class com.huawei.hms.common.internal.HuaweiApiManager.AnonymousClass1 */

                public void run() {
                    HuaweiApiManager.this.innerDisconnect(huaweiApi, taskCompletionSource);
                }
            });
        }
    }

    public boolean handleMessage(Message message) {
        if (message.what != 4) {
            HMSLog.w(C0201.m82(35637), C0201.m82(35636) + message.what);
            return false;
        }
        connectAndSendRequest((HandlerMessageWrapper) message.obj);
        return true;
    }

    public final <TOption extends Api.ApiOptions, TResult> void sendRequest(HuaweiApi<TOption> huaweiApi, TaskApiCall<? extends AnyClient, TResult> taskApiCall, TaskCompletionSource<TResult> taskCompletionSource) {
        TaskApiCallWrapper taskApiCallWrapper = new TaskApiCallWrapper(taskApiCall, taskCompletionSource);
        Handler handler = this.mHandler;
        handler.sendMessage(handler.obtainMessage(4, new HandlerMessageWrapper(taskApiCallWrapper, this.mSerial.getAndIncrement(), huaweiApi)));
    }
}
