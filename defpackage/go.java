package defpackage;

import android.graphics.drawable.Drawable;
import vigqyno.C0188;
import vigqyno.C0201;

/* renamed from: go  reason: default package */
/* compiled from: CustomTarget */
public abstract class go<T> implements no<T> {
    private final int a;
    private final int b;
    private xn c;

    public go() {
        this(C0188.f23, C0188.f23);
    }

    @Override // defpackage.no
    public final void a(mo moVar) {
    }

    @Override // defpackage.no
    public final void c(xn xnVar) {
        this.c = xnVar;
    }

    @Override // defpackage.no
    public void d(Drawable drawable) {
    }

    @Override // defpackage.no
    public void e(Drawable drawable) {
    }

    @Override // defpackage.no
    public final xn f() {
        return this.c;
    }

    @Override // defpackage.no
    public final void h(mo moVar) {
        moVar.g(this.a, this.b);
    }

    @Override // defpackage.dn
    public void onDestroy() {
    }

    @Override // defpackage.dn
    public void onStart() {
    }

    @Override // defpackage.dn
    public void onStop() {
    }

    public go(int i, int i2) {
        if (fp.r(i, i2)) {
            this.a = i;
            this.b = i2;
            return;
        }
        throw new IllegalArgumentException(C0201.m82(17995) + i + C0201.m82(17996) + i2);
    }
}
