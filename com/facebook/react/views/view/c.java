package com.facebook.react.views.view;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.TypedValue;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.uimanager.q;
import vigqyno.C0201;

/* compiled from: ReactDrawableHelper */
public class c {
    private static final TypedValue a = new TypedValue();

    @TargetApi(21)
    public static Drawable a(Context context, ReadableMap readableMap) {
        String string = readableMap.getString(C0201.m82(17435));
        if (C0201.m82(17436).equals(string)) {
            String string2 = readableMap.getString(C0201.m82(17437));
            SoftAssertions.assertNotNull(string2);
            int identifier = context.getResources().getIdentifier(string2, C0201.m82(17438), C0201.m82(17439));
            String r2 = C0201.m82(17440);
            if (identifier == 0) {
                throw new JSApplicationIllegalArgumentException(r2 + string2 + C0201.m82(17442));
            } else if (context.getTheme().resolveAttribute(identifier, a, true)) {
                Drawable c = c(context);
                f(readableMap, c);
                return c;
            } else {
                throw new JSApplicationIllegalArgumentException(r2 + string2 + C0201.m82(17441));
            }
        } else if (C0201.m82(17443).equals(string)) {
            RippleDrawable e = e(context, readableMap);
            f(readableMap, e);
            return e;
        } else {
            throw new JSApplicationIllegalArgumentException(C0201.m82(17444) + string);
        }
    }

    private static int b(Context context, ReadableMap readableMap) {
        String r0 = C0201.m82(17445);
        if (readableMap.hasKey(r0) && !readableMap.isNull(r0)) {
            return readableMap.getInt(r0);
        }
        if (context.getTheme().resolveAttribute(16843820, a, true)) {
            return context.getResources().getColor(a.resourceId);
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(17446));
    }

    private static Drawable c(Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getResources().getDrawable(a.resourceId, context.getTheme());
        }
        return context.getResources().getDrawable(a.resourceId);
    }

    private static Drawable d(ReadableMap readableMap) {
        String r0 = C0201.m82(17447);
        if (!readableMap.hasKey(r0) || readableMap.isNull(r0) || !readableMap.getBoolean(r0)) {
            return new ColorDrawable(-1);
        }
        return null;
    }

    private static RippleDrawable e(Context context, ReadableMap readableMap) {
        if (Build.VERSION.SDK_INT >= 21) {
            int b = b(context, readableMap);
            return new RippleDrawable(new ColorStateList(new int[][]{new int[0]}, new int[]{b}), null, d(readableMap));
        }
        throw new JSApplicationIllegalArgumentException(C0201.m82(17448));
    }

    private static Drawable f(ReadableMap readableMap, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            String r0 = C0201.m82(17449);
            if (readableMap.hasKey(r0) && (drawable instanceof RippleDrawable)) {
                ((RippleDrawable) drawable).setRadius((int) q.b(readableMap.getDouble(r0)));
            }
        }
        return drawable;
    }
}
