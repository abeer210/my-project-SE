package com.google.firebase.iid;

import android.os.Looper;
import android.os.Message;

public final class w extends p01 {
    private final /* synthetic */ x a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(x xVar, Looper looper) {
        super(looper);
        this.a = xVar;
    }

    public final void handleMessage(Message message) {
        this.a.e(message);
    }
}
