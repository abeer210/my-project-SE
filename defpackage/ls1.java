package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.v;

/* renamed from: ls1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ls1 extends ip0 {
    public static final Parcelable.Creator<ls1> CREATOR = new ks1();
    private final int a;
    private final v b;

    public ls1(int i, v vVar) {
        this.a = i;
        this.b = vVar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.s(parcel, 2, this.b, i, false);
        kp0.b(parcel, a2);
    }

    public ls1(v vVar) {
        this(1, vVar);
    }
}
