package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

public final class v implements Parcelable.Creator<SignInConfiguration> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        GoogleSignInOptions googleSignInOptions = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 2) {
                str = jp0.f(parcel, t);
            } else if (l != 5) {
                jp0.B(parcel, t);
            } else {
                googleSignInOptions = (GoogleSignInOptions) jp0.e(parcel, t, GoogleSignInOptions.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new SignInConfiguration(str, googleSignInOptions);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ SignInConfiguration[] newArray(int i) {
        return new SignInConfiguration[i];
    }
}
