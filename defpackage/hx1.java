package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: hx1  reason: default package */
/* compiled from: RippleDrawableCompat */
public class hx1 extends Drawable implements yx1, androidx.core.graphics.drawable.b {
    private b a;

    public hx1 a() {
        this.a = new b(this.a);
        return this;
    }

    public void draw(Canvas canvas) {
        b bVar = this.a;
        if (bVar.b) {
            bVar.a.draw(canvas);
        }
    }

    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    public int getOpacity() {
        return this.a.a.getOpacity();
    }

    public boolean isStateful() {
        return true;
    }

    public /* bridge */ /* synthetic */ Drawable mutate() {
        a();
        return this;
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.a.a.setBounds(rect);
    }

    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.a.a.setState(iArr)) {
            onStateChange = true;
        }
        boolean e = ix1.e(iArr);
        b bVar = this.a;
        if (bVar.b == e) {
            return onStateChange;
        }
        bVar.b = e;
        return true;
    }

    public void setAlpha(int i) {
        this.a.a.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.a.a.setColorFilter(colorFilter);
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        this.a.a.setShapeAppearanceModel(vx1);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTint(int i) {
        this.a.a.setTint(i);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.a.a.setTintList(colorStateList);
    }

    @Override // androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        this.a.a.setTintMode(mode);
    }

    public hx1(vx1 vx1) {
        this(new b(new rx1(vx1)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: hx1$b */
    /* compiled from: RippleDrawableCompat */
    public static final class b extends Drawable.ConstantState {
        public rx1 a;
        public boolean b;

        public b(rx1 rx1) {
            this.a = rx1;
            this.b = false;
        }

        /* renamed from: a */
        public hx1 newDrawable() {
            return new hx1(new b(this));
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public b(b bVar) {
            this.a = (rx1) bVar.a.getConstantState().newDrawable();
            this.b = bVar.b;
        }
    }

    private hx1(b bVar) {
        this.a = bVar;
    }
}
