package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.h;
import com.google.android.gms.location.r0;

/* renamed from: b21  reason: default package */
public final class b21 extends r0 {
    private final k<h> a;

    @Override // com.google.android.gms.location.q0
    public final synchronized void onLocationChanged(Location location) {
        this.a.c(new c21(this, location));
    }
}
