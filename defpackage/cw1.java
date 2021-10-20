package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Property;
import java.util.WeakHashMap;
import vigqyno.C0201;

/* renamed from: cw1  reason: default package */
/* compiled from: DrawableAlphaProperty */
public class cw1 extends Property<Drawable, Integer> {
    public static final Property<Drawable, Integer> b = new cw1();
    private final WeakHashMap<Drawable, Integer> a = new WeakHashMap<>();

    private cw1() {
        super(Integer.class, C0201.m82(36235));
    }

    /* renamed from: a */
    public Integer get(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 19) {
            return Integer.valueOf(drawable.getAlpha());
        }
        if (this.a.containsKey(drawable)) {
            return this.a.get(drawable);
        }
        return 255;
    }

    /* renamed from: b */
    public void set(Drawable drawable, Integer num) {
        if (Build.VERSION.SDK_INT < 19) {
            this.a.put(drawable, num);
        }
        drawable.setAlpha(num.intValue());
    }
}
