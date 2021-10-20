package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import com.google.android.gms.dynamite.DynamiteModule;
import vigqyno.C0201;

/* renamed from: pp1  reason: default package */
public final class pp1 {
    public static boolean a(Context context, String str) {
        return DynamiteModule.a(context, str) > DynamiteModule.c(context, C0201.m82(6181));
    }

    public static Bitmap b(Bitmap bitmap, np1 np1) {
        int i;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (np1.e != 0) {
            Matrix matrix = new Matrix();
            int i2 = np1.e;
            if (i2 == 0) {
                i = 0;
            } else if (i2 == 1) {
                i = 90;
            } else if (i2 == 2) {
                i = 180;
            } else if (i2 == 3) {
                i = 270;
            } else {
                throw new IllegalArgumentException(C0201.m82(6182));
            }
            matrix.postRotate((float) i);
            bitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        }
        int i3 = np1.e;
        if (i3 == 1 || i3 == 3) {
            np1.a = height;
            np1.b = width;
        }
        return bitmap;
    }
}
