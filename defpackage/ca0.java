package defpackage;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import defpackage.w90;
import java.util.Arrays;
import java.util.List;
import vigqyno.C0188;

/* renamed from: ca0  reason: default package */
/* compiled from: GenericDraweeHierarchyBuilder */
public class ca0 {
    public static final w90.c s = w90.c.f;
    public static final w90.c t = w90.c.g;
    private Resources a;
    private int b;
    private float c;
    private Drawable d;
    private w90.c e;
    private Drawable f;
    private w90.c g;
    private Drawable h;
    private w90.c i;
    private Drawable j;
    private w90.c k;
    private w90.c l;
    private PointF m;
    private ColorFilter n;
    private Drawable o;
    private List<Drawable> p;
    private Drawable q;
    private fa0 r;

    public ca0(Resources resources) {
        this.a = resources;
        t();
    }

    private void K() {
        List<Drawable> list = this.p;
        if (list != null) {
            for (Drawable drawable : list) {
                z50.g(drawable);
            }
        }
    }

    private void t() {
        this.b = C0188.f19;
        this.c = 0.0f;
        this.d = null;
        w90.c cVar = s;
        this.e = cVar;
        this.f = null;
        this.g = cVar;
        this.h = null;
        this.i = cVar;
        this.j = null;
        this.k = cVar;
        this.l = t;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.r = null;
    }

    public static ca0 u(Resources resources) {
        return new ca0(resources);
    }

    public ca0 A(w90.c cVar) {
        this.i = cVar;
        return this;
    }

    public ca0 B(Drawable drawable) {
        if (drawable == null) {
            this.p = null;
        } else {
            this.p = Arrays.asList(drawable);
        }
        return this;
    }

    public ca0 C(Drawable drawable) {
        this.d = drawable;
        return this;
    }

    public ca0 D(w90.c cVar) {
        this.e = cVar;
        return this;
    }

    public ca0 E(Drawable drawable) {
        if (drawable == null) {
            this.q = null;
        } else {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, drawable);
            this.q = stateListDrawable;
        }
        return this;
    }

    public ca0 F(Drawable drawable) {
        this.j = drawable;
        return this;
    }

    public ca0 G(w90.c cVar) {
        this.k = cVar;
        return this;
    }

    public ca0 H(Drawable drawable) {
        this.f = drawable;
        return this;
    }

    public ca0 I(w90.c cVar) {
        this.g = cVar;
        return this;
    }

    public ca0 J(fa0 fa0) {
        this.r = fa0;
        return this;
    }

    public ba0 a() {
        K();
        return new ba0(this);
    }

    public ColorFilter b() {
        return this.n;
    }

    public PointF c() {
        return this.m;
    }

    public w90.c d() {
        return this.l;
    }

    public Drawable e() {
        return this.o;
    }

    public float f() {
        return this.c;
    }

    public int g() {
        return this.b;
    }

    public Drawable h() {
        return this.h;
    }

    public w90.c i() {
        return this.i;
    }

    public List<Drawable> j() {
        return this.p;
    }

    public Drawable k() {
        return this.d;
    }

    public w90.c l() {
        return this.e;
    }

    public Drawable m() {
        return this.q;
    }

    public Drawable n() {
        return this.j;
    }

    public w90.c o() {
        return this.k;
    }

    public Resources p() {
        return this.a;
    }

    public Drawable q() {
        return this.f;
    }

    public w90.c r() {
        return this.g;
    }

    public fa0 s() {
        return this.r;
    }

    public ca0 v(w90.c cVar) {
        this.l = cVar;
        return this;
    }

    public ca0 w(Drawable drawable) {
        this.o = drawable;
        return this;
    }

    public ca0 x(float f2) {
        this.c = f2;
        return this;
    }

    public ca0 y(int i2) {
        this.b = i2;
        return this;
    }

    public ca0 z(Drawable drawable) {
        this.h = drawable;
        return this;
    }
}
