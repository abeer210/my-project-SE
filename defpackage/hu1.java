package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: hu1  reason: default package */
public final class hu1 implements Parcelable.Creator<wt1.h> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.h createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1.h(str, str2, str3, str4, str5, str6, str7);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1.h[] newArray(int i) {
        return new wt1.h[i];
    }
}
