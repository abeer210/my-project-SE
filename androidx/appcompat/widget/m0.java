package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* compiled from: ResourceManagerInternal */
public final class m0 {
    private static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    private static m0 i;
    private static final c j = new c(6);
    private WeakHashMap<Context, y0<ColorStateList>> a;
    private r0<String, d> b;
    private y0<String> c;
    private final WeakHashMap<Context, u0<WeakReference<Drawable.ConstantState>>> d = new WeakHashMap<>(0);
    private TypedValue e;
    private boolean f;
    private e g;

    /* access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal */
    public static class a implements d {
        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return o.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0201.m82(8267), C0201.m82(8268), e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal */
    public static class b implements d {
        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return j7.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0201.m82(8250), C0201.m82(8251), e);
                return null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal */
    public static class c extends v0<Integer, PorterDuffColorFilter> {
        public c(int i) {
            super(i);
        }

        private static int h(int i, PorterDuff.Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        public PorterDuffColorFilter i(int i, PorterDuff.Mode mode) {
            return (PorterDuffColorFilter) c(Integer.valueOf(h(i, mode)));
        }

        public PorterDuffColorFilter j(int i, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) d(Integer.valueOf(h(i, mode)), porterDuffColorFilter);
        }
    }

    /* access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal */
    public interface d {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* access modifiers changed from: package-private */
    /* compiled from: ResourceManagerInternal */
    public interface e {
        boolean a(Context context, int i, Drawable drawable);

        PorterDuff.Mode b(int i);

        Drawable c(m0 m0Var, Context context, int i);

        ColorStateList d(Context context, int i);

        boolean e(Context context, int i, Drawable drawable);
    }

    /* access modifiers changed from: private */
    /* compiled from: ResourceManagerInternal */
    public static class f implements d {
        @Override // androidx.appcompat.widget.m0.d
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return p7.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e) {
                Log.e(C0201.m82(8590), C0201.m82(8591), e);
                return null;
            }
        }
    }

    private void a(String str, d dVar) {
        if (this.b == null) {
            this.b = new r0<>();
        }
        this.b.put(str, dVar);
    }

    private synchronized boolean b(Context context, long j2, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        u0<WeakReference<Drawable.ConstantState>> u0Var = this.d.get(context);
        if (u0Var == null) {
            u0Var = new u0<>();
            this.d.put(context, u0Var);
        }
        u0Var.m(j2, new WeakReference<>(constantState));
        return true;
    }

    private void c(Context context, int i2, ColorStateList colorStateList) {
        if (this.a == null) {
            this.a = new WeakHashMap<>();
        }
        y0<ColorStateList> y0Var = this.a.get(context);
        if (y0Var == null) {
            y0Var = new y0<>();
            this.a.put(context, y0Var);
        }
        y0Var.a(i2, colorStateList);
    }

    private void d(Context context) {
        if (!this.f) {
            this.f = true;
            Drawable j2 = j(context, s.abc_vector_test);
            if (j2 == null || !q(j2)) {
                this.f = false;
                throw new IllegalStateException(C0201.m82(24915));
            }
        }
    }

    private static long e(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private Drawable f(Context context, int i2) {
        Drawable drawable;
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        context.getResources().getValue(i2, typedValue, true);
        long e2 = e(typedValue);
        Drawable i3 = i(context, e2);
        if (i3 != null) {
            return i3;
        }
        e eVar = this.g;
        if (eVar == null) {
            drawable = null;
        } else {
            drawable = eVar.c(this, context, i2);
        }
        if (drawable != null) {
            drawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e2, drawable);
        }
        return drawable;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized m0 h() {
        m0 m0Var;
        synchronized (m0.class) {
            if (i == null) {
                m0 m0Var2 = new m0();
                i = m0Var2;
                p(m0Var2);
            }
            m0Var = i;
        }
        return m0Var;
    }

    private synchronized Drawable i(Context context, long j2) {
        u0<WeakReference<Drawable.ConstantState>> u0Var = this.d.get(context);
        if (u0Var == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> g2 = u0Var.g(j2);
        if (g2 != null) {
            Drawable.ConstantState constantState = g2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            u0Var.e(j2);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter i3;
        synchronized (m0.class) {
            i3 = j.i(i2, mode);
            if (i3 == null) {
                i3 = new PorterDuffColorFilter(i2, mode);
                j.j(i2, mode, i3);
            }
        }
        return i3;
    }

    private ColorStateList n(Context context, int i2) {
        y0<ColorStateList> y0Var;
        WeakHashMap<Context, y0<ColorStateList>> weakHashMap = this.a;
        if (weakHashMap == null || (y0Var = weakHashMap.get(context)) == null) {
            return null;
        }
        return y0Var.e(i2);
    }

    private static void p(m0 m0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            m0Var.a(C0201.m82(24916), new f());
            m0Var.a(C0201.m82(24917), new b());
            m0Var.a(C0201.m82(24918), new a());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof p7) || C0201.m82(24919).equals(drawable.getClass().getName());
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[Catch:{ Exception -> 0x00b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a4 A[Catch:{ Exception -> 0x00b1 }] */
    private Drawable r(Context context, int i2) {
        int next;
        r0<String, d> r0Var = this.b;
        if (r0Var == null || r0Var.isEmpty()) {
            return null;
        }
        y0<String> y0Var = this.c;
        String r2 = C0201.m82(24920);
        if (y0Var != null) {
            String e2 = y0Var.e(i2);
            if (r2.equals(e2) || (e2 != null && this.b.get(e2) == null)) {
                return null;
            }
        } else {
            this.c = new y0<>();
        }
        if (this.e == null) {
            this.e = new TypedValue();
        }
        TypedValue typedValue = this.e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long e3 = e(typedValue);
        Drawable i3 = i(context, e3);
        if (i3 != null) {
            return i3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(C0201.m82(24921))) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                while (true) {
                    next = xml.next();
                    if (next == 2 || next == 1) {
                        if (next != 2) {
                            String name = xml.getName();
                            this.c.a(i2, name);
                            d dVar = this.b.get(name);
                            if (dVar != null) {
                                i3 = dVar.a(context, xml, asAttributeSet, context.getTheme());
                            }
                            if (i3 != null) {
                                i3.setChangingConfigurations(typedValue.changingConfigurations);
                                b(context, e3, i3);
                            }
                        } else {
                            throw new XmlPullParserException(C0201.m82(24922));
                        }
                    }
                }
                if (next != 2) {
                }
            } catch (Exception e4) {
                Log.e(C0201.m82(24923), C0201.m82(24924), e4);
            }
        }
        if (i3 == null) {
            this.c.a(i2, r2);
        }
        return i3;
    }

    private Drawable v(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList m = m(context, i2);
        if (m != null) {
            if (e0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r = androidx.core.graphics.drawable.a.r(drawable);
            androidx.core.graphics.drawable.a.o(r, m);
            PorterDuff.Mode o = o(i2);
            if (o == null) {
                return r;
            }
            androidx.core.graphics.drawable.a.p(r, o);
            return r;
        }
        e eVar = this.g;
        if ((eVar == null || !eVar.e(context, i2, drawable)) && !x(context, i2, drawable) && z) {
            return null;
        }
        return drawable;
    }

    public static void w(Drawable drawable, v0 v0Var, int[] iArr) {
        if (!e0.a(drawable) || drawable.mutate() == drawable) {
            if (v0Var.d || v0Var.c) {
                drawable.setColorFilter(g(v0Var.d ? v0Var.a : null, v0Var.c ? v0Var.b : h, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d(C0201.m82(24925), C0201.m82(24926));
    }

    public synchronized Drawable j(Context context, int i2) {
        return k(context, i2, false);
    }

    public synchronized Drawable k(Context context, int i2, boolean z) {
        Drawable r;
        d(context);
        r = r(context, i2);
        if (r == null) {
            r = f(context, i2);
        }
        if (r == null) {
            r = androidx.core.content.b.f(context, i2);
        }
        if (r != null) {
            r = v(context, i2, z, r);
        }
        if (r != null) {
            e0.b(r);
        }
        return r;
    }

    public synchronized ColorStateList m(Context context, int i2) {
        ColorStateList n;
        n = n(context, i2);
        if (n == null) {
            n = this.g == null ? null : this.g.d(context, i2);
            if (n != null) {
                c(context, i2, n);
            }
        }
        return n;
    }

    public PorterDuff.Mode o(int i2) {
        e eVar = this.g;
        if (eVar == null) {
            return null;
        }
        return eVar.b(i2);
    }

    public synchronized void s(Context context) {
        u0<WeakReference<Drawable.ConstantState>> u0Var = this.d.get(context);
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public synchronized Drawable t(Context context, c1 c1Var, int i2) {
        Drawable r = r(context, i2);
        if (r == null) {
            r = c1Var.d(i2);
        }
        if (r == null) {
            return null;
        }
        return v(context, i2, false, r);
    }

    public synchronized void u(e eVar) {
        this.g = eVar;
    }

    public boolean x(Context context, int i2, Drawable drawable) {
        e eVar = this.g;
        return eVar != null && eVar.a(context, i2, drawable);
    }
}
