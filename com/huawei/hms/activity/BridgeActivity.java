package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.ui.SafeIntent;
import com.huawei.hms.utils.ResourceLoaderUtil;
import com.huawei.hms.utils.UIUtil;
import java.lang.reflect.InvocationTargetException;
import vigqyno.C0201;

public class BridgeActivity extends Activity {
    public static final String EXTRA_DELEGATE_CLASS_NAME = null;
    public static final String EXTRA_DELEGATE_UPDATE_INFO = null;
    public static final String EXTRA_INTENT = null;
    public static final String EXTRA_IS_FULLSCREEN = null;
    public static final String EXTRA_RESULT = null;
    private static final int b = a(C0201.m82(7492), 0);
    private IBridgeActivityDelegate a;

    static {
        C0201.m83(BridgeActivity.class, 119);
    }

    private static void a(Window window, boolean z) {
        try {
            window.getClass().getMethod(C0201.m82(7497), Boolean.TYPE).invoke(window, Boolean.valueOf(z));
        } catch (IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e) {
            HMSLog.e(C0201.m82(7499), C0201.m82(7498) + e.getMessage());
        }
    }

    private boolean b() {
        Intent intent = getIntent();
        String r1 = C0201.m82(7500);
        if (intent == null) {
            HMSLog.e(r1, C0201.m82(7501));
            return false;
        }
        if (intent.getBooleanExtra(C0201.m82(7502), false)) {
            getWindow().setFlags(1024, 1024);
        }
        String stringExtra = intent.getStringExtra(C0201.m82(7503));
        if (stringExtra == null) {
            HMSLog.e(r1, C0201.m82(7504));
            return false;
        }
        try {
            IBridgeActivityDelegate iBridgeActivityDelegate = (IBridgeActivityDelegate) Class.forName(stringExtra).asSubclass(IBridgeActivityDelegate.class).newInstance();
            this.a = iBridgeActivityDelegate;
            try {
                iBridgeActivityDelegate.onBridgeActivityCreate(this);
                return true;
            } catch (RuntimeException e) {
                HMSLog.e(r1, C0201.m82(7505) + e.getMessage());
                return false;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            HMSLog.e(r1, C0201.m82(7506) + e2.getMessage());
            return false;
        }
    }

    public static Intent getIntentStartBridgeActivity(Activity activity, String str) {
        Intent intent = new Intent(activity, BridgeActivity.class);
        intent.putExtra(C0201.m82(7507), str);
        intent.putExtra(C0201.m82(7508), UIUtil.isActivityFullscreen(activity));
        return intent;
    }

    public void finish() {
        HMSLog.i(C0201.m82(7511), C0201.m82(7512));
        super.finish();
    }

    public Intent getIntent() {
        Intent intent = super.getIntent();
        return intent != null ? new SafeIntent(intent) : intent;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        SafeIntent safeIntent = new SafeIntent(intent);
        super.onActivityResult(i, i2, safeIntent);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null && !iBridgeActivityDelegate.onBridgeActivityResult(i, i2, safeIntent) && !isFinishing()) {
            setResult(i2, safeIntent);
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeConfigurationChanged();
        }
    }

    public void onCreate(Bundle bundle) {
        w30.i(this);
        super.onCreate(bundle);
        if (getIntent() != null) {
            a();
            if (ResourceLoaderUtil.getmContext() == null) {
                ResourceLoaderUtil.setmContext(getApplicationContext());
            }
            if (!b()) {
                setResult(1, null);
                finish();
            }
        }
    }

    public void onDestroy() {
        w30.k(this);
        super.onDestroy();
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onBridgeActivityDestroy();
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        IBridgeActivityDelegate iBridgeActivityDelegate = this.a;
        if (iBridgeActivityDelegate != null) {
            iBridgeActivityDelegate.onKeyUp(i, keyEvent);
        }
        return super.onKeyUp(i, keyEvent);
    }

    public /* synthetic */ void onPause() {
        w30.v(this);
        super.onPause();
    }

    public /* synthetic */ void onPostCreate(Bundle bundle) {
        w30.w(this);
        super.onPostCreate(bundle);
    }

    public /* synthetic */ void onPostResume() {
        w30.x(this);
        super.onPostResume();
    }

    public /* synthetic */ void onRestart() {
        w30.A(this);
        super.onRestart();
    }

    public /* synthetic */ void onResume() {
        w30.B(this);
        super.onResume();
    }

    public /* synthetic */ void onStart() {
        w30.C(this);
        super.onStart();
    }

    public /* synthetic */ void onStop() {
        w30.D(this);
        super.onStop();
    }

    private void a() {
        requestWindowFeature(1);
        Window window = getWindow();
        if (b >= 9) {
            window.addFlags(67108864);
            a(window, true);
        }
        window.getDecorView().setSystemUiVisibility(0);
    }

    public static Intent getIntentStartBridgeActivity(Context context, String str) {
        Intent intent = new Intent(context, BridgeActivity.class);
        intent.putExtra(C0201.m82(7509), str);
        intent.putExtra(C0201.m82(7510), false);
        return intent;
    }

    private static int a(String str, int i) {
        try {
            Class<?> cls = Class.forName(C0201.m82(7493));
            return ((Integer) cls.getDeclaredMethod(C0201.m82(7494), String.class, Integer.TYPE).invoke(cls, str, Integer.valueOf(i))).intValue();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            HMSLog.e(C0201.m82(7495), C0201.m82(7496));
            return i;
        }
    }
}
