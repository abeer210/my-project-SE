package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.firebase.components.d;
import com.google.firebase.components.h;
import com.google.firebase.components.n;
import java.util.Arrays;
import java.util.List;

@Keep
public final class Registrar implements h {

    /* access modifiers changed from: private */
    public static class a implements w12 {
        public a(FirebaseInstanceId firebaseInstanceId) {
        }
    }

    @Override // com.google.firebase.components.h
    @Keep
    public final List<d<?>> getComponents() {
        d.b a2 = d.a(FirebaseInstanceId.class);
        a2.b(n.e(l12.class));
        a2.b(n.e(v12.class));
        a2.b(n.e(f22.class));
        a2.f(s.a);
        a2.c();
        d d = a2.d();
        d.b a3 = d.a(w12.class);
        a3.b(n.e(FirebaseInstanceId.class));
        a3.f(r.a);
        return Arrays.asList(d, a3.d(), e22.a("fire-iid", "18.0.0"));
    }
}
