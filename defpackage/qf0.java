package defpackage;

import android.graphics.Bitmap;

/* renamed from: qf0  reason: default package */
/* compiled from: BitmapPrepareProducer */
public class qf0 implements rg0<v60<ye0>> {
    private final rg0<v60<ye0>> a;
    private final int b;
    private final int c;
    private final boolean d;

    /* renamed from: qf0$a */
    /* compiled from: BitmapPrepareProducer */
    private static class a extends vf0<v60<ye0>, v60<ye0>> {
        private final int c;
        private final int d;

        public a(sf0<v60<ye0>> sf0, int i, int i2) {
            super(sf0);
            this.c = i;
            this.d = i2;
        }

        private void q(v60<ye0> v60) {
            ye0 w;
            Bitmap n;
            int rowBytes;
            if (v60 != null && v60.y() && (w = v60.w()) != null && !w.isClosed() && (w instanceof ze0) && (n = ((ze0) w).n()) != null && (rowBytes = n.getRowBytes() * n.getHeight()) >= this.c && rowBytes <= this.d) {
                n.prepareToDraw();
            }
        }

        /* renamed from: r */
        public void i(v60<ye0> v60, int i) {
            q(v60);
            p().d(v60, i);
        }
    }

    public qf0(rg0<v60<ye0>> rg0, int i, int i2, boolean z) {
        z50.b(i <= i2);
        z50.g(rg0);
        this.a = rg0;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    @Override // defpackage.rg0
    public void b(sf0<v60<ye0>> sf0, sg0 sg0) {
        if (!sg0.e() || this.d) {
            this.a.b(new a(sf0, this.b, this.c), sg0);
        } else {
            this.a.b(sf0, sg0);
        }
    }
}
