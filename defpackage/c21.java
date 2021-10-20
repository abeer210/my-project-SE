package defpackage;

import android.location.Location;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.location.h;

/* renamed from: c21  reason: default package */
public final class c21 implements k.b<h> {
    private final /* synthetic */ Location a;

    public c21(b21 b21, Location location) {
        this.a = location;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.google.android.gms.common.api.internal.k.b
    public final /* synthetic */ void a(h hVar) {
        hVar.onLocationChanged(this.a);
    }

    @Override // com.google.android.gms.common.api.internal.k.b
    public final void b() {
    }
}
