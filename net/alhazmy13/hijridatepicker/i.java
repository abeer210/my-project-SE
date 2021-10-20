package net.alhazmy13.hijridatepicker;

import android.content.Context;
import android.graphics.Typeface;
import vigqyno.C0201;

/* compiled from: TypefaceHelper */
public class i {
    private static final x0<String, Typeface> a = new x0<>();

    public static Typeface a(Context context, String str) {
        synchronized (a) {
            if (!a.containsKey(str)) {
                Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), String.format(C0201.m82(27654), str));
                a.put(str, createFromAsset);
                return createFromAsset;
            }
            return a.get(str);
        }
    }
}
