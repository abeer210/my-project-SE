package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class m0 implements Parcelable.Creator<h> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Bundle bundle = null;
        Account account = null;
        xo0[] xo0Arr = null;
        xo0[] xo0Arr2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    i = jp0.v(parcel, t);
                    break;
                case 2:
                    i2 = jp0.v(parcel, t);
                    break;
                case 3:
                    i3 = jp0.v(parcel, t);
                    break;
                case 4:
                    str = jp0.f(parcel, t);
                    break;
                case 5:
                    iBinder = jp0.u(parcel, t);
                    break;
                case 6:
                    scopeArr = (Scope[]) jp0.i(parcel, t, Scope.CREATOR);
                    break;
                case 7:
                    bundle = jp0.a(parcel, t);
                    break;
                case 8:
                    account = (Account) jp0.e(parcel, t, Account.CREATOR);
                    break;
                case 9:
                default:
                    jp0.B(parcel, t);
                    break;
                case 10:
                    xo0Arr = (xo0[]) jp0.i(parcel, t, xo0.CREATOR);
                    break;
                case 11:
                    xo0Arr2 = (xo0[]) jp0.i(parcel, t, xo0.CREATOR);
                    break;
                case 12:
                    z = jp0.m(parcel, t);
                    break;
                case 13:
                    i4 = jp0.v(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new h(i, i2, i3, str, iBinder, scopeArr, bundle, account, xo0Arr, xo0Arr2, z, i4);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i) {
        return new h[i];
    }
}
