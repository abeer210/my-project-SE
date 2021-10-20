package defpackage;

import defpackage.xq0;
import java.util.Iterator;

/* renamed from: cr0  reason: default package */
/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class cr0 implements br0<T> {
    private final /* synthetic */ xq0 a;

    public cr0(xq0 xq0) {
        this.a = xq0;
    }

    @Override // defpackage.br0
    public final void a(T t) {
        this.a.a = t;
        Iterator it = this.a.c.iterator();
        while (it.hasNext()) {
            ((xq0.a) it.next()).a(this.a.a);
        }
        this.a.c.clear();
        this.a.b = null;
    }
}
