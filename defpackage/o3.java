package defpackage;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import vigqyno.C0201;

/* renamed from: o3  reason: default package */
/* compiled from: ViewParentCompat */
public final class o3 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;

    static {
        C0201.m83(o3.class, 98);
    }

    public static boolean a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e(C0201.m82(31813), C0201.m82(31811) + viewParent + C0201.m82(31812), e);
                return false;
            }
        } else if (viewParent instanceof e3) {
            return ((e3) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    public static boolean b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e(C0201.m82(31816), C0201.m82(31814) + viewParent + C0201.m82(31815), e);
                return false;
            }
        } else if (viewParent instanceof e3) {
            return ((e3) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    public static void c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof c3) {
            ((c3) viewParent).o(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e(C0201.m82(31819), C0201.m82(31817) + viewParent + C0201.m82(31818), e);
                }
            } else if (viewParent instanceof e3) {
                ((e3) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    public static void d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof d3) {
            ((d3) viewParent).j(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof c3) {
            ((c3) viewParent).k(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e(c, a + viewParent + b, e);
                }
            } else if (viewParent instanceof e3) {
                ((e3) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    public static void e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof c3) {
            ((c3) viewParent).m(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e(C0201.m82(31822), C0201.m82(31820) + viewParent + C0201.m82(31821), e);
                }
            } else if (viewParent instanceof e3) {
                ((e3) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof c3) {
            return ((c3) viewParent).l(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e(C0201.m82(31825), C0201.m82(31823) + viewParent + C0201.m82(31824), e);
                return false;
            }
        } else if (viewParent instanceof e3) {
            return ((e3) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    public static void g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof c3) {
            ((c3) viewParent).n(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e(C0201.m82(31828), C0201.m82(31826) + viewParent + C0201.m82(31827), e);
                }
            } else if (viewParent instanceof e3) {
                ((e3) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    public static boolean h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
