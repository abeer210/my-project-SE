package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.core.widget.b;
import androidx.core.widget.j;
import androidx.core.widget.l;
import defpackage.n2;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView */
public class z extends TextView implements j3, l, b {
    private final e a;
    private final y b;
    private final x c;
    private Future<n2> d;

    public z(Context context) {
        this(context, null);
    }

    private void g() {
        Future<n2> future = this.d;
        if (future != null) {
            try {
                this.d = null;
                j.p(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
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

    public int getFirstBaselineToTopHeight() {
        return j.b(this);
    }

    public int getLastBaselineToBottomHeight() {
        return j.c(this);
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.k();
    }

    public CharSequence getText() {
        g();
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.c) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }

    public n2.a getTextMetricsParamsCompat() {
        return j.g(this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        l.a(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.n(z, i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.s(this, callback));
    }

    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            j.m(this, i);
        }
    }

    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            j.n(this, i);
        }
    }

    public void setLineHeight(int i) {
        j.o(this, i);
    }

    public void setPrecomputedText(n2 n2Var) {
        j.p(this, n2Var);
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

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.b.v(colorStateList);
        this.b.b();
    }

    @Override // androidx.core.widget.l
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.b.w(mode);
        this.b.b();
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        y yVar = this.b;
        if (yVar != null) {
            yVar.p(context, i);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.b(textClassifier);
        }
    }

    public void setTextFuture(Future<n2> future) {
        this.d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(n2.a aVar) {
        j.r(this, aVar);
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

    public void setTypeface(Typeface typeface, int i) {
        Typeface a2 = (typeface == null || i <= 0) ? null : p1.a(getContext(), typeface, i);
        if (a2 != null) {
            typeface = a2;
        }
        super.setTypeface(typeface, i);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public z(Context context, AttributeSet attributeSet, int i) {
        super(u0.b(context), attributeSet, i);
        e eVar = new e(this);
        this.a = eVar;
        eVar.e(attributeSet, i);
        y yVar = new y(this);
        this.b = yVar;
        yVar.m(attributeSet, i);
        this.b.b();
        this.c = new x(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i != 0 ? n.d(context, i) : null;
        Drawable d3 = i2 != 0 ? n.d(context, i2) : null;
        Drawable d4 = i3 != 0 ? n.d(context, i3) : null;
        if (i4 != 0) {
            drawable = n.d(context, i4);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable d2 = i != 0 ? n.d(context, i) : null;
        Drawable d3 = i2 != 0 ? n.d(context, i2) : null;
        Drawable d4 = i3 != 0 ? n.d(context, i3) : null;
        if (i4 != 0) {
            drawable = n.d(context, i4);
        }
        setCompoundDrawablesWithIntrinsicBounds(d2, d3, d4, drawable);
        y yVar = this.b;
        if (yVar != null) {
            yVar.o();
        }
    }
}
