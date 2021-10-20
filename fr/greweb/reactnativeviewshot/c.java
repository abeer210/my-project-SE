package fr.greweb.reactnativeviewshot;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.net.Uri;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.m;
import com.facebook.react.uimanager.n0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Deflater;
import vigqyno.C0188;
import vigqyno.C0201;

/* compiled from: ViewShot */
public class c implements n0 {
    private static final String l = null;
    private static byte[] m = new byte[65536];
    private static final Object n = new Object();
    private static final Set<Bitmap> o = Collections.newSetFromMap(new WeakHashMap());
    private final int a;
    private final String b;
    @a
    private final int c;
    private final double d;
    private final Integer e;
    private final Integer f;
    private final File g;
    private final String h;
    private final Promise i;
    private final Boolean j;
    private final Activity k;

    /* compiled from: ViewShot */
    public @interface a {
        public static final Bitmap.CompressFormat[] a = {Bitmap.CompressFormat.JPEG, Bitmap.CompressFormat.PNG, Bitmap.CompressFormat.WEBP};
    }

    /* compiled from: ViewShot */
    public static class b extends ByteArrayOutputStream {
        public b(byte[] bArr) {
            super(0);
            ((ByteArrayOutputStream) this).buf = bArr;
        }

        public static int h(int i) {
            if (i < 0) {
                throw new OutOfMemoryError();
            } else if (i > 2147483639) {
                return C0188.f24;
            } else {
                return 2147483639;
            }
        }

        public ByteBuffer a(int i) {
            if (((ByteArrayOutputStream) this).buf.length < i) {
                c(i);
            }
            return ByteBuffer.wrap(((ByteArrayOutputStream) this).buf);
        }

        public void c(int i) {
            int length = ((ByteArrayOutputStream) this).buf.length << 1;
            if (length - i < 0) {
                length = i;
            }
            if (length - 2147483639 > 0) {
                length = h(i);
            }
            ((ByteArrayOutputStream) this).buf = Arrays.copyOf(((ByteArrayOutputStream) this).buf, length);
        }

        public byte[] k() {
            return ((ByteArrayOutputStream) this).buf;
        }

        public void m(int i) {
            ((ByteArrayOutputStream) this).count = i;
        }
    }

    static {
        C0201.m83(c.class, 571);
    }

    public c(int i2, String str, @a int i3, double d2, Integer num, Integer num2, File file, String str2, Boolean bool, ReactApplicationContext reactApplicationContext, Activity activity, Promise promise) {
        this.a = i2;
        this.b = str;
        this.c = i3;
        this.d = d2;
        this.e = num;
        this.f = num2;
        this.g = file;
        this.h = str2;
        this.j = bool;
        this.k = activity;
        this.i = promise;
    }

    private Matrix b(Canvas canvas, View view, View view2) {
        Matrix matrix = new Matrix();
        LinkedList linkedList = new LinkedList();
        View view3 = view2;
        do {
            linkedList.add(view3);
            view3 = (View) view3.getParent();
        } while (view3 != view);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            View view4 = (View) it.next();
            canvas.save();
            int i2 = 0;
            float left = ((float) (view4.getLeft() + (view4 != view2 ? view4.getPaddingLeft() : 0))) + view4.getTranslationX();
            int top = view4.getTop();
            if (view4 != view2) {
                i2 = view4.getPaddingTop();
            }
            float translationY = ((float) (top + i2)) + view4.getTranslationY();
            canvas.translate(left, translationY);
            canvas.rotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            canvas.scale(view4.getScaleX(), view4.getScaleY());
            matrix.postTranslate(left, translationY);
            matrix.postRotate(view4.getRotation(), view4.getPivotX(), view4.getPivotY());
            matrix.postScale(view4.getScaleX(), view4.getScaleY());
        }
        return matrix;
    }

    private Point c(View view, OutputStream outputStream) throws IOException {
        try {
            a.d(l, a.b(this.k));
            return d(view, outputStream);
        } finally {
            outputStream.close();
        }
    }

    private Point d(View view, OutputStream outputStream) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (width <= 0 || height <= 0) {
            throw new RuntimeException(C0201.m82(34215));
        }
        if (this.j.booleanValue()) {
            ScrollView scrollView = (ScrollView) view;
            int i2 = 0;
            for (int i3 = 0; i3 < scrollView.getChildCount(); i3++) {
                i2 += scrollView.getChildAt(i3).getHeight();
            }
            height = i2;
        }
        Point point = new Point(width, height);
        Bitmap g2 = g(width, height);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setDither(true);
        Canvas canvas = new Canvas(g2);
        view.draw(canvas);
        for (View view2 : f(view)) {
            if ((view2 instanceof TextureView) && view2.getVisibility() == 0) {
                TextureView textureView = (TextureView) view2;
                textureView.setOpaque(false);
                Bitmap bitmap = textureView.getBitmap(h(view2.getWidth(), view2.getHeight()));
                int save = canvas.save();
                b(canvas, view, view2);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                canvas.restoreToCount(save);
                j(bitmap);
            }
        }
        Integer num = this.e;
        if (!(num == null || this.f == null || (num.intValue() == width && this.f.intValue() == height))) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(g2, this.e.intValue(), this.f.intValue(), true);
            j(g2);
            g2 = createScaledBitmap;
        }
        if (-1 != this.c || !(outputStream instanceof b)) {
            g2.compress(a.a[this.c], (int) (this.d * 100.0d), outputStream);
        } else {
            int i4 = width * height * 4;
            e(outputStream);
            b bVar = (b) outputStream;
            g2.copyPixelsToBuffer(bVar.a(i4));
            bVar.m(i4);
        }
        j(g2);
        return point;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: A */
    /* JADX WARN: Multi-variable type inference failed */
    private static <T extends A, A> T e(A a2) {
        return a2;
    }

    private List<View> f(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            arrayList2.addAll(f(viewGroup.getChildAt(i2)));
        }
        return arrayList2;
    }

    private static Bitmap g(int i2, int i3) {
        synchronized (n) {
            for (Bitmap bitmap : o) {
                if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
                    o.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
    }

    private static Bitmap h(int i2, int i3) {
        synchronized (n) {
            for (Bitmap bitmap : o) {
                if (bitmap.getWidth() == i2 && bitmap.getHeight() == i3) {
                    o.remove(bitmap);
                    bitmap.eraseColor(0);
                    return bitmap;
                }
            }
            return Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        }
    }

    private static int i(View view) {
        return Math.min(view.getWidth() * view.getHeight() * 4, 32);
    }

    private static void j(Bitmap bitmap) {
        synchronized (n) {
            o.add(bitmap);
        }
    }

    private void k(View view) throws IOException {
        String str;
        boolean z = -1 == this.c;
        boolean equals = C0201.m82(34216).equals(this.h);
        b bVar = new b(m);
        Point c2 = c(view, bVar);
        m = bVar.k();
        int size = bVar.size();
        String format = String.format(Locale.US, C0201.m82(34217), Integer.valueOf(c2.x), Integer.valueOf(c2.y));
        if (!z) {
            format = C0201.m82(34218);
        }
        if (equals) {
            Deflater deflater = new Deflater();
            deflater.setInput(m, 0, size);
            deflater.finish();
            b bVar2 = new b(new byte[32]);
            byte[] bArr = new byte[1024];
            while (!deflater.finished()) {
                bVar2.write(bArr, 0, deflater.deflate(bArr));
            }
            str = format + Base64.encodeToString(bVar2.k(), 0, bVar2.size(), 2);
        } else {
            str = format + Base64.encodeToString(m, 0, size, 2);
        }
        this.i.resolve(str);
    }

    private void l(View view) throws IOException {
        b bVar = new b(m);
        c(view, bVar);
        m = bVar.k();
        String encodeToString = Base64.encodeToString(m, 0, bVar.size(), 2);
        String r0 = C0201.m82(34219).equals(this.b) ? C0201.m82(34220) : this.b;
        Promise promise = this.i;
        promise.resolve(C0201.m82(34221) + r0 + C0201.m82(34222) + encodeToString);
    }

    private void m(View view) throws IOException {
        String uri = Uri.fromFile(this.g).toString();
        FileOutputStream fileOutputStream = new FileOutputStream(this.g);
        b bVar = new b(m);
        Point c2 = c(view, bVar);
        m = bVar.k();
        int size = bVar.size();
        fileOutputStream.write(String.format(Locale.US, C0201.m82(34223), Integer.valueOf(c2.x), Integer.valueOf(c2.y)).getBytes(Charset.forName(C0201.m82(34224))));
        fileOutputStream.write(m, 0, size);
        fileOutputStream.close();
        this.i.resolve(uri);
    }

    private void n(View view) throws IOException {
        c(view, new FileOutputStream(this.g));
        this.i.resolve(Uri.fromFile(this.g).toString());
    }

    @Override // com.facebook.react.uimanager.n0
    public void a(m mVar) {
        View view;
        String r0 = C0201.m82(34225);
        int i2 = this.a;
        if (i2 == -1) {
            view = this.k.getWindow().getDecorView().findViewById(16908290);
        } else {
            view = mVar.w(i2);
        }
        String r1 = C0201.m82(34226);
        if (view == null) {
            String str = l;
            StringBuilder sb = new StringBuilder();
            String r2 = C0201.m82(34227);
            sb.append(r2);
            sb.append(this.a);
            Log.e(str, sb.toString(), new AssertionError());
            Promise promise = this.i;
            promise.reject(r1, r2 + this.a);
            return;
        }
        try {
            b bVar = new b(m);
            bVar.m(i(view));
            m = bVar.k();
            if (r0.equals(this.h) && -1 == this.c) {
                m(view);
            } else if (!r0.equals(this.h) || -1 == this.c) {
                if (!C0201.m82(34228).equals(this.h)) {
                    if (!C0201.m82(34229).equals(this.h)) {
                        if (C0201.m82(34230).equals(this.h)) {
                            l(view);
                            return;
                        }
                        return;
                    }
                }
                k(view);
            } else {
                n(view);
            }
        } catch (Throwable th) {
            String str2 = l;
            String r22 = C0201.m82(34231);
            Log.e(str2, r22, th);
            this.i.reject(r1, r22);
        }
    }
}
