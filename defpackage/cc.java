package defpackage;

import java.util.Collections;

/* renamed from: cc  reason: default package */
/* compiled from: ValueCallbackKeyframeAnimation */
public class cc<K, A> extends nb<K, A> {
    private final A i;

    public cc(dg<A> dgVar) {
        this(dgVar, null);
    }

    @Override // defpackage.nb
    public float c() {
        return 1.0f;
    }

    @Override // defpackage.nb
    public A h() {
        dg<A> dgVar = this.e;
        A a = this.i;
        return dgVar.b(0.0f, 0.0f, a, a, f(), f(), f());
    }

    @Override // defpackage.nb
    public A i(bg<K> bgVar, float f) {
        return h();
    }

    @Override // defpackage.nb
    public void j() {
        if (this.e != null) {
            super.j();
        }
    }

    @Override // defpackage.nb
    public void l(float f) {
        this.d = f;
    }

    public cc(dg<A> dgVar, A a) {
        super(Collections.emptyList());
        m(dgVar);
        this.i = a;
    }
}
