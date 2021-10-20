package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.z;

public class MaterialTextView extends z {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    private void h(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, xv1.MaterialTextAppearance);
        int k = k(getContext(), obtainStyledAttributes, xv1.MaterialTextAppearance_android_lineHeight, xv1.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (k >= 0) {
            setLineHeight(k);
        }
    }

    private static boolean i(Context context) {
        return cx1.b(context, nv1.textAppearanceLineHeightEnabled, true);
    }

    private static int j(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, xv1.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(xv1.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int k(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = dx1.c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    private static boolean l(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, xv1.MaterialTextView, i, i2);
        int k = k(context, obtainStyledAttributes, xv1.MaterialTextView_android_lineHeight, xv1.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (k != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.widget.z
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (i(context)) {
            h(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        int j;
        if (i(context)) {
            Resources.Theme theme = context.getTheme();
            if (!l(context, theme, attributeSet, i, i2) && (j = j(theme, attributeSet, i, i2)) != -1) {
                h(theme, j);
            }
        }
    }
}
