package defpackage;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.si0;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import vigqyno.C0201;

/* renamed from: di0  reason: default package */
/* compiled from: HeadlessJsTaskService */
public abstract class di0 extends Service implements mj0 {
    private static PowerManager.WakeLock sWakeLock;
    private final Set<Integer> mActiveTasks = new CopyOnWriteArraySet();

    /* access modifiers changed from: package-private */
    /* renamed from: di0$a */
    /* compiled from: HeadlessJsTaskService */
    public class a implements si0.k {
        public final /* synthetic */ kj0 a;
        public final /* synthetic */ si0 b;

        public a(kj0 kj0, si0 si0) {
            this.a = kj0;
            this.b = si0;
        }

        @Override // defpackage.si0.k
        public void a(ReactContext reactContext) {
            di0.this.invokeStartTask(reactContext, this.a);
            this.b.W(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: di0$b */
    /* compiled from: HeadlessJsTaskService */
    public class b implements Runnable {
        public final /* synthetic */ lj0 a;
        public final /* synthetic */ kj0 b;

        public b(lj0 lj0, kj0 kj0) {
            this.a = lj0;
            this.b = kj0;
        }

        public void run() {
            di0.this.mActiveTasks.add(Integer.valueOf(this.a.k(this.b)));
        }
    }

    @SuppressLint({"WakelockTimeout"})
    public static void acquireWakeLockNow(Context context) {
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock == null || !wakeLock.isHeld()) {
            PowerManager powerManager = (PowerManager) context.getSystemService(C0201.m82(36263));
            yh0.c(powerManager);
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, di0.class.getCanonicalName());
            sWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            sWakeLock.acquire();
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void invokeStartTask(ReactContext reactContext, kj0 kj0) {
        lj0 d = lj0.d(reactContext);
        d.b(this);
        UiThreadUtil.runOnUiThread(new b(d, kj0));
    }

    public vi0 getReactNativeHost() {
        return ((qi0) getApplication()).a();
    }

    public kj0 getTaskConfig(Intent intent) {
        return null;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        ReactContext v;
        super.onDestroy();
        if (getReactNativeHost().n() && (v = getReactNativeHost().j().v()) != null) {
            lj0.d(v).g(this);
        }
        PowerManager.WakeLock wakeLock = sWakeLock;
        if (wakeLock != null) {
            wakeLock.release();
        }
    }

    @Override // defpackage.mj0
    public void onHeadlessJsTaskFinish(int i) {
        this.mActiveTasks.remove(Integer.valueOf(i));
        if (this.mActiveTasks.size() == 0) {
            stopSelf();
        }
    }

    @Override // defpackage.mj0
    public void onHeadlessJsTaskStart(int i) {
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        kj0 taskConfig = getTaskConfig(intent);
        if (taskConfig == null) {
            return 2;
        }
        startTask(taskConfig);
        return 3;
    }

    public void startTask(kj0 kj0) {
        UiThreadUtil.assertOnUiThread();
        acquireWakeLockNow(this);
        si0 j = getReactNativeHost().j();
        ReactContext v = j.v();
        if (v == null) {
            j.k(new a(kj0, j));
            j.r();
            return;
        }
        invokeStartTask(v, kj0);
    }
}
