package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface j {
    void e(String str, LifecycleCallback lifecycleCallback);

    <T extends LifecycleCallback> T g(String str, Class<T> cls);

    Activity h();

    void startActivityForResult(Intent intent, int i);
}
