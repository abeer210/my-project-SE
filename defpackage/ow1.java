package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.g;
import androidx.core.widget.c;

/* renamed from: ow1  reason: default package */
/* compiled from: MaterialCheckBox */
public class ow1 extends g {
    private static final int f = wv1.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList d;
    private boolean e;

    public ow1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.checkboxStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.d == null) {
            int[] iArr = new int[g.length];
            int c = uw1.c(this, nv1.colorControlActivated);
            int c2 = uw1.c(this, nv1.colorSurface);
            int c3 = uw1.c(this, nv1.colorOnSurface);
            iArr[0] = uw1.f(c2, c, 1.0f);
            iArr[1] = uw1.f(c2, c3, 0.54f);
            iArr[2] = uw1.f(c2, c3, 0.38f);
            iArr[3] = uw1.f(c2, c3, 0.38f);
            this.d = new ColorStateList(g, iArr);
        }
        return this.d;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.e && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.e = z;
        if (z) {
            c.c(this, getMaterialThemeColorsTintList());
        } else {
            c.c(this, null);
        }
    }

    public ow1(Context context, AttributeSet attributeSet, int i) {
        super(ay1.c(context, attributeSet, i, f), attributeSet, i);
        Context context2 = getContext();
        TypedArray h = com.google.android.material.internal.g.h(context2, attributeSet, xv1.MaterialCheckBox, i, f, new int[0]);
        if (h.hasValue(xv1.MaterialCheckBox_buttonTint)) {
            c.c(this, dx1.a(context2, h, xv1.MaterialCheckBox_buttonTint));
        }
        this.e = h.getBoolean(xv1.MaterialCheckBox_useMaterialThemeColors, false);
        h.recycle();
    }
}
