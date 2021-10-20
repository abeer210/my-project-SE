package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.f;
import java.lang.reflect.Field;
import vigqyno.C0201;

/* compiled from: DropDownListView */
public class f0 extends ListView {
    private final Rect a = new Rect();
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private int e = 0;
    private int f;
    private Field g;
    private a h;
    private boolean i;
    private boolean j;
    private boolean k;
    private p3 l;
    private f m;
    public b n;

    /* access modifiers changed from: private */
    /* compiled from: DropDownListView */
    public static class a extends q {
        private boolean b = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void c(boolean z) {
            this.b = z;
        }

        @Override // defpackage.q
        public void draw(Canvas canvas) {
            if (this.b) {
                super.draw(canvas);
            }
        }

        @Override // defpackage.q
        public void setHotspot(float f, float f2) {
            if (this.b) {
                super.setHotspot(f, f2);
            }
        }

        @Override // defpackage.q
        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.b) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // defpackage.q
        public boolean setState(int[] iArr) {
            if (this.b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // defpackage.q
        public boolean setVisible(boolean z, boolean z2) {
            if (this.b) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: DropDownListView */
    public class b implements Runnable {
        public b() {
        }

        public void a() {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.removeCallbacks(this);
        }

        public void b() {
            f0.this.post(this);
        }

        public void run() {
            f0 f0Var = f0.this;
            f0Var.n = null;
            f0Var.drawableStateChanged();
        }
    }

    public f0(Context context, boolean z) {
        super(context, null, d.dropDownListViewStyle);
        this.j = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField(C0201.m82(7987));
            this.g = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
        }
    }

    private void a() {
        this.k = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        p3 p3Var = this.l;
        if (p3Var != null) {
            p3Var.b();
            this.l = null;
        }
    }

    private void b(View view, int i2) {
        performItemClick(view, i2, getItemIdAtPosition(i2));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (!this.a.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.a);
            selector.draw(canvas);
        }
    }

    private void f(int i2, View view) {
        Rect rect = this.a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.b;
        rect.top -= this.c;
        rect.right += this.d;
        rect.bottom += this.e;
        try {
            boolean z = this.g.getBoolean(this);
            if (view.isEnabled() != z) {
                this.g.set(this, Boolean.valueOf(!z));
                if (i2 != -1) {
                    refreshDrawableState();
                }
            }
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        }
    }

    private void g(int i2, View view) {
        Drawable selector = getSelector();
        boolean z = true;
        boolean z2 = (selector == null || i2 == -1) ? false : true;
        if (z2) {
            selector.setVisible(false, false);
        }
        f(i2, view);
        if (z2) {
            Rect rect = this.a;
            float exactCenterX = rect.exactCenterX();
            float exactCenterY = rect.exactCenterY();
            if (getVisibility() != 0) {
                z = false;
            }
            selector.setVisible(z, false);
            androidx.core.graphics.drawable.a.k(selector, exactCenterX, exactCenterY);
        }
    }

    private void h(int i2, View view, float f2, float f3) {
        g(i2, view);
        Drawable selector = getSelector();
        if (selector != null && i2 != -1) {
            androidx.core.graphics.drawable.a.k(selector, f2, f3);
        }
    }

    private void i(View view, int i2, float f2, float f3) {
        View childAt;
        this.k = true;
        if (Build.VERSION.SDK_INT >= 21) {
            drawableHotspotChanged(f2, f3);
        }
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i3 = this.f;
        if (!(i3 == -1 || (childAt = getChildAt(i3 - getFirstVisiblePosition())) == null || childAt == view || !childAt.isPressed())) {
            childAt.setPressed(false);
        }
        this.f = i2;
        float left = f2 - ((float) view.getLeft());
        float top = f3 - ((float) view.getTop());
        if (Build.VERSION.SDK_INT >= 21) {
            view.drawableHotspotChanged(left, top);
        }
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i2, view, f2, f3);
        setSelectorEnabled(false);
        refreshDrawableState();
    }

    private boolean j() {
        return this.k;
    }

    private void k() {
        Drawable selector = getSelector();
        if (selector != null && j() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.h;
        if (aVar != null) {
            aVar.c(z);
        }
    }

    public int d(int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i8 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i9 < count) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i12 = layoutParams.height;
            if (i12 > 0) {
                i7 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
            } else {
                i7 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i2, i7);
            view.forceLayout();
            if (i9 > 0) {
                i8 += dividerHeight;
            }
            i8 += view.getMeasuredHeight();
            if (i8 >= i5) {
                return (i6 < 0 || i9 <= i6 || i11 <= 0 || i8 == i5) ? i5 : i11;
            }
            if (i6 >= 0 && i9 >= i6) {
                i11 = i8;
            }
            i9++;
        }
        return i8;
    }

    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            k();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if (r0 != 3) goto L_0x000e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0065  */
    public boolean e(MotionEvent motionEvent, int i2) {
        boolean z;
        boolean z2;
        int findPointerIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z2 = false;
            findPointerIndex = motionEvent.findPointerIndex(i2);
            if (findPointerIndex >= 0) {
            }
            z = false;
            z2 = false;
            a();
            if (!z2) {
            }
            return z2;
        } else if (actionMasked == 2) {
            z2 = true;
            findPointerIndex = motionEvent.findPointerIndex(i2);
            if (findPointerIndex >= 0) {
                int x = (int) motionEvent.getX(findPointerIndex);
                int y = (int) motionEvent.getY(findPointerIndex);
                int pointToPosition = pointToPosition(x, y);
                if (pointToPosition == -1) {
                    z = true;
                    if (!z2 || z) {
                        a();
                    }
                    if (!z2) {
                        if (this.m == null) {
                            this.m = new f(this);
                        }
                        this.m.m(true);
                        this.m.onTouch(this, motionEvent);
                    } else {
                        f fVar = this.m;
                        if (fVar != null) {
                            fVar.m(false);
                        }
                    }
                    return z2;
                }
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                i(childAt, pointToPosition, (float) x, (float) y);
                if (actionMasked == 1) {
                    b(childAt, pointToPosition);
                }
            }
            z = false;
            z2 = false;
            a();
            if (!z2) {
            }
            return z2;
        }
        z = false;
        z2 = true;
        a();
        if (!z2) {
        }
        return z2;
    }

    public boolean hasFocus() {
        return this.j || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.j || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.j || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.j && this.i) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.n == null) {
            b bVar = new b();
            this.n = bVar;
            bVar.b();
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                k();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.n;
        if (bVar != null) {
            bVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.i = z;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.h = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.b = rect.left;
        this.c = rect.top;
        this.d = rect.right;
        this.e = rect.bottom;
    }
}
