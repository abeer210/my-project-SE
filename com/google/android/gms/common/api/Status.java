package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class Status extends ip0 implements m, ReflectedParcelable {
    public static final Parcelable.Creator<Status> CREATOR = new v();
    public static final Status e = new Status(0);
    public static final Status f = new Status(14);
    public static final Status g = new Status(8);
    public static final Status h = new Status(15);
    public static final Status i = new Status(16);
    private final int a;
    private final int b;
    private final String c;
    private final PendingIntent d;

    public Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this.a = i2;
        this.b = i3;
        this.c = str;
        this.d = pendingIntent;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        if (this.a != status.a || this.b != status.b || !s.a(this.c, status.c) || !s.a(this.d, status.d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return s.b(Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    @Override // com.google.android.gms.common.api.m
    public final Status k() {
        return this;
    }

    public final int o() {
        return this.b;
    }

    public final String p() {
        return this.c;
    }

    public final boolean r() {
        return this.d != null;
    }

    public final boolean s() {
        return this.b <= 0;
    }

    public final String toString() {
        s.a c2 = s.c(this);
        c2.a(C0201.m82(7255), w());
        c2.a(C0201.m82(7256), this.d);
        return c2.toString();
    }

    public final void u(Activity activity, int i2) throws IntentSender.SendIntentException {
        if (r()) {
            activity.startIntentSenderForResult(this.d.getIntentSender(), i2, null, 0, 0, 0);
        }
    }

    public final String w() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        return d.a(this.b);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, o());
        kp0.u(parcel, 2, p(), false);
        kp0.s(parcel, 3, this.d, i2, false);
        kp0.n(parcel, C0188.f18, this.a);
        kp0.b(parcel, a2);
    }

    public Status(int i2) {
        this(i2, null);
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }
}
