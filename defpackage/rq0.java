package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.t0;
import vigqyno.C0201;

/* renamed from: rq0  reason: default package */
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class rq0 extends ip0 {
    public static final Parcelable.Creator<rq0> CREATOR = new uq0();
    private final String a;
    private final lq0 b;
    private final boolean c;
    private final boolean d;

    public rq0(String str, IBinder iBinder, boolean z, boolean z2) {
        this.a = str;
        this.b = o(iBinder);
        this.c = z;
        this.d = z2;
    }

    private static lq0 o(IBinder iBinder) {
        byte[] bArr;
        String r0 = C0201.m82(37892);
        String r1 = C0201.m82(37893);
        if (iBinder == null) {
            return null;
        }
        try {
            yq0 k3 = t0.U3(iBinder).k3();
            if (k3 == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ar0.V3(k3);
            }
            if (bArr != null) {
                return new oq0(bArr);
            }
            Log.e(r1, r0);
            return null;
        } catch (RemoteException e) {
            Log.e(r1, r0, e);
            return null;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.u(parcel, 1, this.a, false);
        lq0 lq0 = this.b;
        if (lq0 == null) {
            Log.w(C0201.m82(37894), C0201.m82(37895));
            lq0 = null;
        } else {
            lq0.asBinder();
        }
        kp0.m(parcel, 2, lq0, false);
        kp0.c(parcel, 3, this.c);
        kp0.c(parcel, 4, this.d);
        kp0.b(parcel, a2);
    }

    public rq0(String str, lq0 lq0, boolean z, boolean z2) {
        this.a = str;
        this.b = lq0;
        this.c = z;
        this.d = z2;
    }
}
