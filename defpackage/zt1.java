package defpackage;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.wt1;

/* renamed from: zt1  reason: default package */
public final class zt1 implements Parcelable.Creator<wt1> {
    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1 createFromParcel(Parcel parcel) {
        int C = jp0.C(parcel);
        String str = null;
        String str2 = null;
        Point[] pointArr = null;
        wt1.f fVar = null;
        wt1.i iVar = null;
        wt1.j jVar = null;
        wt1.l lVar = null;
        wt1.k kVar = null;
        wt1.g gVar = null;
        wt1.c cVar = null;
        wt1.d dVar = null;
        wt1.e eVar = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < C) {
            int t = jp0.t(parcel);
            switch (jp0.l(t)) {
                case 2:
                    i = jp0.v(parcel, t);
                    break;
                case 3:
                    str = jp0.f(parcel, t);
                    break;
                case 4:
                    str2 = jp0.f(parcel, t);
                    break;
                case 5:
                    i2 = jp0.v(parcel, t);
                    break;
                case 6:
                    pointArr = (Point[]) jp0.i(parcel, t, Point.CREATOR);
                    break;
                case 7:
                    fVar = (wt1.f) jp0.e(parcel, t, wt1.f.CREATOR);
                    break;
                case 8:
                    iVar = (wt1.i) jp0.e(parcel, t, wt1.i.CREATOR);
                    break;
                case 9:
                    jVar = (wt1.j) jp0.e(parcel, t, wt1.j.CREATOR);
                    break;
                case 10:
                    lVar = (wt1.l) jp0.e(parcel, t, wt1.l.CREATOR);
                    break;
                case 11:
                    kVar = (wt1.k) jp0.e(parcel, t, wt1.k.CREATOR);
                    break;
                case 12:
                    gVar = (wt1.g) jp0.e(parcel, t, wt1.g.CREATOR);
                    break;
                case 13:
                    cVar = (wt1.c) jp0.e(parcel, t, wt1.c.CREATOR);
                    break;
                case 14:
                    dVar = (wt1.d) jp0.e(parcel, t, wt1.d.CREATOR);
                    break;
                case 15:
                    eVar = (wt1.e) jp0.e(parcel, t, wt1.e.CREATOR);
                    break;
                default:
                    jp0.B(parcel, t);
                    break;
            }
        }
        jp0.k(parcel, C);
        return new wt1(i, str, str2, i2, pointArr, fVar, iVar, jVar, lVar, kVar, gVar, cVar, dVar, eVar);
    }

    /* Return type fixed from 'java.lang.Object[]' to match base method */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ wt1[] newArray(int i) {
        return new wt1[i];
    }
}
