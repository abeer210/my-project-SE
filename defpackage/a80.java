package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import vigqyno.C0201;

/* renamed from: a80  reason: default package */
/* compiled from: DefaultDrawableFactory */
public class a80 implements ve0 {
    private final Resources a;
    private final ve0 b;

    public a80(Resources resources, ve0 ve0) {
        this.a = resources;
        this.b = ve0;
    }

    private static boolean c(ze0 ze0) {
        if (ze0.u() == 1 || ze0.u() == 0) {
            return false;
        }
        return true;
    }

    private static boolean d(ze0 ze0) {
        return (ze0.w() == 0 || ze0.w() == -1) ? false : true;
    }

    @Override // defpackage.ve0
    public boolean a(ye0 ye0) {
        return true;
    }

    @Override // defpackage.ve0
    public Drawable b(ye0 ye0) {
        try {
            if (oh0.d()) {
                oh0.a(C0201.m82(29242));
            }
            if (ye0 instanceof ze0) {
                ze0 ze0 = (ze0) ye0;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.a, ze0.n());
                if (!d(ze0) && !c(ze0)) {
                    return bitmapDrawable;
                }
                n90 n90 = new n90(bitmapDrawable, ze0.w(), ze0.u());
                if (oh0.d()) {
                    oh0.b();
                }
                return n90;
            } else if (this.b == null || !this.b.a(ye0)) {
                if (oh0.d()) {
                    oh0.b();
                }
                return null;
            } else {
                Drawable b2 = this.b.b(ye0);
                if (oh0.d()) {
                    oh0.b();
                }
                return b2;
            }
        } finally {
            if (oh0.d()) {
                oh0.b();
            }
        }
    }
}
