package com.huawei.hms.support.common;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

public final class ActivityMgr implements Application.ActivityLifecycleCallbacks {
    public static final ActivityMgr INST = new ActivityMgr();
    private static final String TAG = null;
    private WeakReference<Activity> mCurrentActivity;

    static {
        C0201.m83(ActivityMgr.class, 475);
    }

    private ActivityMgr() {
    }

    private static String objDesc(Object obj) {
        if (obj == null) {
            return C0201.m82(29287);
        }
        return obj.getClass().getName() + '@' + Integer.toHexString(obj.hashCode());
    }

    public Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = this.mCurrentActivity;
        String r1 = C0201.m82(29288);
        if (weakReference == null) {
            HMSLog.i(r1, C0201.m82(29289) + this.mCurrentActivity);
            return null;
        }
        HMSLog.i(r1, C0201.m82(29290) + this.mCurrentActivity.get());
        return this.mCurrentActivity.get();
    }

    public void init(Application application) {
        String r0 = C0201.m82(29291);
        HMSLog.d(r0, C0201.m82(29292));
        if (application == null) {
            HMSLog.w(r0, C0201.m82(29293));
            return;
        }
        application.unregisterActivityLifecycleCallbacks(INST);
        application.registerActivityLifecycleCallbacks(INST);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        HMSLog.d(C0201.m82(29295), C0201.m82(29294) + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
        HMSLog.d(C0201.m82(29297), C0201.m82(29296) + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        HMSLog.d(C0201.m82(29299), C0201.m82(29298) + objDesc(activity));
        this.mCurrentActivity = new WeakReference<>(activity);
    }

    public void onActivityStopped(Activity activity) {
    }
}
