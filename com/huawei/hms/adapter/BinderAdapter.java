package com.huawei.hms.adapter;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.hms.api.BindingFailedResolution;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Util;
import vigqyno.C0201;

public class BinderAdapter implements ServiceConnection {
    private static final Object LOCK_CONNECT_TIMEOUT_HANDLER = new Object();
    private static final int MSG_CONN_TIMEOUT = 0;
    private static final String TAG = null;
    private BinderCallBack callback;
    private String mAction;
    private Handler mBinderTimeoutHandler = null;
    private Context mContext;
    private String mService;

    public interface BinderCallBack {
        void onBinderFailed(int i);

        void onBinderFailed(int i, Intent intent);

        void onNullBinding(ComponentName componentName);

        void onServiceConnected(ComponentName componentName, IBinder iBinder);

        void onServiceDisconnected(ComponentName componentName);
    }

    static {
        C0201.m83(BinderAdapter.class, 530);
    }

    public BinderAdapter(Context context, String str, String str2) {
        this.mContext = context;
        this.mAction = str;
        this.mService = str2;
    }

    private void bindCoreService() {
        if (TextUtils.isEmpty(this.mAction) || TextUtils.isEmpty(this.mService)) {
            getBindFailPendingIntent();
        }
        Intent intent = new Intent(this.mAction);
        intent.setPackage(this.mService);
        synchronized (LOCK_CONNECT_TIMEOUT_HANDLER) {
            if (this.mContext.bindService(intent, this, 1)) {
                postConnDelayHandle();
            } else {
                getBindFailPendingIntent();
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void binderServiceFailed() {
        BinderCallBack callBack = getCallBack();
        if (callBack != null) {
            callBack.onBinderFailed(-1);
        }
    }

    private void cancelConnDelayHandle() {
        synchronized (LOCK_CONNECT_TIMEOUT_HANDLER) {
            if (this.mBinderTimeoutHandler != null) {
                this.mBinderTimeoutHandler.removeMessages(1001);
                this.mBinderTimeoutHandler = null;
            }
        }
    }

    private void getBindFailPendingIntent() {
        HMSLog.e(C0201.m82(23876), C0201.m82(23877));
        ComponentName componentName = new ComponentName(this.mContext.getApplicationInfo().packageName, C0201.m82(23878));
        Intent intent = new Intent();
        intent.setComponent(componentName);
        intent.putExtra(C0201.m82(23879), BindingFailedResolution.class.getName());
        this.callback.onBinderFailed(-1, intent);
    }

    private BinderCallBack getCallBack() {
        return this.callback;
    }

    private void postConnDelayHandle() {
        Handler handler = this.mBinderTimeoutHandler;
        if (handler != null) {
            handler.removeMessages(1001);
        } else {
            this.mBinderTimeoutHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                /* class com.huawei.hms.adapter.BinderAdapter.AnonymousClass1 */

                public boolean handleMessage(Message message) {
                    if (message == null || message.what != 1001) {
                        return false;
                    }
                    HMSLog.e(C0201.m82(22458), C0201.m82(22459));
                    BinderAdapter.this.binderServiceFailed();
                    return true;
                }
            });
        }
        this.mBinderTimeoutHandler.sendEmptyMessageDelayed(1001, 5000);
    }

    public void binder(BinderCallBack binderCallBack) {
        if (binderCallBack != null) {
            this.callback = binderCallBack;
            bindCoreService();
        }
    }

    public void onNullBinding(ComponentName componentName) {
        HMSLog.e(C0201.m82(23880), C0201.m82(23881));
        unBind();
        cancelConnDelayHandle();
        BinderCallBack callBack = getCallBack();
        if (callBack != null) {
            callBack.onNullBinding(componentName);
        }
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HMSLog.i(C0201.m82(23882), C0201.m82(23883));
        cancelConnDelayHandle();
        BinderCallBack callBack = getCallBack();
        if (callBack != null) {
            callBack.onServiceConnected(componentName, iBinder);
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        HMSLog.i(C0201.m82(23884), C0201.m82(23885));
        BinderCallBack callBack = getCallBack();
        if (callBack != null) {
            callBack.onServiceDisconnected(componentName);
        }
    }

    public void unBind() {
        Util.unBindServiceCatchException(this.mContext, this);
    }
}
