package defpackage;

import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;

/* renamed from: tn0  reason: default package */
/* compiled from: PreviewImpl */
public abstract class tn0 {
    private a a;
    private int b;
    private int c;

    /* renamed from: tn0$a */
    /* compiled from: PreviewImpl */
    interface a {
        void a();

        void b();
    }

    public void a() {
        this.a.b();
    }

    public void b() {
        this.a.a();
    }

    public int c() {
        return this.c;
    }

    public abstract Class d();

    public abstract Surface e();

    public SurfaceHolder f() {
        return null;
    }

    public Object g() {
        return null;
    }

    public abstract View h();

    public int i() {
        return this.b;
    }

    public abstract boolean j();

    public void k(int i, int i2) {
    }

    public void l(a aVar) {
        this.a = aVar;
    }

    public abstract void m(int i);

    public void n(int i, int i2) {
        this.b = i;
        this.c = i2;
    }
}
