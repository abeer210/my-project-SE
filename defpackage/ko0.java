package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.i;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.e;
import java.util.Collections;
import java.util.List;

/* renamed from: ko0  reason: default package */
public final class ko0 extends a.AbstractC0054a<i, GoogleSignInOptions> {
    @Override // com.google.android.gms.common.api.a.e
    public final /* synthetic */ List a(Object obj) {
        GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
        if (googleSignInOptions == null) {
            return Collections.emptyList();
        }
        return googleSignInOptions.r();
    }

    /* Return type fixed from 'com.google.android.gms.common.api.a$f' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [android.content.Context, android.os.Looper, com.google.android.gms.common.internal.e, java.lang.Object, com.google.android.gms.common.api.f$b, com.google.android.gms.common.api.f$c] */
    @Override // com.google.android.gms.common.api.a.AbstractC0054a
    public final /* synthetic */ i c(Context context, Looper looper, e eVar, GoogleSignInOptions googleSignInOptions, f.b bVar, f.c cVar) {
        return new i(context, looper, eVar, googleSignInOptions, bVar, cVar);
    }
}
