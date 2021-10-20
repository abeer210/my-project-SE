package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.u;

public final class SignInConfiguration extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInConfiguration> CREATOR = new v();
    private final String a;
    private GoogleSignInOptions b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        u.g(str);
        this.a = str;
        this.b = googleSignInOptions;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (this.a.equals(signInConfiguration.a)) {
            GoogleSignInOptions googleSignInOptions = this.b;
            if (googleSignInOptions == null) {
                if (signInConfiguration.b == null) {
                    return true;
                }
            } else if (googleSignInOptions.equals(signInConfiguration.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        b bVar = new b();
        bVar.a(this.a);
        bVar.a(this.b);
        return bVar.b();
    }

    public final GoogleSignInOptions o() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 2, this.a, false);
        kp0.s(parcel, 5, this.b, i, false);
        kp0.b(parcel, a2);
    }
}
