package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.j;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b0 extends g {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ j b;
    private final /* synthetic */ int c;

    public b0(Intent intent, j jVar, int i) {
        this.a = intent;
        this.b = jVar;
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
