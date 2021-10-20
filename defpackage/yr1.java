package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: yr1  reason: default package */
public final class yr1 implements Parcelable.Creator<wr1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wr1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    str = jp0.f(parcel, t);
                    break;
                case 3:
                    bArr = jp0.b(parcel, t);
                    break;
                case 4:
                    bArr2 = jp0.c(parcel, t);
                    break;
                case 5:
                    bArr3 = jp0.c(parcel, t);
                    break;
                case 6:
                    bArr4 = jp0.c(parcel, t);
                    break;
                case 7:
                    bArr5 = jp0.c(parcel, t);
                    break;
                case 8:
                    iArr = jp0.d(parcel, t);
                    break;
                case 9:
                    bArr6 = jp0.c(parcel, t);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wr1(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wr1[] newArray(int i) {
        return new wr1[i];
    }
}
