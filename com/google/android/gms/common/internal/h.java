package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.n;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class h extends ip0 {
    public static final Parcelable.Creator<h> CREATOR = new m0();
    private final int a;
    private final int b;
    private int c;
    public String d;
    public IBinder e;
    public Scope[] f;
    public Bundle g;
    public Account h;
    public xo0[] i;
    public xo0[] j;
    private boolean k;
    private int l;

    public h(int i2) {
        this.a = 4;
        this.c = zo0.a;
        this.b = i2;
        this.k = true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, this.b);
        kp0.n(parcel, 3, this.c);
        kp0.u(parcel, 4, this.d, false);
        kp0.m(parcel, 5, this.e, false);
        kp0.x(parcel, 6, this.f, i2, false);
        kp0.e(parcel, 7, this.g, false);
        kp0.s(parcel, 8, this.h, i2, false);
        kp0.x(parcel, 10, this.i, i2, false);
        kp0.x(parcel, 11, this.j, i2, false);
        kp0.c(parcel, 12, this.k);
        kp0.n(parcel, 13, this.l);
        kp0.b(parcel, a2);
    }

    public h(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, xo0[] xo0Arr, xo0[] xo0Arr2, boolean z, int i5) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        String r2 = C0201.m82(7882);
        if (r2.equals(str)) {
            this.d = r2;
        } else {
            this.d = str;
        }
        if (i2 < 2) {
            this.h = iBinder != null ? a.V3(n.a.U3(iBinder)) : null;
        } else {
            this.e = iBinder;
            this.h = account;
        }
        this.f = scopeArr;
        this.g = bundle;
        this.i = xo0Arr;
        this.j = xo0Arr2;
        this.k = z;
        this.l = i5;
    }
}
