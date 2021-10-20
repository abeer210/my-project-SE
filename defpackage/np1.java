package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.vision.b;

/* renamed from: np1  reason: default package */
public final class np1 extends ip0 {
    public static final Parcelable.Creator<np1> CREATOR = new op1();
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public np1() {
    }

    public static np1 o(b bVar) {
        np1 np1 = new np1();
        np1.a = bVar.c().f();
        np1.b = bVar.c().b();
        np1.e = bVar.c().d();
        np1.c = bVar.c().c();
        np1.d = bVar.c().e();
        return np1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.n(parcel, 2, this.a);
        kp0.n(parcel, 3, this.b);
        kp0.n(parcel, 4, this.c);
        kp0.q(parcel, 5, this.d);
        kp0.n(parcel, 6, this.e);
        kp0.b(parcel, a2);
    }

    public np1(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }
}
