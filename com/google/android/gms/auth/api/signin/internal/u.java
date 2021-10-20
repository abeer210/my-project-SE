package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.f;
import vigqyno.C0201;

public final class u extends p {
    private final Context a;

    public u(Context context) {
        this.a = context;
    }

    private final void U3() {
        if (!dp0.h(this.a, Binder.getCallingUid())) {
            int callingUid = Binder.getCallingUid();
            StringBuilder sb = new StringBuilder(52);
            sb.append(C0201.m82(37238));
            sb.append(callingUid);
            sb.append(C0201.m82(37239));
            throw new SecurityException(sb.toString());
        }
    }

    @Override // com.google.android.gms.auth.api.signin.internal.o
    public final void E() {
        U3();
        n.c(this.a).a();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.o
    public final void s() {
        U3();
        c b = c.b(this.a);
        GoogleSignInAccount c = b.c();
        GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.o;
        if (c != null) {
            googleSignInOptions = b.d();
        }
        f.a aVar = new f.a(this.a);
        aVar.b(bo0.e, googleSignInOptions);
        f e = aVar.e();
        try {
            if (e.d().u()) {
                if (c != null) {
                    bo0.f.a(e);
                } else {
                    e.e();
                }
            }
        } finally {
            e.g();
        }
    }
}
