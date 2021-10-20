package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: TintContextWrapper */
public class u0 extends ContextWrapper {
    private static final Object c = new Object();
    private static ArrayList<WeakReference<u0>> d;
    private final Resources a;
    private final Resources.Theme b;

    private u0(Context context) {
        super(context);
        if (c1.c()) {
            c1 c1Var = new c1(this, context.getResources());
            this.a = c1Var;
            Resources.Theme newTheme = c1Var.newTheme();
            this.b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.a = new w0(this, context.getResources());
        this.b = null;
    }

    private static boolean a(Context context) {
        if ((context instanceof u0) || (context.getResources() instanceof w0) || (context.getResources() instanceof c1)) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 21 || c1.c()) {
            return true;
        }
        return false;
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (c) {
            if (d == null) {
                d = new ArrayList<>();
            } else {
                for (int size = d.size() - 1; size >= 0; size--) {
                    WeakReference<u0> weakReference = d.get(size);
                    if (weakReference == null || weakReference.get() == null) {
                        d.remove(size);
                    }
                }
                for (int size2 = d.size() - 1; size2 >= 0; size2--) {
                    WeakReference<u0> weakReference2 = d.get(size2);
                    u0 u0Var = weakReference2 != null ? weakReference2.get() : null;
                    if (u0Var != null && u0Var.getBaseContext() == context) {
                        return u0Var;
                    }
                }
            }
            u0 u0Var2 = new u0(context);
            d.add(new WeakReference<>(u0Var2));
            return u0Var2;
        }
    }

    public AssetManager getAssets() {
        return this.a.getAssets();
    }

    public Resources getResources() {
        return this.a;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        return theme == null ? super.getTheme() : theme;
    }

    public void setTheme(int i) {
        Resources.Theme theme = this.b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
