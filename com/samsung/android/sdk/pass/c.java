package com.samsung.android.sdk.pass;

import android.content.DialogInterface;
import com.samsung.android.sdk.pass.SpassFingerprint;

public final class c implements DialogInterface.OnDismissListener {
    private final /* synthetic */ SpassFingerprint.c a;

    public c(SpassFingerprint.c cVar) {
        this.a = cVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.a.a();
    }
}
