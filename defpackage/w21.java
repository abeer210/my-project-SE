package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.location.d0;
import java.util.List;

/* renamed from: w21  reason: default package */
public final class w21 implements Parcelable.Creator<v21> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v21 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        d0 d0Var = v21.e;
        List<d> list = v21.d;
        String str = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            int l = jp0.l(t);
            if (l == 1) {
                d0Var = (d0) jp0.e(parcel, t, d0.CREATOR);
            } else if (l == 2) {
                list = jp0.j(parcel, t, d.CREATOR);
            } else if (l != 3) {
                jp0.B(parcel, t);
            } else {
                str = jp0.f(parcel, t);
            }
        }
        jp0.k(parcel, C);
        return new v21(d0Var, list, str);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ v21[] newArray(int i) {
        return new v21[i];
    }
}
