package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;
import vigqyno.C0201;

/* compiled from: ModalHostHelper */
public class a {
    private static final Point a = new Point();
    private static final Point b = new Point();
    private static final Point c = new Point();

    public static Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(C0201.m82(24554));
        yh0.c(windowManager);
        Display defaultDisplay = windowManager.getDefaultDisplay();
        defaultDisplay.getCurrentSizeRange(a, b);
        defaultDisplay.getSize(c);
        int i = 0;
        boolean z = context.getTheme().obtainStyledAttributes(new int[]{16843277}).getBoolean(0, false);
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(C0201.m82(24555), C0201.m82(24556), C0201.m82(24557));
        if (z && identifier > 0) {
            i = (int) resources.getDimension(identifier);
        }
        Point point = c;
        if (point.x < point.y) {
            return new Point(a.x, b.y + i);
        }
        return new Point(b.x, a.y + i);
    }
}
