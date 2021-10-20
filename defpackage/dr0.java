package defpackage;

import android.os.Bundle;
import defpackage.xq0;

/* renamed from: dr0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class dr0 implements xq0.a {
    private final /* synthetic */ Bundle a;
    private final /* synthetic */ xq0 b;

    public dr0(xq0 xq0, Bundle bundle) {
        this.b = xq0;
        this.a = bundle;
    }

    @Override // defpackage.xq0.a
    public final void a(zq0 zq0) {
        this.b.a.onCreate(this.a);
    }

    @Override // defpackage.xq0.a
    public final int getState() {
        return 1;
    }
}
