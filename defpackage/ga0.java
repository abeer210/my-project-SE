package defpackage;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import defpackage.fa0;
import defpackage.w90;
import vigqyno.C0201;

/* renamed from: ga0  reason: default package */
/* compiled from: WrappingUtils */
public class ga0 {
    private static final Drawable a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, fa0 fa0, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            q90 q90 = new q90(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint());
            b(q90, fa0);
            return q90;
        } else if (drawable instanceof NinePatchDrawable) {
            u90 u90 = new u90((NinePatchDrawable) drawable);
            b(u90, fa0);
            return u90;
        } else if (!(drawable instanceof ColorDrawable) || Build.VERSION.SDK_INT < 11) {
            f60.C(C0201.m82(35773), C0201.m82(35774), drawable);
            return drawable;
        } else {
            r90 b = r90.b((ColorDrawable) drawable);
            b(b, fa0);
            return b;
        }
    }

    public static void b(p90 p90, fa0 fa0) {
        p90.c(fa0.i());
        p90.m(fa0.d());
        p90.a(fa0.b(), fa0.c());
        p90.i(fa0.g());
        p90.f(fa0.k());
        p90.e(fa0.h());
    }

    public static h90 c(h90 h90) {
        while (true) {
            Drawable l = h90.l();
            if (l == h90 || !(l instanceof h90)) {
                return h90;
            }
            h90 = (h90) l;
        }
        return h90;
    }

    public static Drawable d(Drawable drawable, fa0 fa0, Resources resources) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(35775));
            }
            if (!(drawable == null || fa0 == null)) {
                if (fa0.j() == fa0.a.BITMAP_ONLY) {
                    if (drawable instanceof l90) {
                        h90 c = c((l90) drawable);
                        c.g(a(c.g(a), fa0, resources));
                        if (oh0.d()) {
                            oh0.b();
                        }
                        return drawable;
                    }
                    Drawable a2 = a(drawable, fa0, resources);
                    if (oh0.d()) {
                        oh0.b();
                    }
                    return a2;
                }
            }
            return drawable;
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public static Drawable e(Drawable drawable, fa0 fa0) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(35776));
            }
            if (!(drawable == null || fa0 == null)) {
                if (fa0.j() == fa0.a.OVERLAY_COLOR) {
                    s90 s90 = new s90(drawable);
                    b(s90, fa0);
                    s90.s(fa0.f());
                    if (oh0.d()) {
                        oh0.b();
                    }
                    return s90;
                }
            }
            return drawable;
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }

    public static Drawable f(Drawable drawable, w90.c cVar) {
        return g(drawable, cVar, null);
    }

    public static Drawable g(Drawable drawable, w90.c cVar, PointF pointF) {
        if (oh0.d()) {
            oh0.a(C0201.m82(35777));
        }
        if (drawable == null || cVar == null) {
            if (oh0.d()) {
                oh0.b();
            }
            return drawable;
        }
        v90 v90 = new v90(drawable, cVar);
        if (pointF != null) {
            v90.u(pointF);
        }
        if (oh0.d()) {
            oh0.b();
        }
        return v90;
    }

    public static void h(p90 p90) {
        p90.c(false);
        p90.j(0.0f);
        p90.a(0, 0.0f);
        p90.i(0.0f);
        p90.f(false);
        p90.e(false);
    }

    public static void i(h90 h90, fa0 fa0, Resources resources) {
        h90 c = c(h90);
        Drawable l = c.l();
        if (fa0 == null || fa0.j() != fa0.a.BITMAP_ONLY) {
            if (l instanceof p90) {
                h((p90) l);
            }
        } else if (l instanceof p90) {
            b((p90) l, fa0);
        } else if (l != null) {
            c.g(a);
            c.g(a(l, fa0, resources));
        }
    }

    public static void j(h90 h90, fa0 fa0) {
        Drawable l = h90.l();
        if (fa0 == null || fa0.j() != fa0.a.OVERLAY_COLOR) {
            if (l instanceof s90) {
                h90.g(((s90) l).p(a));
                a.setCallback(null);
            }
        } else if (l instanceof s90) {
            s90 s90 = (s90) l;
            b(s90, fa0);
            s90.s(fa0.f());
        } else {
            h90.g(e(h90.g(a), fa0));
        }
    }

    public static v90 k(h90 h90, w90.c cVar) {
        Drawable f = f(h90.g(a), cVar);
        h90.g(f);
        z50.h(f, C0201.m82(35778));
        return (v90) f;
    }
}
