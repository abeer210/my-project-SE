package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: du1  reason: default package */
public final class du1 implements Parcelable.Creator<wt1.d> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.d createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        wt1.h hVar = null;
        String str = null;
        String str2 = null;
        wt1.i[] iVarArr = null;
        wt1.f[] fVarArr = null;
        String[] strArr = null;
        wt1.a[] aVarArr = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    hVar = (wt1.h) jp0.e(parcel, t, wt1.h.CREATOR);
                    break;
                case 3:
                    str = jp0.f(parcel, t);
                    break;
                case 4:
                    str2 = jp0.f(parcel, t);
                    break;
                case 5:
                    iVarArr = (wt1.i[]) jp0.i(parcel, t, wt1.i.CREATOR);
                    break;
                case 6:
                    fVarArr = (wt1.f[]) jp0.i(parcel, t, wt1.f.CREATOR);
                    break;
                case 7:
                    strArr = jp0.g(parcel, t);
                    break;
                case 8:
                    aVarArr = (wt1.a[]) jp0.i(parcel, t, wt1.a.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1.d(hVar, str, str2, iVarArr, fVarArr, strArr, aVarArr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.d[] newArray(int i) {
        return new wt1.d[i];
    }
}
