package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* compiled from: BindingFailedResolveMgr */
public class a {
    public static final a a = new a();
    public List<Activity> b = new ArrayList(1);

    public void a(Activity activity) {
        for (Activity activity2 : this.b) {
            if (!(activity2 == null || activity2 == activity || activity2.isFinishing())) {
                activity2.finish();
            }
        }
        this.b.add(activity);
    }

    public void b(Activity activity) {
        this.b.remove(activity);
    }
}
