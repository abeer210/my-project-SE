package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: bu1  reason: default package */
public final class bu1 implements Parcelable.Creator<wt1.b> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.b createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    i = jp0.v(parcel, t);
                    break;
                case 3:
                    i2 = jp0.v(parcel, t);
                    break;
                case 4:
                    i3 = jp0.v(parcel, t);
                    break;
                case 5:
                    i4 = jp0.v(parcel, t);
                    break;
                case 6:
                    i5 = jp0.v(parcel, t);
                    break;
                case 7:
                    i6 = jp0.v(parcel, t);
                    break;
                case 8:
                    z = jp0.m(parcel, t);
                    break;
                case 9:
                    str = jp0.f(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1.b(i, i2, i3, i4, i5, i6, z, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.b[] newArray(int i) {
        return new wt1.b[i];
    }
}
