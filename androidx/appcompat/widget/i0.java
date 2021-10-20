package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: LinearLayoutCompat */
public class i0 extends ViewGroup {
    private boolean a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private float g;
    private boolean h;
    private int[] i;
    private int[] j;
    private Drawable k;
    private int l;
    private int m;
    private int n;
    private int o;

    public i0(Context context) {
        this(context, null);
    }

    private void A(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    private void k(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).width;
                    ((ViewGroup.MarginLayoutParams) aVar).width = s.getMeasuredWidth();
                    measureChildWithMargins(s, i3, 0, makeMeasureSpec, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).width = i5;
                }
            }
        }
    }

    private void l(int i2, int i3) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View s = s(i4);
            if (s.getVisibility() != 8) {
                a aVar = (a) s.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) aVar).width == -1) {
                    int i5 = ((ViewGroup.MarginLayoutParams) aVar).height;
                    ((ViewGroup.MarginLayoutParams) aVar).height = s.getMeasuredHeight();
                    measureChildWithMargins(s, makeMeasureSpec, 0, i3, 0);
                    ((ViewGroup.MarginLayoutParams) aVar).height = i5;
                }
            }
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void g(Canvas canvas) {
        int i2;
        int i3;
        int i4;
        int i5;
        int virtualChildCount = getVirtualChildCount();
        boolean b2 = d1.b(this);
        for (int i6 = 0; i6 < virtualChildCount; i6++) {
            View s = s(i6);
            if (!(s == null || s.getVisibility() == 8 || !t(i6))) {
                a aVar = (a) s.getLayoutParams();
                if (b2) {
                    i5 = s.getRight() + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else {
                    i5 = (s.getLeft() - ((ViewGroup.MarginLayoutParams) aVar).leftMargin) - this.l;
                }
                j(canvas, i5);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 != null) {
                a aVar2 = (a) s2.getLayoutParams();
                if (b2) {
                    i4 = s2.getLeft() - ((ViewGroup.MarginLayoutParams) aVar2).leftMargin;
                    i3 = this.l;
                } else {
                    i2 = s2.getRight() + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin;
                    j(canvas, i2);
                }
            } else if (b2) {
                i2 = getPaddingLeft();
                j(canvas, i2);
            } else {
                i4 = getWidth() - getPaddingRight();
                i3 = this.l;
            }
            i2 = i4 - i3;
            j(canvas, i2);
        }
    }

    public int getBaseline() {
        int i2;
        if (this.b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.b;
        if (childCount > i3) {
            View childAt = getChildAt(i3);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i4 = this.c;
                if (this.d == 1 && (i2 = this.e & 112) != 48) {
                    if (i2 == 16) {
                        i4 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f) / 2;
                    } else if (i2 == 80) {
                        i4 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f;
                    }
                }
                return i4 + ((ViewGroup.MarginLayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
            } else if (this.b == 0) {
                return -1;
            } else {
                throw new RuntimeException(C0201.m82(10277));
            }
        } else {
            throw new RuntimeException(C0201.m82(10278));
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.b;
    }

    public Drawable getDividerDrawable() {
        return this.k;
    }

    public int getDividerPadding() {
        return this.o;
    }

    public int getDividerWidth() {
        return this.l;
    }

    public int getGravity() {
        return this.e;
    }

    public int getOrientation() {
        return this.d;
    }

    public int getShowDividers() {
        return this.n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.g;
    }

    public void h(Canvas canvas) {
        int i2;
        int virtualChildCount = getVirtualChildCount();
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View s = s(i3);
            if (!(s == null || s.getVisibility() == 8 || !t(i3))) {
                i(canvas, (s.getTop() - ((ViewGroup.MarginLayoutParams) ((a) s.getLayoutParams())).topMargin) - this.m);
            }
        }
        if (t(virtualChildCount)) {
            View s2 = s(virtualChildCount - 1);
            if (s2 == null) {
                i2 = (getHeight() - getPaddingBottom()) - this.m;
            } else {
                i2 = s2.getBottom() + ((ViewGroup.MarginLayoutParams) ((a) s2.getLayoutParams())).bottomMargin;
            }
            i(canvas, i2);
        }
    }

    public void i(Canvas canvas, int i2) {
        this.k.setBounds(getPaddingLeft() + this.o, i2, (getWidth() - getPaddingRight()) - this.o, this.m + i2);
        this.k.draw(canvas);
    }

    public void j(Canvas canvas, int i2) {
        this.k.setBounds(i2, getPaddingTop() + this.o, this.l + i2, (getHeight() - getPaddingBottom()) - this.o);
        this.k.draw(canvas);
    }

    /* renamed from: m */
    public a generateDefaultLayoutParams() {
        int i2 = this.d;
        if (i2 == 0) {
            return new a(-2, -2);
        }
        if (i2 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    /* renamed from: n */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    /* renamed from: o */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new a(layoutParams);
    }

    public void onDraw(Canvas canvas) {
        if (this.k != null) {
            if (this.d == 1) {
                h(canvas);
            } else {
                g(canvas);
            }
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(C0201.m82(10279));
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C0201.m82(10280));
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (this.d == 1) {
            v(i2, i3, i4, i5);
        } else {
            u(i2, i3, i4, i5);
        }
    }

    public void onMeasure(int i2, int i3) {
        if (this.d == 1) {
            z(i2, i3);
        } else {
            x(i2, i3);
        }
    }

    public int p(View view, int i2) {
        return 0;
    }

    public int q(View view) {
        return 0;
    }

    public int r(View view) {
        return 0;
    }

    public View s(int i2) {
        return getChildAt(i2);
    }

    public void setBaselineAligned(boolean z) {
        this.a = z;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 < 0 || i2 >= getChildCount()) {
            throw new IllegalArgumentException(C0201.m82(10281) + getChildCount() + C0201.m82(10282));
        }
        this.b = i2;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.k) {
            this.k = drawable;
            boolean z = false;
            if (drawable != null) {
                this.l = drawable.getIntrinsicWidth();
                this.m = drawable.getIntrinsicHeight();
            } else {
                this.l = 0;
                this.m = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i2) {
        this.o = i2;
    }

    public void setGravity(int i2) {
        if (this.e != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= 8388611;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.e = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & 8388615;
        int i4 = this.e;
        if ((8388615 & i4) != i3) {
            this.e = i3 | (-8388616 & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.h = z;
    }

    public void setOrientation(int i2) {
        if (this.d != i2) {
            this.d = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.n) {
            requestLayout();
        }
        this.n = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.e;
        if ((i4 & 112) != i3) {
            this.e = i3 | (i4 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.g = Math.max(0.0f, f2);
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public boolean t(int i2) {
        if (i2 == 0) {
            return (this.n & 1) != 0;
        }
        if (i2 == getChildCount()) {
            if ((this.n & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.n & 2) == 0) {
            return false;
        } else {
            for (int i3 = i2 - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f7  */
    public void u(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean b2 = d1.b(this);
        int paddingTop = getPaddingTop();
        int i16 = i5 - i3;
        int paddingBottom = i16 - getPaddingBottom();
        int paddingBottom2 = (i16 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i17 = this.e;
        int i18 = i17 & 112;
        boolean z = this.a;
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        int b3 = u2.b(8388615 & i17, k3.w(this));
        if (b3 == 1) {
            i6 = getPaddingLeft() + (((i4 - i2) - this.f) / 2);
        } else if (b3 != 5) {
            i6 = getPaddingLeft();
        } else {
            i6 = ((getPaddingLeft() + i4) - i2) - this.f;
        }
        if (b2) {
            i8 = virtualChildCount - 1;
            i7 = -1;
        } else {
            i8 = 0;
            i7 = 1;
        }
        int i19 = 0;
        while (i19 < virtualChildCount) {
            int i20 = i8 + (i7 * i19);
            View s = s(i20);
            if (s == null) {
                i6 += y(i20);
            } else if (s.getVisibility() != 8) {
                int measuredWidth = s.getMeasuredWidth();
                int measuredHeight = s.getMeasuredHeight();
                a aVar = (a) s.getLayoutParams();
                if (z) {
                    i11 = virtualChildCount;
                    if (((ViewGroup.MarginLayoutParams) aVar).height != -1) {
                        i12 = s.getBaseline();
                        i13 = aVar.b;
                        if (i13 < 0) {
                            i13 = i18;
                        }
                        i14 = i13 & 112;
                        i10 = i18;
                        if (i14 != 16) {
                            i15 = ((((paddingBottom2 - measuredHeight) / 2) + paddingTop) + ((ViewGroup.MarginLayoutParams) aVar).topMargin) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        } else if (i14 == 48) {
                            i15 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + paddingTop;
                            if (i12 != -1) {
                                i15 += iArr[1] - i12;
                            }
                        } else if (i14 != 80) {
                            i15 = paddingTop;
                        } else {
                            i15 = (paddingBottom - measuredHeight) - ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                            if (i12 != -1) {
                                i15 -= iArr2[2] - (s.getMeasuredHeight() - i12);
                            }
                        }
                        if (t(i20)) {
                            i6 += this.l;
                        }
                        int i21 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i6;
                        i9 = paddingTop;
                        A(s, i21 + q(s), i15, measuredWidth, measuredHeight);
                        i19 += p(s, i20);
                        i6 = i21 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + r(s);
                        i19++;
                        virtualChildCount = i11;
                        i18 = i10;
                        paddingTop = i9;
                    }
                } else {
                    i11 = virtualChildCount;
                }
                i12 = -1;
                i13 = aVar.b;
                if (i13 < 0) {
                }
                i14 = i13 & 112;
                i10 = i18;
                if (i14 != 16) {
                }
                if (t(i20)) {
                }
                int i212 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i6;
                i9 = paddingTop;
                A(s, i212 + q(s), i15, measuredWidth, measuredHeight);
                i19 += p(s, i20);
                i6 = i212 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + r(s);
                i19++;
                virtualChildCount = i11;
                i18 = i10;
                paddingTop = i9;
            }
            i9 = paddingTop;
            i11 = virtualChildCount;
            i10 = i18;
            i19++;
            virtualChildCount = i11;
            i18 = i10;
            paddingTop = i9;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009f  */
    public void v(int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8;
        int i9;
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int paddingRight = i10 - getPaddingRight();
        int paddingRight2 = (i10 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i11 = this.e;
        int i12 = i11 & 112;
        int i13 = i11 & 8388615;
        if (i12 == 16) {
            i6 = getPaddingTop() + (((i5 - i3) - this.f) / 2);
        } else if (i12 != 80) {
            i6 = getPaddingTop();
        } else {
            i6 = ((getPaddingTop() + i5) - i3) - this.f;
        }
        int i14 = 0;
        while (i14 < virtualChildCount) {
            View s = s(i14);
            if (s == null) {
                i6 += y(i14);
            } else if (s.getVisibility() != 8) {
                int measuredWidth = s.getMeasuredWidth();
                int measuredHeight = s.getMeasuredHeight();
                a aVar = (a) s.getLayoutParams();
                int i15 = aVar.b;
                if (i15 < 0) {
                    i15 = i13;
                }
                int b2 = u2.b(i15, k3.w(this)) & 7;
                if (b2 == 1) {
                    i9 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
                    i8 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                } else if (b2 != 5) {
                    i7 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + paddingLeft;
                    if (t(i14)) {
                        i6 += this.m;
                    }
                    int i16 = i6 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                    A(s, i7, i16 + q(s), measuredWidth, measuredHeight);
                    i14 += p(s, i14);
                    i6 = i16 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + r(s);
                } else {
                    i9 = paddingRight - measuredWidth;
                    i8 = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                }
                i7 = i9 - i8;
                if (t(i14)) {
                }
                int i162 = i6 + ((ViewGroup.MarginLayoutParams) aVar).topMargin;
                A(s, i7, i162 + q(s), measuredWidth, measuredHeight);
                i14 += p(s, i14);
                i6 = i162 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + r(s);
            }
            i14++;
        }
    }

    public void w(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:186:0x044f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0197  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d6  */
    public void x(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f2;
        int i13;
        boolean z;
        int baseline;
        int i14;
        int i15;
        int i16;
        boolean z2;
        boolean z3;
        int i17;
        int i18;
        View view;
        int i19;
        boolean z4;
        int measuredHeight;
        int baseline2;
        int i20;
        int i21;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        if (this.i == null || this.j == null) {
            this.i = new int[4];
            this.j = new int[4];
        }
        int[] iArr = this.i;
        int[] iArr2 = this.j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z5 = this.a;
        boolean z6 = this.h;
        int i22 = 1073741824;
        boolean z7 = mode == 1073741824;
        float f3 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        boolean z8 = false;
        int i28 = 0;
        boolean z9 = true;
        boolean z10 = false;
        while (i23 < virtualChildCount) {
            View s = s(i23);
            if (s == null) {
                this.f += y(i23);
            } else if (s.getVisibility() == 8) {
                i23 += p(s, i23);
            } else {
                if (t(i23)) {
                    this.f += this.l;
                }
                a aVar = (a) s.getLayoutParams();
                float f4 = aVar.a;
                float f5 = f3 + f4;
                if (mode == i22 && ((ViewGroup.MarginLayoutParams) aVar).width == 0 && f4 > 0.0f) {
                    if (z7) {
                        this.f += ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                    } else {
                        int i29 = this.f;
                        this.f = Math.max(i29, ((ViewGroup.MarginLayoutParams) aVar).leftMargin + i29 + ((ViewGroup.MarginLayoutParams) aVar).rightMargin);
                    }
                    if (z5) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        s.measure(makeMeasureSpec, makeMeasureSpec);
                        i18 = i23;
                        z3 = z6;
                        z2 = z5;
                        view = s;
                    } else {
                        i18 = i23;
                        z3 = z6;
                        z2 = z5;
                        view = s;
                        i19 = 1073741824;
                        z8 = true;
                        if (mode2 == i19 && ((ViewGroup.MarginLayoutParams) aVar).height == -1) {
                            z4 = true;
                            z10 = true;
                        } else {
                            z4 = false;
                        }
                        int i30 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                        measuredHeight = view.getMeasuredHeight() + i30;
                        i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                        if (z2 && (baseline2 = view.getBaseline()) != -1) {
                            i20 = aVar.b;
                            if (i20 < 0) {
                                i20 = this.e;
                            }
                            int i31 = (((i20 & 112) >> 4) & -2) >> 1;
                            iArr[i31] = Math.max(iArr[i31], baseline2);
                            iArr2[i31] = Math.max(iArr2[i31], measuredHeight - baseline2);
                        }
                        i25 = Math.max(i25, measuredHeight);
                        z9 = !z9 && ((ViewGroup.MarginLayoutParams) aVar).height == -1;
                        if (aVar.a <= 0.0f) {
                            if (!z4) {
                                i30 = measuredHeight;
                            }
                            i27 = Math.max(i27, i30);
                        } else {
                            if (!z4) {
                                i30 = measuredHeight;
                            }
                            i26 = Math.max(i26, i30);
                            i27 = i27;
                        }
                        i17 = p(view, i18) + i18;
                        f3 = f5;
                        i23 = i17 + 1;
                        iArr2 = iArr2;
                        z6 = z3;
                        z5 = z2;
                        i22 = 1073741824;
                    }
                } else {
                    if (((ViewGroup.MarginLayoutParams) aVar).width != 0 || aVar.a <= 0.0f) {
                        i21 = C0188.f23;
                    } else {
                        ((ViewGroup.MarginLayoutParams) aVar).width = -2;
                        i21 = 0;
                    }
                    i18 = i23;
                    z3 = z6;
                    z2 = z5;
                    w(s, i18, i2, f5 == 0.0f ? this.f : 0, i3, 0);
                    if (i21 != Integer.MIN_VALUE) {
                        ((ViewGroup.MarginLayoutParams) aVar).width = i21;
                    }
                    int measuredWidth = s.getMeasuredWidth();
                    if (z7) {
                        view = s;
                        this.f += ((ViewGroup.MarginLayoutParams) aVar).leftMargin + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + r(view);
                    } else {
                        view = s;
                        int i32 = this.f;
                        this.f = Math.max(i32, i32 + measuredWidth + ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin + r(view));
                    }
                    if (z3) {
                        i24 = Math.max(measuredWidth, i24);
                    }
                }
                i19 = 1073741824;
                if (mode2 == i19) {
                }
                z4 = false;
                int i302 = ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
                measuredHeight = view.getMeasuredHeight() + i302;
                i28 = View.combineMeasuredStates(i28, view.getMeasuredState());
                i20 = aVar.b;
                if (i20 < 0) {
                }
                int i312 = (((i20 & 112) >> 4) & -2) >> 1;
                iArr[i312] = Math.max(iArr[i312], baseline2);
                iArr2[i312] = Math.max(iArr2[i312], measuredHeight - baseline2);
                i25 = Math.max(i25, measuredHeight);
                if (!z9) {
                }
                if (aVar.a <= 0.0f) {
                }
                i17 = p(view, i18) + i18;
                f3 = f5;
                i23 = i17 + 1;
                iArr2 = iArr2;
                z6 = z3;
                z5 = z2;
                i22 = 1073741824;
            }
            i17 = i23;
            z3 = z6;
            z2 = z5;
            i23 = i17 + 1;
            iArr2 = iArr2;
            z6 = z3;
            z5 = z2;
            i22 = 1073741824;
        }
        if (this.f > 0 && t(virtualChildCount)) {
            this.f += this.l;
        }
        if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
            i5 = i25;
            i4 = i28;
        } else {
            i4 = i28;
            i5 = Math.max(i25, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
        }
        if (z6 && (mode == Integer.MIN_VALUE || mode == 0)) {
            this.f = 0;
            int i33 = 0;
            while (i33 < virtualChildCount) {
                View s2 = s(i33);
                if (s2 == null) {
                    this.f += y(i33);
                } else if (s2.getVisibility() == 8) {
                    i33 += p(s2, i33);
                } else {
                    a aVar2 = (a) s2.getLayoutParams();
                    if (z7) {
                        this.f += ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + i24 + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + r(s2);
                    } else {
                        int i34 = this.f;
                        i16 = i5;
                        this.f = Math.max(i34, i34 + i24 + ((ViewGroup.MarginLayoutParams) aVar2).leftMargin + ((ViewGroup.MarginLayoutParams) aVar2).rightMargin + r(s2));
                        i33++;
                        i5 = i16;
                    }
                }
                i16 = i5;
                i33++;
                i5 = i16;
            }
        }
        int paddingLeft = this.f + getPaddingLeft() + getPaddingRight();
        this.f = paddingLeft;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i2, 0);
        int i35 = (16777215 & resolveSizeAndState) - this.f;
        if (z8 || (i35 != 0 && f3 > 0.0f)) {
            float f6 = this.g;
            if (f6 > 0.0f) {
                f3 = f6;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f = 0;
            int i36 = i26;
            int i37 = i4;
            int i38 = -1;
            int i39 = 0;
            while (i39 < virtualChildCount) {
                View s3 = s(i39);
                if (s3 == null || s3.getVisibility() == 8) {
                    i12 = i35;
                    i11 = virtualChildCount;
                } else {
                    a aVar3 = (a) s3.getLayoutParams();
                    float f7 = aVar3.a;
                    if (f7 > 0.0f) {
                        int i40 = (int) ((((float) i35) * f7) / f3);
                        float f8 = f3 - f7;
                        int i41 = i35 - i40;
                        i11 = virtualChildCount;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin, ((ViewGroup.MarginLayoutParams) aVar3).height);
                        if (((ViewGroup.MarginLayoutParams) aVar3).width == 0) {
                            i15 = 1073741824;
                            if (mode == 1073741824) {
                                if (i40 <= 0) {
                                    i40 = 0;
                                }
                                s3.measure(View.MeasureSpec.makeMeasureSpec(i40, 1073741824), childMeasureSpec);
                                i37 = View.combineMeasuredStates(i37, s3.getMeasuredState() & -16777216);
                                f3 = f8;
                                i12 = i41;
                            }
                        } else {
                            i15 = 1073741824;
                        }
                        int measuredWidth2 = s3.getMeasuredWidth() + i40;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        s3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i15), childMeasureSpec);
                        i37 = View.combineMeasuredStates(i37, s3.getMeasuredState() & -16777216);
                        f3 = f8;
                        i12 = i41;
                    } else {
                        i12 = i35;
                        i11 = virtualChildCount;
                    }
                    if (z7) {
                        this.f += s3.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + r(s3);
                        f2 = f3;
                    } else {
                        int i42 = this.f;
                        f2 = f3;
                        this.f = Math.max(i42, s3.getMeasuredWidth() + i42 + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin + r(s3));
                    }
                    boolean z11 = mode2 != 1073741824 && ((ViewGroup.MarginLayoutParams) aVar3).height == -1;
                    int i43 = ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = s3.getMeasuredHeight() + i43;
                    i38 = Math.max(i38, measuredHeight2);
                    if (!z11) {
                        i43 = measuredHeight2;
                    }
                    int max = Math.max(i36, i43);
                    if (z9) {
                        i13 = -1;
                        if (((ViewGroup.MarginLayoutParams) aVar3).height == -1) {
                            z = true;
                            if (z5 && (baseline = s3.getBaseline()) != i13) {
                                i14 = aVar3.b;
                                if (i14 < 0) {
                                    i14 = this.e;
                                }
                                int i44 = (((i14 & 112) >> 4) & -2) >> 1;
                                iArr[i44] = Math.max(iArr[i44], baseline);
                                iArr2[i44] = Math.max(iArr2[i44], measuredHeight2 - baseline);
                            }
                            z9 = z;
                            i36 = max;
                            f3 = f2;
                        }
                    } else {
                        i13 = -1;
                    }
                    z = false;
                    i14 = aVar3.b;
                    if (i14 < 0) {
                    }
                    int i442 = (((i14 & 112) >> 4) & -2) >> 1;
                    iArr[i442] = Math.max(iArr[i442], baseline);
                    iArr2[i442] = Math.max(iArr2[i442], measuredHeight2 - baseline);
                    z9 = z;
                    i36 = max;
                    f3 = f2;
                }
                i39++;
                i35 = i12;
                virtualChildCount = i11;
            }
            i8 = i3;
            i6 = virtualChildCount;
            this.f += getPaddingLeft() + getPaddingRight();
            if (iArr[1] == -1 && iArr[0] == -1 && iArr[2] == -1 && iArr[3] == -1) {
                i10 = i38;
            } else {
                i10 = Math.max(i38, Math.max(iArr[3], Math.max(iArr[0], Math.max(iArr[1], iArr[2]))) + Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))));
            }
            i7 = i10;
            i9 = i36;
            i4 = i37;
        } else {
            i9 = Math.max(i26, i27);
            if (z6 && mode != 1073741824) {
                for (int i45 = 0; i45 < virtualChildCount; i45++) {
                    View s4 = s(i45);
                    if (!(s4 == null || s4.getVisibility() == 8 || ((a) s4.getLayoutParams()).a <= 0.0f)) {
                        s4.measure(View.MeasureSpec.makeMeasureSpec(i24, 1073741824), View.MeasureSpec.makeMeasureSpec(s4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i8 = i3;
            i6 = virtualChildCount;
            i7 = i5;
        }
        if (z9 || mode2 == 1073741824) {
            i9 = i7;
        }
        setMeasuredDimension(resolveSizeAndState | (i4 & -16777216), View.resolveSizeAndState(Math.max(i9 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, i4 << 16));
        if (z10) {
            k(i6, i2);
        }
    }

    public int y(int i2) {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:140:0x032a  */
    public void z(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        View view;
        int i19;
        boolean z2;
        int i20;
        int i21;
        this.f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int i22 = this.b;
        boolean z3 = this.h;
        float f2 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        boolean z4 = false;
        boolean z5 = true;
        boolean z6 = false;
        while (true) {
            int i29 = 8;
            if (i28 < virtualChildCount) {
                View s = s(i28);
                if (s == null) {
                    this.f += y(i28);
                    i12 = virtualChildCount;
                    i13 = mode2;
                    i26 = i26;
                } else if (s.getVisibility() == 8) {
                    i28 += p(s, i28);
                    i12 = virtualChildCount;
                    i26 = i26;
                    i23 = i23;
                    i13 = mode2;
                } else {
                    if (t(i28)) {
                        this.f += this.m;
                    }
                    a aVar = (a) s.getLayoutParams();
                    float f3 = aVar.a;
                    float f4 = f2 + f3;
                    if (mode2 == 1073741824 && ((ViewGroup.MarginLayoutParams) aVar).height == 0 && f3 > 0.0f) {
                        int i30 = this.f;
                        this.f = Math.max(i30, ((ViewGroup.MarginLayoutParams) aVar).topMargin + i30 + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin);
                        i19 = i25;
                        view = s;
                        i14 = i27;
                        i18 = i23;
                        i15 = i24;
                        z4 = true;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i16 = i26;
                        i17 = i28;
                    } else {
                        if (((ViewGroup.MarginLayoutParams) aVar).height != 0 || aVar.a <= 0.0f) {
                            i21 = C0188.f23;
                        } else {
                            ((ViewGroup.MarginLayoutParams) aVar).height = -2;
                            i21 = 0;
                        }
                        i18 = i23;
                        i15 = i24;
                        i12 = virtualChildCount;
                        i13 = mode2;
                        i16 = i26;
                        i14 = i27;
                        i17 = i28;
                        w(s, i28, i2, 0, i3, f4 == 0.0f ? this.f : 0);
                        if (i21 != Integer.MIN_VALUE) {
                            ((ViewGroup.MarginLayoutParams) aVar).height = i21;
                        }
                        int measuredHeight = s.getMeasuredHeight();
                        int i31 = this.f;
                        view = s;
                        this.f = Math.max(i31, i31 + measuredHeight + ((ViewGroup.MarginLayoutParams) aVar).topMargin + ((ViewGroup.MarginLayoutParams) aVar).bottomMargin + r(view));
                        i19 = z3 ? Math.max(measuredHeight, i25) : i25;
                    }
                    if (i22 >= 0 && i22 == i17 + 1) {
                        this.c = this.f;
                    }
                    if (i17 >= i22 || aVar.a <= 0.0f) {
                        if (mode == 1073741824 || ((ViewGroup.MarginLayoutParams) aVar).width != -1) {
                            z2 = false;
                        } else {
                            z2 = true;
                            z6 = true;
                        }
                        int i32 = ((ViewGroup.MarginLayoutParams) aVar).leftMargin + ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
                        int measuredWidth = view.getMeasuredWidth() + i32;
                        int max = Math.max(i15, measuredWidth);
                        int combineMeasuredStates = View.combineMeasuredStates(i18, view.getMeasuredState());
                        z5 = z5 && ((ViewGroup.MarginLayoutParams) aVar).width == -1;
                        if (aVar.a > 0.0f) {
                            if (!z2) {
                                i32 = measuredWidth;
                            }
                            i26 = Math.max(i16, i32);
                            i20 = i14;
                        } else {
                            if (!z2) {
                                i32 = measuredWidth;
                            }
                            i20 = Math.max(i14, i32);
                            i26 = i16;
                        }
                        i25 = i19;
                        f2 = f4;
                        i27 = i20;
                        i23 = combineMeasuredStates;
                        i28 = p(view, i17) + i17;
                        i24 = max;
                    } else {
                        throw new RuntimeException(C0201.m82(10283));
                    }
                }
                i28++;
                mode2 = i13;
                virtualChildCount = i12;
            } else {
                int i33 = i24;
                if (this.f > 0) {
                    i4 = virtualChildCount;
                    if (t(i4)) {
                        this.f += this.m;
                    }
                } else {
                    i4 = virtualChildCount;
                }
                if (z3 && (mode2 == Integer.MIN_VALUE || mode2 == 0)) {
                    this.f = 0;
                    int i34 = 0;
                    while (i34 < i4) {
                        View s2 = s(i34);
                        if (s2 == null) {
                            this.f += y(i34);
                        } else if (s2.getVisibility() == i29) {
                            i34 += p(s2, i34);
                        } else {
                            a aVar2 = (a) s2.getLayoutParams();
                            int i35 = this.f;
                            this.f = Math.max(i35, i35 + i25 + ((ViewGroup.MarginLayoutParams) aVar2).topMargin + ((ViewGroup.MarginLayoutParams) aVar2).bottomMargin + r(s2));
                        }
                        i34++;
                        i29 = 8;
                    }
                }
                int paddingTop = this.f + getPaddingTop() + getPaddingBottom();
                this.f = paddingTop;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i3, 0);
                int i36 = (16777215 & resolveSizeAndState) - this.f;
                if (z4 || (i36 != 0 && f2 > 0.0f)) {
                    float f5 = this.g;
                    if (f5 > 0.0f) {
                        f2 = f5;
                    }
                    this.f = 0;
                    int i37 = i36;
                    int i38 = i27;
                    i6 = i23;
                    int i39 = 0;
                    while (i39 < i4) {
                        View s3 = s(i39);
                        if (s3.getVisibility() == 8) {
                            i8 = i37;
                        } else {
                            a aVar3 = (a) s3.getLayoutParams();
                            float f6 = aVar3.a;
                            if (f6 > 0.0f) {
                                int i40 = (int) ((((float) i37) * f6) / f2);
                                float f7 = f2 - f6;
                                i8 = i37 - i40;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin, ((ViewGroup.MarginLayoutParams) aVar3).width);
                                if (((ViewGroup.MarginLayoutParams) aVar3).height == 0) {
                                    i11 = 1073741824;
                                    if (mode2 == 1073741824) {
                                        if (i40 <= 0) {
                                            i40 = 0;
                                        }
                                        s3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i40, 1073741824));
                                        i6 = View.combineMeasuredStates(i6, s3.getMeasuredState() & -256);
                                        f2 = f7;
                                    }
                                } else {
                                    i11 = 1073741824;
                                }
                                int measuredHeight2 = s3.getMeasuredHeight() + i40;
                                if (measuredHeight2 < 0) {
                                    measuredHeight2 = 0;
                                }
                                s3.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight2, i11));
                                i6 = View.combineMeasuredStates(i6, s3.getMeasuredState() & -256);
                                f2 = f7;
                            } else {
                                i8 = i37;
                            }
                            int i41 = ((ViewGroup.MarginLayoutParams) aVar3).leftMargin + ((ViewGroup.MarginLayoutParams) aVar3).rightMargin;
                            int measuredWidth2 = s3.getMeasuredWidth() + i41;
                            i33 = Math.max(i33, measuredWidth2);
                            if (mode != 1073741824) {
                                i9 = i6;
                                i10 = -1;
                                if (((ViewGroup.MarginLayoutParams) aVar3).width == -1) {
                                    z = true;
                                    if (!z) {
                                        i41 = measuredWidth2;
                                    }
                                    int max2 = Math.max(i38, i41);
                                    boolean z7 = !z5 && ((ViewGroup.MarginLayoutParams) aVar3).width == i10;
                                    int i42 = this.f;
                                    this.f = Math.max(i42, s3.getMeasuredHeight() + i42 + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + r(s3));
                                    z5 = z7;
                                    i6 = i9;
                                    i38 = max2;
                                    f2 = f2;
                                }
                            } else {
                                i9 = i6;
                                i10 = -1;
                            }
                            z = false;
                            if (!z) {
                            }
                            int max22 = Math.max(i38, i41);
                            if (!z5) {
                            }
                            int i422 = this.f;
                            this.f = Math.max(i422, s3.getMeasuredHeight() + i422 + ((ViewGroup.MarginLayoutParams) aVar3).topMargin + ((ViewGroup.MarginLayoutParams) aVar3).bottomMargin + r(s3));
                            z5 = z7;
                            i6 = i9;
                            i38 = max22;
                            f2 = f2;
                        }
                        i39++;
                        i37 = i8;
                    }
                    i5 = i2;
                    this.f += getPaddingTop() + getPaddingBottom();
                    i7 = i38;
                } else {
                    i7 = Math.max(i27, i26);
                    if (z3 && mode2 != 1073741824) {
                        for (int i43 = 0; i43 < i4; i43++) {
                            View s4 = s(i43);
                            if (!(s4 == null || s4.getVisibility() == 8 || ((a) s4.getLayoutParams()).a <= 0.0f)) {
                                s4.measure(View.MeasureSpec.makeMeasureSpec(s4.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i25, 1073741824));
                            }
                        }
                    }
                    i5 = i2;
                    i6 = i23;
                }
                if (z5 || mode == 1073741824) {
                    i7 = i33;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(i7 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i5, i6), resolveSizeAndState);
                if (z6) {
                    l(i4, i3);
                    return;
                }
                return;
            }
        }
    }

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public i0(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.a = true;
        this.b = -1;
        this.c = 0;
        this.e = 8388659;
        x0 u = x0.u(context, attributeSet, m.LinearLayoutCompat, i2, 0);
        int k2 = u.k(m.LinearLayoutCompat_android_orientation, -1);
        if (k2 >= 0) {
            setOrientation(k2);
        }
        int k3 = u.k(m.LinearLayoutCompat_android_gravity, -1);
        if (k3 >= 0) {
            setGravity(k3);
        }
        boolean a2 = u.a(m.LinearLayoutCompat_android_baselineAligned, true);
        if (!a2) {
            setBaselineAligned(a2);
        }
        this.g = u.i(m.LinearLayoutCompat_android_weightSum, -1.0f);
        this.b = u.k(m.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.h = u.a(m.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(u.g(m.LinearLayoutCompat_divider));
        this.n = u.k(m.LinearLayoutCompat_showDividers, 0);
        this.o = u.f(m.LinearLayoutCompat_dividerPadding, 0);
        u.v();
    }

    /* compiled from: LinearLayoutCompat */
    public static class a extends ViewGroup.MarginLayoutParams {
        public float a;
        public int b;

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.b = -1;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.LinearLayoutCompat_Layout);
            this.a = obtainStyledAttributes.getFloat(m.LinearLayoutCompat_Layout_android_layout_weight, 0.0f);
            this.b = obtainStyledAttributes.getInt(m.LinearLayoutCompat_Layout_android_layout_gravity, -1);
            obtainStyledAttributes.recycle();
        }

        public a(int i, int i2) {
            super(i, i2);
            this.b = -1;
            this.a = 0.0f;
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.b = -1;
        }
    }
}
