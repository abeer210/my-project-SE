package com.samsung.android.sdk.pass;

import android.util.Log;
import com.samsung.android.fingerprint.FingerprintManager;
import com.samsung.android.sdk.pass.SpassFingerprint;
import vigqyno.C0201;

public final class d implements FingerprintManager.EnrollFinishListener {
    private final /* synthetic */ SpassFingerprint.RegisterListener a;

    public d(SpassFingerprint.RegisterListener registerListener) {
        this.a = registerListener;
    }

    public final void onEnrollFinish() {
        Log.d(C0201.m82(26671), C0201.m82(26672));
        this.a.onFinished();
    }
}
