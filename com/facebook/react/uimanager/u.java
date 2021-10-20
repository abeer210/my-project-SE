package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import vigqyno.C0201;

/* compiled from: ReactClippingViewGroupHelper */
public class u {
    private static final Rect a = new Rect();

    public static void a(View view, Rect rect) {
        ViewParent parent = view.getParent();
        if (parent == null) {
            rect.setEmpty();
            return;
        }
        if (parent instanceof t) {
            t tVar = (t) parent;
            if (tVar.getRemoveClippedSubviews()) {
                tVar.getClippingRect(a);
                if (!a.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                    rect.setEmpty();
                    return;
                }
                a.offset(-view.getLeft(), -view.getTop());
                a.offset(view.getScrollX(), view.getScrollY());
                rect.set(a);
                return;
            }
        }
        view.getDrawingRect(rect);
    }

    public static boolean b(View view, Rect rect, Point point, View view2, String str) {
        RectF rectF = new RectF();
        rectF.set(rect);
        view.getMatrix().mapRect(rectF);
        int left = view.getLeft() - view2.getScrollX();
        int top = view.getTop() - view2.getScrollY();
        rectF.offset((float) left, (float) top);
        boolean z = true;
        if (point != null) {
            float[] fArr = {(float) point.x, (float) point.y};
            view.getMatrix().mapPoints(fArr);
            point.x = Math.round(fArr[0]) + left;
            point.y = Math.round(fArr[1]) + top;
        }
        int right = view2.getRight() - view2.getLeft();
        int bottom = view2.getBottom() - view2.getTop();
        ViewParent parent = view2.getParent();
        if (parent == null || C0201.m82(22229).equals(str)) {
            z = rectF.intersect(0.0f, 0.0f, (float) right, (float) bottom);
        }
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
        return (!z || parent == null) ? z : parent.getChildVisibleRect(view2, rect, point);
    }
}
