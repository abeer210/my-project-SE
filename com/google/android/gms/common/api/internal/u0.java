package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class u0 extends et0 {
    private final /* synthetic */ r0 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(r0 r0Var, Looper looper) {
        super(looper);
        this.a = r0Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.a.C();
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append(C0201.m82(12357));
            sb.append(i);
            Log.w(C0201.m82(12358), sb.toString());
        } else {
            this.a.w();
        }
    }
}
