package com.huawei.hms.support.api.a;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.utils.Checker;

/* compiled from: HmsLocation */
public class a {
    public static e a(Activity activity, r rVar) {
        Checker.assertNonNull(activity);
        return new g(activity, rVar);
    }

    public static b b(Activity activity, r rVar) {
        Checker.assertNonNull(activity);
        return new d(activity, rVar);
    }

    public static k c(Activity activity, r rVar) {
        Checker.assertNonNull(activity);
        return new m(activity, rVar);
    }

    public static h d(Context context, r rVar) {
        Checker.assertNonNull(context);
        return new j(context, rVar);
    }

    public static e a(Context context, r rVar) {
        Checker.assertNonNull(context);
        return new g(context, rVar);
    }

    public static b b(Context context, r rVar) {
        Checker.assertNonNull(context);
        return new d(context, rVar);
    }

    public static k c(Context context, r rVar) {
        Checker.assertNonNull(context);
        return new m(context, rVar);
    }

    public static h d(Activity activity, r rVar) {
        Checker.assertNonNull(activity);
        return new j(activity, rVar);
    }
}
