package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.m0;
import androidx.core.content.b;
import java.util.WeakHashMap;
import vigqyno.C0201;

@SuppressLint({"RestrictedAPI"})
/* renamed from: n  reason: default package */
/* compiled from: AppCompatResources */
public final class n {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal<>();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap<>(0);
    private static final Object c = new Object();

    /* access modifiers changed from: private */
    /* renamed from: n$a */
    /* compiled from: AppCompatResources */
    public static class a {
        public final ColorStateList a;
        public final Configuration b;

        public a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

    private static void a(Context context, int i, ColorStateList colorStateList) {
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                b.put(context, sparseArray);
            }
            sparseArray.append(i, new a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    private static ColorStateList b(Context context, int i) {
        a aVar;
        synchronized (c) {
            SparseArray<a> sparseArray = b.get(context);
            if (!(sparseArray == null || sparseArray.size() <= 0 || (aVar = sparseArray.get(i)) == null)) {
                if (aVar.b.equals(context.getResources().getConfiguration())) {
                    return aVar.a;
                }
                sparseArray.remove(i);
            }
            return null;
        }
    }

    public static ColorStateList c(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList b2 = b(context, i);
        if (b2 != null) {
            return b2;
        }
        ColorStateList f = f(context, i);
        if (f == null) {
            return b.e(context, i);
        }
        a(context, i, f);
        return f;
    }

    public static Drawable d(Context context, int i) {
        return m0.h().j(context, i);
    }

    private static TypedValue e() {
        TypedValue typedValue = a.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        a.set(typedValue2);
        return typedValue2;
    }

    private static ColorStateList f(Context context, int i) {
        if (g(context, i)) {
            return null;
        }
        Resources resources = context.getResources();
        try {
            return g1.a(resources, resources.getXml(i), context.getTheme());
        } catch (Exception e) {
            Log.e(C0201.m82(27389), C0201.m82(27390), e);
            return null;
        }
    }

    private static boolean g(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue e = e();
        resources.getValue(i, e, true);
        int i2 = e.type;
        if (i2 < 28 || i2 > 31) {
            return false;
        }
        return true;
    }
}
