package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class i0 implements Parcelable.Creator<v> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                i = jp0.v(parcel, t);
            } else if (l == 2) {
                account = (Account) jp0.e(parcel, t, Account.CREATOR);
            } else if (l == 3) {
                i2 = jp0.v(parcel, t);
            } else if (l != 4) {
                jp0.B(parcel, t);
            } else {
                googleSignInAccount = (GoogleSignInAccount) jp0.e(parcel, t, GoogleSignInAccount.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new v(i, account, i2, googleSignInAccount);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v[] newArray(int i) {
        return new v[i];
    }
}
