package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.m;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public interface x0 {
    void a();

    void d();

    boolean disconnect();

    void i(vo0 vo0, a<?> aVar, boolean z);

    <A extends a.b, T extends d<? extends m, A>> T j(T t);

    <A extends a.b, R extends m, T extends d<R, A>> T k(T t);

    void onConnected(Bundle bundle);

    void onConnectionSuspended(int i);
}
