package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: cu1  reason: default package */
public final class cu1 implements Parcelable.Creator<wt1.c> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.c createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        wt1.b bVar = null;
        wt1.b bVar2 = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    str2 = jp0.f(parcel, t);
                    break;
                case 4:
                    str3 = jp0.f(parcel, t);
                    break;
                case 5:
                    str4 = jp0.f(parcel, t);
                    break;
                case 6:
                    str5 = jp0.f(parcel, t);
                    break;
                case 7:
                    bVar = (wt1.b) jp0.e(parcel, t, wt1.b.CREATOR);
                    break;
                case 8:
                    bVar2 = (wt1.b) jp0.e(parcel, t, wt1.b.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1.c(str, str2, str3, str4, str5, bVar, bVar2);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.c[] newArray(int i) {
        return new wt1.c[i];
    }
}
