package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.location.d0;
import java.util.Collections;
import java.util.List;

/* renamed from: v21  reason: default package */
public final class v21 extends ip0 {
    public static final Parcelable.Creator<v21> CREATOR = new w21();
    public static final List<d> d = Collections.emptyList();
    public static final d0 e = new d0();
    private d0 a;
    private List<d> b;
    private String c;

    public v21(d0 d0Var, List<d> list, String str) {
        this.a = d0Var;
        this.b = list;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v21)) {
            return false;
        }
        v21 v21 = (v21) obj;
        return s.a(this.a, v21.a) && s.a(this.b, v21.b) && s.a(this.c, v21.c);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = kp0.a(parcel);
        kp0.s(parcel, 1, this.a, i, false);
        kp0.y(parcel, 2, this.b, false);
        kp0.u(parcel, 3, this.c, false);
        kp0.b(parcel, a2);
    }
}
