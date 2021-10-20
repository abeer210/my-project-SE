package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.w;

/* renamed from: ns1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class ns1 extends ip0 {
    public static final Parcelable.Creator<ns1> CREATOR = new ms1();
    private final int a;
    private final vo0 b;
    private final w c;

    public ns1(int i, vo0 vo0, w wVar) {
        this.a = i;
        this.b = vo0;
        this.c = wVar;
    }

    public final vo0 o() {
        return this.b;
    }

    public final w p() {
        return this.c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 1, this.a);
        kp0.s(parcel, 2, this.b, i, false);
        kp0.s(parcel, 3, this.c, i, false);
        kp0.b(parcel, a2);
    }

    public ns1(int i) {
        this(new vo0(8, null), null);
    }

    private ns1(vo0 vo0, w wVar) {
        this(1, vo0, null);
    }
}
