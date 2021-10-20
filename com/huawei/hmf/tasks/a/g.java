package com.huawei.hmf.tasks.a;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.util.Log;
import com.huawei.hmf.tasks.ExecuteResult;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import vigqyno.C0201;

public final class g extends Fragment {
    private static final WeakHashMap<Activity, WeakReference<g>> b = new WeakHashMap<>();
    private final List<WeakReference<ExecuteResult<?>>> a = new ArrayList();

    private static g a(Activity activity) {
        g gVar;
        ClassCastException e;
        WeakReference<g> weakReference = b.get(activity);
        if (weakReference != null && weakReference.get() != null) {
            return weakReference.get();
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        try {
            g gVar2 = (g) fragmentManager.findFragmentByTag(C0201.m82(7217));
            if (gVar2 == null) {
                try {
                    gVar = a(fragmentManager);
                } catch (ClassCastException e2) {
                    e = e2;
                    gVar = gVar2;
                }
            } else {
                gVar = gVar2;
            }
            try {
                b.put(activity, new WeakReference<>(gVar));
            } catch (ClassCastException e3) {
                e = e3;
            }
        } catch (ClassCastException e4) {
            e = e4;
            gVar = null;
            Log.e(C0201.m82(7219), C0201.m82(7218) + e.getMessage());
            return gVar;
        }
        return gVar;
    }

    private static g a(FragmentManager fragmentManager) {
        Exception e;
        g gVar = null;
        try {
            g gVar2 = new g();
            try {
                fragmentManager.beginTransaction().add(gVar2, C0201.m82(7220)).commitAllowingStateLoss();
                return gVar2;
            } catch (Exception e2) {
                e = e2;
                gVar = gVar2;
            }
        } catch (Exception e3) {
            e = e3;
            Log.e(C0201.m82(7222), C0201.m82(7221) + e.getMessage());
            return gVar;
        }
    }

    public static void a(Activity activity, ExecuteResult executeResult) {
        g a2 = a(activity);
        if (a2 != null) {
            synchronized (a2.a) {
                a2.a.add(new WeakReference<>(executeResult));
            }
        }
    }

    public final void onStop() {
        super.onStop();
        synchronized (this.a) {
            for (WeakReference<ExecuteResult<?>> weakReference : this.a) {
                ExecuteResult<?> executeResult = weakReference.get();
                if (executeResult != null) {
                    executeResult.cancel();
                }
            }
            this.a.clear();
        }
    }
}
