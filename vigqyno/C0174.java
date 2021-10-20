package vigqyno;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* renamed from: vigqyno.∯  reason: contains not printable characters */
public class C0174 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private long f7;

    public C0174() {
        m13();
    }

    /* renamed from: ─  reason: not valid java name and contains not printable characters */
    private native void m13();

    /* renamed from: ━  reason: not valid java name and contains not printable characters */
    private native void m14();

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0009, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000a, code lost:
        super.finalize();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000d, code lost:
        throw r0;
     */
    @Override // java.lang.Object
    public void finalize() {
        m14();
        super.finalize();
    }

    public native void onActivityCreated(Activity activity, Bundle bundle);

    public native void onActivityDestroyed(Activity activity);

    public native void onActivityPaused(Activity activity);

    public native void onActivityResumed(Activity activity);

    public native void onActivitySaveInstanceState(Activity activity, Bundle bundle);

    public native void onActivityStarted(Activity activity);

    public native void onActivityStopped(Activity activity);
}
