package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import vigqyno.C0201;

/* renamed from: sl  reason: default package */
/* compiled from: TransformationUtils */
public final class sl {
    private static final Paint a = new Paint(6);
    private static final Paint b;
    private static final Set<String> c;
    private static final Lock d;

    /* renamed from: sl$a */
    /* compiled from: TransformationUtils */
    private static final class a implements Lock {
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        public Condition newCondition() {
            throw new UnsupportedOperationException(C0201.m82(1317));
        }

        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        new Paint(7);
        HashSet hashSet = new HashSet(Arrays.asList(C0201.m82(5589), C0201.m82(5590), C0201.m82(5591), C0201.m82(5592), C0201.m82(5593), C0201.m82(5594), C0201.m82(5595), C0201.m82(5596), C0201.m82(5597), C0201.m82(5598), C0201.m82(5599), C0201.m82(5600), C0201.m82(5601), C0201.m82(5602), C0201.m82(5603), C0201.m82(5604), C0201.m82(5605), C0201.m82(5606), C0201.m82(5607), C0201.m82(5608), C0201.m82(5609), C0201.m82(5610), C0201.m82(5611), C0201.m82(5612), C0201.m82(5613), C0201.m82(5614), C0201.m82(5615), C0201.m82(5616), C0201.m82(5617)));
        c = hashSet;
        d = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new a();
        Paint paint = new Paint(7);
        b = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private static void a(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        d.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, a);
            d(canvas);
        } finally {
            d.unlock();
        }
    }

    public static Bitmap b(qi qiVar, Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap d2 = qiVar.d(i, i2, h(bitmap));
        l(bitmap, d2);
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Bitmap c(qi qiVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        String r2 = C0201.m82(5618);
        if (width > i || bitmap.getHeight() > i2) {
            if (Log.isLoggable(r2, 2)) {
                Log.v(r2, C0201.m82(5620));
            }
            return e(qiVar, bitmap, i, i2);
        }
        if (Log.isLoggable(r2, 2)) {
            Log.v(r2, C0201.m82(5619));
        }
        return bitmap;
    }

    private static void d(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap e(qi qiVar, Bitmap bitmap, int i, int i2) {
        int width = bitmap.getWidth();
        String r2 = C0201.m82(5621);
        if (width == i && bitmap.getHeight() == i2) {
            if (Log.isLoggable(r2, 2)) {
                Log.v(r2, C0201.m82(5622));
            }
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            if (Log.isLoggable(r2, 2)) {
                Log.v(r2, C0201.m82(5623));
            }
            return bitmap;
        }
        Bitmap d2 = qiVar.d((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), h(bitmap));
        l(bitmap, d2);
        if (Log.isLoggable(r2, 2)) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(5624));
            sb.append(i);
            String r8 = C0201.m82(5625);
            sb.append(r8);
            sb.append(i2);
            Log.v(r2, sb.toString());
            Log.v(r2, C0201.m82(5626) + bitmap.getWidth() + r8 + bitmap.getHeight());
            Log.v(r2, C0201.m82(5627) + d2.getWidth() + r8 + d2.getHeight());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C0201.m82(5628));
            sb2.append(min);
            Log.v(r2, sb2.toString());
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, d2, matrix);
        return d2;
    }

    public static Lock f() {
        return d;
    }

    public static int g(int i) {
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

    private static Bitmap.Config h(Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static void i(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }

    public static boolean j(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap k(qi qiVar, Bitmap bitmap, int i) {
        if (!j(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        i(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap d2 = qiVar.d(Math.round(rectF.width()), Math.round(rectF.height()), h(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        d2.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, d2, matrix);
        return d2;
    }

    public static void l(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
