package com.airbnb.android.react.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import java.util.Map;
import java.util.WeakHashMap;
import vigqyno.C0201;

public class LottieAnimationViewManager extends SimpleViewManager<da> {
    private static final int COMMAND_PAUSE = 0;
    private static final int COMMAND_PLAY = 0;
    private static final int COMMAND_RESET = 0;
    private static final int COMMAND_RESUME = 0;
    private static final String REACT_CLASS = null;
    private static final String TAG = null;
    private static final int VERSION = 0;
    private Map<da, a> propManagersMap = new WeakHashMap();

    /* access modifiers changed from: package-private */
    public class a implements Animator.AnimatorListener {
        public final /* synthetic */ da a;

        public a(da daVar) {
            this.a = daVar;
        }

        public void onAnimationCancel(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.a, true);
        }

        public void onAnimationEnd(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.a, false);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* access modifiers changed from: package-private */
    public class b implements Runnable {
        public final /* synthetic */ ReadableArray a;
        public final /* synthetic */ da b;

        class a implements View.OnAttachStateChangeListener {
            public a() {
            }

            public void onViewAttachedToWindow(View view) {
                da daVar = (da) view;
                daVar.setProgress(0.0f);
                daVar.p();
                daVar.removeOnAttachStateChangeListener(this);
            }

            public void onViewDetachedFromWindow(View view) {
                b.this.b.removeOnAttachStateChangeListener(this);
            }
        }

        public b(LottieAnimationViewManager lottieAnimationViewManager, ReadableArray readableArray, da daVar) {
            this.a = readableArray;
            this.b = daVar;
        }

        public void run() {
            int i = this.a.getInt(0);
            int i2 = this.a.getInt(1);
            if (!(i == -1 || i2 == -1)) {
                if (i > i2) {
                    this.b.u(i2, i);
                    this.b.r();
                } else {
                    this.b.u(i, i2);
                }
            }
            if (k3.M(this.b)) {
                this.b.setProgress(0.0f);
                this.b.p();
                return;
            }
            this.b.addOnAttachStateChangeListener(new a());
        }
    }

    /* access modifiers changed from: package-private */
    public class c implements Runnable {
        public final /* synthetic */ da a;

        public c(LottieAnimationViewManager lottieAnimationViewManager, da daVar) {
            this.a = daVar;
        }

        public void run() {
            if (k3.M(this.a)) {
                this.a.h();
                this.a.setProgress(0.0f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class d implements Runnable {
        public final /* synthetic */ da a;

        public d(LottieAnimationViewManager lottieAnimationViewManager, da daVar) {
            this.a = daVar;
        }

        public void run() {
            if (k3.M(this.a)) {
                this.a.o();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public class e implements Runnable {
        public final /* synthetic */ da a;

        public e(LottieAnimationViewManager lottieAnimationViewManager, da daVar) {
            this.a = daVar;
        }

        public void run() {
            if (k3.M(this.a)) {
                this.a.q();
            }
        }
    }

    static {
        C0201.m83(LottieAnimationViewManager.class, 212);
    }

    private a getOrCreatePropertyManager(da daVar) {
        a aVar = this.propManagersMap.get(daVar);
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(daVar);
        this.propManagersMap.put(daVar, aVar2);
        return aVar2;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void sendOnAnimationFinishEvent(da daVar, boolean z) {
        ReactContext reactContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean(C0201.m82(1705), z);
        Context context = daVar.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                reactContext = null;
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(daVar.getId(), C0201.m82(1706), createMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return com.facebook.react.common.e.g(C0201.m82(1707), 1, C0201.m82(1708), 2, C0201.m82(1709), 3, C0201.m82(1710), 4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        e.b a2 = com.facebook.react.common.e.a();
        a2.b(C0201.m82(1714), com.facebook.react.common.e.d(C0201.m82(1713), com.facebook.react.common.e.d(C0201.m82(1711), C0201.m82(1712))));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        e.b a2 = com.facebook.react.common.e.a();
        a2.b(C0201.m82(1715), 1);
        return a2.a();
    }

    @Override // com.facebook.react.bridge.NativeModule, com.facebook.react.uimanager.ViewManager
    public String getName() {
        return C0201.m82(1716);
    }

    @xj0(name = "colorFilters")
    public void setColorFilters(da daVar, ReadableArray readableArray) {
        getOrCreatePropertyManager(daVar).d(readableArray);
    }

    @xj0(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(da daVar, boolean z) {
        getOrCreatePropertyManager(daVar).e(z);
    }

    @xj0(name = "imageAssetsFolder")
    public void setImageAssetsFolder(da daVar, String str) {
        getOrCreatePropertyManager(daVar).f(str);
    }

    @xj0(name = "loop")
    public void setLoop(da daVar, boolean z) {
        getOrCreatePropertyManager(daVar).g(z);
    }

    @xj0(name = "progress")
    public void setProgress(da daVar, float f) {
        getOrCreatePropertyManager(daVar).h(Float.valueOf(f));
    }

    @xj0(name = "renderMode")
    public void setRenderMode(da daVar, String str) {
        qa qaVar;
        if (C0201.m82(1717).equals(str)) {
            qaVar = qa.AUTOMATIC;
        } else if (C0201.m82(1718).equals(str)) {
            qaVar = qa.HARDWARE;
        } else {
            qaVar = C0201.m82(1719).equals(str) ? qa.SOFTWARE : null;
        }
        getOrCreatePropertyManager(daVar).i(qaVar);
    }

    @xj0(name = "resizeMode")
    public void setResizeMode(da daVar, String str) {
        ImageView.ScaleType scaleType;
        if (C0201.m82(1720).equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_CROP;
        } else if (C0201.m82(1721).equals(str)) {
            scaleType = ImageView.ScaleType.CENTER_INSIDE;
        } else {
            scaleType = C0201.m82(1722).equals(str) ? ImageView.ScaleType.CENTER : null;
        }
        getOrCreatePropertyManager(daVar).j(scaleType);
    }

    @xj0(name = "sourceJson")
    public void setSourceJson(da daVar, String str) {
        getOrCreatePropertyManager(daVar).b(str);
    }

    @xj0(name = "sourceName")
    public void setSourceName(da daVar, String str) {
        if (!str.contains(C0201.m82(1723))) {
            str = str + C0201.m82(1724);
        }
        getOrCreatePropertyManager(daVar).c(str);
    }

    @xj0(name = "speed")
    public void setSpeed(da daVar, double d2) {
        getOrCreatePropertyManager(daVar).k((float) d2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public da createViewInstance(k0 k0Var) {
        da daVar = new da(k0Var);
        daVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        daVar.f(new a(daVar));
        return daVar;
    }

    public void onAfterUpdateTransaction(da daVar) {
        super.onAfterUpdateTransaction((View) daVar);
        getOrCreatePropertyManager(daVar).a();
    }

    public void receiveCommand(da daVar, int i, ReadableArray readableArray) {
        if (i == 1) {
            new Handler(Looper.getMainLooper()).post(new b(this, readableArray, daVar));
        } else if (i == 2) {
            new Handler(Looper.getMainLooper()).post(new c(this, daVar));
        } else if (i == 3) {
            new Handler(Looper.getMainLooper()).post(new d(this, daVar));
        } else if (i == 4) {
            new Handler(Looper.getMainLooper()).post(new e(this, daVar));
        }
    }
}
