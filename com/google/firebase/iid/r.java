package com.google.firebase.iid;

import com.google.firebase.components.e;
import com.google.firebase.components.g;
import com.google.firebase.iid.Registrar;

public final /* synthetic */ class r implements g {
    public static final g a = new r();

    private r() {
    }

    @Override // com.google.firebase.components.g
    public final Object a(e eVar) {
        return new Registrar.a((FirebaseInstanceId) eVar.a(FirebaseInstanceId.class));
    }
}
