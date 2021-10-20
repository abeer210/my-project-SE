package defpackage;

/* renamed from: im  reason: default package */
/* compiled from: GifDrawableResource */
public class im extends yl<gm> implements di {
    public im(gm gmVar) {
        super(gmVar);
    }

    @Override // defpackage.hi
    public int a() {
        return ((gm) this.a).i();
    }

    @Override // defpackage.hi
    public Class<gm> b() {
        return gm.class;
    }

    @Override // defpackage.yl, defpackage.di
    public void initialize() {
        ((gm) this.a).e().prepareToDraw();
    }

    @Override // defpackage.hi
    public void recycle() {
        ((gm) this.a).stop();
        ((gm) this.a).k();
    }
}
