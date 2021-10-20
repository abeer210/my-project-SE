package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.s;
import androidx.core.widget.c;
import com.google.android.material.internal.g;

/* renamed from: ax1  reason: default package */
/* compiled from: MaterialRadioButton */
public class ax1 extends s {
    private static final int f = wv1.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] g = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    private ColorStateList d;
    private boolean e;

    public ax1(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, nv1.radioButtonStyle);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.d == null) {
            int c = uw1.c(this, nv1.colorControlActivated);
            int c2 = uw1.c(this, nv1.colorOnSurface);
            int c3 = uw1.c(this, nv1.colorSurface);
            int[] iArr = new int[g.length];
            iArr[0] = uw1.f(c3, c, 1.0f);
            iArr[1] = uw1.f(c3, c2, 0.54f);
            iArr[2] = uw1.f(c3, c2, 0.38f);
            iArr[3] = uw1.f(c3, c2, 0.38f);
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

    public ax1(Context context, AttributeSet attributeSet, int i) {
        super(ay1.c(context, attributeSet, i, f), attributeSet, i);
        TypedArray h = g.h(getContext(), attributeSet, xv1.MaterialRadioButton, i, f, new int[0]);
        this.e = h.getBoolean(xv1.MaterialRadioButton_useMaterialThemeColors, false);
        h.recycle();
    }
}
