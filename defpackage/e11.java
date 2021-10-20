package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: e11  reason: default package */
public class e11 {
    static {
        e11.class.getClassLoader();
    }

    private e11() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean c(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
