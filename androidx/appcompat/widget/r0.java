package androidx.appcompat.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.core.widget.j;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: SwitchCompat */
public class r0 extends CompoundButton {
    private static final Property<r0, Float> Q = new a(Float.class, C0201.m82(30916));
    private static final int[] R = {16842912};
    public float A;
    private int B;
    private int C;
    private int D;
    private int E;
    private int F;
    private int G;
    private int H;
    private final TextPaint I;
    private ColorStateList J;
    private Layout K;
    private Layout L;
    private TransformationMethod M;
    public ObjectAnimator N;
    private final y O;
    private final Rect P;
    private Drawable a;
    private ColorStateList b;
    private PorterDuff.Mode c;
    private boolean d;
    private boolean e;
    private Drawable f;
    private ColorStateList g;
    private PorterDuff.Mode h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private CharSequence o;
    private CharSequence p;
    private boolean q;
    private int u;
    private int v;
    private float w;
    private float x;
    private VelocityTracker y;
    private int z;

    /* compiled from: SwitchCompat */
    static class a extends Property<r0, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(r0 r0Var) {
            return Float.valueOf(r0Var.A);
        }

        /* renamed from: b */
        public void set(r0 r0Var, Float f) {
            r0Var.setThumbPosition(f.floatValue());
        }
    }

    public r0(Context context) {
        this(context, null);
    }

    private void a(boolean z2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, Q, z2 ? 1.0f : 0.0f);
        this.N = ofFloat;
        ofFloat.setDuration(250L);
        if (Build.VERSION.SDK_INT >= 18) {
            this.N.setAutoCancel(true);
        }
        this.N.start();
    }

    private void b() {
        if (this.a == null) {
            return;
        }
        if (this.d || this.e) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.a).mutate();
            this.a = mutate;
            if (this.d) {
                androidx.core.graphics.drawable.a.o(mutate, this.b);
            }
            if (this.e) {
                androidx.core.graphics.drawable.a.p(this.a, this.c);
            }
            if (this.a.isStateful()) {
                this.a.setState(getDrawableState());
            }
        }
    }

    private void c() {
        if (this.f == null) {
            return;
        }
        if (this.i || this.j) {
            Drawable mutate = androidx.core.graphics.drawable.a.r(this.f).mutate();
            this.f = mutate;
            if (this.i) {
                androidx.core.graphics.drawable.a.o(mutate, this.g);
            }
            if (this.j) {
                androidx.core.graphics.drawable.a.p(this.f, this.h);
            }
            if (this.f.isStateful()) {
                this.f.setState(getDrawableState());
            }
        }
    }

    private void d() {
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void e(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        super.onTouchEvent(obtain);
        obtain.recycle();
    }

    private static float f(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    private boolean g(float f2, float f3) {
        if (this.a == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.a.getPadding(this.P);
        int i2 = this.F;
        int i3 = this.v;
        int i4 = i2 - i3;
        int i5 = (this.E + thumbOffset) - i3;
        Rect rect = this.P;
        int i6 = this.D + i5 + rect.left + rect.right + i3;
        int i7 = this.H + i3;
        if (f2 <= ((float) i5) || f2 >= ((float) i6) || f3 <= ((float) i4) || f3 >= ((float) i7)) {
            return false;
        }
        return true;
    }

    private boolean getTargetCheckedState() {
        return this.A > 0.5f;
    }

    private int getThumbOffset() {
        float f2;
        if (d1.b(this)) {
            f2 = 1.0f - this.A;
        } else {
            f2 = this.A;
        }
        return (int) ((f2 * ((float) getThumbScrollRange())) + 0.5f);
    }

    private int getThumbScrollRange() {
        Rect rect;
        Drawable drawable = this.f;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.P;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            rect = e0.d(drawable2);
        } else {
            rect = e0.c;
        }
        return ((((this.B - this.D) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    private Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.M;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        TextPaint textPaint = this.I;
        return new StaticLayout(charSequence, textPaint, charSequence != null ? (int) Math.ceil((double) Layout.getDesiredWidth(charSequence, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    private void k(int i2, int i3) {
        Typeface typeface;
        if (i2 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i2 != 2) {
            typeface = i2 != 3 ? null : Typeface.MONOSPACE;
        } else {
            typeface = Typeface.SERIF;
        }
        j(typeface, i3);
    }

    private void l(MotionEvent motionEvent) {
        this.u = 0;
        boolean z2 = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean isChecked = isChecked();
        if (z3) {
            this.y.computeCurrentVelocity(C0188.f18);
            float xVelocity = this.y.getXVelocity();
            if (Math.abs(xVelocity) <= ((float) this.z)) {
                z2 = getTargetCheckedState();
            } else if (!d1.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                z2 = false;
            }
        } else {
            z2 = isChecked;
        }
        if (z2 != isChecked) {
            playSoundEffect(0);
        }
        setChecked(z2);
        e(motionEvent);
    }

    public void draw(Canvas canvas) {
        Rect rect;
        int i2;
        int i3;
        Rect rect2 = this.P;
        int i4 = this.E;
        int i5 = this.F;
        int i6 = this.G;
        int i7 = this.H;
        int thumbOffset = getThumbOffset() + i4;
        Drawable drawable = this.a;
        if (drawable != null) {
            rect = e0.d(drawable);
        } else {
            rect = e0.c;
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            int i8 = rect2.left;
            thumbOffset += i8;
            if (rect != null) {
                int i9 = rect.left;
                if (i9 > i8) {
                    i4 += i9 - i8;
                }
                int i10 = rect.top;
                int i11 = rect2.top;
                i2 = i10 > i11 ? (i10 - i11) + i5 : i5;
                int i12 = rect.right;
                int i13 = rect2.right;
                if (i12 > i13) {
                    i6 -= i12 - i13;
                }
                int i14 = rect.bottom;
                int i15 = rect2.bottom;
                if (i14 > i15) {
                    i3 = i7 - (i14 - i15);
                    this.f.setBounds(i4, i2, i6, i3);
                }
            } else {
                i2 = i5;
            }
            i3 = i7;
            this.f.setBounds(i4, i2, i6, i3);
        }
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i16 = thumbOffset - rect2.left;
            int i17 = thumbOffset + this.D + rect2.right;
            this.a.setBounds(i16, i5, i17, i7);
            Drawable background = getBackground();
            if (background != null) {
                androidx.core.graphics.drawable.a.l(background, i16, i5, i17, i7);
            }
        }
        super.draw(canvas);
    }

    public void drawableHotspotChanged(float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.drawableHotspotChanged(f2, f3);
        }
        Drawable drawable = this.a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f2, f3);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            androidx.core.graphics.drawable.a.k(drawable2, f2, f3);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.a;
        boolean z2 = false;
        if (drawable != null && drawable.isStateful()) {
            z2 = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null && drawable2.isStateful()) {
            z2 |= drawable2.setState(drawableState);
        }
        if (z2) {
            invalidate();
        }
    }

    public int getCompoundPaddingLeft() {
        if (!d1.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.m : compoundPaddingLeft;
    }

    public int getCompoundPaddingRight() {
        if (d1.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.B;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.m : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.q;
    }

    public boolean getSplitTrack() {
        return this.n;
    }

    public int getSwitchMinWidth() {
        return this.l;
    }

    public int getSwitchPadding() {
        return this.m;
    }

    public CharSequence getTextOff() {
        return this.p;
    }

    public CharSequence getTextOn() {
        return this.o;
    }

    public Drawable getThumbDrawable() {
        return this.a;
    }

    public int getThumbTextPadding() {
        return this.k;
    }

    public ColorStateList getThumbTintList() {
        return this.b;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.c;
    }

    public Drawable getTrackDrawable() {
        return this.f;
    }

    public ColorStateList getTrackTintList() {
        return this.g;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.h;
    }

    public void i(Context context, int i2) {
        x0 s = x0.s(context, i2, m.TextAppearance);
        ColorStateList c2 = s.c(m.TextAppearance_android_textColor);
        if (c2 != null) {
            this.J = c2;
        } else {
            this.J = getTextColors();
        }
        int f2 = s.f(m.TextAppearance_android_textSize, 0);
        if (f2 != 0) {
            float f3 = (float) f2;
            if (f3 != this.I.getTextSize()) {
                this.I.setTextSize(f3);
                requestLayout();
            }
        }
        k(s.k(m.TextAppearance_android_typeface, -1), s.k(m.TextAppearance_android_textStyle, -1));
        if (s.a(m.TextAppearance_textAllCaps, false)) {
            this.M = new u(getContext());
        } else {
            this.M = null;
        }
        s.v();
    }

    public void j(Typeface typeface, int i2) {
        Typeface typeface2;
        float f2 = 0.0f;
        boolean z2 = false;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setSwitchTypeface(typeface2);
            int style = ((typeface2 != null ? typeface2.getStyle() : 0) ^ -1) & i2;
            TextPaint textPaint = this.I;
            if ((style & 1) != 0) {
                z2 = true;
            }
            textPaint.setFakeBoldText(z2);
            TextPaint textPaint2 = this.I;
            if ((style & 2) != 0) {
                f2 = -0.25f;
            }
            textPaint2.setTextSkewX(f2);
            return;
        }
        this.I.setFakeBoldText(false);
        this.I.setTextSkewX(0.0f);
        setSwitchTypeface(typeface);
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.N;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.N.end();
            this.N = null;
        }
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        if (isChecked()) {
            CompoundButton.mergeDrawableStates(onCreateDrawableState, R);
        }
        return onCreateDrawableState;
    }

    public void onDraw(Canvas canvas) {
        int i2;
        super.onDraw(canvas);
        Rect rect = this.P;
        Drawable drawable = this.f;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i3 = this.F;
        int i4 = this.H;
        int i5 = i3 + rect.top;
        int i6 = i4 - rect.bottom;
        Drawable drawable2 = this.a;
        if (drawable != null) {
            if (!this.n || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect d2 = e0.d(drawable2);
                drawable2.copyBounds(rect);
                rect.left += d2.left;
                rect.right -= d2.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.K : this.L;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                this.I.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.I.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i2 = bounds.left + bounds.right;
            } else {
                i2 = getWidth();
            }
            canvas.translate((float) ((i2 / 2) - (layout.getWidth() / 2)), (float) (((i5 + i6) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0201.m82(30917));
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0201.m82(30918));
        CharSequence charSequence = isChecked() ? this.o : this.p;
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        super.onLayout(z2, i2, i3, i4, i5);
        int i12 = 0;
        if (this.a != null) {
            Rect rect = this.P;
            Drawable drawable = this.f;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect d2 = e0.d(this.a);
            i6 = Math.max(0, d2.left - rect.left);
            i12 = Math.max(0, d2.right - rect.right);
        } else {
            i6 = 0;
        }
        if (d1.b(this)) {
            i8 = getPaddingLeft() + i6;
            i7 = ((this.B + i8) - i6) - i12;
        } else {
            i7 = (getWidth() - getPaddingRight()) - i12;
            i8 = (i7 - this.B) + i6 + i12;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            i11 = this.C;
            i10 = (((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2) - (i11 / 2);
        } else if (gravity != 80) {
            i10 = getPaddingTop();
            i11 = this.C;
        } else {
            i9 = getHeight() - getPaddingBottom();
            i10 = i9 - this.C;
            this.E = i8;
            this.F = i10;
            this.H = i9;
            this.G = i7;
        }
        i9 = i11 + i10;
        this.E = i8;
        this.F = i10;
        this.H = i9;
        this.G = i7;
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        int i5;
        if (this.q) {
            if (this.K == null) {
                this.K = h(this.o);
            }
            if (this.L == null) {
                this.L = h(this.p);
            }
        }
        Rect rect = this.P;
        Drawable drawable = this.a;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i5 = (this.a.getIntrinsicWidth() - rect.left) - rect.right;
            i4 = this.a.getIntrinsicHeight();
        } else {
            i5 = 0;
            i4 = 0;
        }
        this.D = Math.max(this.q ? Math.max(this.K.getWidth(), this.L.getWidth()) + (this.k * 2) : 0, i5);
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i7 = rect.left;
        int i8 = rect.right;
        Drawable drawable3 = this.a;
        if (drawable3 != null) {
            Rect d2 = e0.d(drawable3);
            i7 = Math.max(i7, d2.left);
            i8 = Math.max(i8, d2.right);
        }
        int max = Math.max(this.l, (this.D * 2) + i7 + i8);
        int max2 = Math.max(i6, i4);
        this.B = max;
        this.C = max2;
        super.onMeasure(i2, i3);
        if (getMeasuredHeight() < max2) {
            setMeasuredDimension(getMeasuredWidthAndState(), max2);
        }
    }

    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.o : this.p;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r0 != 3) goto L_0x00b9;
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i2 = this.u;
                    if (i2 == 1) {
                        float x2 = motionEvent.getX();
                        float y2 = motionEvent.getY();
                        if (Math.abs(x2 - this.w) > ((float) this.v) || Math.abs(y2 - this.x) > ((float) this.v)) {
                            this.u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.w = x2;
                            this.x = y2;
                            return true;
                        }
                    } else if (i2 == 2) {
                        float x3 = motionEvent.getX();
                        int thumbScrollRange = getThumbScrollRange();
                        float f2 = x3 - this.w;
                        float f3 = thumbScrollRange != 0 ? f2 / ((float) thumbScrollRange) : f2 > 0.0f ? 1.0f : -1.0f;
                        if (d1.b(this)) {
                            f3 = -f3;
                        }
                        float f4 = f(this.A + f3, 0.0f, 1.0f);
                        if (f4 != this.A) {
                            this.w = x3;
                            setThumbPosition(f4);
                        }
                        return true;
                    }
                }
            }
            if (this.u == 2) {
                l(motionEvent);
                super.onTouchEvent(motionEvent);
                return true;
            }
            this.u = 0;
            this.y.clear();
        } else {
            float x4 = motionEvent.getX();
            float y3 = motionEvent.getY();
            if (isEnabled() && g(x4, y3)) {
                this.u = 1;
                this.w = x4;
                this.x = y3;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setChecked(boolean z2) {
        super.setChecked(z2);
        boolean isChecked = isChecked();
        if (getWindowToken() == null || !k3.O(this)) {
            d();
            setThumbPosition(isChecked ? 1.0f : 0.0f);
            return;
        }
        a(isChecked);
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(j.s(this, callback));
    }

    public void setShowText(boolean z2) {
        if (this.q != z2) {
            this.q = z2;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z2) {
        this.n = z2;
        invalidate();
    }

    public void setSwitchMinWidth(int i2) {
        this.l = i2;
        requestLayout();
    }

    public void setSwitchPadding(int i2) {
        this.m = i2;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.I.getTypeface() != null && !this.I.getTypeface().equals(typeface)) || (this.I.getTypeface() == null && typeface != null)) {
            this.I.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }

    public void setTextOff(CharSequence charSequence) {
        this.p = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.o = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f2) {
        this.A = f2;
        invalidate();
    }

    public void setThumbResource(int i2) {
        setThumbDrawable(n.d(getContext(), i2));
    }

    public void setThumbTextPadding(int i2) {
        this.k = i2;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.b = colorStateList;
        this.d = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.c = mode;
        this.e = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i2) {
        setTrackDrawable(n.d(getContext(), i2));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        this.i = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        this.j = true;
        c();
    }

    public void toggle() {
        setChecked(!isChecked());
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.a || drawable == this.f;
    }

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.switchStyle);
    }

    public r0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.b = null;
        this.c = null;
        this.d = false;
        this.e = false;
        this.g = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.y = VelocityTracker.obtain();
        this.P = new Rect();
        this.I = new TextPaint(1);
        Resources resources = getResources();
        this.I.density = resources.getDisplayMetrics().density;
        x0 u2 = x0.u(context, attributeSet, m.SwitchCompat, i2, 0);
        Drawable g2 = u2.g(m.SwitchCompat_android_thumb);
        this.a = g2;
        if (g2 != null) {
            g2.setCallback(this);
        }
        Drawable g3 = u2.g(m.SwitchCompat_track);
        this.f = g3;
        if (g3 != null) {
            g3.setCallback(this);
        }
        this.o = u2.p(m.SwitchCompat_android_textOn);
        this.p = u2.p(m.SwitchCompat_android_textOff);
        this.q = u2.a(m.SwitchCompat_showText, true);
        this.k = u2.f(m.SwitchCompat_thumbTextPadding, 0);
        this.l = u2.f(m.SwitchCompat_switchMinWidth, 0);
        this.m = u2.f(m.SwitchCompat_switchPadding, 0);
        this.n = u2.a(m.SwitchCompat_splitTrack, false);
        ColorStateList c2 = u2.c(m.SwitchCompat_thumbTint);
        if (c2 != null) {
            this.b = c2;
            this.d = true;
        }
        PorterDuff.Mode e2 = e0.e(u2.k(m.SwitchCompat_thumbTintMode, -1), null);
        if (this.c != e2) {
            this.c = e2;
            this.e = true;
        }
        if (this.d || this.e) {
            b();
        }
        ColorStateList c3 = u2.c(m.SwitchCompat_trackTint);
        if (c3 != null) {
            this.g = c3;
            this.i = true;
        }
        PorterDuff.Mode e3 = e0.e(u2.k(m.SwitchCompat_trackTintMode, -1), null);
        if (this.h != e3) {
            this.h = e3;
            this.j = true;
        }
        if (this.i || this.j) {
            c();
        }
        int n2 = u2.n(m.SwitchCompat_switchTextAppearance, 0);
        if (n2 != 0) {
            i(context, n2);
        }
        y yVar = new y(this);
        this.O = yVar;
        yVar.m(attributeSet, i2);
        u2.v();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.v = viewConfiguration.getScaledTouchSlop();
        this.z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
