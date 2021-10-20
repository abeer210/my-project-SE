package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class c1 extends et0 {
    private final /* synthetic */ a1 a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c1(a1 a1Var, Looper looper) {
        super(looper);
        this.a = a1Var;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            ((z0) message.obj).a(this.a);
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(31);
            sb.append(C0201.m82(19247));
            sb.append(i);
            Log.w(C0201.m82(19248), sb.toString());
        } else {
            throw ((RuntimeException) message.obj);
        }
    }
}
