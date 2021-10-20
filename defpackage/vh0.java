package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import java.io.OutputStream;
import vigqyno.C0201;

/* renamed from: vh0  reason: default package */
/* compiled from: SimpleImageTranscoder */
public class vh0 implements rh0 {
    public static final String c = null;
    public static final String d = null;
    public static final String e = null;
    private final boolean a;
    private final int b;

    static {
        C0201.m83(vh0.class, 91);
    }

    public vh0(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    private static Bitmap.CompressFormat e(ob0 ob0) {
        if (ob0 == null) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (ob0 == nb0.a) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (ob0 == nb0.b) {
            return Bitmap.CompressFormat.PNG;
        }
        if (Build.VERSION.SDK_INT < 14 || !nb0.a(ob0)) {
            return Bitmap.CompressFormat.JPEG;
        }
        return Bitmap.CompressFormat.WEBP;
    }

    private int f(af0 af0, sd0 sd0, rd0 rd0) {
        if (!this.a) {
            return 1;
        }
        return ph0.b(sd0, rd0, af0, this.b);
    }

    @Override // defpackage.rh0
    public String a() {
        return C0201.m82(29283);
    }

    @Override // defpackage.rh0
    public boolean b(af0 af0, sd0 sd0, rd0 rd0) {
        if (sd0 == null) {
            sd0 = sd0.a();
        }
        if (!this.a || ph0.b(sd0, rd0, af0, this.b) <= 1) {
            return false;
        }
        return true;
    }

    @Override // defpackage.rh0
    public qh0 c(af0 af0, OutputStream outputStream, sd0 sd0, rd0 rd0, ob0 ob0, Integer num) {
        vh0 vh0;
        sd0 sd02;
        Bitmap bitmap;
        Throwable th;
        OutOfMemoryError e2;
        String str = d;
        String str2 = c;
        Integer num2 = num == null ? 85 : num;
        if (sd0 == null) {
            sd02 = sd0.a();
            vh0 = this;
        } else {
            vh0 = this;
            sd02 = sd0;
        }
        int f = vh0.f(af0, sd02, rd0);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = f;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(af0.w(), null, options);
            if (decodeStream == null) {
                f60.i(str2, e);
                return new qh0(2);
            }
            Matrix g = th0.g(af0, sd02);
            if (g != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), g, false);
                } catch (OutOfMemoryError e3) {
                    e2 = e3;
                    bitmap = decodeStream;
                    try {
                        f60.j(str2, str, e2);
                        qh0 qh0 = new qh0(2);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return qh0;
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap.recycle();
                        decodeStream.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(e(ob0), num2.intValue(), outputStream);
                int i = 1;
                if (f > 1) {
                    i = 0;
                }
                qh0 qh02 = new qh0(i);
                bitmap.recycle();
                decodeStream.recycle();
                return qh02;
            } catch (OutOfMemoryError e4) {
                e2 = e4;
                f60.j(str2, str, e2);
                qh0 qh03 = new qh0(2);
                bitmap.recycle();
                decodeStream.recycle();
                return qh03;
            }
        } catch (OutOfMemoryError e5) {
            f60.j(str2, str, e5);
            return new qh0(2);
        }
    }

    @Override // defpackage.rh0
    public boolean d(ob0 ob0) {
        return ob0 == nb0.k || ob0 == nb0.a;
    }
}
