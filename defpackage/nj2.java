package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import vigqyno.C0201;

/* renamed from: nj2  reason: default package */
/* compiled from: LaunchArgsParser */
public final class nj2 {
    public static WritableMap a(Activity activity) {
        Intent intent;
        Bundle bundleExtra;
        if (activity == null || (intent = activity.getIntent()) == null || (bundleExtra = intent.getBundleExtra(C0201.m82(7538))) == null) {
            return Arguments.createMap();
        }
        return Arguments.fromBundle(bundleExtra);
    }
}
