package com.google.firebase.iid;

import android.util.Base64;
import com.google.android.gms.common.internal.s;
import java.security.KeyPair;

public final class b1 {
    private final KeyPair a;
    private final long b;

    public b1(KeyPair keyPair, long j) {
        this.a = keyPair;
        this.b = j;
    }

    /* access modifiers changed from: private */
    public final String e() {
        return Base64.encodeToString(this.a.getPublic().getEncoded(), 11);
    }

    /* access modifiers changed from: private */
    public final String f() {
        return Base64.encodeToString(this.a.getPrivate().getEncoded(), 11);
    }

    public final KeyPair a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        if (this.b != b1Var.b || !this.a.getPublic().equals(b1Var.a.getPublic()) || !this.a.getPrivate().equals(b1Var.a.getPrivate())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return s.b(this.a.getPublic(), this.a.getPrivate(), Long.valueOf(this.b));
    }
}
