package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: yl  reason: default package */
/* compiled from: DrawableResource */
public abstract class yl<T extends Drawable> implements hi<T>, di {
    public final T a;

    public yl(T t) {
        ep.d(t);
        this.a = t;
    }

    /* renamed from: c */
    public final T get() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        return constantState == null ? this.a : (T) constantState.newDrawable();
    }

    @Override // defpackage.di
    public void initialize() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof gm) {
            ((gm) t).e().prepareToDraw();
        }
    }
}
