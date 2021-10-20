package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.core.widget.b;
import androidx.core.widget.j;

/* compiled from: AppCompatButton */
public class f extends Button implements j3, b {
    private final e a;
    private final y b;

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.buttonStyle);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.a;
        if (eVar != null) {
            eVar.b();
        }
        y yVar = this.b;
        if (yVar != null) {
            yVar.b();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.r) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.b;
        if (yVar != null) {
            return yVar.e();
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.r) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.b;
        if (yVar != null) {
            return yVar.f();
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.r) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.b;
        if (yVar != null) {
            return yVar.g();
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.r) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.b;
        return yVar != null ? yVar.h() : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.r) {
            y yVar = this.b;
            if (yVar != null) {
                return yVar.i();
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override // defpackage.j3
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // defpackage.j3
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.n(z, i, i2, i3, i4);
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        y yVar = this.b;
        if (yVar != null && !b.r && yVar.l()) {
            this.b.c();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) throws IllegalArgumentException {
        if (b.r) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        y yVar = this.b;
        if (yVar != null) {
            yVar.s(i, i2, i3, i4);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) throws IllegalArgumentException {
        if (b.r) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        y yVar = this.b;
        if (yVar != null) {
            yVar.t(iArr, i);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.r) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        y yVar = this.b;
        if (yVar != null) {
            yVar.u(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        e eVar = this.a;
        if (eVar != null) {
            eVar.g(i);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.s(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        y yVar = this.b;
        if (yVar != null) {
            yVar.r(z);
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // defpackage.j3
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.b;
        if (yVar != null) {
            yVar.p(context, i);
        }
    }

    public void setTextSize(int i, float f) {
        if (b.r) {
            super.setTextSize(i, f);
            return;
        }
        y yVar = this.b;
        if (yVar != null) {
            yVar.z(i, f);
        }
    }

    public f(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.a = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.b = yVar;
        yVar.m(attributeSet, i);
        this.b.b();
    }
}
