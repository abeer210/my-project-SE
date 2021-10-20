package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import vigqyno.C0201;

public final class i extends com.google.android.gms.common.internal.i<s> {
    private final GoogleSignInOptions E;

    public i(Context context, Looper looper, e eVar, GoogleSignInOptions googleSignInOptions, f.b bVar, f.c cVar) {
        super(context, looper, 91, eVar, bVar, cVar);
        googleSignInOptions = googleSignInOptions == null ? new GoogleSignInOptions.a().a() : googleSignInOptions;
        if (!eVar.d().isEmpty()) {
            GoogleSignInOptions.a aVar = new GoogleSignInOptions.a(googleSignInOptions);
            for (Scope scope : eVar.d()) {
                aVar.d(scope, new Scope[0]);
            }
            googleSignInOptions = aVar.a();
        }
        this.E = googleSignInOptions;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final boolean d() {
        return true;
    }

    @Override // com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final Intent getSignInIntent() {
        return j.a(A(), this.E);
    }

    @Override // com.google.android.gms.common.internal.c
    public final String m() {
        return C0201.m82(36442);
    }

    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface(C0201.m82(36443));
        if (queryLocalInterface instanceof s) {
            return (s) queryLocalInterface;
        }
        return new t(iBinder);
    }

    @Override // com.google.android.gms.common.internal.i, com.google.android.gms.common.api.a.f, com.google.android.gms.common.internal.c
    public final int p() {
        return 12451000;
    }

    public final GoogleSignInOptions p0() {
        return this.E;
    }

    @Override // com.google.android.gms.common.internal.c
    public final String t() {
        return C0201.m82(36444);
    }
}
