package defpackage;

import android.graphics.Typeface;

/* renamed from: bx1  reason: default package */
/* compiled from: CancelableFontCallback */
public final class bx1 extends gx1 {
    private final Typeface a;
    private final a b;
    private boolean c;

    /* renamed from: bx1$a */
    /* compiled from: CancelableFontCallback */
    public interface a {
        void a(Typeface typeface);
    }

    public bx1(a aVar, Typeface typeface) {
        this.a = typeface;
        this.b = aVar;
    }

    private void d(Typeface typeface) {
        if (!this.c) {
            this.b.a(typeface);
        }
    }

    @Override // defpackage.gx1
    public void a(int i) {
        d(this.a);
    }

    @Override // defpackage.gx1
    public void b(Typeface typeface, boolean z) {
        d(typeface);
    }

    public void c() {
        this.c = true;
    }
}
