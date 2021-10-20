package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import com.huawei.hms.activity.IBridgeActivityDelegate;
import com.huawei.hms.common.internal.BindResolveClients;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.AbstractDialog;
import com.huawei.hms.ui.AbstractPromptDialog;
import com.huawei.hms.utils.HMSPackageManager;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.Util;
import vigqyno.C0201;

public class BindingFailedResolution implements ServiceConnection, IBridgeActivityDelegate {
    private static final Object a = new Object();
    private Activity b;
    private boolean c = true;
    private a d;
    private Handler e = null;
    private Handler f = null;

    /* access modifiers changed from: private */
    public static class a extends AbstractPromptDialog {
        private a() {
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetMessageString(Context context) {
            return ResourceLoaderUtil.getString(C0201.m82(10845), Util.getAppName(context, null), Util.getAppName(context, HMSPackageManager.getInstance(context).getHMSPackageName()));
        }

        @Override // com.huawei.hms.ui.AbstractDialog
        public String onGetPositiveButtonString(Context context) {
            return ResourceLoaderUtil.getString(C0201.m82(10846));
        }
    }

    private void b() {
        Activity activity = getActivity();
        if (activity == null) {
            HMSLog.e(C0201.m82(27771), C0201.m82(27772));
            a(false);
            return;
        }
        Intent intent = new Intent(C0201.m82(27773));
        intent.setPackage(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName());
        synchronized (a) {
            if (activity.bindService(intent, this, 1)) {
                c();
                return;
            }
            HMSLog.e(C0201.m82(27774), C0201.m82(27775));
            a(false);
        }
    }

    private void c() {
        Handler handler = this.e;
        if (handler != null) {
            handler.removeMessages(2);
        } else {
            this.e = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                /* class com.huawei.hms.api.BindingFailedResolution.AnonymousClass2 */

                public boolean handleMessage(Message message) {
                    if (message == null || message.what != 2) {
                        return false;
                    }
                    HMSLog.e(C0201.m82(20039), C0201.m82(20040));
                    BindingFailedResolution.this.a((BindingFailedResolution) false);
                    return true;
                }
            });
        }
        this.e.sendEmptyMessageDelayed(2, 5000);
    }

    private void d() {
        synchronized (a) {
            if (this.e != null) {
                this.e.removeMessages(2);
                this.e = null;
            }
        }
    }

    private void e() {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            a aVar = this.d;
            if (aVar == null) {
                this.d = new a();
            } else {
                aVar.dismiss();
            }
            HMSLog.e(C0201.m82(27776), C0201.m82(27777));
            this.d.show(activity, new AbstractDialog.Callback() {
                /* class com.huawei.hms.api.BindingFailedResolution.AnonymousClass3 */

                @Override // com.huawei.hms.ui.AbstractDialog.Callback
                public void onCancel(AbstractDialog abstractDialog) {
                    BindingFailedResolution.this.d = null;
                    BindResolveClients.getInstance().unRegisterAll();
                    BindingFailedResolution.this.a((BindingFailedResolution) 8);
                }

                @Override // com.huawei.hms.ui.AbstractDialog.Callback
                public void onDoWork(AbstractDialog abstractDialog) {
                    BindingFailedResolution.this.d = null;
                    BindResolveClients.getInstance().unRegisterAll();
                    BindingFailedResolution.this.a((BindingFailedResolution) 8);
                }
            });
        }
    }

    public Activity getActivity() {
        return this.b;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public int getRequestCode() {
        return 2003;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityCreate(Activity activity) {
        this.b = activity;
        a.a.a(activity);
        a();
        a(activity);
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeActivityDestroy() {
        d();
        a.a.b(this.b);
        this.b = null;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public boolean onBridgeActivityResult(int i, int i2, Intent intent) {
        if (i != getRequestCode()) {
            return false;
        }
        HMSLog.i(C0201.m82(27778), C0201.m82(27779));
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(3);
            this.f = null;
        }
        b();
        return true;
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onBridgeConfigurationChanged() {
        if (this.d != null) {
            HMSLog.i(C0201.m82(27780), C0201.m82(27781));
            e();
        }
    }

    @Override // com.huawei.hms.activity.IBridgeActivityDelegate
    public void onKeyUp(int i, KeyEvent keyEvent) {
        HMSLog.i(C0201.m82(27782), C0201.m82(27783));
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        d();
        a(true);
        Activity activity = getActivity();
        if (activity != null) {
            Util.unBindServiceCatchException(activity, this);
            HMSLog.i(C0201.m82(27784), C0201.m82(27785));
            BindResolveClients.getInstance().notifyClientReconnect();
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }

    public void onStartResult(boolean z) {
        if (getActivity() != null) {
            if (z) {
                a(0);
            } else {
                e();
            }
        }
    }

    private void a() {
        Handler handler = this.f;
        if (handler != null) {
            handler.removeMessages(3);
        } else {
            this.f = new Handler(Looper.getMainLooper(), new Handler.Callback() {
                /* class com.huawei.hms.api.BindingFailedResolution.AnonymousClass1 */

                public boolean handleMessage(Message message) {
                    if (message == null || message.what != 3) {
                        return false;
                    }
                    BindingFailedResolution.this.a((BindingFailedResolution) 8);
                    return true;
                }
            });
        }
        this.f.sendEmptyMessageDelayed(3, 2000);
    }

    private void a(Activity activity) {
        Intent intent = new Intent();
        intent.setClassName(HMSPackageManager.getInstance(activity.getApplicationContext()).getHMSPackageName(), C0201.m82(27767));
        String r1 = C0201.m82(27768);
        HMSLog.i(r1, C0201.m82(27769));
        try {
            activity.startActivityForResult(intent, getRequestCode());
        } catch (Throwable th) {
            HMSLog.e(r1, C0201.m82(27770) + th.getMessage());
            Handler handler = this.f;
            if (handler != null) {
                handler.removeMessages(3);
                this.f = null;
            }
            b();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(boolean z) {
        if (this.c) {
            this.c = false;
            onStartResult(z);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void a(int i) {
        Activity activity = getActivity();
        if (activity != null && !activity.isFinishing()) {
            HMSLog.i(C0201.m82(27765), C0201.m82(27764) + i);
            Intent intent = new Intent();
            intent.putExtra(C0201.m82(27766), i);
            activity.setResult(-1, intent);
            activity.finish();
        }
    }
}
