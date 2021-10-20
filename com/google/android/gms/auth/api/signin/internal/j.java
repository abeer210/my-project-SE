package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.g;
import vigqyno.C0201;

public final class j {
    private static zp0 a = new zp0(C0201.m82(36374), new String[0]);

    public static Intent a(Context context, GoogleSignInOptions googleSignInOptions) {
        a.a(C0201.m82(36375), new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), googleSignInOptions);
        Intent intent = new Intent(C0201.m82(36376));
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        String r1 = C0201.m82(36377);
        bundle.putParcelable(r1, signInConfiguration);
        intent.putExtra(r1, bundle);
        return intent;
    }

    private static void b(Context context) {
        n.c(context).a();
        for (f fVar : f.k()) {
            fVar.o();
        }
        g.b();
    }

    public static h<Status> c(f fVar, Context context, boolean z) {
        a.a(C0201.m82(36378), new Object[0]);
        String e = c.b(context).e();
        b(context);
        if (z) {
            return f.a(e);
        }
        return fVar.j(new k(fVar));
    }
}
