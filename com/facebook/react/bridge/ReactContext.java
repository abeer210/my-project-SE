package com.facebook.react.bridge;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.facebook.react.bridge.queue.MessageQueueThread;
import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.common.LifecycleState;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import vigqyno.C0201;

public class ReactContext extends ContextWrapper {
    private static final String EARLY_JS_ACCESS_EXCEPTION_MESSAGE = null;
    private static final String EARLY_NATIVE_MODULE_EXCEPTION_MESSAGE = null;
    private static final String LATE_JS_ACCESS_EXCEPTION_MESSAGE = null;
    private static final String LATE_NATIVE_MODULE_EXCEPTION_MESSAGE = null;
    private static final String TAG = null;
    private final CopyOnWriteArraySet<ActivityEventListener> mActivityEventListeners = new CopyOnWriteArraySet<>();
    private CatalystInstance mCatalystInstance;
    private WeakReference<Activity> mCurrentActivity;
    private volatile boolean mDestroyed = false;
    private NativeModuleCallExceptionHandler mExceptionHandlerWrapper;
    private LayoutInflater mInflater;
    private MessageQueueThread mJSMessageQueueThread;
    private final CopyOnWriteArraySet<LifecycleEventListener> mLifecycleEventListeners = new CopyOnWriteArraySet<>();
    private LifecycleState mLifecycleState = LifecycleState.BEFORE_CREATE;
    private NativeModuleCallExceptionHandler mNativeModuleCallExceptionHandler;
    private MessageQueueThread mNativeModulesMessageQueueThread;
    private MessageQueueThread mUiMessageQueueThread;
    private final CopyOnWriteArraySet<WindowFocusChangeListener> mWindowFocusEventListeners = new CopyOnWriteArraySet<>();

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.ReactContext$2  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        public static final /* synthetic */ int[] $SwitchMap$com$facebook$react$common$LifecycleState;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            int[] iArr = new int[LifecycleState.values().length];
            $SwitchMap$com$facebook$react$common$LifecycleState = iArr;
            iArr[LifecycleState.BEFORE_CREATE.ordinal()] = 1;
            $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.BEFORE_RESUME.ordinal()] = 2;
            try {
                $SwitchMap$com$facebook$react$common$LifecycleState[LifecycleState.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public class ExceptionHandlerWrapper implements NativeModuleCallExceptionHandler {
        public ExceptionHandlerWrapper() {
        }

        @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
        public void handleException(Exception exc) {
            ReactContext.this.handleException(exc);
        }
    }

    static {
        C0201.m83(ReactContext.class, 330);
    }

    public ReactContext(Context context) {
        super(context);
    }

    private void raiseCatalystInstanceMissingException() {
        throw new IllegalStateException(this.mDestroyed ? C0201.m82(1687) : C0201.m82(1688));
    }

    public void addActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.add(activityEventListener);
    }

    public void addLifecycleEventListener(final LifecycleEventListener lifecycleEventListener) {
        int i;
        this.mLifecycleEventListeners.add(lifecycleEventListener);
        if (hasActiveCatalystInstance() && (i = AnonymousClass2.$SwitchMap$com$facebook$react$common$LifecycleState[this.mLifecycleState.ordinal()]) != 1 && i != 2) {
            if (i == 3) {
                runOnUiQueueThread(new Runnable() {
                    /* class com.facebook.react.bridge.ReactContext.AnonymousClass1 */

                    public void run() {
                        if (ReactContext.this.mLifecycleEventListeners.contains(lifecycleEventListener)) {
                            try {
                                lifecycleEventListener.onHostResume();
                            } catch (RuntimeException e) {
                                ReactContext.this.handleException(e);
                            }
                        }
                    }
                });
                return;
            }
            throw new IllegalStateException(C0201.m82(1689));
        }
    }

    public void addWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.add(windowFocusChangeListener);
    }

    public void assertOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void assertOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.assertIsOnThread();
    }

    public void destroy() {
        UiThreadUtil.assertOnUiThread();
        this.mDestroyed = true;
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            catalystInstance.destroy();
            if (dj0.e) {
                this.mCatalystInstance = null;
            }
        }
    }

    public CatalystInstance getCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        yh0.c(catalystInstance);
        return catalystInstance;
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public NativeModuleCallExceptionHandler getExceptionHandler() {
        if (this.mExceptionHandlerWrapper == null) {
            this.mExceptionHandlerWrapper = new ExceptionHandlerWrapper();
        }
        return this.mExceptionHandlerWrapper;
    }

    public JSIModule getJSIModule(JSIModuleType jSIModuleType) {
        if (hasActiveCatalystInstance()) {
            return this.mCatalystInstance.getJSIModule(jSIModuleType);
        }
        throw new IllegalStateException(C0201.m82(1690));
    }

    public <T extends JavaScriptModule> T getJSModule(Class<T> cls) {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        if (catalystInstance != null) {
            return (T) catalystInstance.getJSModule(cls);
        }
        if (this.mDestroyed) {
            throw new IllegalStateException(C0201.m82(1691));
        }
        throw new IllegalStateException(C0201.m82(1692));
    }

    public JavaScriptContextHolder getJavaScriptContextHolder() {
        return this.mCatalystInstance.getJavaScriptContextHolder();
    }

    public LifecycleState getLifecycleState() {
        return this.mLifecycleState;
    }

    public <T extends NativeModule> T getNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return (T) this.mCatalystInstance.getNativeModule(cls);
    }

    public String getSourceURL() {
        return this.mCatalystInstance.getSourceURL();
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!C0201.m82(1693).equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.mInflater == null) {
            this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.mInflater;
    }

    public void handleException(Exception exc) {
        boolean z = false;
        boolean z2 = this.mCatalystInstance != null;
        boolean z3 = z2 && !this.mCatalystInstance.isDestroyed();
        if (this.mNativeModuleCallExceptionHandler != null) {
            z = true;
        }
        if (!z3 || !z) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(1694));
            sb.append(z2);
            sb.append(C0201.m82(1695));
            sb.append(!z3);
            sb.append(C0201.m82(1696));
            sb.append(z);
            f60.j(C0201.m82(1697), sb.toString(), exc);
            throw new IllegalStateException(exc);
        }
        this.mNativeModuleCallExceptionHandler.handleException(exc);
    }

    public boolean hasActiveCatalystInstance() {
        CatalystInstance catalystInstance = this.mCatalystInstance;
        return catalystInstance != null && !catalystInstance.isDestroyed();
    }

    public boolean hasCatalystInstance() {
        return this.mCatalystInstance != null;
    }

    public boolean hasCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public <T extends NativeModule> boolean hasNativeModule(Class<T> cls) {
        if (this.mCatalystInstance == null) {
            raiseCatalystInstanceMissingException();
        }
        return this.mCatalystInstance.hasNativeModule(cls);
    }

    public void initializeMessageQueueThreads(ReactQueueConfiguration reactQueueConfiguration) {
        if (this.mUiMessageQueueThread == null && this.mNativeModulesMessageQueueThread == null && this.mJSMessageQueueThread == null) {
            this.mUiMessageQueueThread = reactQueueConfiguration.getUIQueueThread();
            this.mNativeModulesMessageQueueThread = reactQueueConfiguration.getNativeModulesQueueThread();
            this.mJSMessageQueueThread = reactQueueConfiguration.getJSQueueThread();
            return;
        }
        throw new IllegalStateException(C0201.m82(1698));
    }

    public void initializeWithInstance(CatalystInstance catalystInstance) {
        if (catalystInstance == null) {
            throw new IllegalArgumentException(C0201.m82(1702));
        } else if (this.mCatalystInstance == null) {
            if (this.mDestroyed) {
                ReactSoftException.logSoftException(C0201.m82(1700), new IllegalStateException(C0201.m82(1699)));
            }
            this.mCatalystInstance = catalystInstance;
            initializeMessageQueueThreads(catalystInstance.getReactQueueConfiguration());
        } else {
            throw new IllegalStateException(C0201.m82(1701));
        }
    }

    public boolean isBridgeless() {
        return false;
    }

    public boolean isOnJSQueueThread() {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        yh0.c(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnNativeModulesQueueThread() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        yh0.c(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public boolean isOnUiQueueThread() {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        yh0.c(messageQueueThread);
        return messageQueueThread.isOnThread();
    }

    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onActivityResult(activity, i, i2, intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onHostDestroy() {
        UiThreadUtil.assertOnUiThread();
        this.mLifecycleState = LifecycleState.BEFORE_CREATE;
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostDestroy();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        this.mCurrentActivity = null;
    }

    public void onHostPause() {
        this.mLifecycleState = LifecycleState.BEFORE_RESUME;
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostPause();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_PAUSE_END);
    }

    public void onHostResume(Activity activity) {
        this.mLifecycleState = LifecycleState.RESUMED;
        this.mCurrentActivity = new WeakReference<>(activity);
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_START);
        Iterator<LifecycleEventListener> it = this.mLifecycleEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onHostResume();
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
        ReactMarker.logMarker(ReactMarkerConstants.ON_HOST_RESUME_END);
    }

    public void onNewIntent(Activity activity, Intent intent) {
        UiThreadUtil.assertOnUiThread();
        this.mCurrentActivity = new WeakReference<>(activity);
        Iterator<ActivityEventListener> it = this.mActivityEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onNewIntent(intent);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void onWindowFocusChange(boolean z) {
        UiThreadUtil.assertOnUiThread();
        Iterator<WindowFocusChangeListener> it = this.mWindowFocusEventListeners.iterator();
        while (it.hasNext()) {
            try {
                it.next().onWindowFocusChange(z);
            } catch (RuntimeException e) {
                handleException(e);
            }
        }
    }

    public void removeActivityEventListener(ActivityEventListener activityEventListener) {
        this.mActivityEventListeners.remove(activityEventListener);
    }

    public void removeLifecycleEventListener(LifecycleEventListener lifecycleEventListener) {
        this.mLifecycleEventListeners.remove(lifecycleEventListener);
    }

    public void removeWindowFocusChangeListener(WindowFocusChangeListener windowFocusChangeListener) {
        this.mWindowFocusEventListeners.remove(windowFocusChangeListener);
    }

    public void resetPerfStats() {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        if (messageQueueThread != null) {
            messageQueueThread.resetPerfStats();
        }
        MessageQueueThread messageQueueThread2 = this.mJSMessageQueueThread;
        if (messageQueueThread2 != null) {
            messageQueueThread2.resetPerfStats();
        }
    }

    public void runOnJSQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mJSMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnNativeModulesQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void runOnUiQueueThread(Runnable runnable) {
        MessageQueueThread messageQueueThread = this.mUiMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.runOnQueue(runnable);
    }

    public void setNativeModuleCallExceptionHandler(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.mNativeModuleCallExceptionHandler = nativeModuleCallExceptionHandler;
    }

    public boolean startActivityForResult(Intent intent, int i, Bundle bundle) {
        Activity currentActivity = getCurrentActivity();
        yh0.c(currentActivity);
        currentActivity.startActivityForResult(intent, i, bundle);
        return true;
    }

    public void assertOnNativeModulesQueueThread(String str) {
        MessageQueueThread messageQueueThread = this.mNativeModulesMessageQueueThread;
        yh0.c(messageQueueThread);
        messageQueueThread.assertIsOnThread(str);
    }
}
