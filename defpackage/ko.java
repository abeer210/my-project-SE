package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import vigqyno.C0201;

/* renamed from: ko  reason: default package */
/* compiled from: ImageViewTargetFactory */
public class ko {
    public <Z> oo<ImageView, Z> a(ImageView imageView, Class<Z> cls) {
        if (Bitmap.class.equals(cls)) {
            return new fo(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new io(imageView);
        }
        throw new IllegalArgumentException(C0201.m82(27759) + cls + C0201.m82(27760));
    }
}
