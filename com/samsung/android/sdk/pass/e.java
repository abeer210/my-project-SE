package com.samsung.android.sdk.pass;

import com.samsung.android.fingerprint.FingerprintEvent;
import com.samsung.android.sdk.pass.SpassFingerprint;

public final class e implements Runnable {
    private /* synthetic */ SpassFingerprint.b a;
    private final /* synthetic */ FingerprintEvent b;
    private final /* synthetic */ SpassFingerprint.IdentifyListener c;

    public e(SpassFingerprint.b bVar, FingerprintEvent fingerprintEvent, SpassFingerprint.IdentifyListener identifyListener) {
        this.a = bVar;
        this.b = fingerprintEvent;
        this.c = identifyListener;
    }

    public final void run() {
        int i = this.b.eventId;
        if (i != 16) {
            if (i != 100000) {
                switch (i) {
                    case 11:
                        this.c.onReady();
                        return;
                    case 12:
                        this.c.onStarted();
                        return;
                    case 13:
                        SpassFingerprint.a(SpassFingerprint.this, this.c, this.b, -1);
                        if (!SpassFingerprint.o) {
                            this.c.onCompleted();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else {
                this.c.onFinished(7);
                this.c.onCompleted();
            }
        } else if (SpassFingerprint.o) {
            this.c.onCompleted();
        }
    }
}
