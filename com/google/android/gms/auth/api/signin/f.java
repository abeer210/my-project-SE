package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import vigqyno.C0201;

public final class f implements Parcelable.Creator<SignInAccount> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String r1 = C0201.m82(28104);
        GoogleSignInAccount googleSignInAccount = null;
        String str = r1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 4) {
                r1 = jp0.f(parcel, t);
            } else if (l == 7) {
                googleSignInAccount = (GoogleSignInAccount) jp0.e(parcel, t, GoogleSignInAccount.CREATOR);
            } else if (l != 8) {
                jp0.B(parcel, t);
            } else {
                str = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new SignInAccount(r1, googleSignInAccount, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInAccount[] newArray(int i) {
        return new SignInAccount[i];
    }
}
