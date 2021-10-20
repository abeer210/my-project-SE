package defpackage;

import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.g;
import com.google.android.gms.location.o0;

/* renamed from: x11  reason: default package */
public final class x11 extends o0 {
    private final k<g> a;

    public x11(k<g> kVar) {
        this.a = kVar;
    }

    @Override // com.google.android.gms.location.n0
    public final void K1(LocationAvailability locationAvailability) {
        this.a.c(new z11(this, locationAvailability));
    }

    public final synchronized void V3() {
        this.a.a();
    }

    @Override // com.google.android.gms.location.n0
    public final void w2(LocationResult locationResult) {
        this.a.c(new y11(this, locationResult));
    }
}
