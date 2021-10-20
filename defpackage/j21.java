package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.LocationRequest;
import java.util.List;

/* renamed from: j21  reason: default package */
public final class j21 implements Parcelable.Creator<i21> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i21 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        List<d> list = i21.h;
        LocationRequest locationRequest = null;
        String str = null;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l != 1) {
                switch (l) {
                    case 5:
                        list = jp0.j(parcel, t, d.CREATOR);
                        continue;
                    case 6:
                        str = jp0.f(parcel, t);
                        continue;
                    case 7:
                        z = jp0.m(parcel, t);
                        continue;
                    case 8:
                        z2 = jp0.m(parcel, t);
                        continue;
                    case 9:
                        z3 = jp0.m(parcel, t);
                        continue;
                    case 10:
                        str2 = jp0.f(parcel, t);
                        continue;
                    default:
                        jp0.B(parcel, t);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) jp0.e(parcel, t, LocationRequest.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new i21(locationRequest, list, str, z, z2, z3, str2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ i21[] newArray(int i) {
        return new i21[i];
    }
}
