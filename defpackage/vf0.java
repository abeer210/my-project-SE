package defpackage;

/* renamed from: vf0  reason: default package */
/* compiled from: DelegatingConsumer */
public abstract class vf0<I, O> extends jf0<I> {
    private final sf0<O> b;

    public vf0(sf0<O> sf0) {
        this.b = sf0;
    }

    @Override // defpackage.jf0
    public void g() {
        this.b.b();
    }

    @Override // defpackage.jf0
    public void h(Throwable th) {
        this.b.a(th);
    }

    @Override // defpackage.jf0
    public void j(float f) {
        this.b.c(f);
    }

    public sf0<O> p() {
        return this.b;
    }
}
