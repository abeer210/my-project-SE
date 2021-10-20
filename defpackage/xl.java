package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.core.content.b;
import vigqyno.C0201;

/* renamed from: xl  reason: default package */
/* compiled from: DrawableDecoderCompat */
public final class xl {
    private static volatile boolean a;

    static {
        C0201.m83(xl.class, 536);
    }

    public static Drawable a(Context context, int i, Resources.Theme theme) {
        return c(context, context, i, theme);
    }

    public static Drawable b(Context context, Context context2, int i) {
        return c(context, context2, i, null);
    }

    private static Drawable c(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (a) {
                return e(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return b.f(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return d(context2, i, theme);
    }

    private static Drawable d(Context context, int i, Resources.Theme theme) {
        return l1.b(context.getResources(), i, theme);
    }

    private static Drawable e(Context context, int i, Resources.Theme theme) {
        if (theme != null) {
            context = new y(context, theme);
        }
        return n.d(context, i);
    }
}
