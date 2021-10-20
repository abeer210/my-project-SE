package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: e01  reason: default package */
public final class e01 implements Parcelable.Creator<d01> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d01 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    i = jp0.v(parcel, t);
                    break;
                case 4:
                    i2 = jp0.v(parcel, t);
                    break;
                case 5:
                    str2 = jp0.f(parcel, t);
                    break;
                case 6:
                    str3 = jp0.f(parcel, t);
                    break;
                case 7:
                    z = jp0.m(parcel, t);
                    break;
                case 8:
                    str4 = jp0.f(parcel, t);
                    break;
                case 9:
                    z2 = jp0.m(parcel, t);
                    break;
                case 10:
                    i3 = jp0.v(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new d01(str, i, i2, str2, str3, z, str4, z2, i3);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ d01[] newArray(int i) {
        return new d01[i];
    }
}
