package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.ref.WeakReference;
import vigqyno.C0201;

/* compiled from: VectorEnabledTintResources */
public class c1 extends Resources {
    private static boolean b;
    private final WeakReference<Context> a;

    static {
        C0201.m83(c1.class, 388);
    }

    public c1(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.a = new WeakReference<>(context);
    }

    public static boolean a() {
        return b;
    }

    public static void b(boolean z) {
        b = z;
    }

    public static boolean c() {
        return a() && Build.VERSION.SDK_INT <= 20;
    }

    public final Drawable d(int i) {
        return super.getDrawable(i);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.a.get();
        if (context != null) {
            return m0.h().t(context, this, i);
        }
        return super.getDrawable(i);
    }
}
