package defpackage;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: fi1  reason: default package */
public final class fi1 extends ip0 {
    public static final Parcelable.Creator<fi1> CREATOR = new gi1();
    public final Rect a;

    public fi1(Rect rect) {
        this.a = rect;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 2, this.a, i, false);
        kp0.b(parcel, a2);
    }
}
