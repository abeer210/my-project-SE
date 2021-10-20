package com.google.firebase.iid;

import com.google.firebase.iid.FirebaseInstanceId;

public final /* synthetic */ class t0 implements t12 {
    private final FirebaseInstanceId.a a;

    public t0(FirebaseInstanceId.a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.t12
    public final void a(s12 s12) {
        FirebaseInstanceId.a aVar = this.a;
        synchronized (aVar) {
            if (aVar.a()) {
                FirebaseInstanceId.this.w();
            }
        }
    }
}
