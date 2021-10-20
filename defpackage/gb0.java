package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import defpackage.fc0;
import vigqyno.C0201;

/* renamed from: gb0  reason: default package */
/* compiled from: AnimatedDrawableBackendFrameRenderer */
public class gb0 implements xa0 {
    private static final Class<?> e = gb0.class;
    private final wa0 a;
    private rb0 b;
    private fc0 c;
    private final fc0.b d;

    /* renamed from: gb0$a */
    /* compiled from: AnimatedDrawableBackendFrameRenderer */
    class a implements fc0.b {
        public a() {
        }

        @Override // defpackage.fc0.b
        public void a(int i, Bitmap bitmap) {
        }

        @Override // defpackage.fc0.b
        public v60<Bitmap> b(int i) {
            return gb0.this.a.d(i);
        }
    }

    public gb0(wa0 wa0, rb0 rb0) {
        a aVar = new a();
        this.d = aVar;
        this.a = wa0;
        this.b = rb0;
        this.c = new fc0(rb0, aVar);
    }

    @Override // defpackage.xa0
    public int a() {
        return this.b.a();
    }

    @Override // defpackage.xa0
    public boolean b(int i, Bitmap bitmap) {
        try {
            this.c.f(i, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            f60.h(e, e2, C0201.m82(3819), Integer.valueOf(i));
            return false;
        }
    }

    @Override // defpackage.xa0
    public void c(Rect rect) {
        rb0 h = this.b.h(rect);
        if (h != this.b) {
            this.b = h;
            this.c = new fc0(h, this.d);
        }
    }

    @Override // defpackage.xa0
    public int e() {
        return this.b.c();
    }
}
