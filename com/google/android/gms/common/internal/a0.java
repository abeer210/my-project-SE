package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class a0 extends g {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Activity b;
    private final /* synthetic */ int c;

    public a0(Intent intent, Activity activity, int i) {
        this.a = intent;
        this.b = activity;
        this.c = i;
    }

    @Override // com.google.android.gms.common.internal.g
    public final void c() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, this.c);
        }
    }
}
