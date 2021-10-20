package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: ay1  reason: default package */
/* compiled from: MaterialThemeOverlay */
public class ay1 {
    private static final int[] a = {16842752, nv1.theme};
    private static final int[] b = {nv1.materialThemeOverlay};

    private static int a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    private static int b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static Context c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b2 = b(context, attributeSet, i, i2);
        boolean z = (context instanceof y) && ((y) context).b() == b2;
        if (b2 == 0 || z) {
            return context;
        }
        y yVar = new y(context, b2);
        int a2 = a(context, attributeSet);
        if (a2 != 0) {
            yVar.getTheme().applyStyle(a2, true);
        }
        return yVar;
    }
}
