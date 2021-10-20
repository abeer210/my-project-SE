package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.util.g;
import defpackage.i1;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import vigqyno.C0201;

/* renamed from: l1  reason: default package */
/* compiled from: ResourcesCompat */
public final class l1 {
    public static final String a = null;
    public static final String b = null;
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    public static final String f = null;
    public static final String g = null;
    public static final String h = null;
    public static final String i = null;

    /* renamed from: l1$a */
    /* compiled from: ResourcesCompat */
    public static abstract class a {

        /* access modifiers changed from: package-private */
        /* renamed from: l1$a$a  reason: collision with other inner class name */
        /* compiled from: ResourcesCompat */
        public class RunnableC0150a implements Runnable {
            public final /* synthetic */ Typeface a;

            public RunnableC0150a(Typeface typeface) {
                this.a = typeface;
            }

            public void run() {
                a.this.d(this.a);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l1$a$b */
        /* compiled from: ResourcesCompat */
        public class b implements Runnable {
            public final /* synthetic */ int a;

            public b(int i) {
                this.a = i;
            }

            public void run() {
                a.this.c(this.a);
            }
        }

        public final void a(int i, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new b(i));
        }

        public final void b(Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new RunnableC0150a(typeface));
        }

        public abstract void c(int i);

        public abstract void d(Typeface typeface);
    }

    static {
        C0201.m83(l1.class, 78);
    }

    public static int a(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i2, theme);
        }
        return resources.getColor(i2);
    }

    public static Drawable b(Resources resources, int i2, Resources.Theme theme) throws Resources.NotFoundException {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i2, theme);
        }
        return resources.getDrawable(i2);
    }

    public static Typeface c(Context context, int i2) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i2, new TypedValue(), 0, null, null, false);
    }

    public static Typeface d(Context context, int i2, TypedValue typedValue, int i3, a aVar) throws Resources.NotFoundException {
        if (context.isRestricted()) {
            return null;
        }
        return f(context, i2, typedValue, i3, aVar, null, true);
    }

    public static void e(Context context, int i2, a aVar, Handler handler) throws Resources.NotFoundException {
        g.c(aVar);
        if (context.isRestricted()) {
            aVar.a(-4, handler);
        } else {
            f(context, i2, new TypedValue(), 0, aVar, handler, false);
        }
    }

    private static Typeface f(Context context, int i2, TypedValue typedValue, int i3, a aVar, Handler handler, boolean z) {
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        Typeface g2 = g(context, resources, typedValue, i2, i3, aVar, handler, z);
        if (g2 != null || aVar != null) {
            return g2;
        }
        throw new Resources.NotFoundException(C0201.m82(25120) + Integer.toHexString(i2) + C0201.m82(25121));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
    private static Typeface g(Context context, Resources resources, TypedValue typedValue, int i2, int i3, a aVar, Handler handler, boolean z) {
        String str = g;
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (!charSequence2.startsWith(e)) {
                if (aVar != null) {
                    aVar.a(-3, handler);
                }
                return null;
            }
            Typeface f2 = p1.f(resources, i2, i3);
            if (f2 != null) {
                if (aVar != null) {
                    aVar.b(f2, handler);
                }
                return f2;
            }
            try {
                if (charSequence2.toLowerCase().endsWith(b)) {
                    i1.a b2 = i1.b(resources.getXml(i2), resources);
                    if (b2 != null) {
                        return p1.c(context, b2, resources, i2, i3, aVar, handler, z);
                    }
                    Log.e(str, f);
                    if (aVar != null) {
                        aVar.a(-3, handler);
                    }
                    return null;
                }
                Typeface d2 = p1.d(context, resources, i2, charSequence2, i3);
                if (aVar != null) {
                    if (d2 != null) {
                        aVar.b(d2, handler);
                    } else {
                        aVar.a(-3, handler);
                    }
                }
                return d2;
            } catch (XmlPullParserException e2) {
                Log.e(str, c + charSequence2, e2);
                if (aVar != null) {
                    aVar.a(-3, handler);
                }
                return null;
            } catch (IOException e3) {
                Log.e(str, d + charSequence2, e3);
                if (aVar != null) {
                }
                return null;
            }
        } else {
            throw new Resources.NotFoundException(i + resources.getResourceName(i2) + a + Integer.toHexString(i2) + h + typedValue);
        }
    }
}
