package com.google.android.gms.vision.clearcut;

import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.common.api.f;

@Keep
public class LoggingConnectionCallbacks implements f.b, f.c {
    @Override // com.google.android.gms.common.api.internal.f
    public void onConnected(Bundle bundle) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.api.internal.m
    public void onConnectionFailed(vo0 vo0) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.common.api.internal.f
    public void onConnectionSuspended(int i) {
        throw new NoSuchMethodError();
    }
}
