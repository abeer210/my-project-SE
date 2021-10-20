package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.core.graphics.drawable.a;
import androidx.core.widget.c;

/* compiled from: AppCompatCompoundButtonHelper */
public class i {
    private final CompoundButton a;
    private ColorStateList b = null;
    private PorterDuff.Mode c = null;
    private boolean d = false;
    private boolean e = false;
    private boolean f;

    public i(CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public void a() {
        Drawable a2 = c.a(this.a);
        if (a2 == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = a.r(a2).mutate();
            if (this.d) {
                a.o(mutate, this.b);
            }
            if (this.e) {
                a.p(mutate, this.c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.a.getDrawableState());
            }
            this.a.setButtonDrawable(mutate);
        }
    }

    public int b(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = c.a(this.a)) == null) ? i : i + a2.getIntrinsicWidth();
    }

    public ColorStateList c() {
        return this.b;
    }

    public PorterDuff.Mode d() {
        return this.c;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006b  */
    public void e(AttributeSet attributeSet, int i) {
        boolean z;
        int resourceId;
        int resourceId2;
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, m.CompoundButton, i, 0);
        try {
            if (obtainStyledAttributes.hasValue(m.CompoundButton_buttonCompat) && (resourceId2 = obtainStyledAttributes.getResourceId(m.CompoundButton_buttonCompat, 0)) != 0) {
                try {
                    this.a.setButtonDrawable(n.d(this.a.getContext(), resourceId2));
                    z = true;
                } catch (Resources.NotFoundException unused) {
                }
                if (!z && obtainStyledAttributes.hasValue(m.CompoundButton_android_button) && (resourceId = obtainStyledAttributes.getResourceId(m.CompoundButton_android_button, 0)) != 0) {
                    this.a.setButtonDrawable(n.d(this.a.getContext(), resourceId));
                }
                if (obtainStyledAttributes.hasValue(m.CompoundButton_buttonTint)) {
                    c.c(this.a, obtainStyledAttributes.getColorStateList(m.CompoundButton_buttonTint));
                }
                if (obtainStyledAttributes.hasValue(m.CompoundButton_buttonTintMode)) {
                    c.d(this.a, e0.e(obtainStyledAttributes.getInt(m.CompoundButton_buttonTintMode, -1), null));
                }
            }
            z = false;
            this.a.setButtonDrawable(n.d(this.a.getContext(), resourceId));
            if (obtainStyledAttributes.hasValue(m.CompoundButton_buttonTint)) {
            }
            if (obtainStyledAttributes.hasValue(m.CompoundButton_buttonTintMode)) {
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public void f() {
        if (this.f) {
            this.f = false;
            return;
        }
        this.f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        a();
    }
}
