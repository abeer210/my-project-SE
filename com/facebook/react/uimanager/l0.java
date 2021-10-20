package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import vigqyno.C0201;

/* compiled from: TouchTargetHelper */
public class l0 {
    private static final float[] a = new float[2];
    private static final PointF b = new PointF();
    private static final float[] c = new float[2];
    private static final Matrix d = new Matrix();

    private static View a(View view) {
        while (view != null && view.getId() <= 0) {
            view = (View) view.getParent();
        }
        return view;
    }

    public static int b(float f, float f2, ViewGroup viewGroup, float[] fArr, int[] iArr) {
        View a2;
        UiThreadUtil.assertOnUiThread();
        int id = viewGroup.getId();
        fArr[0] = f;
        fArr[1] = f2;
        View d2 = d(fArr, viewGroup);
        if (d2 == null || (a2 = a(d2)) == null) {
            return id;
        }
        if (iArr != null) {
            iArr[0] = a2.getId();
        }
        return f(a2, fArr[0], fArr[1]);
    }

    public static int c(float f, float f2, ViewGroup viewGroup) {
        return b(f, f2, viewGroup, a, null);
    }

    private static View d(float[] fArr, ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        e0 e0Var = viewGroup instanceof e0 ? (e0) viewGroup : null;
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = viewGroup.getChildAt(e0Var != null ? e0Var.getZIndexMappedChildIndex(i) : i);
            PointF pointF = b;
            if (g(fArr[0], fArr[1], viewGroup, childAt, pointF)) {
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                View e = e(fArr, childAt);
                if (e != null) {
                    return e;
                }
                fArr[0] = f;
                fArr[1] = f2;
            }
        }
        return viewGroup;
    }

    private static View e(float[] fArr, View view) {
        r pointerEvents = view instanceof x ? ((x) view).getPointerEvents() : r.AUTO;
        if (!view.isEnabled()) {
            if (pointerEvents == r.AUTO) {
                pointerEvents = r.BOX_NONE;
            } else if (pointerEvents == r.BOX_ONLY) {
                pointerEvents = r.NONE;
            }
        }
        if (pointerEvents == r.NONE) {
            return null;
        }
        if (pointerEvents == r.BOX_ONLY) {
            return view;
        }
        if (pointerEvents == r.BOX_NONE) {
            if (view instanceof ViewGroup) {
                View d2 = d(fArr, (ViewGroup) view);
                if (d2 != view) {
                    return d2;
                }
                if (!(view instanceof v) || ((v) view).b(fArr[0], fArr[1]) == view.getId()) {
                    return null;
                }
                return view;
            }
            return null;
        } else if (pointerEvents == r.AUTO) {
            return ((!(view instanceof w) || !((w) view).d(fArr[0], fArr[1])) && (view instanceof ViewGroup)) ? d(fArr, (ViewGroup) view) : view;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(31389) + pointerEvents.toString());
        }
    }

    private static int f(View view, float f, float f2) {
        if (view instanceof v) {
            return ((v) view).b(f, f2);
        }
        return view.getId();
    }

    private static boolean g(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + ((float) viewGroup.getScrollX())) - ((float) view.getLeft());
        float scrollY = (f2 + ((float) viewGroup.getScrollY())) - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = c;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = d;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            scrollX = fArr[0];
            scrollY = fArr[1];
        }
        if (view instanceof vj0) {
            vj0 vj0 = (vj0) view;
            if (vj0.getHitSlopRect() != null) {
                Rect hitSlopRect = vj0.getHitSlopRect();
                if (scrollX < ((float) (-hitSlopRect.left)) || scrollX >= ((float) ((view.getRight() - view.getLeft()) + hitSlopRect.right)) || scrollY < ((float) (-hitSlopRect.top)) || scrollY >= ((float) ((view.getBottom() - view.getTop()) + hitSlopRect.bottom))) {
                    return false;
                }
                pointF.set(scrollX, scrollY);
                return true;
            }
        }
        if (scrollX < 0.0f || scrollX >= ((float) (view.getRight() - view.getLeft())) || scrollY < 0.0f || scrollY >= ((float) (view.getBottom() - view.getTop()))) {
            return false;
        }
        pointF.set(scrollX, scrollY);
        return true;
    }
}
