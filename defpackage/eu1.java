package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: eu1  reason: default package */
public final class eu1 implements Parcelable.Creator<wt1.e> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.e createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
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
                    str6 = jp0.f(parcel, t);
                    break;
                case 8:
                    str7 = jp0.f(parcel, t);
                    break;
                case 9:
                    str8 = jp0.f(parcel, t);
                    break;
                case 10:
                    str9 = jp0.f(parcel, t);
                    break;
                case 11:
                    str10 = jp0.f(parcel, t);
                    break;
                case 12:
                    str11 = jp0.f(parcel, t);
                    break;
                case 13:
                    str12 = jp0.f(parcel, t);
                    break;
                case 14:
                    str13 = jp0.f(parcel, t);
                    break;
                case 15:
                    str14 = jp0.f(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1.e(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.e[] newArray(int i) {
        return new wt1.e[i];
    }
}
