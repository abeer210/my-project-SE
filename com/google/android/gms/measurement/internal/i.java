package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;

public final class i extends ip0 implements Iterable<String> {
    public static final Parcelable.Creator<i> CREATOR = new k();
    private final Bundle a;

    public i(Bundle bundle) {
        this.a = bundle;
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new h(this);
    }

    public final Object o(String str) {
        return this.a.get(str);
    }

    public final Long p(String str) {
        return Long.valueOf(this.a.getLong(str));
    }

    public final String r(String str) {
        return this.a.getString(str);
    }

    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final Double u(String str) {
        return Double.valueOf(this.a.getDouble(str));
    }

    public final Bundle w() {
        return new Bundle(this.a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.e(parcel, 2, w(), false);
        kp0.b(parcel, a2);
    }
}
