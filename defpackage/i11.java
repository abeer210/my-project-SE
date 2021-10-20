package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: i11  reason: default package */
public final class i11 implements Parcelable.Creator<h11> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h11 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        Status status = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            if (jp0.l(t) != 1) {
                jp0.B(parcel, t);
            } else {
                status = (Status) jp0.e(parcel, t, Status.CREATOR);
            }
        }
        jp0.k(parcel, C);
        return new h11(status);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h11[] newArray(int i) {
        return new h11[i];
    }
}
