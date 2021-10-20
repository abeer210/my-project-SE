package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import vigqyno.C0201;

/* renamed from: mw1  reason: default package */
/* compiled from: MaterialCardView */
public class mw1 extends j0 implements Checkable, yx1 {
    private static final int[] k = {16842911};
    private static final int[] l = {16842912};
    private static final int[] m = {nv1.state_dragged};
    private final nw1 f;
    private boolean g;
    private boolean h;
    private boolean i;
    private a j;

    /* renamed from: mw1$a */
    /* compiled from: MaterialCardView */
    public interface a {
        void a(mw1 mw1, boolean z);
    }

    private void d() {
        if (Build.VERSION.SDK_INT > 26) {
            this.f.a();
            throw null;
        }
    }

    public boolean e() {
        nw1 nw1 = this.f;
        if (nw1 == null) {
            return false;
        }
        nw1.o();
        throw null;
    }

    public boolean f() {
        return this.i;
    }

    @Override // defpackage.j0
    public ColorStateList getCardBackgroundColor() {
        this.f.c();
        throw null;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        this.f.d();
        throw null;
    }

    public ColorStateList getCheckedIconTint() {
        this.f.e();
        throw null;
    }

    @Override // defpackage.j0
    public int getContentPaddingBottom() {
        this.f.m();
        throw null;
    }

    @Override // defpackage.j0
    public int getContentPaddingLeft() {
        this.f.m();
        throw null;
    }

    @Override // defpackage.j0
    public int getContentPaddingRight() {
        this.f.m();
        throw null;
    }

    @Override // defpackage.j0
    public int getContentPaddingTop() {
        this.f.m();
        throw null;
    }

    public float getProgress() {
        this.f.g();
        throw null;
    }

    @Override // defpackage.j0
    public float getRadius() {
        this.f.f();
        throw null;
    }

    public ColorStateList getRippleColor() {
        this.f.h();
        throw null;
    }

    public vx1 getShapeAppearanceModel() {
        this.f.i();
        throw null;
    }

    @Deprecated
    public int getStrokeColor() {
        this.f.j();
        throw null;
    }

    public ColorStateList getStrokeColorStateList() {
        this.f.k();
        throw null;
    }

    public int getStrokeWidth() {
        this.f.l();
        throw null;
    }

    public boolean isChecked() {
        return this.h;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f.b();
        throw null;
    }

    public int[] onCreateDrawableState(int i2) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i2 + 3);
        if (e()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, k);
        }
        if (isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (f()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, m);
        }
        return onCreateDrawableState;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0201.m82(9915));
        accessibilityEvent.setChecked(isChecked());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0201.m82(9916));
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // defpackage.j0
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.f.p(getMeasuredWidth(), getMeasuredHeight());
        throw null;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundDrawable(Drawable drawable) {
        if (this.g) {
            this.f.n();
            throw null;
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.j0
    public void setCardBackgroundColor(int i2) {
        this.f.q(ColorStateList.valueOf(i2));
        throw null;
    }

    @Override // defpackage.j0
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        this.f.B();
        throw null;
    }

    public void setCheckable(boolean z) {
        this.f.r(z);
        throw null;
    }

    public void setChecked(boolean z) {
        if (this.h != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f.s(drawable);
        throw null;
    }

    public void setCheckedIconResource(int i2) {
        this.f.s(n.d(getContext(), i2));
        throw null;
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.f.t(colorStateList);
        throw null;
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.f.A();
        throw null;
    }

    public void setDragged(boolean z) {
        if (this.i != z) {
            this.i = z;
            refreshDrawableState();
            d();
            invalidate();
        }
    }

    @Override // defpackage.j0
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f.C();
        throw null;
    }

    public void setOnCheckedChangeListener(a aVar) {
        this.j = aVar;
    }

    @Override // defpackage.j0
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.f.C();
        throw null;
    }

    public void setProgress(float f2) {
        this.f.v(f2);
        throw null;
    }

    @Override // defpackage.j0
    public void setRadius(float f2) {
        super.setRadius(f2);
        this.f.u(f2);
        throw null;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.f.w(colorStateList);
        throw null;
    }

    public void setRippleColorResource(int i2) {
        this.f.w(n.c(getContext(), i2));
        throw null;
    }

    @Override // defpackage.yx1
    public void setShapeAppearanceModel(vx1 vx1) {
        this.f.x(vx1);
        throw null;
    }

    public void setStrokeColor(int i2) {
        this.f.y(ColorStateList.valueOf(i2));
        throw null;
    }

    public void setStrokeWidth(int i2) {
        this.f.z(i2);
        throw null;
    }

    @Override // defpackage.j0
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.f.C();
        throw null;
    }

    public void toggle() {
        if (e() && isEnabled()) {
            this.h = !this.h;
            refreshDrawableState();
            d();
            a aVar = this.j;
            if (aVar != null) {
                aVar.a(this, this.h);
            }
        }
    }

    @Override // defpackage.j0
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f.q(colorStateList);
        throw null;
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f.y(colorStateList);
        throw null;
    }
}
