package androidx.appcompat.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.appcompat.widget.b0;
import androidx.appcompat.widget.d;
import androidx.appcompat.widget.f;
import androidx.appcompat.widget.g;
import androidx.appcompat.widget.h;
import androidx.appcompat.widget.k;
import androidx.appcompat.widget.m;
import androidx.appcompat.widget.o;
import androidx.appcompat.widget.p;
import androidx.appcompat.widget.s;
import androidx.appcompat.widget.t;
import androidx.appcompat.widget.u;
import androidx.appcompat.widget.u0;
import androidx.appcompat.widget.w;
import androidx.appcompat.widget.z;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import vigqyno.C0201;

public class AppCompatViewInflater {
    private static final Class<?>[] b = {Context.class, AttributeSet.class};
    private static final int[] c = {16843375};
    private static final String[] d = {C0201.m82(11529), C0201.m82(11530), C0201.m82(11531)};
    private static final Map<String, Constructor<? extends View>> e = new r0();
    private final Object[] a = new Object[2];

    /* access modifiers changed from: private */
    public static class a implements View.OnClickListener {
        private final View a;
        private final String b;
        private Method c;
        private Context d;

        public a(View view, String str) {
            this.a = view;
            this.b = str;
        }

        private void a(Context context, String str) {
            String str2;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.b, View.class)) != null) {
                        this.c = method;
                        this.d = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.a.getId();
            if (id == -1) {
                str2 = C0201.m82(11015);
            } else {
                str2 = C0201.m82(11016) + this.a.getContext().getResources().getResourceEntryName(id) + C0201.m82(11017);
            }
            throw new IllegalStateException(C0201.m82(11018) + this.b + C0201.m82(11019) + this.a.getClass() + str2);
        }

        public void onClick(View view) {
            w30.g(view);
            try {
                if (this.c == null) {
                    a(this.a.getContext(), this.b);
                }
                try {
                    this.c.invoke(this.d, view);
                } catch (IllegalAccessException e) {
                    throw new IllegalStateException(C0201.m82(11021), e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(C0201.m82(11020), e2);
                }
            } finally {
                w30.h();
            }
        }
    }

    private void a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (Build.VERSION.SDK_INT < 15 || k3.I(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View r(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        Constructor<? extends View> constructor = e.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(b);
            e.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.a);
    }

    private View s(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(C0201.m82(11532))) {
            str = attributeSet.getAttributeValue(null, C0201.m82(11533));
        }
        try {
            this.a[0] = context;
            this.a[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                for (int i = 0; i < d.length; i++) {
                    View r = r(context, str, d[i]);
                    if (r != null) {
                        return r;
                    }
                }
                Object[] objArr = this.a;
                objArr[0] = null;
                objArr[1] = null;
                return null;
            }
            View r2 = r(context, str, null);
            Object[] objArr2 = this.a;
            objArr2[0] = null;
            objArr2[1] = null;
            return r2;
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr3 = this.a;
            objArr3[0] = null;
            objArr3[1] = null;
        }
    }

    private static Context t(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(m.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0 && (resourceId = obtainStyledAttributes.getResourceId(m.View_theme, 0)) != 0) {
            Log.i(C0201.m82(11534), C0201.m82(11535));
        }
        obtainStyledAttributes.recycle();
        if (resourceId != 0) {
            return (!(context instanceof y) || ((y) context).b() != resourceId) ? new y(context, resourceId) : context;
        }
        return context;
    }

    private void u(View view, String str) {
        if (view == null) {
            throw new IllegalStateException(getClass().getName() + C0201.m82(11536) + str + C0201.m82(11537));
        }
    }

    public d b(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public f c(Context context, AttributeSet attributeSet) {
        return new f(context, attributeSet);
    }

    public g d(Context context, AttributeSet attributeSet) {
        return new g(context, attributeSet);
    }

    public h e(Context context, AttributeSet attributeSet) {
        return new h(context, attributeSet);
    }

    public k f(Context context, AttributeSet attributeSet) {
        return new k(context, attributeSet);
    }

    public m g(Context context, AttributeSet attributeSet) {
        return new m(context, attributeSet);
    }

    public o h(Context context, AttributeSet attributeSet) {
        return new o(context, attributeSet);
    }

    public p i(Context context, AttributeSet attributeSet) {
        return new p(context, attributeSet);
    }

    public s j(Context context, AttributeSet attributeSet) {
        return new s(context, attributeSet);
    }

    public t k(Context context, AttributeSet attributeSet) {
        return new t(context, attributeSet);
    }

    public u l(Context context, AttributeSet attributeSet) {
        return new u(context, attributeSet);
    }

    public w m(Context context, AttributeSet attributeSet) {
        return new w(context, attributeSet);
    }

    public z n(Context context, AttributeSet attributeSet) {
        return new z(context, attributeSet);
    }

    public b0 o(Context context, AttributeSet attributeSet) {
        return new b0(context, attributeSet);
    }

    public View p(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    public final View q(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        View view2;
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = t(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = u0.b(context2);
        }
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals(C0201.m82(11551))) {
                    c2 = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals(C0201.m82(11550))) {
                    c2 = '\b';
                    break;
                }
                break;
            case -1346021293:
                if (str.equals(C0201.m82(11549))) {
                    c2 = '\n';
                    break;
                }
                break;
            case -938935918:
                if (str.equals(C0201.m82(11548))) {
                    c2 = 0;
                    break;
                }
                break;
            case -937446323:
                if (str.equals(C0201.m82(11547))) {
                    c2 = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals(C0201.m82(11546))) {
                    c2 = '\f';
                    break;
                }
                break;
            case -339785223:
                if (str.equals(C0201.m82(11545))) {
                    c2 = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals(C0201.m82(11544))) {
                    c2 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals(C0201.m82(11543))) {
                    c2 = '\r';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals(C0201.m82(11542))) {
                    c2 = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals(C0201.m82(11541))) {
                    c2 = '\t';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals(C0201.m82(11540))) {
                    c2 = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals(C0201.m82(11539))) {
                    c2 = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals(C0201.m82(11538))) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                view2 = n(context2, attributeSet);
                u(view2, str);
                break;
            case 1:
                view2 = h(context2, attributeSet);
                u(view2, str);
                break;
            case 2:
                view2 = c(context2, attributeSet);
                u(view2, str);
                break;
            case 3:
                view2 = f(context2, attributeSet);
                u(view2, str);
                break;
            case 4:
                view2 = m(context2, attributeSet);
                u(view2, str);
                break;
            case 5:
                view2 = g(context2, attributeSet);
                u(view2, str);
                break;
            case 6:
                view2 = d(context2, attributeSet);
                u(view2, str);
                break;
            case 7:
                view2 = j(context2, attributeSet);
                u(view2, str);
                break;
            case '\b':
                view2 = e(context2, attributeSet);
                u(view2, str);
                break;
            case '\t':
                view2 = b(context2, attributeSet);
                u(view2, str);
                break;
            case '\n':
                view2 = i(context2, attributeSet);
                u(view2, str);
                break;
            case 11:
                view2 = k(context2, attributeSet);
                u(view2, str);
                break;
            case '\f':
                view2 = l(context2, attributeSet);
                u(view2, str);
                break;
            case '\r':
                view2 = o(context2, attributeSet);
                u(view2, str);
                break;
            default:
                view2 = p(context2, str, attributeSet);
                break;
        }
        if (view2 == null && context != context2) {
            view2 = s(context2, str, attributeSet);
        }
        if (view2 != null) {
            a(view2, attributeSet);
        }
        return view2;
    }
}
