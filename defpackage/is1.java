package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import vigqyno.C0201;

/* renamed from: is1  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public abstract class is1 extends ws0 implements fs1 {
    public is1() {
        super(C0201.m82(29373));
    }

    @Override // defpackage.ws0
    public boolean U3(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 3) {
            Y2((vo0) ys0.b(parcel, vo0.CREATOR), (es1) ys0.b(parcel, es1.CREATOR));
        } else if (i == 4) {
            H1((Status) ys0.b(parcel, Status.CREATOR));
        } else if (i == 6) {
            S1((Status) ys0.b(parcel, Status.CREATOR));
        } else if (i == 7) {
            G((Status) ys0.b(parcel, Status.CREATOR), (GoogleSignInAccount) ys0.b(parcel, GoogleSignInAccount.CREATOR));
        } else if (i != 8) {
            return false;
        } else {
            t0((ns1) ys0.b(parcel, ns1.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
