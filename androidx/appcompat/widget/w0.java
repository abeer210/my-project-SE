package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* compiled from: TintResources */
public class w0 extends n0 {
    private final WeakReference<Context> b;

    public w0(Context context, Resources resources) {
        super(resources);
        this.b = new WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.n0, android.content.res.Resources
    public Drawable getDrawable(int i) throws Resources.NotFoundException {
        Drawable drawable = super.getDrawable(i);
        Context context = this.b.get();
        if (!(drawable == null || context == null)) {
            m0.h().x(context, i, drawable);
        }
        return drawable;
    }
}
