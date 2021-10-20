package com.huawei.hms.support.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import com.huawei.hms.adapter.BaseAdapter;
import com.huawei.hms.common.internal.TransactionIdCreater;
import com.huawei.hms.core.aidl.AbstractMessageEntity;
import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.InnerPendingResult;
import com.huawei.hms.support.api.client.Result;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.transport.DatagramTransport;
import com.huawei.hms.support.gentyref.GenericTypeReflector;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtil;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import vigqyno.C0201;

public abstract class PendingResultImpl<R extends Result, T extends IMessageEntity> extends InnerPendingResult<R> {
    private static final String TAG = null;
    private WeakReference<ApiClient> api;
    private CountDownLatch countLatch;
    private boolean isNeedReport = true;
    private R result = null;
    private String transId = null;
    public DatagramTransport transport = null;
    private String url = null;

    /* access modifiers changed from: protected */
    public static class CallbackHandler<R extends Result> extends Handler {
        public CallbackHandler() {
            this(Looper.getMainLooper());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.huawei.hms.support.api.PendingResultImpl$CallbackHandler<R extends com.huawei.hms.support.api.client.Result> */
        /* JADX WARN: Multi-variable type inference failed */
        public void handleMessage(Message message) {
            if (message.what == 1) {
                Pair pair = (Pair) message.obj;
                send((ResultCallback) pair.first, (Result) pair.second);
            }
        }

        public void post(ResultCallback<? super R> resultCallback, R r) {
            sendMessage(obtainMessage(1, new Pair(resultCallback, r)));
        }

        public void send(ResultCallback<? super R> resultCallback, R r) {
            resultCallback.onResult(r);
        }

        public CallbackHandler(Looper looper) {
            super(looper);
        }
    }

    static {
        C0201.m83(PendingResultImpl.class, 652);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity) {
        init(apiClient, str, iMessageEntity, getResponseType(), 0);
    }

    private void biReportEvent(int i, int i2) {
        SubAppInfo subAppInfo;
        HMSLog.i(C0201.m82(12785), C0201.m82(12786));
        ApiClient apiClient = this.api.get();
        if (apiClient != null && this.url != null && !HiAnalyticsUtil.getInstance().hasError(apiClient.getContext())) {
            HashMap hashMap = new HashMap();
            hashMap.put(C0201.m82(12787), apiClient.getPackageName());
            hashMap.put(C0201.m82(12788), C0201.m82(12789));
            String r2 = C0201.m82(12790);
            if (i2 == 1) {
                hashMap.put(r2, C0201.m82(12791));
            } else {
                hashMap.put(r2, C0201.m82(12792));
                hashMap.put(C0201.m82(12793), String.valueOf(i));
                R r = this.result;
                if (!(r == null || r.getStatus() == null)) {
                    hashMap.put(C0201.m82(12794), String.valueOf(this.result.getStatus().getStatusCode()));
                }
            }
            hashMap.put(C0201.m82(12795), C0201.m82(12796));
            String appId = Util.getAppId(apiClient.getContext());
            if (TextUtils.isEmpty(appId) && (subAppInfo = apiClient.getSubAppInfo()) != null) {
                appId = subAppInfo.getSubAppID();
            }
            hashMap.put(C0201.m82(12797), appId);
            boolean isEmpty = TextUtils.isEmpty(this.transId);
            String r22 = C0201.m82(12798);
            if (isEmpty) {
                String id = TransactionIdCreater.getId(appId, this.url);
                this.transId = id;
                hashMap.put(r22, id);
            } else {
                hashMap.put(r22, this.transId);
                this.transId = null;
            }
            String[] split = this.url.split(C0201.m82(12799));
            if (split.length >= 2) {
                hashMap.put(C0201.m82(12800), split[0]);
                hashMap.put(C0201.m82(12801), split[1]);
            }
            hashMap.put(C0201.m82(12802), String.valueOf(System.currentTimeMillis()));
            hashMap.put(C0201.m82(12805), Util.getSystemProperties(C0201.m82(12803), C0201.m82(12804)));
            HiAnalyticsUtil.getInstance().onEvent(apiClient.getContext(), C0201.m82(12806), hashMap);
        }
    }

    private void init(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls, int i) {
        String r1 = C0201.m82(12808);
        HMSLog.i(r1, C0201.m82(12807) + str);
        this.url = str;
        if (apiClient == null) {
            HMSLog.e(r1, C0201.m82(12809));
            return;
        }
        this.api = new WeakReference<>(apiClient);
        this.countLatch = new CountDownLatch(1);
        try {
            this.transport = (DatagramTransport) Class.forName(apiClient.getTransportName()).getConstructor(String.class, IMessageEntity.class, Class.class, Integer.TYPE).newInstance(str, iMessageEntity, cls, Integer.valueOf(i));
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e(r1, C0201.m82(12810) + e.getMessage());
            throw new IllegalStateException(C0201.m82(12811) + e.getMessage(), e);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v0, resolved type: com.huawei.hms.core.aidl.IMessageEntity */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setResult(int i, IMessageEntity iMessageEntity) {
        Status status;
        String r1 = C0201.m82(12813);
        HMSLog.i(r1, C0201.m82(12812) + i);
        Status commonStatus = iMessageEntity instanceof AbstractMessageEntity ? ((AbstractMessageEntity) iMessageEntity).getCommonStatus() : null;
        if (i == 0) {
            this.result = onComplete(iMessageEntity);
        } else {
            this.result = onError(i);
        }
        if (this.isNeedReport) {
            biReportEvent(i, 2);
        }
        R r = this.result;
        if (r != null && (status = r.getStatus()) != null && commonStatus != null) {
            int statusCode = status.getStatusCode();
            String statusMessage = status.getStatusMessage();
            int statusCode2 = commonStatus.getStatusCode();
            String statusMessage2 = commonStatus.getStatusMessage();
            String r4 = C0201.m82(12814);
            String r5 = C0201.m82(12815);
            String r6 = C0201.m82(12816);
            if (statusCode != statusCode2) {
                HMSLog.e(r1, C0201.m82(12817) + statusCode + C0201.m82(12818) + statusCode2 + r6);
                HMSLog.e(r1, r5 + statusMessage + r4 + statusMessage2 + r6);
            } else if (TextUtils.isEmpty(statusMessage) && !TextUtils.isEmpty(statusMessage2)) {
                HMSLog.i(r1, r5 + statusMessage + r4 + statusMessage2 + r6);
                this.result.setStatus(new Status(statusCode, statusMessage2, status.getResolution()));
            }
        }
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final R await() {
        String r0 = C0201.m82(12819);
        HMSLog.i(r0, C0201.m82(12820));
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread();
        }
        HMSLog.e(r0, C0201.m82(12821));
        throw new IllegalStateException(C0201.m82(12822));
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread() {
        String r0 = C0201.m82(12828);
        HMSLog.i(r0, C0201.m82(12829));
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(r0, C0201.m82(12830));
            setResult(907135003, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(r0, C0201.m82(12831));
            setResult(907135003, null);
            return this.result;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.send(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.AnonymousClass1 */

            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                PendingResultImpl.this.setResult(i, iMessageEntity);
                PendingResultImpl.this.countLatch.countDown();
            }
        });
        try {
            this.countLatch.await();
        } catch (InterruptedException unused) {
            HMSLog.e(r0, C0201.m82(12832));
            setResult(907135001, null);
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void cancel() {
    }

    public boolean checkApiClient(ApiClient apiClient) {
        return true;
    }

    public Class<T> getResponseType() {
        Type type;
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass == null || (type = ((ParameterizedType) genericSuperclass).getActualTypeArguments()[1]) == null) {
            return null;
        }
        return (Class) type;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public boolean isCanceled() {
        return false;
    }

    public abstract R onComplete(T t);

    public R onError(int i) {
        Type genericSuperclass = getClass().getGenericSuperclass();
        Type type = genericSuperclass != null ? ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0] : null;
        Class<?> type2 = type != null ? GenericTypeReflector.getType(type) : null;
        if (type2 != null) {
            try {
                R r = (R) ((Result) type2.newInstance());
                this.result = r;
                r.setStatus(new Status(i));
            } catch (Exception e) {
                HMSLog.e(C0201.m82(12840), C0201.m82(12839) + e.getMessage());
                return null;
            }
        }
        return this.result;
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public void setResultCallback(ResultCallback<R> resultCallback) {
        this.isNeedReport = !(resultCallback instanceof BaseAdapter.BaseRequestResultCallback);
        setResultCallback(Looper.getMainLooper(), resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public final void setResultCallback(Looper looper, final ResultCallback<R> resultCallback) {
        String r0 = C0201.m82(12841);
        HMSLog.i(r0, C0201.m82(12842));
        if (looper == null) {
            looper = Looper.myLooper();
        }
        final CallbackHandler callbackHandler = new CallbackHandler(looper);
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(r0, C0201.m82(12843));
            setResult(907135003, null);
            return;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(r0, C0201.m82(12844));
            setResult(907135003, null);
            callbackHandler.post(resultCallback, this.result);
            return;
        }
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.AnonymousClass3 */

            /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.huawei.hms.support.api.PendingResultImpl$CallbackHandler */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                PendingResultImpl.this.setResult(i, iMessageEntity);
                callbackHandler.post(resultCallback, PendingResultImpl.this.result);
            }
        });
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    public R await(long j, TimeUnit timeUnit) {
        String r1 = C0201.m82(12825);
        HMSLog.i(r1, C0201.m82(12823) + j + C0201.m82(12824) + timeUnit.toString());
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return awaitOnAnyThread(j, timeUnit);
        }
        HMSLog.i(r1, C0201.m82(12826));
        throw new IllegalStateException(C0201.m82(12827));
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, Class<T> cls) {
        init(apiClient, str, iMessageEntity, cls, 0);
    }

    public PendingResultImpl(ApiClient apiClient, String str, IMessageEntity iMessageEntity, int i) {
        init(apiClient, str, iMessageEntity, getResponseType(), i);
    }

    @Override // com.huawei.hms.support.api.client.PendingResult
    @Deprecated
    public void setResultCallback(ResultCallback<R> resultCallback, long j, TimeUnit timeUnit) {
        setResultCallback(resultCallback);
    }

    @Override // com.huawei.hms.support.api.client.InnerPendingResult
    public final R awaitOnAnyThread(long j, TimeUnit timeUnit) {
        String r1 = C0201.m82(12835);
        HMSLog.i(r1, C0201.m82(12833) + j + C0201.m82(12834) + timeUnit.toString());
        WeakReference<ApiClient> weakReference = this.api;
        if (weakReference == null) {
            HMSLog.e(r1, C0201.m82(12836));
            setResult(907135003, null);
            return this.result;
        }
        ApiClient apiClient = weakReference.get();
        if (!checkApiClient(apiClient)) {
            HMSLog.e(r1, C0201.m82(12837));
            setResult(907135003, null);
            return this.result;
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        if (this.isNeedReport) {
            biReportEvent(0, 1);
        }
        this.transport.post(apiClient, new DatagramTransport.CallBack() {
            /* class com.huawei.hms.support.api.PendingResultImpl.AnonymousClass2 */

            @Override // com.huawei.hms.support.api.transport.DatagramTransport.CallBack
            public void onCallback(int i, IMessageEntity iMessageEntity) {
                if (!atomicBoolean.get()) {
                    PendingResultImpl.this.setResult(i, iMessageEntity);
                }
                PendingResultImpl.this.countLatch.countDown();
            }
        });
        try {
            if (!this.countLatch.await(j, timeUnit)) {
                atomicBoolean.set(true);
                setResult(907135004, null);
            }
        } catch (InterruptedException unused) {
            HMSLog.e(r1, C0201.m82(12838));
            setResult(907135001, null);
        }
        return this.result;
    }
}
