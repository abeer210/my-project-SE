package com.yalantis.ucrop.task;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import vigqyno.C0201;

public class BitmapCropTask extends AsyncTask<Void, Void, Throwable> {
    private Bitmap a;
    private final RectF b;
    private final RectF c;
    private float d;
    private float e;
    private final int f;
    private final int g;
    private final Bitmap.CompressFormat h;
    private final int i;
    private final String j;
    private final String k;
    private final ju2 l;
    private final du2 m;
    private int n;
    private int o;
    private int p;
    private int q;

    static {
        System.loadLibrary(C0201.m82(26758));
    }

    public BitmapCropTask(Bitmap bitmap, ku2 ku2, iu2 iu2, du2 du2) {
        this.a = bitmap;
        this.b = ku2.a();
        this.c = ku2.c();
        this.d = ku2.d();
        this.e = ku2.b();
        this.f = iu2.f();
        this.g = iu2.g();
        this.h = iu2.a();
        this.i = iu2.b();
        this.j = iu2.d();
        this.k = iu2.e();
        this.l = iu2.c();
        this.m = du2;
    }

    private boolean a(float f2) throws IOException {
        k4 k4Var = new k4(this.j);
        this.p = Math.round((this.b.left - this.c.left) / this.d);
        this.q = Math.round((this.b.top - this.c.top) / this.d);
        this.n = Math.round(this.b.width() / this.d);
        int round = Math.round(this.b.height() / this.d);
        this.o = round;
        boolean e2 = e(this.n, round);
        Log.i(C0201.m82(26760), C0201.m82(26759) + e2);
        if (e2) {
            boolean cropCImg = cropCImg(this.j, this.k, this.p, this.q, this.n, this.o, this.e, f2, this.h.ordinal(), this.i, this.l.a(), this.l.b());
            if (cropCImg && this.h.equals(Bitmap.CompressFormat.JPEG)) {
                qu2.b(k4Var, this.n, this.o, this.k);
            }
            return cropCImg;
        }
        pu2.a(this.j, this.k);
        return false;
    }

    public static native boolean cropCImg(String str, String str2, int i2, int i3, int i4, int i5, float f2, float f3, int i6, int i7, int i8, int i9) throws IOException, OutOfMemoryError;

    private float d() {
        BitmapFactory.Options options = new BitmapFactory.Options();
        boolean z = true;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(this.j, options);
        if (!(this.l.a() == 90 || this.l.a() == 270)) {
            z = false;
        }
        this.d /= Math.min(((float) (z ? options.outHeight : options.outWidth)) / ((float) this.a.getWidth()), ((float) (z ? options.outWidth : options.outHeight)) / ((float) this.a.getHeight()));
        if (this.f <= 0 || this.g <= 0) {
            return 1.0f;
        }
        float width = this.b.width() / this.d;
        float height = this.b.height() / this.d;
        if (width <= ((float) this.f) && height <= ((float) this.g)) {
            return 1.0f;
        }
        float min = Math.min(((float) this.f) / width, ((float) this.g) / height);
        this.d /= min;
        return min;
    }

    private boolean e(int i2, int i3) {
        int round = Math.round(((float) Math.max(i2, i3)) / 1000.0f) + 1;
        if (this.f > 0 && this.g > 0) {
            return true;
        }
        float f2 = (float) round;
        if (Math.abs(this.b.left - this.c.left) > f2 || Math.abs(this.b.top - this.c.top) > f2 || Math.abs(this.b.bottom - this.c.bottom) > f2 || Math.abs(this.b.right - this.c.right) > f2 || this.e != 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public Throwable doInBackground(Void... voidArr) {
        Bitmap bitmap = this.a;
        if (bitmap == null) {
            return new NullPointerException(C0201.m82(26761));
        }
        if (bitmap.isRecycled()) {
            return new NullPointerException(C0201.m82(26762));
        }
        if (this.c.isEmpty()) {
            return new NullPointerException(C0201.m82(26763));
        }
        try {
            a(d());
            this.a = null;
            return null;
        } catch (Throwable th) {
            return th;
        }
    }

    /* renamed from: c */
    public void onPostExecute(Throwable th) {
        du2 du2 = this.m;
        if (du2 == null) {
            return;
        }
        if (th == null) {
            this.m.a(Uri.fromFile(new File(this.k)), this.p, this.q, this.n, this.o);
            return;
        }
        du2.b(th);
    }
}
