package com.google.android.material.theme;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatViewInflater;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.z;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import com.google.android.material.textview.a;
import vigqyno.C0201;

public class MaterialComponentsViewInflater extends AppCompatViewInflater {
    private static int f;

    static {
        C0201.m83(MaterialComponentsViewInflater.class, 723);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public d b(Context context, AttributeSet attributeSet) {
        return new a(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public f c(Context context, AttributeSet attributeSet) {
        if (v(context, attributeSet)) {
            return new f(context, attributeSet);
        }
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public g d(Context context, AttributeSet attributeSet) {
        return new ow1(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public s j(Context context, AttributeSet attributeSet) {
        return new ax1(context, attributeSet);
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    public z n(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    public boolean v(Context context, AttributeSet attributeSet) {
        int i = Build.VERSION.SDK_INT;
        if (!(i == 23 || i == 24 || i == 25)) {
            return false;
        }
        if (f == -1) {
            f = context.getResources().getIdentifier(C0201.m82(19372), C0201.m82(19373), C0201.m82(19374));
        }
        int i2 = f;
        if (!(i2 == 0 || i2 == -1)) {
            for (int i3 = 0; i3 < attributeSet.getAttributeCount(); i3++) {
                if (attributeSet.getAttributeNameResource(i3) == 16842964 && f == attributeSet.getAttributeListValue(i3, null, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
}
