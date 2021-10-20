package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final /* synthetic */ class b implements Comparator {
    public static final Comparator a = new b();

    private b() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return GoogleSignInAccount.D((Scope) obj, (Scope) obj2);
    }
}
