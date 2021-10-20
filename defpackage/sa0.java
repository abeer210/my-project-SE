package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import defpackage.ra0;

/* renamed from: sa0  reason: default package */
/* compiled from: AnimationBackendDelegate */
public class sa0<T extends ra0> implements ra0 {
    private T a;
    private Rect b;

    public sa0(T t) {
        this.a = t;
    }

    @Override // defpackage.ra0
    public int a() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.a();
    }

    @Override // defpackage.ua0
    public int b() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.b();
    }

    @Override // defpackage.ra0
    public void c(Rect rect) {
        T t = this.a;
        if (t != null) {
            t.c(rect);
        }
        this.b = rect;
    }

    @Override // defpackage.ra0
    public void clear() {
        T t = this.a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // defpackage.ua0
    public int d() {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.d();
    }

    @Override // defpackage.ra0
    public int e() {
        T t = this.a;
        if (t == null) {
            return -1;
        }
        return t.e();
    }

    @Override // defpackage.ra0
    public void g(ColorFilter colorFilter) {
        T t = this.a;
        if (t != null) {
            t.g(colorFilter);
        }
    }

    @Override // defpackage.ua0
    public int h(int i) {
        T t = this.a;
        if (t == null) {
            return 0;
        }
        return t.h(i);
    }

    @Override // defpackage.ra0
    public void i(int i) {
        T t = this.a;
        if (t != null) {
            t.i(i);
        }
    }

    @Override // defpackage.ra0
    public boolean j(Drawable drawable, Canvas canvas, int i) {
        T t = this.a;
        return t != null && t.j(drawable, canvas, i);
    }
}
