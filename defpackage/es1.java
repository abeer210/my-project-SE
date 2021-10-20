package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.m;

/* renamed from: es1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class es1 extends ip0 implements m {
    public static final Parcelable.Creator<es1> CREATOR = new ds1();
    private final int a;
    private int b;
    private Intent c;

    public es1(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // com.google.android.gms.common.api.m
    public final Status k() {
        if (this.b == 0) {
            return Status.e;
        }
        return Status.i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.n(parcel, 2, this.b);
        kp0.s(parcel, 3, this.c, i, false);
        kp0.b(parcel, a2);
    }

    public es1() {
        this(0, null);
    }

    private es1(int i, Intent intent) {
        this(2, 0, null);
    }
}
