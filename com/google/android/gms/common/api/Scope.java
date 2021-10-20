package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.u;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class Scope extends ip0 implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new u();
    private final int a;
    private final String b;

    public Scope(int i, String str) {
        u.h(str, C0201.m82(22186));
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.b.equals(((Scope) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String o() {
        return this.b;
    }

    public final String toString() {
        return this.b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.u(parcel, 2, o(), false);
        kp0.b(parcel, a2);
    }

    public Scope(String str) {
        this(1, str);
    }
}
