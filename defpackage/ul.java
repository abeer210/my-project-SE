package defpackage;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.h;
import com.bumptech.glide.load.i;
import com.bumptech.glide.load.k;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import vigqyno.C0201;

/* renamed from: ul  reason: default package */
/* compiled from: VideoDecoder */
public class ul<T> implements k<T, Bitmap> {
    public static final h<Long> d = h.a(C0201.m82(10328), -1L, new a());
    public static final h<Integer> e = h.a(C0201.m82(10329), 2, new b());
    private static final e f = new e();
    public static final String g = null;
    public static final String h = null;
    private final f<T> a;
    private final qi b;
    private final e c;

    /* access modifiers changed from: package-private */
    /* renamed from: ul$a */
    /* compiled from: VideoDecoder */
    public class a implements h.b<Long> {
        private final ByteBuffer a = ByteBuffer.allocate(8);

        /* renamed from: b */
        public void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l.longValue()).array());
            }
        }
    }

    /* renamed from: ul$b */
    /* compiled from: VideoDecoder */
    class b implements h.b<Integer> {
        private final ByteBuffer a = ByteBuffer.allocate(4);

        /* renamed from: b */
        public void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            if (num != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num.intValue()).array());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: ul$c */
    /* compiled from: VideoDecoder */
    public static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ul$d */
    /* compiled from: VideoDecoder */
    public static final class d implements f<ByteBuffer> {

        /* access modifiers changed from: package-private */
        /* renamed from: ul$d$a */
        /* compiled from: VideoDecoder */
        public class a extends MediaDataSource {
            public final /* synthetic */ ByteBuffer a;

            public a(d dVar, ByteBuffer byteBuffer) {
                this.a = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return (long) this.a.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j, byte[] bArr, int i, int i2) {
                if (j >= ((long) this.a.limit())) {
                    return -1;
                }
                this.a.position((int) j);
                int min = Math.min(i2, this.a.remaining());
                this.a.get(bArr, i, min);
                return min;
            }
        }

        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(this, byteBuffer));
        }
    }

    /* renamed from: ul$e */
    /* compiled from: VideoDecoder */
    static class e {
        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ul$f */
    /* compiled from: VideoDecoder */
    public interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ul$g */
    /* compiled from: VideoDecoder */
    public static final class g implements f<ParcelFileDescriptor> {
        /* renamed from: b */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    static {
        C0201.m83(ul.class, 31);
    }

    public ul(qi qiVar, f<T> fVar) {
        this(qiVar, fVar, f);
    }

    public static k<AssetFileDescriptor, Bitmap> c(qi qiVar) {
        return new ul(qiVar, new c(null));
    }

    public static k<ByteBuffer, Bitmap> d(qi qiVar) {
        return new ul(qiVar, new d());
    }

    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, el elVar) {
        Bitmap g2 = (Build.VERSION.SDK_INT < 27 || i2 == Integer.MIN_VALUE || i3 == Integer.MIN_VALUE || elVar == el.d) ? null : g(mediaMetadataRetriever, j, i, i2, i3, elVar);
        return g2 == null ? f(mediaMetadataRetriever, j, i) : g2;
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j, int i) {
        return mediaMetadataRetriever.getFrameAtTime(j, i);
    }

    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, el elVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b2 = elVar.b(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(((float) parseInt) * b2), Math.round(b2 * ((float) parseInt2)));
        } catch (Throwable th) {
            String str = g;
            if (!Log.isLoggable(str, 3)) {
                return null;
            }
            Log.d(str, h, th);
            return null;
        }
    }

    public static k<ParcelFileDescriptor, Bitmap> h(qi qiVar) {
        return new ul(qiVar, new g());
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(T t, i iVar) {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r13v0, resolved type: com.bumptech.glide.load.i */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.k
    public hi<Bitmap> b(T t, int i, int i2, i iVar) throws IOException {
        long longValue = ((Long) iVar.c(d)).longValue();
        if (longValue >= 0 || longValue == -1) {
            Integer num = (Integer) iVar.c(e);
            if (num == null) {
                num = 2;
            }
            el elVar = (el) iVar.c(el.f);
            if (elVar == null) {
                elVar = el.e;
            }
            MediaMetadataRetriever a2 = this.c.a();
            try {
                this.a.a(a2, t);
                Bitmap e2 = e(a2, longValue, num.intValue(), i, i2, elVar);
                a2.release();
                return xk.d(e2, this.b);
            } catch (RuntimeException e3) {
                throw new IOException(e3);
            } catch (Throwable th) {
                a2.release();
                throw th;
            }
        } else {
            throw new IllegalArgumentException(C0201.m82(10330) + longValue);
        }
    }

    public ul(qi qiVar, f<T> fVar, e eVar) {
        this.b = qiVar;
        this.a = fVar;
        this.c = eVar;
    }
}
