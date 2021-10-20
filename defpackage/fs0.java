package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import vigqyno.C0201;

/* renamed from: fs0  reason: default package */
/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public abstract class fs0 extends zr0 implements gs0 {
    public fs0() {
        super(C0201.m82(5954));
    }

    @Override // defpackage.zr0
    public final boolean i(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        m((Status) cs0.a(parcel, Status.CREATOR));
        return true;
    }
}
