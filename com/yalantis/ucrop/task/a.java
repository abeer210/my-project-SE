package com.yalantis.ucrop.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import vigqyno.C0201;

/* compiled from: BitmapLoadTask */
public class a extends AsyncTask<Void, Void, C0132a> {
    private final Context a;
    private Uri b;
    private Uri c;
    private final int d;
    private final int e;
    private final eu2 f;

    public a(Context context, Uri uri, Uri uri2, int i, int i2, eu2 eu2) {
        this.a = context;
        this.b = uri;
        this.c = uri2;
        this.d = i;
        this.e = i2;
        this.f = eu2;
    }

    private boolean a(Bitmap bitmap, BitmapFactory.Options options) {
        if ((bitmap != null ? bitmap.getByteCount() : 0) <= 104857600) {
            return false;
        }
        options.inSampleSize *= 2;
        return true;
    }

    private void b(Uri uri, Uri uri2) throws NullPointerException, IOException {
        Throwable th;
        InputStream inputStream;
        Log.d(C0201.m82(8203), C0201.m82(8204));
        if (uri2 != null) {
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = this.a.getContentResolver().openInputStream(uri);
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(new File(uri2.getPath()));
                    if (inputStream != null) {
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream2.write(bArr, 0, read);
                                } else {
                                    lu2.c(fileOutputStream2);
                                    lu2.c(inputStream);
                                    this.b = this.c;
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            lu2.c(fileOutputStream);
                            lu2.c(inputStream);
                            this.b = this.c;
                            throw th;
                        }
                    } else {
                        throw new NullPointerException(C0201.m82(8205));
                    }
                } catch (Throwable th3) {
                    th = th3;
                    lu2.c(fileOutputStream);
                    lu2.c(inputStream);
                    this.b = this.c;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                lu2.c(fileOutputStream);
                lu2.c(inputStream);
                this.b = this.c;
                throw th;
            }
        } else {
            throw new NullPointerException(C0201.m82(8206));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a  */
    private void d(Uri uri, Uri uri2) throws NullPointerException, IOException {
        Throwable th;
        Closeable closeable;
        Response response;
        cy2 source;
        Log.d(C0201.m82(8207), C0201.m82(8208));
        if (uri2 != null) {
            OkHttpClient okHttpClient = new OkHttpClient();
            cy2 cy2 = null;
            try {
                Response b2 = c40.b(okHttpClient.newCall(new Request.Builder().url(uri.toString()).build()));
                try {
                    source = b2.body().source();
                } catch (Throwable th2) {
                    th = th2;
                    response = b2;
                    closeable = null;
                    lu2.c(cy2);
                    lu2.c(closeable);
                    if (response != null) {
                    }
                    okHttpClient.dispatcher().cancelAll();
                    this.b = this.c;
                    throw th;
                }
                try {
                    OutputStream openOutputStream = this.a.getContentResolver().openOutputStream(uri2);
                    if (openOutputStream != null) {
                        sy2 g = jy2.g(openOutputStream);
                        source.X0(g);
                        lu2.c(source);
                        lu2.c(g);
                        if (b2 != null) {
                            lu2.c(b2.body());
                        }
                        okHttpClient.dispatcher().cancelAll();
                        this.b = this.c;
                        return;
                    }
                    throw new NullPointerException(C0201.m82(8209));
                } catch (Throwable th3) {
                    th = th3;
                    response = b2;
                    closeable = null;
                    cy2 = source;
                    lu2.c(cy2);
                    lu2.c(closeable);
                    if (response != null) {
                        lu2.c(response.body());
                    }
                    okHttpClient.dispatcher().cancelAll();
                    this.b = this.c;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                closeable = null;
                response = null;
                lu2.c(cy2);
                lu2.c(closeable);
                if (response != null) {
                }
                okHttpClient.dispatcher().cancelAll();
                this.b = this.c;
                throw th;
            }
        } else {
            throw new NullPointerException(C0201.m82(8210));
        }
    }

    private void f() throws NullPointerException, IOException {
        String scheme = this.b.getScheme();
        String r2 = C0201.m82(8212);
        Log.d(r2, C0201.m82(8211) + scheme);
        if (C0201.m82(8213).equals(scheme) || C0201.m82(8214).equals(scheme)) {
            try {
                d(this.b, this.c);
            } catch (IOException | NullPointerException e2) {
                Log.e(r2, C0201.m82(8220), e2);
                throw e2;
            }
        } else if (C0201.m82(8215).equals(scheme)) {
            try {
                b(this.b, this.c);
            } catch (IOException | NullPointerException e3) {
                Log.e(r2, C0201.m82(8216), e3);
                throw e3;
            }
        } else if (!C0201.m82(8217).equals(scheme)) {
            Log.e(r2, C0201.m82(8218) + scheme);
            throw new IllegalArgumentException(C0201.m82(8219) + scheme);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public C0132a doInBackground(Void... voidArr) {
        String r6;
        InputStream openInputStream;
        String r14 = C0201.m82(8221);
        if (this.b == null) {
            return new C0132a(new NullPointerException(C0201.m82(8222)));
        }
        try {
            f();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            options.inSampleSize = lu2.a(options, this.d, this.e);
            boolean z = false;
            options.inJustDecodeBounds = false;
            Bitmap bitmap = null;
            while (true) {
                String r5 = C0201.m82(8223);
                r6 = C0201.m82(8224);
                if (!z) {
                    try {
                        openInputStream = this.a.getContentResolver().openInputStream(this.b);
                        try {
                            bitmap = BitmapFactory.decodeStream(openInputStream, null, options);
                            if (options.outWidth == -1 || options.outHeight == -1) {
                                C0132a aVar = new C0132a(new IllegalArgumentException(C0201.m82(8225) + this.b + r6));
                                lu2.c(openInputStream);
                            } else {
                                lu2.c(openInputStream);
                                if (!a(bitmap, options)) {
                                    z = true;
                                }
                            }
                        } catch (Throwable th) {
                            lu2.c(openInputStream);
                            throw th;
                        }
                    } catch (OutOfMemoryError e2) {
                        Log.e(r14, C0201.m82(8227), e2);
                        options.inSampleSize *= 2;
                    } catch (IOException e3) {
                        Log.e(r14, C0201.m82(8226), e3);
                        return new C0132a(new IllegalArgumentException(r5 + this.b + r6, e3));
                    }
                } else if (bitmap == null) {
                    return new C0132a(new IllegalArgumentException(r5 + this.b + r6));
                } else {
                    int g = lu2.g(this.a, this.b);
                    int e4 = lu2.e(g);
                    int f2 = lu2.f(g);
                    ju2 ju2 = new ju2(g, e4, f2);
                    Matrix matrix = new Matrix();
                    if (e4 != 0) {
                        matrix.preRotate((float) e4);
                    }
                    if (f2 != 1) {
                        matrix.postScale((float) f2, 1.0f);
                    }
                    if (!matrix.isIdentity()) {
                        return new C0132a(lu2.h(bitmap, matrix), ju2);
                    }
                    return new C0132a(bitmap, ju2);
                }
            }
            C0132a aVar2 = new C0132a(new IllegalArgumentException(C0201.m82(8225) + this.b + r6));
            lu2.c(openInputStream);
            return aVar2;
        } catch (IOException | NullPointerException e5) {
            return new C0132a(e5);
        }
    }

    /* renamed from: e */
    public void onPostExecute(C0132a aVar) {
        Exception exc = aVar.c;
        if (exc == null) {
            eu2 eu2 = this.f;
            Bitmap bitmap = aVar.a;
            ju2 ju2 = aVar.b;
            String path = this.b.getPath();
            Uri uri = this.c;
            eu2.a(bitmap, ju2, path, uri == null ? null : uri.getPath());
            return;
        }
        this.f.onFailure(exc);
    }

    /* renamed from: com.yalantis.ucrop.task.a$a  reason: collision with other inner class name */
    /* compiled from: BitmapLoadTask */
    public static class C0132a {
        public Bitmap a;
        public ju2 b;
        public Exception c;

        public C0132a(Bitmap bitmap, ju2 ju2) {
            this.a = bitmap;
            this.b = ju2;
        }

        public C0132a(Exception exc) {
            this.c = exc;
        }
    }
}
