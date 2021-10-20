package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.concurrent.locks.Lock;
import vigqyno.C0201;

/* renamed from: gl  reason: default package */
/* compiled from: DrawableToBitmapConverter */
public final class gl {
    private static final qi a = new a();

    /* renamed from: gl$a */
    /* compiled from: DrawableToBitmapConverter */
    class a extends ri {
        @Override // defpackage.ri, defpackage.qi
        public void c(Bitmap bitmap) {
        }
    }

    public static hi<Bitmap> a(qi qiVar, Drawable drawable, int i, int i2) {
        Bitmap bitmap;
        Drawable current = drawable.getCurrent();
        boolean z = false;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            bitmap = b(qiVar, current, i, i2);
            z = true;
        } else {
            bitmap = null;
        }
        if (!z) {
            qiVar = a;
        }
        return xk.d(bitmap, qiVar);
    }

    private static Bitmap b(qi qiVar, Drawable drawable, int i, int i2) {
        String r0 = C0201.m82(17652);
        String r4 = C0201.m82(17653);
        if (i == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable(r4, 5)) {
                Log.w(r4, r0 + drawable + C0201.m82(17654));
            }
            return null;
        } else if (i2 != Integer.MIN_VALUE || drawable.getIntrinsicHeight() > 0) {
            if (drawable.getIntrinsicWidth() > 0) {
                i = drawable.getIntrinsicWidth();
            }
            if (drawable.getIntrinsicHeight() > 0) {
                i2 = drawable.getIntrinsicHeight();
            }
            Lock f = sl.f();
            f.lock();
            Bitmap d = qiVar.d(i, i2, Bitmap.Config.ARGB_8888);
            try {
                Canvas canvas = new Canvas(d);
                drawable.setBounds(0, 0, i, i2);
                drawable.draw(canvas);
                canvas.setBitmap(null);
                return d;
            } finally {
                f.unlock();
            }
        } else {
            if (Log.isLoggable(r4, 5)) {
                Log.w(r4, r0 + drawable + C0201.m82(17655));
            }
            return null;
        }
    }
}
