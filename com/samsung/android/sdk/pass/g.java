package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

public final class g implements Runnable {
    private /* synthetic */ SpassFingerprint.c a;
    private final /* synthetic */ FingerprintEvent b;
    private final /* synthetic */ SpassFingerprint.IdentifyListener c;

    public g(SpassFingerprint.c cVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.a = cVar;
        this.b = fingerprintEvent;
        this.c = identifyListener;
    }

    public final void run() {
        if (this.b.eventId == 13) {
            SpassFingerprint.a(SpassFingerprint.this, this.c, this.b, -1);
            this.c.onCompleted();
        }
    }
}
