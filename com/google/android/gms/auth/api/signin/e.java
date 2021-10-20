package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.internal.a;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class e implements Parcelable.Creator<GoogleSignInOptions> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        ArrayList arrayList = null;
        Account account = null;
        String str = null;
        String str2 = null;
        ArrayList arrayList2 = null;
        String str3 = null;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    arrayList = jp0.j(parcel, t, Scope.CREATOR);
                    break;
                case 3:
                    account = (Account) jp0.e(parcel, t, Account.CREATOR);
                    break;
                case 4:
                    z = jp0.m(parcel, t);
                    break;
                case 5:
                    z2 = jp0.m(parcel, t);
                    break;
                case 6:
                    z3 = jp0.m(parcel, t);
                    break;
                case 7:
                    str = jp0.f(parcel, t);
                    break;
                case 8:
                    str2 = jp0.f(parcel, t);
                    break;
                case 9:
                    arrayList2 = jp0.j(parcel, t, a.CREATOR);
                    break;
                case 10:
                    str3 = jp0.f(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new GoogleSignInOptions(i, arrayList, account, z, z2, z3, str, str2, arrayList2, str3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInOptions[] newArray(int i) {
        return new GoogleSignInOptions[i];
    }
}
