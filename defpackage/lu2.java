package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import android.view.WindowManager;
import com.yalantis.ucrop.task.a;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import vigqyno.C0201;

/* renamed from: lu2  reason: default package */
/* compiled from: BitmapLoadUtils */
public class lu2 {
    public static int a(BitmapFactory.Options options, int i, int i2) {
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 1;
        if (i3 > i2 || i4 > i) {
            while (true) {
                if (i3 / i5 <= i2 && i4 / i5 <= i) {
                    break;
                }
                i5 *= 2;
            }
        }
        return i5;
    }

    public static int b(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(C0201.m82(7711));
        Point point = new Point();
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getSize(point);
        }
        int sqrt = (int) Math.sqrt(Math.pow((double) point.x, 2.0d) + Math.pow((double) point.y, 2.0d));
        Canvas canvas = new Canvas();
        int min = Math.min(canvas.getMaximumBitmapWidth(), canvas.getMaximumBitmapHeight());
        if (min > 0) {
            sqrt = Math.min(sqrt, min);
        }
        int c = nu2.c();
        if (c > 0) {
            sqrt = Math.min(sqrt, c);
        }
        Log.d(C0201.m82(7713), C0201.m82(7712) + sqrt);
        return sqrt;
    }

    public static void c(Closeable closeable) {
        if (closeable != null && (closeable instanceof Closeable)) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static void d(Context context, Uri uri, Uri uri2, int i, int i2, eu2 eu2) {
        new a(context, uri, uri2, i, i2, eu2).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public static int e(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static int f(int i) {
        return (i == 2 || i == 7 || i == 4 || i == 5) ? -1 : 1;
    }

    public static int g(Context context, Uri uri) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return 0;
            }
            int c = new qu2(openInputStream).c();
            c(openInputStream);
            return c;
        } catch (IOException e) {
            Log.e(C0201.m82(7715), C0201.m82(7714) + uri.toString(), e);
            return 0;
        }
    }

    public static Bitmap h(Bitmap bitmap, Matrix matrix) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            return !bitmap.sameAs(createBitmap) ? createBitmap : bitmap;
        } catch (OutOfMemoryError e) {
            Log.e(C0201.m82(7716), C0201.m82(7717), e);
            return bitmap;
        }
    }
}
