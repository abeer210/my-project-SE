package defpackage;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: su1  reason: default package */
public final class su1 extends ip0 {
    public static final Parcelable.Creator<su1> CREATOR = new tu1();
    public final PointF[] a;
    public final int b;

    public su1(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.x(parcel, 2, this.a, i, false);
        kp0.n(parcel, 3, this.b);
        kp0.b(parcel, a2);
    }
}
