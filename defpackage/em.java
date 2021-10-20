package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.f;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import defpackage.ng;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Queue;
import vigqyno.C0201;

/* renamed from: em  reason: default package */
/* compiled from: ByteBufferGifDecoder */
public class em implements k<ByteBuffer, gm> {
    private static final a f = new a();
    private static final b g = new b();
    public static final String h = null;
    public static final String i = null;
    private final Context a;
    private final List<ImageHeaderParser> b;
    private final b c;
    private final a d;
    private final fm e;

    /* access modifiers changed from: package-private */
    /* renamed from: em$a */
    /* compiled from: ByteBufferGifDecoder */
    public static class a {
        public ng a(ng.a aVar, pg pgVar, ByteBuffer byteBuffer, int i) {
            return new rg(aVar, pgVar, byteBuffer, i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: em$b */
    /* compiled from: ByteBufferGifDecoder */
    public static class b {
        private final Queue<qg> a = fp.e(0);

        public synchronized qg a(ByteBuffer byteBuffer) {
            qg poll;
            poll = this.a.poll();
            if (poll == null) {
                poll = new qg();
            }
            poll.p(byteBuffer);
            return poll;
        }

        public synchronized void b(qg qgVar) {
            qgVar.a();
            this.a.offer(qgVar);
        }
    }

    static {
        C0201.m83(em.class, 41);
    }

    public em(Context context, List<ImageHeaderParser> list, qi qiVar, ni niVar) {
        this(context, list, qiVar, niVar, g, f);
    }

    private im c(ByteBuffer byteBuffer, int i2, int i3, qg qgVar, i iVar) {
        Bitmap.Config config;
        String str = i;
        String str2 = h;
        long b2 = ap.b();
        try {
            pg c2 = qgVar.c();
            if (c2.b() > 0) {
                if (c2.c() == 0) {
                    if (iVar.c(mm.a) == com.bumptech.glide.load.b.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    ng a2 = this.d.a(this.e, c2, byteBuffer, e(c2, i2, i3));
                    a2.f(config);
                    a2.d();
                    Bitmap c3 = a2.c();
                    if (c3 == null) {
                        if (Log.isLoggable(str2, 2)) {
                            Log.v(str2, str + ap.a(b2));
                        }
                        return null;
                    }
                    im imVar = new im(new gm(this.a, a2, sk.c(), i2, i3, c3));
                    if (Log.isLoggable(str2, 2)) {
                        Log.v(str2, str + ap.a(b2));
                    }
                    return imVar;
                }
            }
            return null;
        } finally {
            if (Log.isLoggable(str2, 2)) {
                Log.v(str2, str + ap.a(b2));
            }
        }
    }

    private static int e(pg pgVar, int i2, int i3) {
        int i4;
        int min = Math.min(pgVar.a() / i3, pgVar.d() / i2);
        if (min == 0) {
            i4 = 0;
        } else {
            i4 = Integer.highestOneBit(min);
        }
        int max = Math.max(1, i4);
        String r3 = C0201.m82(13031);
        if (Log.isLoggable(r3, 2) && max > 1) {
            StringBuilder sb = new StringBuilder();
            sb.append(C0201.m82(13032));
            sb.append(max);
            sb.append(C0201.m82(13033));
            sb.append(i2);
            String r5 = C0201.m82(13034);
            sb.append(r5);
            sb.append(i3);
            sb.append(C0201.m82(13035));
            sb.append(pgVar.d());
            sb.append(r5);
            sb.append(pgVar.a());
            sb.append(C0201.m82(13036));
            Log.v(r3, sb.toString());
        }
        return max;
    }

    /* renamed from: d */
    public im b(ByteBuffer byteBuffer, int i2, int i3, i iVar) {
        qg a2 = this.c.a(byteBuffer);
        try {
            return c(byteBuffer, i2, i3, a2, iVar);
        } finally {
            this.c.b(a2);
        }
    }

    /* renamed from: f */
    public boolean a(ByteBuffer byteBuffer, i iVar) throws IOException {
        return !((Boolean) iVar.c(mm.b)).booleanValue() && f.f(this.b, byteBuffer) == ImageHeaderParser.ImageType.GIF;
    }

    public em(Context context, List<ImageHeaderParser> list, qi qiVar, ni niVar, b bVar, a aVar) {
        this.a = context.getApplicationContext();
        this.b = list;
        this.d = aVar;
        this.e = new fm(qiVar, niVar);
        this.c = bVar;
    }
}
