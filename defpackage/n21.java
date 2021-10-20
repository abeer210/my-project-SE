package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: n21  reason: default package */
public final class n21 implements Parcelable.Creator<m21> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m21 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        String str = null;
        long j = 0;
        int i = 0;
        short s = 0;
        float f = 0.0f;
        int i2 = 0;
        int i3 = -1;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 1:
                    str = jp0.f(parcel, t);
                    break;
                case 2:
                    j = jp0.x(parcel, t);
                    break;
                case 3:
                    s = jp0.z(parcel, t);
                    break;
                case 4:
                    d = jp0.p(parcel, t);
                    break;
                case 5:
                    d2 = jp0.p(parcel, t);
                    break;
                case 6:
                    f = jp0.r(parcel, t);
                    break;
                case 7:
                    i = jp0.v(parcel, t);
                    break;
                case 8:
                    i2 = jp0.v(parcel, t);
                    break;
                case 9:
                    i3 = jp0.v(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new m21(str, i, s, d, d2, f, j, i2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ m21[] newArray(int i) {
        return new m21[i];
    }
}
