package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class c implements Parcelable.Creator<GoogleSignInAccount> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList arrayList = null;
        String str7 = null;
        String str8 = null;
        long j = 0;
        int i = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    str2 = jp0.f(parcel, t);
                    break;
                case 4:
                    str3 = jp0.f(parcel, t);
                    break;
                case 5:
                    str4 = jp0.f(parcel, t);
                    break;
                case 6:
                    uri = (Uri) jp0.e(parcel, t, Uri.CREATOR);
                    break;
                case 7:
                    str5 = jp0.f(parcel, t);
                    break;
                case 8:
                    j = jp0.x(parcel, t);
                    break;
                case 9:
                    str6 = jp0.f(parcel, t);
                    break;
                case 10:
                    arrayList = jp0.j(parcel, t, Scope.CREATOR);
                    break;
                case 11:
                    str7 = jp0.f(parcel, t);
                    break;
                case 12:
                    str8 = jp0.f(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new GoogleSignInAccount(i, str, str2, str3, str4, uri, str5, j, str6, arrayList, str7, str8);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleSignInAccount[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
