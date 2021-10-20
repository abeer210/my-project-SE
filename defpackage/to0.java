package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: to0  reason: default package */
public final class to0 implements Parcelable.Creator<so0> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ so0 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        d01 d01 = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        wr1[] wr1Arr = null;
        boolean z = true;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    d01 = (d01) jp0.e(parcel, t, d01.CREATOR);
                    break;
                case 3:
                    bArr = jp0.b(parcel, t);
                    break;
                case 4:
                    iArr = jp0.d(parcel, t);
                    break;
                case 5:
                    strArr = jp0.g(parcel, t);
                    break;
                case 6:
                    iArr2 = jp0.d(parcel, t);
                    break;
                case 7:
                    bArr2 = jp0.c(parcel, t);
                    break;
                case 8:
                    z = jp0.m(parcel, t);
                    break;
                case 9:
                    wr1Arr = (wr1[]) jp0.i(parcel, t, wr1.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new so0(d01, bArr, iArr, strArr, iArr2, bArr2, z, wr1Arr);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ so0[] newArray(int i) {
        return new so0[i];
    }
}
