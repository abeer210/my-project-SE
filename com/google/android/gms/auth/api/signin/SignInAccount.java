package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

public class SignInAccount extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new f();
    @Deprecated
    private String a;
    private GoogleSignInAccount b;
    @Deprecated
    private String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        u.h(str, C0201.m82(10348));
        this.a = str;
        u.h(str2, C0201.m82(10349));
        this.c = str2;
    }

    public final GoogleSignInAccount c() {
        return this.b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 4, this.a, false);
        kp0.s(parcel, 7, this.b, i, false);
        kp0.u(parcel, 8, this.c, false);
        kp0.b(parcel, a2);
    }
}
