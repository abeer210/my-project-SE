package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class v extends ip0 {
    public static final Parcelable.Creator<v> CREATOR = new i0();
    private final int a;
    private final Account b;
    private final int c;
    private final GoogleSignInAccount d;

    public v(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.a = i;
        this.b = account;
        this.c = i2;
        this.d = googleSignInAccount;
    }

    public Account B() {
        return this.b;
    }

    public int o() {
        return this.c;
    }

    public GoogleSignInAccount p() {
        return this.d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.s(parcel, 2, B(), i, false);
        kp0.n(parcel, 3, o());
        kp0.s(parcel, 4, p(), i, false);
        kp0.b(parcel, a2);
    }

    public v(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
