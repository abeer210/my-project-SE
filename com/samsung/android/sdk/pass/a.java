package com.samsung.android.sdk.pass;

import com.samsung.android.sdk.pass.SpassFingerprint;

public final class a implements Runnable {
    private /* synthetic */ SpassFingerprint a;
    private final /* synthetic */ SpassFingerprint.IdentifyListener b;

    public a(SpassFingerprint spassFingerprint, SpassFingerprint.IdentifyListener identifyListener) {
        this.a = spassFingerprint;
        this.b = identifyListener;
    }

    public final void run() {
        SpassFingerprint.a(this.a, this.b, null, 8);
        this.b.onCompleted();
    }
}
