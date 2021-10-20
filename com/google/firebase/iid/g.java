package com.google.firebase.iid;

import android.os.Handler;
import android.os.Message;

public final /* synthetic */ class g implements Handler.Callback {
    private final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final boolean handleMessage(Message message) {
        return this.a.c(message);
    }
}
