package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.provider.Settings;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;
import vigqyno.C0201;

/* renamed from: ag  reason: default package */
/* compiled from: Utils */
public final class ag {
    private static final PathMeasure a = new PathMeasure();
    private static final Path b = new Path();
    private static final Path c = new Path();
    private static final float[] d = new float[4];
    private static final float e = ((float) (Math.sqrt(2.0d) / 2.0d));
    private static float f = -1.0f;

    public static void a(Path path, float f2, float f3, float f4) {
        String r0 = C0201.m82(3192);
        ca.a(r0);
        a.setPath(path, false);
        float length = a.getLength();
        if (f2 == 1.0f && f3 == 0.0f) {
            ca.b(r0);
        } else if (length < 1.0f || ((double) Math.abs((f3 - f2) - 1.0f)) < 0.01d) {
            ca.b(r0);
        } else {
            float f5 = f2 * length;
            float f6 = f3 * length;
            float f7 = f4 * length;
            float min = Math.min(f5, f6) + f7;
            float max = Math.max(f5, f6) + f7;
            if (min >= length && max >= length) {
                min = (float) zf.f(min, length);
                max = (float) zf.f(max, length);
            }
            if (min < 0.0f) {
                min = (float) zf.f(min, length);
            }
            if (max < 0.0f) {
                max = (float) zf.f(max, length);
            }
            if (min == max) {
                path.reset();
                ca.b(r0);
                return;
            }
            if (min >= max) {
                min -= length;
            }
            b.reset();
            a.getSegment(min, max, b, true);
            if (max > length) {
                c.reset();
                a.getSegment(0.0f, max % length, c, true);
                b.addPath(c);
            } else if (min < 0.0f) {
                c.reset();
                a.getSegment(min + length, length, c, true);
                b.addPath(c);
            }
            path.set(b);
            ca.b(r0);
        }
    }

    public static void b(Path path, mb mbVar) {
        if (mbVar != null && !mbVar.k()) {
            a(path, ((pb) mbVar.i()).o() / 100.0f, ((pb) mbVar.f()).o() / 100.0f, ((pb) mbVar.h()).o() / 360.0f);
        }
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f2 = pointF.x;
            float f3 = pointF2.x;
            float f4 = pointF2.y;
            path.cubicTo(pointF3.x + f2, pointF.y + pointF3.y, f3 + pointF4.x, f4 + pointF4.y, f3, f4);
        }
        return path;
    }

    public static float e() {
        if (f == -1.0f) {
            f = Resources.getSystem().getDisplayMetrics().density;
        }
        return f;
    }

    public static float f(Context context) {
        int i = Build.VERSION.SDK_INT;
        String r2 = C0201.m82(3193);
        if (i >= 17) {
            return Settings.Global.getFloat(context.getContentResolver(), r2, 1.0f);
        }
        return Settings.System.getFloat(context.getContentResolver(), r2, 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f2 = e;
        fArr[2] = f2;
        fArr[3] = f2;
        matrix.mapPoints(fArr);
        float[] fArr2 = d;
        return (float) Math.hypot((double) (fArr2[2] - fArr2[0]), (double) (fArr2[3] - fArr2[1]));
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = d;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        float[] fArr2 = d;
        return fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3];
    }

    public static int i(float f2, float f3, float f4, float f5) {
        int i = f2 != 0.0f ? (int) (((float) 527) * f2) : 17;
        if (f3 != 0.0f) {
            i = (int) (((float) (i * 31)) * f3);
        }
        if (f4 != 0.0f) {
            i = (int) (((float) (i * 31)) * f4);
        }
        return f5 != 0.0f ? (int) (((float) (i * 31)) * f5) : i;
    }

    public static boolean j(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i4) {
            return false;
        }
        if (i > i4) {
            return true;
        }
        if (i2 < i5) {
            return false;
        }
        return i2 > i5 || i3 >= i6;
    }

    public static boolean k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap l(Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void m(Canvas canvas, RectF rectF, Paint paint) {
        n(canvas, rectF, paint, 31);
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint, int i) {
        String r0 = C0201.m82(3194);
        ca.a(r0);
        if (Build.VERSION.SDK_INT < 23) {
            canvas.saveLayer(rectF, paint, i);
        } else {
            canvas.saveLayer(rectF, paint);
        }
        ca.b(r0);
    }
}
