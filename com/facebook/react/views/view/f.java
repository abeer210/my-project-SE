package com.facebook.react.views.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.animation.Animation;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.g0;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.r;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import com.facebook.react.uimanager.x;
import com.facebook.react.uimanager.x0;
import com.facebook.react.views.view.d;
import com.facebook.yoga.g;
import vigqyno.C0201;

/* compiled from: ReactViewGroup */
public class f extends ViewGroup implements wj0, t, x, vj0, e0 {
    private static final int ARRAY_CAPACITY_INCREMENT = 0;
    private static final int DEFAULT_BACKGROUND_COLOR = 0;
    private static final ViewGroup.LayoutParams sDefaultLayoutParam = new ViewGroup.LayoutParams(0, 0);
    private static final Rect sHelperRect = new Rect();
    private View[] mAllChildren = null;
    private int mAllChildrenCount;
    private float mBackfaceOpacity = 1.0f;
    private String mBackfaceVisibility = C0201.m82(17384);
    private b mChildrenLayoutChangeListener;
    private Rect mClippingRect;
    private final x0 mDrawingOrderHelper;
    private Rect mHitSlopRect;
    private int mLayoutDirection;
    private boolean mNeedsOffscreenAlphaCompositing = false;
    private uj0 mOnInterceptTouchEventListener;
    private String mOverflow;
    private Path mPath;
    private r mPointerEvents = r.AUTO;
    private d mReactBackgroundDrawable;
    private boolean mRemoveClippedSubviews = false;

    /* access modifiers changed from: private */
    /* compiled from: ReactViewGroup */
    public static final class b implements View.OnLayoutChangeListener {
        private final f a;

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.a.getRemoveClippedSubviews()) {
                this.a.updateSubviewClipStatus(view);
            }
        }

        private b(f fVar) {
            this.a = fVar;
        }
    }

    static {
        C0201.m83(f.class, 607);
    }

    public f(Context context) {
        super(context);
        setClipChildren(false);
        this.mDrawingOrderHelper = new x0(this);
    }

    private void addInArray(View view, int i) {
        View[] viewArr = this.mAllChildren;
        yh0.c(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.mAllChildrenCount;
        int length = viewArr2.length;
        if (i == i2) {
            if (length == i2) {
                View[] viewArr3 = new View[(length + 12)];
                this.mAllChildren = viewArr3;
                System.arraycopy(viewArr2, 0, viewArr3, 0, length);
                viewArr2 = this.mAllChildren;
            }
            int i3 = this.mAllChildrenCount;
            this.mAllChildrenCount = i3 + 1;
            viewArr2[i3] = view;
        } else if (i < i2) {
            if (length == i2) {
                View[] viewArr4 = new View[(length + 12)];
                this.mAllChildren = viewArr4;
                System.arraycopy(viewArr2, 0, viewArr4, 0, i);
                System.arraycopy(viewArr2, i, this.mAllChildren, i + 1, i2 - i);
                viewArr2 = this.mAllChildren;
            } else {
                System.arraycopy(viewArr2, i, viewArr2, i + 1, i2 - i);
            }
            viewArr2[i] = view;
            this.mAllChildrenCount++;
        } else {
            throw new IndexOutOfBoundsException(C0201.m82(17385) + i + C0201.m82(17386) + i2);
        }
    }

    private void dispatchOverflowDraw(Canvas canvas) {
        float f;
        boolean z;
        float f2;
        float f3;
        String str = this.mOverflow;
        if (str != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1217487446) {
                if (hashCode == 466743410 && str.equals(C0201.m82(17387))) {
                    c = 0;
                }
            } else if (str.equals(C0201.m82(17388))) {
                c = 1;
            }
            if (c == 0) {
                Path path = this.mPath;
                if (path != null) {
                    path.rewind();
                }
            } else if (c == 1) {
                float width = (float) getWidth();
                float height = (float) getHeight();
                d dVar = this.mReactBackgroundDrawable;
                float f4 = 0.0f;
                if (dVar != null) {
                    RectF k = dVar.k();
                    if (k.top > 0.0f || k.left > 0.0f || k.bottom > 0.0f || k.right > 0.0f) {
                        f3 = k.left + 0.0f;
                        f = k.top + 0.0f;
                        width -= k.right;
                        height -= k.bottom;
                    } else {
                        f3 = 0.0f;
                        f = 0.0f;
                    }
                    float m = this.mReactBackgroundDrawable.m();
                    float h = this.mReactBackgroundDrawable.h(m, d.b.TOP_LEFT);
                    float h2 = this.mReactBackgroundDrawable.h(m, d.b.TOP_RIGHT);
                    float h3 = this.mReactBackgroundDrawable.h(m, d.b.BOTTOM_LEFT);
                    float h4 = this.mReactBackgroundDrawable.h(m, d.b.BOTTOM_RIGHT);
                    if (Build.VERSION.SDK_INT >= 17) {
                        boolean z2 = this.mLayoutDirection == 1;
                        float g = this.mReactBackgroundDrawable.g(d.b.TOP_START);
                        float g2 = this.mReactBackgroundDrawable.g(d.b.TOP_END);
                        float g3 = this.mReactBackgroundDrawable.g(d.b.BOTTOM_START);
                        h4 = this.mReactBackgroundDrawable.g(d.b.BOTTOM_END);
                        if (com.facebook.react.modules.i18nmanager.a.d().b(getContext())) {
                            float f5 = g.a(g) ? h : g;
                            if (!g.a(g2)) {
                                h2 = g2;
                            }
                            if (!g.a(g3)) {
                                h3 = g3;
                            }
                            if (g.a(h4)) {
                                h4 = h4;
                            }
                            float f6 = z2 ? h2 : f5;
                            if (z2) {
                                h2 = f5;
                            }
                            float f7 = z2 ? h4 : h3;
                            if (z2) {
                                h4 = h3;
                            }
                            h = f6;
                            h3 = f7;
                        } else {
                            h = z2 ? g2 : g;
                            if (!z2) {
                                g = g2;
                            }
                            float f8 = z2 ? h4 : g3;
                            if (!z2) {
                                g3 = h4;
                            }
                            if (g.a(h)) {
                                h = h;
                            }
                            if (!g.a(g)) {
                                h2 = g;
                            }
                            if (!g.a(f8)) {
                                h3 = f8;
                            }
                            h4 = !g.a(g3) ? g3 : h4;
                        }
                        f4 = 0.0f;
                    }
                    if (h > f4 || h2 > f4 || h4 > f4 || h3 > f4) {
                        if (this.mPath == null) {
                            this.mPath = new Path();
                        }
                        this.mPath.rewind();
                        this.mPath.addRoundRect(new RectF(f3, f, width, height), new float[]{Math.max(h - k.left, 0.0f), Math.max(h - k.top, 0.0f), Math.max(h2 - k.right, 0.0f), Math.max(h2 - k.top, 0.0f), Math.max(h4 - k.right, 0.0f), Math.max(h4 - k.bottom, 0.0f), Math.max(h3 - k.left, 0.0f), Math.max(h3 - k.bottom, 0.0f)}, Path.Direction.CW);
                        canvas.clipPath(this.mPath);
                        f2 = f3;
                        z = true;
                    } else {
                        f2 = f3;
                        z = false;
                    }
                } else {
                    f2 = 0.0f;
                    z = false;
                    f = 0.0f;
                }
                if (!z) {
                    canvas.clipRect(new RectF(f2, f, width, height));
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: com.facebook.react.views.view.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [boolean, int] */
    /* JADX WARNING: Unknown variable types count: 1 */
    private d getOrCreateReactViewBackground() {
        if (this.mReactBackgroundDrawable == null) {
            this.mReactBackgroundDrawable = new d(getContext());
            Drawable background = getBackground();
            updateBackgroundDrawable(null);
            if (background == null) {
                updateBackgroundDrawable(this.mReactBackgroundDrawable);
            } else {
                updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, background}));
            }
            if (Build.VERSION.SDK_INT >= 17) {
                ?? g = com.facebook.react.modules.i18nmanager.a.d().g(getContext());
                this.mLayoutDirection = g == true ? 1 : 0;
                this.mReactBackgroundDrawable.A(g);
            }
        }
        return this.mReactBackgroundDrawable;
    }

    private int indexOfChildInAllChildren(View view) {
        int i = this.mAllChildrenCount;
        View[] viewArr = this.mAllChildren;
        yh0.c(viewArr);
        View[] viewArr2 = viewArr;
        for (int i2 = 0; i2 < i; i2++) {
            if (viewArr2[i2] == view) {
                return i2;
            }
        }
        return -1;
    }

    private void removeFromArray(int i) {
        View[] viewArr = this.mAllChildren;
        yh0.c(viewArr);
        View[] viewArr2 = viewArr;
        int i2 = this.mAllChildrenCount;
        if (i == i2 - 1) {
            int i3 = i2 - 1;
            this.mAllChildrenCount = i3;
            viewArr2[i3] = null;
        } else if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        } else {
            System.arraycopy(viewArr2, i + 1, viewArr2, i, (i2 - i) - 1);
            int i4 = this.mAllChildrenCount - 1;
            this.mAllChildrenCount = i4;
            viewArr2[i4] = null;
        }
    }

    private void updateBackgroundDrawable(Drawable drawable) {
        super.setBackground(drawable);
    }

    private void updateClippingToRect(Rect rect) {
        yh0.c(this.mAllChildren);
        int i = 0;
        for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
            updateSubviewClipStatus(rect, i2, i);
            if (this.mAllChildren[i2].getParent() == null) {
                i++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0061, code lost:
        if (r7 != false) goto L_0x0063;
     */
    private void updateSubviewClipStatus(Rect rect, int i, int i2) {
        UiThreadUtil.assertOnUiThread();
        View[] viewArr = this.mAllChildren;
        yh0.c(viewArr);
        View view = viewArr[i];
        sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Rect rect2 = sHelperRect;
        boolean intersects = rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom);
        Animation animation = view.getAnimation();
        boolean z = false;
        boolean z2 = animation != null && !animation.hasEnded();
        if (!intersects && view.getParent() != null && !z2) {
            super.removeViewsInLayout(i - i2, 1);
        } else if (intersects && view.getParent() == null) {
            super.addViewInLayout(view, i - i2, sDefaultLayoutParam, true);
            invalidate();
        }
        z = true;
        if (z && (view instanceof t)) {
            t tVar = (t) view;
            if (tVar.getRemoveClippedSubviews()) {
                tVar.updateClippingRect();
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        this.mDrawingOrderHelper.b(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.addView(view, i, layoutParams);
    }

    public void addViewWithSubviewClippingEnabled(View view, int i) {
        addViewWithSubviewClippingEnabled(view, i, sDefaultLayoutParam);
    }

    public void dispatchDraw(Canvas canvas) {
        try {
            dispatchOverflowDraw(canvas);
            super.dispatchDraw(canvas);
        } catch (NullPointerException e) {
            f60.j(C0201.m82(17390), C0201.m82(17391), e);
        } catch (StackOverflowError e2) {
            f0 a2 = g0.a(this);
            if (a2 != null) {
                a2.c(e2);
            } else if (getContext() instanceof ReactContext) {
                ((ReactContext) getContext()).handleException(new com.facebook.react.uimanager.g(C0201.m82(17389), this, e2));
            } else {
                throw e2;
            }
        }
    }

    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        try {
            super.dispatchProvideStructure(viewStructure);
        } catch (NullPointerException e) {
            f60.j(C0201.m82(17392), C0201.m82(17393), e);
        }
    }

    public void dispatchSetPressed(boolean z) {
    }

    public int getAllChildrenCount() {
        return this.mAllChildrenCount;
    }

    public int getBackgroundColor() {
        if (getBackground() != null) {
            return ((d) getBackground()).j();
        }
        return 0;
    }

    public View getChildAtWithSubviewClippingEnabled(int i) {
        View[] viewArr = this.mAllChildren;
        yh0.c(viewArr);
        return viewArr[i];
    }

    public int getChildDrawingOrder(int i, int i2) {
        return this.mDrawingOrderHelper.a(i, i2);
    }

    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        if (dj0.g) {
            return u.b(view, rect, point, this, this.mOverflow);
        }
        return super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        rect.set(this.mClippingRect);
    }

    @Override // defpackage.vj0
    public Rect getHitSlopRect() {
        return this.mHitSlopRect;
    }

    public String getOverflow() {
        return this.mOverflow;
    }

    @Override // com.facebook.react.uimanager.x
    public r getPointerEvents() {
        return this.mPointerEvents;
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.mRemoveClippedSubviews;
    }

    @Override // com.facebook.react.uimanager.e0
    public int getZIndexMappedChildIndex(int i) {
        return this.mDrawingOrderHelper.d() ? this.mDrawingOrderHelper.a(getChildCount(), i) : i;
    }

    public boolean hasOverlappingRendering() {
        return this.mNeedsOffscreenAlphaCompositing;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        r rVar;
        uj0 uj0 = this.mOnInterceptTouchEventListener;
        if ((uj0 != null && uj0.a(this, motionEvent)) || (rVar = this.mPointerEvents) == r.NONE || rVar == r.BOX_ONLY) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public void onMeasure(int i, int i2) {
        k.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    public void onRtlPropertiesChanged(int i) {
        d dVar;
        if (Build.VERSION.SDK_INT >= 17 && (dVar = this.mReactBackgroundDrawable) != null) {
            dVar.A(this.mLayoutDirection);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.mRemoveClippedSubviews) {
            updateClippingRect();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        r rVar = this.mPointerEvents;
        return (rVar == r.NONE || rVar == r.BOX_NONE) ? false : true;
    }

    public void removeAllViewsWithSubviewClippingEnabled() {
        yh0.a(this.mRemoveClippedSubviews);
        yh0.c(this.mAllChildren);
        for (int i = 0; i < this.mAllChildrenCount; i++) {
            this.mAllChildren[i].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        }
        removeAllViewsInLayout();
        this.mAllChildrenCount = 0;
    }

    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.c(view);
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.removeView(view);
    }

    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.mDrawingOrderHelper.c(getChildAt(i));
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        super.removeViewAt(i);
    }

    public void removeViewWithSubviewClippingEnabled(View view) {
        UiThreadUtil.assertOnUiThread();
        yh0.a(this.mRemoveClippedSubviews);
        yh0.c(this.mClippingRect);
        yh0.c(this.mAllChildren);
        view.removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
        int indexOfChildInAllChildren = indexOfChildInAllChildren(view);
        if (this.mAllChildren[indexOfChildInAllChildren].getParent() != null) {
            int i = 0;
            for (int i2 = 0; i2 < indexOfChildInAllChildren; i2++) {
                if (this.mAllChildren[i2].getParent() == null) {
                    i++;
                }
            }
            super.removeViewsInLayout(indexOfChildInAllChildren - i, 1);
        }
        removeFromArray(indexOfChildInAllChildren);
    }

    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
    }

    public void setBackfaceVisibility(String str) {
        this.mBackfaceVisibility = str;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setBackfaceVisibilityDependantOpacity() {
        if (this.mBackfaceVisibility.equals(C0201.m82(17394))) {
            setAlpha(this.mBackfaceOpacity);
            return;
        }
        float rotationX = getRotationX();
        float rotationY = getRotationY();
        if (rotationX >= -90.0f && rotationX < 90.0f && rotationY >= -90.0f && rotationY < 90.0f) {
            setAlpha(this.mBackfaceOpacity);
        } else {
            setAlpha(0.0f);
        }
    }

    public void setBackground(Drawable drawable) {
        throw new UnsupportedOperationException(C0201.m82(17395));
    }

    public void setBackgroundColor(int i) {
        if (i != 0 || this.mReactBackgroundDrawable != null) {
            getOrCreateReactViewBackground().x(i);
        }
    }

    public void setBorderColor(int i, float f, float f2) {
        getOrCreateReactViewBackground().t(i, f, f2);
    }

    public void setBorderRadius(float f) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.y(f);
        if (Build.VERSION.SDK_INT < 18) {
            int i = orCreateReactViewBackground.p() ? 1 : 2;
            if (i != getLayerType()) {
                setLayerType(i, null);
            }
        }
    }

    public void setBorderStyle(String str) {
        getOrCreateReactViewBackground().v(str);
    }

    public void setBorderWidth(int i, float f) {
        getOrCreateReactViewBackground().w(i, f);
    }

    public void setHitSlopRect(Rect rect) {
        this.mHitSlopRect = rect;
    }

    public void setNeedsOffscreenAlphaCompositing(boolean z) {
        this.mNeedsOffscreenAlphaCompositing = z;
    }

    @Override // defpackage.wj0
    public void setOnInterceptTouchEventListener(uj0 uj0) {
        this.mOnInterceptTouchEventListener = uj0;
    }

    public void setOpacityIfPossible(float f) {
        this.mBackfaceOpacity = f;
        setBackfaceVisibilityDependantOpacity();
    }

    public void setOverflow(String str) {
        this.mOverflow = str;
        invalidate();
    }

    public void setPointerEvents(r rVar) {
        this.mPointerEvents = rVar;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z != this.mRemoveClippedSubviews) {
            this.mRemoveClippedSubviews = z;
            if (z) {
                Rect rect = new Rect();
                this.mClippingRect = rect;
                u.a(this, rect);
                int childCount = getChildCount();
                this.mAllChildrenCount = childCount;
                this.mAllChildren = new View[Math.max(12, childCount)];
                this.mChildrenLayoutChangeListener = new b();
                for (int i = 0; i < this.mAllChildrenCount; i++) {
                    View childAt = getChildAt(i);
                    this.mAllChildren[i] = childAt;
                    childAt.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
                }
                updateClippingRect();
                return;
            }
            yh0.c(this.mClippingRect);
            yh0.c(this.mAllChildren);
            yh0.c(this.mChildrenLayoutChangeListener);
            for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                this.mAllChildren[i2].removeOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
            }
            getDrawingRect(this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
            this.mAllChildren = null;
            this.mClippingRect = null;
            this.mAllChildrenCount = 0;
            this.mChildrenLayoutChangeListener = null;
        }
    }

    public void setTranslucentBackgroundDrawable(Drawable drawable) {
        updateBackgroundDrawable(null);
        if (this.mReactBackgroundDrawable != null && drawable != null) {
            updateBackgroundDrawable(new LayerDrawable(new Drawable[]{this.mReactBackgroundDrawable, drawable}));
        } else if (drawable != null) {
            updateBackgroundDrawable(drawable);
        }
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (this.mRemoveClippedSubviews) {
            yh0.c(this.mClippingRect);
            yh0.c(this.mAllChildren);
            u.a(this, this.mClippingRect);
            updateClippingToRect(this.mClippingRect);
        }
    }

    @Override // com.facebook.react.uimanager.e0
    public void updateDrawingOrder() {
        this.mDrawingOrderHelper.e();
        setChildrenDrawingOrderEnabled(this.mDrawingOrderHelper.d());
        invalidate();
    }

    public void addViewWithSubviewClippingEnabled(View view, int i, ViewGroup.LayoutParams layoutParams) {
        yh0.a(this.mRemoveClippedSubviews);
        yh0.c(this.mClippingRect);
        yh0.c(this.mAllChildren);
        addInArray(view, i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (this.mAllChildren[i3].getParent() == null) {
                i2++;
            }
        }
        updateSubviewClipStatus(this.mClippingRect, i, i2);
        view.addOnLayoutChangeListener(this.mChildrenLayoutChangeListener);
    }

    public void setBorderRadius(float f, int i) {
        d orCreateReactViewBackground = getOrCreateReactViewBackground();
        orCreateReactViewBackground.z(f, i);
        if (Build.VERSION.SDK_INT < 18) {
            int i2 = orCreateReactViewBackground.p() ? 1 : 2;
            if (i2 != getLayerType()) {
                setLayerType(i2, null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void updateSubviewClipStatus(View view) {
        if (this.mRemoveClippedSubviews && getParent() != null) {
            yh0.c(this.mClippingRect);
            yh0.c(this.mAllChildren);
            sHelperRect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            Rect rect = this.mClippingRect;
            Rect rect2 = sHelperRect;
            if (rect.intersects(rect2.left, rect2.top, rect2.right, rect2.bottom) != (view.getParent() != null)) {
                int i = 0;
                for (int i2 = 0; i2 < this.mAllChildrenCount; i2++) {
                    View[] viewArr = this.mAllChildren;
                    if (viewArr[i2] == view) {
                        updateSubviewClipStatus(this.mClippingRect, i2, i);
                        return;
                    }
                    if (viewArr[i2].getParent() == null) {
                        i++;
                    }
                }
            }
        }
    }
}
