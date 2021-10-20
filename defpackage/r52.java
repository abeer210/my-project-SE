package defpackage;

import com.google.android.gms.maps.model.p;
import com.google.android.gms.maps.model.t;
import com.google.android.gms.maps.model.v;
import java.util.HashMap;
import vigqyno.C0201;

/* renamed from: r52  reason: default package */
/* compiled from: KmlPlacemark */
public class r52 extends n42 {
    private final String d;
    private final v52 e;

    public r52(o42 o42, String str, v52 v52, HashMap<String, String> hashMap) {
        super(o42, str, hashMap);
        this.d = str;
        this.e = v52;
    }

    public v52 g() {
        return this.e;
    }

    public p h() {
        return this.e.p();
    }

    public t i() {
        return this.e.q();
    }

    public v j() {
        return this.e.r();
    }

    public String k() {
        return super.b();
    }

    public String toString() {
        return C0201.m82(18673) + C0201.m82(18674) + C0201.m82(18675) + this.d + C0201.m82(18676) + this.e + C0201.m82(18677);
    }
}
