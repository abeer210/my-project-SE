package com.lwansbrough.RCTCamera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Base64;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import vigqyno.C0201;

/* compiled from: MutableImage */
public class a {
    private final byte[] a;
    private Bitmap b;
    private wr c;
    private boolean d = false;

    /* access modifiers changed from: private */
    /* renamed from: com.lwansbrough.RCTCamera.a$a  reason: collision with other inner class name */
    /* compiled from: MutableImage */
    public static class C0119a {
        private static String a(double d) {
            return d < 0.0d ? C0201.m82(35251) : C0201.m82(35252);
        }

        private static String b(double d) {
            return d < 0.0d ? C0201.m82(35253) : C0201.m82(35254);
        }

        private static String c(double d) {
            double abs = Math.abs(d);
            int i = (int) abs;
            double d2 = (double) i;
            Double.isNaN(d2);
            double d3 = (abs * 60.0d) - (d2 * 60.0d);
            int i2 = (int) d3;
            double d4 = (double) i2;
            Double.isNaN(d4);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(i);
            String r0 = C0201.m82(35255);
            stringBuffer.append(r0);
            stringBuffer.append(i2);
            stringBuffer.append(r0);
            stringBuffer.append((int) (((d3 * 60.0d) - (d4 * 60.0d)) * 1000.0d));
            stringBuffer.append(C0201.m82(35256));
            return stringBuffer.toString();
        }

        public static void d(double d, double d2, k4 k4Var) throws IOException {
            k4Var.T(C0201.m82(35257), c(d));
            k4Var.T(C0201.m82(35258), a(d));
            k4Var.T(C0201.m82(35259), c(d2));
            k4Var.T(C0201.m82(35260), b(d2));
        }
    }

    /* compiled from: MutableImage */
    public static class b extends Exception {
        public b(String str, Throwable th) {
            super(str, th);
        }

        public b(String str) {
            super(str);
        }
    }

    public a(byte[] bArr) {
        this.a = bArr;
        this.b = k(bArr);
    }

    private String a(String str) {
        String r0 = C0201.m82(4703);
        if (!str.contains(r0)) {
            return C0201.m82(4704);
        }
        return Double.toString(1.0d / Double.parseDouble(str.split(r0)[1]));
    }

    private wr g() throws mp, IOException {
        if (this.c == null) {
            this.c = lp.a(new BufferedInputStream(new ByteArrayInputStream(this.a)), (long) this.a.length);
        }
        return this.c;
    }

    private void h(k4 k4Var) {
        k4Var.T(C0201.m82(4705), String.valueOf(1));
    }

    private void i(int i) throws b {
        Matrix matrix = new Matrix();
        switch (i) {
            case 1:
                return;
            case 2:
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.postRotate(180.0f);
                break;
            case 4:
                matrix.postRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.postRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.postRotate(90.0f);
                break;
            case 7:
                matrix.postRotate(270.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.postRotate(270.0f);
                break;
        }
        Bitmap createBitmap = Bitmap.createBitmap(this.b, 0, 0, e(), d(), matrix, false);
        if (createBitmap != null) {
            this.b = createBitmap;
            this.d = true;
            return;
        }
        throw new b(C0201.m82(4706));
    }

    private static Bitmap k(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream);
            byteArrayInputStream.close();
            return decodeStream;
        } catch (IOException e) {
            throw new IllegalStateException(C0201.m82(4707), e);
        }
    }

    private static byte[] l(Bitmap bitmap, int i) throws OutOfMemoryError {
        String r0 = C0201.m82(4708);
        String r1 = C0201.m82(4709);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            return byteArrayOutputStream.toByteArray();
        } finally {
            try {
                byteArrayOutputStream.close();
            } catch (IOException e) {
                Log.e(r1, r0, e);
            }
        }
    }

    private void n(ReadableMap readableMap, k4 k4Var) {
        String r0 = C0201.m82(4710);
        if (readableMap.hasKey(r0)) {
            ReadableMap map = readableMap.getMap(r0);
            String r02 = C0201.m82(4711);
            if (map.hasKey(r02)) {
                ReadableMap map2 = map.getMap(r02);
                String r03 = C0201.m82(4712);
                if (map2.hasKey(r03)) {
                    try {
                        ReadableMap map3 = map2.getMap(r03);
                        C0119a.d(map3.getDouble(C0201.m82(4713)), map3.getDouble(C0201.m82(4714)), k4Var);
                    } catch (IOException e) {
                        Log.e(C0201.m82(4715), C0201.m82(4716), e);
                    }
                }
            }
        }
    }

    public void b(double d2) throws IllegalArgumentException {
        int i;
        int i2;
        int e = e();
        int d3 = d();
        double d4 = (double) d3;
        Double.isNaN(d4);
        double d5 = d4 * d2;
        double d6 = (double) e;
        if (d5 > d6) {
            Double.isNaN(d6);
            i = (int) (d6 / d2);
            i2 = e;
        } else {
            i2 = (int) d5;
            i = d3;
        }
        this.b = Bitmap.createBitmap(this.b, (e - i2) / 2, (d3 - i) / 2, i2, i);
    }

    public void c() throws b {
        int j;
        try {
            qs qsVar = (qs) g().e(qs.class);
            if (qsVar != null && qsVar.b(274) && (j = qsVar.j(274)) != 1) {
                i(j);
                qsVar.J(274, 1);
            }
        } catch (IOException | mp | xr e) {
            throw new b(C0201.m82(4717), e);
        }
    }

    public int d() {
        return this.b.getHeight();
    }

    public int e() {
        return this.b.getWidth();
    }

    public void f() throws b {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        Bitmap createBitmap = Bitmap.createBitmap(this.b, 0, 0, e(), d(), matrix, false);
        if (createBitmap != null) {
            this.b = createBitmap;
            return;
        }
        throw new b(C0201.m82(4718));
    }

    public String j(int i) {
        return Base64.encodeToString(l(this.b, i), 2);
    }

    public void m(File file, ReadableMap readableMap, int i) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(l(this.b, i));
        fileOutputStream.close();
        try {
            k4 k4Var = new k4(file.getAbsolutePath());
            for (tr trVar : g().b()) {
                for (zr zrVar : trVar.x()) {
                    k4Var.T(zrVar.b(), trVar.o(zrVar.c()).toString());
                }
            }
            xs xsVar = (xs) g().e(xs.class);
            for (zr zrVar2 : xsVar.x()) {
                int c2 = zrVar2.c();
                String replaceAll = zrVar2.b().replaceAll(C0201.m82(4719), C0201.m82(4720));
                Object o = xsVar.o(c2);
                if (replaceAll.equals(C0201.m82(4721))) {
                    k4Var.T(replaceAll, a(o.toString()));
                } else {
                    k4Var.T(replaceAll, o.toString());
                }
            }
            n(readableMap, k4Var);
            if (this.d) {
                h(k4Var);
            }
            k4Var.Q();
        } catch (IOException | mp e) {
            Log.e(C0201.m82(4722), C0201.m82(4723), e);
        }
    }
}
