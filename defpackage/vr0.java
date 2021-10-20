package defpackage;

import android.os.Parcel;

/* renamed from: vr0  reason: default package */
public class vr0 {
    static {
        vr0.class.getClassLoader();
    }

    private vr0() {
    }

    public static void a(Parcel parcel, boolean z) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
