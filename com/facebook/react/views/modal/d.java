package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.q;
import com.facebook.react.views.view.f;
import java.util.ArrayList;
import vigqyno.C0201;

/* compiled from: ReactModalHostView */
public class d extends ViewGroup implements LifecycleEventListener {
    private b a;
    private Dialog b;
    private boolean c;
    private boolean d;
    private String e;
    private boolean f;
    private boolean g;
    private DialogInterface.OnShowListener h;
    private c i;

    /* access modifiers changed from: package-private */
    /* compiled from: ReactModalHostView */
    public class a implements DialogInterface.OnKeyListener {
        public a() {
        }

        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 1) {
                return false;
            }
            if (i == 4) {
                yh0.d(d.this.i, C0201.m82(35000));
                d.this.i.a(dialogInterface);
                return true;
            }
            Activity currentActivity = ((ReactContext) d.this.getContext()).getCurrentActivity();
            if (currentActivity != null) {
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ReactModalHostView */
    public static class b extends f implements f0 {
        private boolean a = false;
        private int b;
        private int c;
        private j0 d;
        private final h e = new h(this);

        /* access modifiers changed from: package-private */
        /* compiled from: ReactModalHostView */
        public class a extends GuardedRunnable {
            public final /* synthetic */ int a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(ReactContext reactContext, int i) {
                super(reactContext);
                this.a = i;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                ((UIManagerModule) b.this.j().getNativeModule(UIManagerModule.class)).updateNodeSize(this.a, b.this.b, b.this.c);
            }
        }

        public b(Context context) {
            super(context);
        }

        private com.facebook.react.uimanager.events.d i() {
            return ((UIManagerModule) j().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private ReactContext j() {
            return (ReactContext) getContext();
        }

        private void k() {
            if (getChildCount() > 0) {
                this.a = false;
                int id = getChildAt(0).getId();
                j0 j0Var = this.d;
                if (j0Var != null) {
                    l(j0Var, this.b, this.c);
                    return;
                }
                ReactContext j = j();
                j.runOnNativeModulesQueueThread(new a(j, id));
                return;
            }
            this.a = true;
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.a) {
                k();
            }
        }

        @Override // com.facebook.react.uimanager.f0
        public void c(Throwable th) {
            j().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.uimanager.f0
        public void g(MotionEvent motionEvent) {
            this.e.d(motionEvent, i());
        }

        public void l(j0 j0Var, int i, int i2) {
            this.d = j0Var;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble(C0201.m82(35034), (double) q.a((float) i));
            writableNativeMap.putDouble(C0201.m82(35035), (double) q.a((float) i2));
            j0Var.a(writableNativeMap);
        }

        @Override // com.facebook.react.views.view.f
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.e.c(motionEvent, i());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.f
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.b = i;
            this.c = i2;
            k();
        }

        @Override // com.facebook.react.views.view.f
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.e.c(motionEvent, i());
            super.onTouchEvent(motionEvent);
            return true;
        }

        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    /* compiled from: ReactModalHostView */
    public interface c {
        void a(DialogInterface dialogInterface);
    }

    public d(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.a = new b(context);
    }

    private void b() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.b;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) il0.a(this.b.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.b.dismiss();
            }
            this.b = null;
            ((ViewGroup) this.a.getParent()).removeViewAt(0);
        }
    }

    private void e() {
        yh0.d(this.b, C0201.m82(24168));
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.b.getWindow().addFlags(1024);
            } else {
                this.b.getWindow().clearFlags(1024);
            }
        }
        if (this.c) {
            this.b.getWindow().clearFlags(2);
            return;
        }
        this.b.getWindow().setDimAmount(0.5f);
        this.b.getWindow().setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.a);
        if (this.d) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    @Override // android.view.View, android.view.ViewGroup
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        UiThreadUtil.assertOnUiThread();
        this.a.addView(view, i2);
    }

    public void c() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        b();
    }

    public void d() {
        UiThreadUtil.assertOnUiThread();
        if (this.b != null) {
            if (this.g) {
                b();
            } else {
                e();
                return;
            }
        }
        this.g = false;
        int i2 = li0.Theme_FullScreenDialog;
        if (this.e.equals(C0201.m82(24169))) {
            i2 = li0.Theme_FullScreenDialogAnimatedFade;
        } else if (this.e.equals(C0201.m82(24170))) {
            i2 = li0.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        Dialog dialog = new Dialog(context, i2);
        this.b = dialog;
        dialog.getWindow().setFlags(8, 8);
        this.b.setContentView(getContentView());
        e();
        this.b.setOnShowListener(this.h);
        this.b.setOnKeyListener(new a());
        this.b.getWindow().setSoftInputMode(16);
        if (this.f) {
            this.b.getWindow().addFlags(16777216);
        }
        if (currentActivity != null && !currentActivity.isFinishing()) {
            this.b.show();
            if (context instanceof Activity) {
                this.b.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.b.getWindow().clearFlags(8);
        }
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.a.dispatchProvideStructure(viewStructure);
    }

    public void f(j0 j0Var, int i2, int i3) {
        this.a.l(j0Var, i2, i3);
    }

    public View getChildAt(int i2) {
        return this.a.getChildAt(i2);
    }

    public int getChildCount() {
        return this.a.getChildCount();
    }

    public Dialog getDialog() {
        return this.b;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        d();
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.a.removeView(view);
    }

    public void removeViewAt(int i2) {
        UiThreadUtil.assertOnUiThread();
        this.a.removeView(getChildAt(i2));
    }

    public void setAnimationType(String str) {
        this.e = str;
        this.g = true;
    }

    public void setHardwareAccelerated(boolean z) {
        this.f = z;
        this.g = true;
    }

    public void setOnRequestCloseListener(c cVar) {
        this.i = cVar;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.h = onShowListener;
    }

    public void setStatusBarTranslucent(boolean z) {
        this.d = z;
        this.g = true;
    }

    public void setTransparent(boolean z) {
        this.c = z;
    }
}
