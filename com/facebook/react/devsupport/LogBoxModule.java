package com.facebook.react.devsupport;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.fbreact.specs.NativeLogBoxSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import vigqyno.C0201;

@pj0(name = "LogBox")
public class LogBoxModule extends NativeLogBoxSpec {
    public static final String NAME = null;
    private final gj0 mDevSupportManager;
    private d mLogBoxDialog;
    private View mReactRootView;

    class a implements Runnable {
        public a() {
        }

        public void run() {
            if (LogBoxModule.this.mReactRootView == null && LogBoxModule.this.mDevSupportManager != null) {
                LogBoxModule logBoxModule = LogBoxModule.this;
                logBoxModule.mReactRootView = logBoxModule.mDevSupportManager.a(C0201.m82(1007));
                if (LogBoxModule.this.mReactRootView == null) {
                    com.facebook.react.util.c.a(C0201.m82(1008));
                }
            }
        }
    }

    class b implements Runnable {
        public b() {
        }

        public void run() {
            if (LogBoxModule.this.mLogBoxDialog == null && LogBoxModule.this.mReactRootView != null) {
                Activity currentActivity = LogBoxModule.this.getCurrentActivity();
                if (currentActivity == null || currentActivity.isFinishing()) {
                    com.facebook.react.util.c.a(C0201.m82(489));
                    return;
                }
                LogBoxModule.this.mLogBoxDialog = new d(currentActivity, LogBoxModule.this.mReactRootView);
                LogBoxModule.this.mLogBoxDialog.setCancelable(false);
                LogBoxModule.this.mLogBoxDialog.show();
            }
        }
    }

    class c implements Runnable {
        public c() {
        }

        public void run() {
            if (LogBoxModule.this.mLogBoxDialog != null) {
                if (!(LogBoxModule.this.mReactRootView == null || LogBoxModule.this.mReactRootView.getParent() == null)) {
                    ((ViewGroup) LogBoxModule.this.mReactRootView.getParent()).removeView(LogBoxModule.this.mReactRootView);
                }
                LogBoxModule.this.mLogBoxDialog.dismiss();
                LogBoxModule.this.mLogBoxDialog = null;
            }
        }
    }

    class d implements Runnable {
        public d() {
        }

        public void run() {
            if (LogBoxModule.this.mReactRootView != null) {
                LogBoxModule.this.mDevSupportManager.j(LogBoxModule.this.mReactRootView);
                LogBoxModule.this.mReactRootView = null;
            }
        }
    }

    static {
        C0201.m83(LogBoxModule.class, 650);
    }

    public LogBoxModule(ReactApplicationContext reactApplicationContext, gj0 gj0) {
        super(reactApplicationContext);
        this.mDevSupportManager = gj0;
        UiThreadUtil.runOnUiThread(new a());
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(21634);
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void hide() {
        UiThreadUtil.runOnUiThread(new c());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        UiThreadUtil.runOnUiThread(new d());
    }

    @Override // com.facebook.fbreact.specs.NativeLogBoxSpec
    public void show() {
        if (this.mReactRootView != null) {
            UiThreadUtil.runOnUiThread(new b());
        }
    }
}
