package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import vigqyno.C0201;

/* renamed from: xj2  reason: default package */
/* compiled from: UiUtils */
public class xj2 {
    private static int a;

    /* access modifiers changed from: package-private */
    /* renamed from: xj2$a */
    /* compiled from: UiUtils */
    public static class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View a;
        public final /* synthetic */ Runnable b;

        public a(View view, Runnable runnable) {
            this.a = view;
            this.b = runnable;
        }

        public boolean onPreDraw() {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            this.b.run();
            return true;
        }
    }

    static {
        C0201.m83(xj2.class, 332);
    }

    public static float a(Context context, float f) {
        return f * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static int b(Context context, int i) {
        if (i <= 0) {
            return i;
        }
        return (int) (((float) i) * (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f));
    }

    public static float c(Context context, float f) {
        return a(context, f) / context.getResources().getDisplayMetrics().density;
    }

    private static DisplayMetrics d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService(C0201.m82(19875));
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    public static int e(Context context) {
        int i;
        int i2 = a;
        if (i2 > 0) {
            return i2;
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(C0201.m82(19876), C0201.m82(19877), C0201.m82(19878));
        if (identifier > 0) {
            i = resources.getDimensionPixelSize(identifier);
        } else {
            i = b(context, 56);
        }
        a = i;
        return i;
    }

    public static int f(Context context) {
        return (int) i(context, (float) e(context));
    }

    public static float g(Context context) {
        return (float) d(context).heightPixels;
    }

    public static float i(Context context, float f) {
        return f / (((float) context.getResources().getDisplayMetrics().densityDpi) / 160.0f);
    }

    public static <T extends View> void j(T t, fj2<T> fj2) {
        if (t != null) {
            k(t, new ri2(fj2, t));
        }
    }

    public static void k(View view, Runnable runnable) {
        if (view != null) {
            view.getViewTreeObserver().addOnPreDrawListener(new a(view, runnable));
        }
    }
}
