package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.q;
import java.util.Map;
import vigqyno.C0188;
import vigqyno.C0201;

@pj0(name = "StatusBarManager")
public class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = null;
    private static final String HEIGHT_KEY = null;
    public static final String NAME = null;

    class a extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ int c;

        /* renamed from: com.facebook.react.modules.statusbar.StatusBarModule$a$a  reason: collision with other inner class name */
        class C0047a implements ValueAnimator.AnimatorUpdateListener {
            public C0047a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                a.this.a.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z, int i) {
            super(reactContext);
            this.a = activity;
            this.b = z;
            this.c = i;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            this.a.getWindow().addFlags(C0188.f23);
            if (this.b) {
                int statusBarColor = this.a.getWindow().getStatusBarColor();
                ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(statusBarColor), Integer.valueOf(this.c));
                ofObject.addUpdateListener(new C0047a());
                ofObject.setDuration(300L).setStartDelay(0);
                ofObject.start();
                return;
            }
            this.a.getWindow().setStatusBarColor(this.c);
        }
    }

    class b extends GuardedRunnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ boolean b;

        class a implements View.OnApplyWindowInsetsListener {
            public a(b bVar) {
            }

            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(StatusBarModule statusBarModule, ReactContext reactContext, Activity activity, boolean z) {
            super(reactContext);
            this.a = activity;
            this.b = z;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        @TargetApi(21)
        public void runGuarded() {
            View decorView = this.a.getWindow().getDecorView();
            if (this.b) {
                decorView.setOnApplyWindowInsetsListener(new a(this));
            } else {
                decorView.setOnApplyWindowInsetsListener(null);
            }
            k3.f0(decorView);
        }
    }

    class c implements Runnable {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ Activity b;

        public c(StatusBarModule statusBarModule, boolean z, Activity activity) {
            this.a = z;
            this.b = activity;
        }

        public void run() {
            if (this.a) {
                this.b.getWindow().addFlags(1024);
                this.b.getWindow().clearFlags(2048);
                return;
            }
            this.b.getWindow().addFlags(2048);
            this.b.getWindow().clearFlags(1024);
        }
    }

    class d implements Runnable {
        public final /* synthetic */ Activity a;
        public final /* synthetic */ String b;

        public d(StatusBarModule statusBarModule, Activity activity, String str) {
            this.a = activity;
            this.b = str;
        }

        @TargetApi(23)
        public void run() {
            View decorView = this.a.getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(C0201.m82(14222).equals(this.b) ? systemUiVisibility | 8192 : systemUiVisibility & -8193);
        }
    }

    static {
        C0201.m83(StatusBarModule.class, 320);
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return C0201.m82(26633);
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        int identifier = reactApplicationContext.getResources().getIdentifier(C0201.m82(26634), C0201.m82(26635), C0201.m82(26636));
        return e.e(C0201.m82(26639), Float.valueOf(identifier > 0 ? q.a((float) reactApplicationContext.getResources().getDimensionPixelSize(identifier)) : 0.0f), C0201.m82(26640), (currentActivity == null || Build.VERSION.SDK_INT < 21) ? C0201.m82(26638) : String.format(C0201.m82(26637), Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & 16777215)));
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setColor(double d2, boolean z) {
        int i = (int) d2;
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            f60.A(C0201.m82(26641), C0201.m82(26642));
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new a(this, getReactApplicationContext(), currentActivity, z, i));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setHidden(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            f60.A(C0201.m82(26643), C0201.m82(26644));
        } else {
            UiThreadUtil.runOnUiThread(new c(this, z, currentActivity));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setStyle(String str) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            f60.A(C0201.m82(26645), C0201.m82(26646));
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new d(this, currentActivity, str));
        }
    }

    @Override // com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec
    public void setTranslucent(boolean z) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            f60.A(C0201.m82(26647), C0201.m82(26648));
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new b(this, getReactApplicationContext(), currentActivity, z));
        }
    }
}
